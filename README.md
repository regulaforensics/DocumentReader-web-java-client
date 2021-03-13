# Regula Document Reader java client compatible with jvm and android

[![maven](https://img.shields.io/maven-metadata/v?metadataUrl=https%3A%2F%2Fmaven.regulaforensics.com%2FRegulaDocumentReaderWebClient%2Fcom%2Fregula%2Fdocumentreader%2Fwebclient%2Fmaven-metadata.xml&style=flat-square)](https://support.regulaforensics.com/hc/en-us/articles/115000916306-Documentation)
[![OpenAPI](https://img.shields.io/badge/OpenAPI-defs-8c0a56?style=flat-square)](https://github.com/regulaforensics/DocumentReader-web-openapi)
[![documentation](https://img.shields.io/badge/docs-en-f6858d?style=flat-square)](https://support.regulaforensics.com/hc/en-us/articles/115000916306-Documentation)
[![live](https://img.shields.io/badge/live-demo-0a8c42?style=flat-square)](https://api.regulaforensics.com/)

Documents recognition as easy as reading two bytes.

If you have any problems with or questions about this client, please contact us
through a [GitHub issue](https://github.com/regulaforensics/DocumentReader-api-java-client/issues).
You are invited to contribute [new features, fixes, or updates](https://github.com/regulaforensics/DocumentReader-api-java-clien/issues?q=is%3Aissue+is%3Aopen+label%3A%22help+wanted%22), large or small; 
We are always thrilled to receive pull requests, and do our best to process them as fast as we can.
See [dev guide](./dev.md)


## Install package
Add __Regula Forensics, Inc.__ maven repository to repositories section in your `build.gradle`,
and declare client as regular dependency.

```gradle
repositories {
    maven {
        url = uri("https://maven.regulaforensics.com/RegulaDocumentReaderWebClient")
    }
}

dependencies {
    implementation("com.regula.documentreader:webclient:5.+")
}
```

## Example
Performing request:
```java
byte[] imageBytes = readFile("australia_passport.jpg");
var image = new ProcessRequestImage(imageBytes, Light.WHITE);

var requestParams = new RecognitionParams()
        .withScenario(Scenario.FULL_PROCESS)
        .withResultTypeOutput(Result.STATUS, Result.TEXT, Result.IMAGES);

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
You can find a more detailed example in  [example](./example) folder.
