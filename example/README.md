# Regula Document Reader java client compatible with jvm and android

:bulb: Before you start: if you just want to play with an online demo, visit our [playground](https://api.regulaforensics.com).

Requirements:
- installed java 11+

Verify Java version:
```bash
java --version  
>  openjdk 14.0.1 2020-04-14
```

Cloning example:
```bash
git clone https://github.com/regulaforensics/DocumentReader-web-java-client.git
cd DocumentReader-web-java-client
```

### Running with local Regula Document Reader web API installation

:warning: NOTE: for some systems `gradlew.bat` command should be used, instead of `./gradlew`.

Follow [the instructions](https://docs.regulaforensics.com/web/quick-start-guide) to run Regula Document Reader web API. 
Assuming you have successfully launched instance, use next line command to run example:
```bash
./gradlew :example:run

# If Regula Document Reader web API is running not on localhost, specify host via env variable:
API_BASE_PATH="http://192.168.0.101:8080" ./gradlew :example:run
```

### Running using Regula Document Reader web API test SaaS

:warning: NOTE: for some systems `gradlew.bat` command should be used, instead of `./gradlew`.

Get your [free trial here](https://mobile.regulaforensics.com/). You should obtain `regula.license` file. 
Copy it to [example resources](../example/src/main/resources) folder. You are ready for running!

Execute example:
```bash
API_BASE_PATH="https://test-api.regulaforensics.com" ./gradlew :example:run
```

### Output 
This sample generates next text output:
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
Also, it creates [portrait](portrait.jpg) and [document image](document-image.jpg) pictures inside current folder.
Edit [example](../example/src/main/java/com/regula/documentreader/webclient/example/Main.java) on your own , and re-run to see your results.
