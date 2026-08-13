#!/usr/bin/env bash
#
# Post-processing for a fresh openapi-generator run.
#
# This is shared by two callers and MUST stay identical for both:
#   - CI:    .github/workflows/check.yaml  ("Check for changes" step)
#   - local: scripts/generate-local.sh
#
# Precondition: openapi-generator has just written its output into ./java-client
# Inputs (env):
#   SDK_VERSION - value written to .sdk-version
#
set -euo pipefail

cd "$(dirname "$0")/.."

: "${SDK_VERSION:?SDK_VERSION must be set}"

# Move generated files to the correct locations and clean up
rm -Rf docs && mv java-client/docs .
rm -Rf gradle && mv java-client/gradle .
rm -Rf src/main && mv java-client/src/main src/
rm -Rf build.gradle && mv java-client/build.gradle .
rm -Rf build.sbt && mv java-client/build.sbt .
rm -Rf gradle.properties && mv java-client/gradle.properties .
rm -Rf gradlew && mv java-client/gradlew .
rm -Rf gradlew.bat && mv java-client/gradlew.bat .
rm -Rf pom.xml && mv java-client/pom.xml .
rm -Rf settings.gradle && mv java-client/settings.gradle .
rm -Rf README.md && mv java-client/README.md .
rm -Rf java-client

# Ensure gradlew is executable
chmod +x gradlew

# Move custom models
cp models/* src/main/java/ai/reveng/model/

# Store the SDK version
echo "$SDK_VERSION" > .sdk-version
