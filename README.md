# Regula Document Reader java client compatible with jvm and android

[![documentation](https://img.shields.io/badge/docs-en-f6858d?style=flat-square)](https://support.regulaforensics.com/hc/en-us/articles/115000916306-Documentation)
[![OpenAPI](https://img.shields.io/badge/OpenAPI-defs-0a8c42?style=flat-square)](https://github.com/regulaforensics/DocumentReader-api-openapi)

## Install package
tbd maven deploy

## Example
Performing request:
```java
```

Parsing results:
```java
```
todo link for full doc

## Development

Java client is written using java7. Development environment requires java11+.
Models generation based on [openapi spec](https://github.com/regulaforensics/DocumentReader-api-openapi). 

### Enums
Instead of using enums, generator produces static constants. 

### 4-cycle generation
1. Generate enums as constants
2. Generate normal models with substituted by primitive values enums
3. Replace links to generated models by extend one
4. Replace links to generated models by extend one. For models, that was skipped from generation on step 3 


To regenerate models from openapi definition, 
clone [latest open api definitions](https://github.com/regulaforensics/DocumentReader-api-openapi)
and set `DEFINITION_FOLDER` as path to cloned directory.
```bash
DEFINITION_FOLDER="/home/user/projects/DocumentReader-api-openapi"
```
Then use next command from the project root.
```bash
\
ENUM_MAPPINGS="TextFieldType=Integer,GraphicFieldType=Integer,Scenario=String,DocumentFormat=Integer,\
Light=Integer,Result=Integer,FieldSource=String,VerificationResult=Integer,RfidLocation=Integer,\
DocumentTypeRecognitionResult=Integer,ProcessingStatus=Integer,Source=Integer,CheckResult=Integer,\
LCID=Integer" \
\
&& docker run --rm -v "${PWD}:/client" -v "${DEFINITION_FOLDER}:/definitions" \
openapitools/openapi-generator-cli generate \
-i /definitions/index.yml -g java -o /client/client \
-c /client/java-generator-config.json -t /client/client/generator-templates/ \
\
&& docker run --rm -v "${PWD}:/client" -v "${DEFINITION_FOLDER}:/definitions" \
openapitools/openapi-generator-cli generate \
-i /client/docs/openapi/index.yml -g java -o /client/clients/java/client \
-i /definitions/index.yml -g java -o /client/client \
-c /client/java-generator-config.json -t /client/client/generator-templates/ \
--import-mappings $ENUM_MAPPINGS \
\
&& docker run --rm -v "${PWD}:/client" -v "${DEFINITION_FOLDER}:/definitions" \
openapitools/openapi-generator-cli generate \
-i /definitions/index.yml -g java -o /client/client \
-c /client/java-generator-config.json -t /client/client/generator-templates/ \
--import-mappings $ENUM_MAPPINGS,TextField=com.regulaforensics.docreader.client.model.ext.TextField \
\
&& docker run --rm -v "${PWD}:/client" -v "${DEFINITION_FOLDER}:/definitions" \
openapitools/openapi-generator-cli generate \
-i /definitions/index.yml -g java -o /client/client \
-c /client/java-generator-config.json -t /client/client/generator-templates/ \
--import-mappings $ENUM_MAPPINGS,Text=com.regulaforensics.docreader.client.model.ext.Text \
\
&& ./gradlew -p ./ goJF
```

## Contribution