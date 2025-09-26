# Development

Java client is written using java7. Development environment requires java11+.
Models generation based on [openapi spec](https://github.com/regulaforensics/DocumentReader-api-openapi). 

## Generation

To regenerate models from openapi definition, 
clone [latest open api definitions](https://github.com/regulaforensics/DocumentReader-api-openapi) 
and use next command from the project root.
```bash
./update-models.sh
```

## Generator configuration Features

1. Two client generation modes have been added: 
strict (for client testing) and lenient (for release). 
In strict mode, the client will throw an exception if the 
types do not match or the required fields are missing; 
in lenient mode, error data will be output as a warning to 
the console. The templates for generating these modes 
are located in the generator-templates folder.
2. When generating oneOf schemas, the generator creates its 
own abstract class, which does not look like it would like. 
The problem was solved by replacing the abstract generator 
class with ours using typeMappings in the generator config.
3. The generator treats the discriminator value as a string, 
but in our case it's numbers. To solve this problem, changes 
have been made to the pojo.mustache template (for both modes).
4. Disabled validation of additional JSON fields in 
the pojo.mustache template (for both modes).
5. The generator replaces the list field with _list, solved 
using nameMappings in the generator config.

## Problem solving

To solve new problems, use the generator 
settings ([java](https://github.com/OpenAPITools/openapi-generator/blob/master/docs/generators/java.md), 
[common](https://github.com/OpenAPITools/openapi-generator/blob/master/docs/customization.md)) 
and [templates](https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator/src/main/resources/Java/libraries/okhttp-gson).

**Do not edit the generated files! They will be overwritten after generation!**
