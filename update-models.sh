#!/bin/sh

DOCS_DEFINITION_FOLDER="${PWD}/../DocumentReader-web-openapi" \
\
&& ENUM_MAPPINGS="TextFieldType=Integer,GraphicFieldType=Integer,Scenario=String,DocumentFormat=Integer,\
Light=Integer,Result=Integer,VerificationResult=Integer,RfidLocation=Integer,\
DocumentTypeRecognitionResult=Integer,ProcessingStatus=Integer,Source=String,CheckResult=Integer,\
LCID=Integer,DocumentType=Integer" \
\
&& docker run --user "$(id -u):$(id -g)" --rm -v "${PWD}:/client" -v "$DOCS_DEFINITION_FOLDER:/definitions" \
openapitools/openapi-generator-cli:v5.0.0-beta generate \
-i /definitions/index.yml -g java -o /client/client \
-c /client/java-generator-config.json -t /client/client/generator-templates/ \
\
&& docker run --user "$(id -u):$(id -g)" --rm -v "${PWD}:/client" -v "${DOCS_DEFINITION_FOLDER}:/definitions" \
openapitools/openapi-generator-cli:v5.0.0-beta generate \
-i /client/docs/openapi/index.yml -g java -o /client/clients/java/client \
-i /definitions/index.yml -g java -o /client/client \
-c /client/java-generator-config.json -t /client/client/generator-templates/ \
--import-mappings $ENUM_MAPPINGS \
\
&& docker run --user "$(id -u):$(id -g)" --rm -v "${PWD}:/client" -v "${DOCS_DEFINITION_FOLDER}:/definitions" \
openapitools/openapi-generator-cli:v5.0.0-beta generate \
-i /definitions/index.yml -g java -o /client/client \
-c /client/java-generator-config.json -t /client/client/generator-templates/ \
--import-mappings $ENUM_MAPPINGS,TextField=com.regula.documentreader.webclient.model.ext.TextField,\
ImagesField=com.regula.documentreader.webclient.model.ext.ImagesField \
\
&& docker run --user "$(id -u):$(id -g)" --rm -v "${PWD}:/client" -v "${DOCS_DEFINITION_FOLDER}:/definitions" \
openapitools/openapi-generator-cli:v5.0.0-beta generate \
-i /definitions/index.yml -g java -o /client/client \
-c /client/java-generator-config.json -t /client/client/generator-templates/ \
--import-mappings $ENUM_MAPPINGS,Text=com.regula.documentreader.webclient.model.ext.Text,\
Images=com.regula.documentreader.webclient.model.ext.Images \
\
|| exit 1

./gradlew -p ./ goJF
exit 0