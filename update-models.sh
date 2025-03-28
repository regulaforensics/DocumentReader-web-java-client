#!/bin/sh

DOCS_DEFINITION_FOLDER="${PWD}/../DocumentReader-web-openapi" \
\
&& docker run --user "$(id -u):$(id -g)" --rm \
-v "${PWD}:/client" \
-v "${DOCS_DEFINITION_FOLDER}:/definitions" \
openapitools/openapi-generator-cli:v7.12.0 generate \
-g java \
-i /definitions/index.yml \
-o /client/client --openapi-normalizer REF_AS_PARENT_IN_ALLOF=true \
-t /client/client/generator-templates \
-c /client/java-generator-config.json || exit 1

./gradlew -p ./ goJF || exit 0