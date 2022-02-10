# Regula Document Reader java client compatible with jvm and android

:bulb: Before you start: if you just want to play with an online demo, visit our [playground](https://api.regulaforensics.com).

:warning: NOTE: If a custom Document Reader endpoint is not specified, demo web API will be used by default.
By sending requests to demo Regula Document Reader web API, 
you agree with our [Privacy Policy](https://regulaforensics.com/en/company/privacy/) 
and [License Agreement](https://downloads.regulaforensics.com/work/SDK/doc/Eula.pdf).


Requirements:
- installed java 11+

Java version verification:
```bash
java --version  
>  openjdk 14.0.1 2020-04-14
```

Example of cloning:
```bash
git clone https://github.com/regulaforensics/DocumentReader-web-java-client.git
cd DocumentReader-web-java-client
```

### Running the client with demo Regula Document Reader web API  
:warning: NOTE: for some systems, the `gradlew.bat` command should be used instead of `./gradlew`.

Example of execution:
```bash
./gradlew :example:run
```

### Running the client with local Regula Document Reader web API installation
:warning: NOTE: for some systems, the `gradlew.bat` command should be used instead of `./gradlew`.

Get your [free trial here](https://mobile.regulaforensics.com/). When you receive the `regula.license` file, 
copy it to the [example resources](../example/src/main/resources) folder. Now you are ready for start!

Follow [the instructions](https://docs.regulaforensics.com/develop/doc-reader-sdk/web-service/) to run Regula Document Reader web API.
If the instance has been launched successfully, use the following line command to run the example:

```bash
API_BASE_PATH="http://127.0.0.1:8080" ./gradlew :example:run
```

### Output 
This sample generates the following text output:
```text
    ---------------------------------------------------------------------------
                   Document Overall Status: not valid
                    Document Number Visual: U0996738
                       Document Number MRZ: U0996738
        Validity Of Document Number Visual: 1
           Validity Of Document Number MRZ: 1
              MRZ-Visual values comparison: 1
    ---------------------------------------------------------------------------
```
Also, it stores [portrait](portrait.jpg) and [document image](document-image.jpg) images in the current folder.
You can modify [this example](../example/src/main/java/com/regula/documentreader/webclient/example/Main.java) 
and re-run it to get your own results.
