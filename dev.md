# Development

Java client is written using java7. Development environment requires java11+.
Models generation based on [openapi spec](https://github.com/regulaforensics/DocumentReader-api-openapi). 

## Enums
Instead of using enums, generator produces static constants. 

## 4-cycle generation
1. Generate enums as constants
2. Generate normal models with substituted by primitive values enums
3. Replace links to generated models by extend one
4. Replace links to generated models by extend one. For models, that was skipped from generation on step 3 


To regenerate models from openapi definition, 
clone [latest open api definitions](https://github.com/regulaforensics/DocumentReader-api-openapi)
and set `DOCS_DEFINITION_FOLDER` as path to cloned directory.
```bash
export DOCS_DEFINITION_FOLDER="/home/user/projects/DocumentReader-api-openapi"
```
Then use next command from the project root.
```bash
./update-models.sh
```
