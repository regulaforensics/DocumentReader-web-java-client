# Regula Document Reader java client compatible with jvm and android

[![maven](https://img.shields.io/maven-metadata/v?metadataUrl=https%3A%2F%2Fmaven.regulaforensics.com%2FRegulaDocumentReader%2Fcom%2Fregula%2Fdocumentreader%2Fapi%2Fmaven-metadata.xml&style=flat-square)](https://support.regulaforensics.com/hc/en-us/articles/115000916306-Documentation)
[![documentation](https://img.shields.io/badge/docs-en-f6858d?style=flat-square)](https://support.regulaforensics.com/hc/en-us/articles/115000916306-Documentation)
[![OpenAPI](https://img.shields.io/badge/OpenAPI-defs-0a8c42?style=flat-square)](https://github.com/regulaforensics/DocumentReader-api-openapi)

Documents recognition as easy as reading two bytes.

If you have any problems with or questions about this client, please contact us
through a [GitHub issue](https://github.com/regulaforensics/DocumentReader-api-java-client/issues).
You are invited to contribute [new features, fixes, or updates](https://github.com/regulaforensics/DocumentReader-api-java-clien/issues?q=is%3Aissue+is%3Aopen+label%3A%22help+wanted%22), large or small; We are always thrilled to receive pull requests, and do our best to process them as fast as we can.


## Install package
tbd maven deploy

## Example
Performing request:
```java
byte[] imageBytes = readFile("australia_passport.jpg");
var image = new ProcessRequestImage(imageBytes, Light.WHITE);

var requestParams = new RecognitionParams()
        .withScenario(Scenario.FULL_PROCESS)
        .withResultTypeOutput(Result.STATUS, Result.TEXT, Result.LEXICAL_ANALYSIS);

RecognitionRequest request = new RecognitionRequest(requestParams, List.of(image));

var api = new DocumentReaderApi();
RecognitionResponse response = api.process(request);
```

Parsing results:
```java
var status = response.status();
var docOverallStatus = status.getComplete() == CheckResult.OK ? "valid" : "not valid";
var docOpticalTextStatus = status.getDetailsOptical().getText();

var docNumberField = response.text().getField(DOCUMENT_NUMBER);
var docNumberMrz = docNumberField.getValue(Source.MRZ);
var docNumberMrzValidity = docNumberField.sourceValidity(Source.MRZ);
var docNumberMrzVisualMatching = docNumberField.crossSourceComparison(Source.MRZ, Source.VISUAL);
```
You can find a more detailed example in  `./example` folder.

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
Light=Integer,Result=Integer,VerificationResult=Integer,RfidLocation=Integer,\
DocumentTypeRecognitionResult=Integer,ProcessingStatus=Integer,Source=String,CheckResult=Integer,\
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
--import-mappings $ENUM_MAPPINGS,TextField=com.regula.documentreader.webclient.model.ext.TextField \
\
&& docker run --rm -v "${PWD}:/client" -v "${DEFINITION_FOLDER}:/definitions" \
openapitools/openapi-generator-cli generate \
-i /definitions/index.yml -g java -o /client/client \
-c /client/java-generator-config.json -t /client/client/generator-templates/ \
--import-mappings $ENUM_MAPPINGS,Text=com.regula.documentreader.webclient.model.ext.Text \
\
&& ./gradlew -p ./ goJF
```
