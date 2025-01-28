/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.   # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core 
 *
 * The version of the OpenAPI document: 7.4.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.regula.documentreader.webclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.regula.documentreader.webclient.model.TrfFtString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;


/**
* Structure contains information that serves as the distinguished name (identifier) of an object.
*/

public class RfidAttributeName {
        public static final String SERIALIZED_NAME_TYPE = "Type";
        @SerializedName(SERIALIZED_NAME_TYPE)
            private String type;



        public static final String SERIALIZED_NAME_VALUE = "Value";
        @SerializedName(SERIALIZED_NAME_VALUE)
            private TrfFtString value;




            public RfidAttributeName withType(String type) {
              this.type = type;
              return this;
            }


    /**
        * Attribute identifier (OID ASCII string); contents of the identifier in the format S1 (S2), where S1 – attribute name, S2 – identifier (OID string)
    * @return type
    **/
    
    

        public String getType() {
        return type;
    }


            public void setType(String type) {
            this.type = type;
        }


            public RfidAttributeName withValue(TrfFtString value) {
              this.value = value;
              return this;
            }


    /**
        * Get value
    * @return value
    **/
    
    

        public TrfFtString getValue() {
        return value;
    }


            public void setValue(TrfFtString value) {
            this.value = value;
        }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
        return true;
        }
        if (o == null || getClass() != o.getClass()) {
        return false;
        }
            RfidAttributeName rfidAttributeName = (RfidAttributeName) o;
            return Objects.equals(this.type, rfidAttributeName.type) &&
            Objects.equals(this.value, rfidAttributeName.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value);
    }


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class RfidAttributeName {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
sb.append("}");
return sb.toString();
}

/**
* Convert the given object to string with each line indented by 4 spaces
* (except the first line).
*/
private String toIndentedString(java.lang.Object o) {
if (o == null) {
return "null";
}
return o.toString().replace("\n", "\n    ");
}

}

