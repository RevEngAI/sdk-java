#!/usr/bin/env bash
#
# Generate the Java SDK locally from an OpenAPI spec.
#
# This is the local-developer equivalent of .github/workflows/check.yaml. It
# uses the same generator version, the same config.yml, the same templates and
# the same post-processing (scripts/postprocess.sh), so local output does not
# drift from CI output. The only deliberate difference is that the spec source
# is configurable, so any spec URL or a saved .json file can be generated from
# as easily as the default.
#
# Usage:
#   scripts/generate-local.sh [--spec <url|path>] [--version <x.y.z[-suffix]>]
#                             [--version-prefix <x.y.z>] [--generator <ver>]
#
# Env equivalents: SPEC, VERSION, VERSION_PREFIX, GENERATOR_VERSION
#
set -euo pipefail

REPO_ROOT="$(cd "$(dirname "$0")/.." && pwd)"

# Spec to generate from: a URL or a path to a local .json file.
SPEC="${SPEC:-https://docs.reveng.ai/openapi.json}"

# Explicit artifact version. If empty it is derived from the spec (see below).
VERSION="${VERSION:-}"

# Used only when the spec's info.version is not semver, which is the case for
# unreleased builds. Maven needs a semver-shaped version, and consumers select
# an installed SDK by parsing a numeric X.Y.Z out of the artifact filename, so
# a locally built SDK must still start with one. The default sorts above any
# released version, so a local build is never mistaken for a release.
VERSION_PREFIX="${VERSION_PREFIX:-3.999.0}"

# Keep in lockstep with `generator-tag` in .github/workflows/check.yaml.
GENERATOR_VERSION="${GENERATOR_VERSION:-7.23.0}"

while [ $# -gt 0 ]; do
  case "$1" in
    --spec)           SPEC="$2"; shift 2 ;;
    --version)        VERSION="$2"; shift 2 ;;
    --version-prefix) VERSION_PREFIX="$2"; shift 2 ;;
    --generator)      GENERATOR_VERSION="$2"; shift 2 ;;
    -h|--help)        sed -n '2,17p' "$0"; exit 0 ;;
    *) echo "unknown argument: $1" >&2; exit 2 ;;
  esac
done

cd "$REPO_ROOT"

# --- 1. Resolve the spec to a file inside the repo -------------------------
# It has to live under REPO_ROOT because that is the only path bind-mounted
# into the generator container.
SPEC_FILE="$REPO_ROOT/.openapi-spec.json"
trap 'rm -f "$SPEC_FILE"' EXIT

case "$SPEC" in
  http://*|https://*)
    echo "==> Fetching spec from $SPEC"
    curl -fsSL "$SPEC" -o "$SPEC_FILE"
    ;;
  *)
    echo "==> Using local spec $SPEC"
    [ -f "$SPEC" ] || { echo "spec file not found: $SPEC" >&2; exit 1; }
    cp "$SPEC" "$SPEC_FILE"
    ;;
esac

SPEC_VERSION="$(jq -r '.info.version // empty' "$SPEC_FILE")"
[ -n "$SPEC_VERSION" ] || { echo "spec has no info.version" >&2; exit 1; }
echo "==> Spec info.version: $SPEC_VERSION"

# --- 2. Resolve the artifact version --------------------------------------
if [ -z "$VERSION" ]; then
  # Drop the `v` prefix, as CI does: it is not usually used in Maven versions.
  BASE="${SPEC_VERSION#v}"
  if printf '%s' "$BASE" | grep -Eq '^[0-9]+\.[0-9]+\.[0-9]+$'; then
    # Released spec: use its version verbatim, identical to CI.
    VERSION="$BASE"
  else
    # Unreleased spec: prefix a synthetic semver and keep the spec's own
    # version as a suffix, so the artifact stays traceable to its source.
    VERSION="${VERSION_PREFIX}-${BASE}"
  fi
fi

# Fail here rather than at consumer build time.
if ! printf '%s' "$VERSION" | grep -Eq '^[0-9]+\.[0-9]+\.[0-9]+'; then
  echo "version must start with a numeric X.Y.Z: got '$VERSION'" >&2
  exit 1
fi
echo "==> Artifact version: $VERSION"

# --- 3. Generate ----------------------------------------------------------
# Pinned to the same image tag CI uses, so no local generator install is
# needed. Running as the invoking user keeps the generated tree owned by the
# developer rather than by root.
rm -rf "$REPO_ROOT/java-client"

echo "==> Running openapi-generator v${GENERATOR_VERSION}"
docker run --rm \
  --user "$(id -u):$(id -g)" \
  -v "$REPO_ROOT:/local" \
  -w /local \
  "openapitools/openapi-generator-cli:v${GENERATOR_VERSION}" \
  generate \
    -i /local/.openapi-spec.json \
    -g java \
    -o /local/java-client \
    -c /local/config.yml \
    -t /local/templates \
    --additional-properties="artifactVersion=${VERSION}"

# --- 4. Post-process (shared with CI) -------------------------------------
echo "==> Post-processing"
SDK_VERSION="$VERSION" "$REPO_ROOT/scripts/postprocess.sh"

echo
echo "==> Done. Generated SDK version $(cat "$REPO_ROOT/.sdk-version")"
grep -n "^version = \|coordinates(" "$REPO_ROOT/build.gradle"
