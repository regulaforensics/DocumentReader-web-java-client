/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core 
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
* Structure contains information on a certificate validity.
*/

public class RfidValidity {
        public static final String SERIALIZED_NAME_NOT_BEFORE = "NotBefore";
        @SerializedName(SERIALIZED_NAME_NOT_BEFORE)
            private TrfFtString notBefore;



        public static final String SERIALIZED_NAME_NOT_AFTER = "NotAfter";
        @SerializedName(SERIALIZED_NAME_NOT_AFTER)
            private TrfFtString notAfter;




            public RfidValidity withNotBefore(TrfFtString notBefore) {
              this.notBefore = notBefore;
              return this;
            }


    /**
        * Get notBefore
    * @return notBefore
    **/
    
    

        public TrfFtString getNotBefore() {
        return notBefore;
    }


            public void setNotBefore(TrfFtString notBefore) {
            this.notBefore = notBefore;
        }


            public RfidValidity withNotAfter(TrfFtString notAfter) {
              this.notAfter = notAfter;
              return this;
            }


    /**
        * Get notAfter
    * @return notAfter
    **/
    
    

        public TrfFtString getNotAfter() {
        return notAfter;
    }


            public void setNotAfter(TrfFtString notAfter) {
            this.notAfter = notAfter;
        }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
        return true;
        }
        if (o == null || getClass() != o.getClass()) {
        return false;
        }
            RfidValidity rfidValidity = (RfidValidity) o;
            return Objects.equals(this.notBefore, rfidValidity.notBefore) &&
            Objects.equals(this.notAfter, rfidValidity.notAfter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notBefore, notAfter);
    }


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class RfidValidity {\n");
    sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
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

