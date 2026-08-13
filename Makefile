# Local generation and installation of the Java SDK.
#
# The released SDK is generated in CI (.github/workflows/check.yaml) and
# published by .github/workflows/publish.yaml. These targets exist to build an
# SDK from an arbitrary spec and install it into the local Maven repository,
# so downstream projects can be built against unreleased API changes. Nothing
# here publishes to a remote registry.

# Spec to generate from: a URL or a path to a local .json file.
SPEC ?= https://docs.reveng.ai/openapi.json

# Artifact version. Leave empty to derive it from the spec's info.version.
VERSION ?=

export SPEC
export VERSION

help: ## Show this help message
	@printf "\nUsage: make [target]\n\n"
	@printf "Targets:\n"
	@grep -E '^[a-zA-Z_-]+:.*##' $(MAKEFILE_LIST) | awk -F ':.*## ' '{printf "  %-15s %s\n", $$1, $$2}'
	@printf "\nVariables:\n"
	@printf "  %-15s %s\n" "SPEC" "OpenAPI spec URL or file path"
	@printf "  %-15s %s\n" "VERSION" "Artifact version override (default: derived from the spec)"
	@printf "\n"

.DEFAULT_GOAL := help

generate: ## Regenerate the SDK source tree from SPEC
	./scripts/generate-local.sh

build: ## Compile the current source tree
	./gradlew build

install: ## Install the current source tree into ~/.m2 (publishToMavenLocal)
	./gradlew publishToMavenLocal
	@printf "\nInstalled:\n"
	@ls -1 "$$HOME/.m2/repository/ai/reveng/sdk/$$(sed 's/^v//' .sdk-version)/"

sdk: generate install ## Regenerate from SPEC and install into ~/.m2

clean: ## Remove build output and any leftover generator output
	./gradlew clean
	rm -rf java-client .openapi-spec.json

.PHONY: help generate build install sdk clean
