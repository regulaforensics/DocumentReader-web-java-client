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
import com.regula.documentreader.webclient.model.BinaryData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;


/**
* TDocBinaryInfo
*/
public class TDocBinaryInfo {
        public static final String SERIALIZED_NAME_R_F_I_D_B_I_N_A_R_Y_D_A_T_A = "RFID_BINARY_DATA";
        @SerializedName(SERIALIZED_NAME_R_F_I_D_B_I_N_A_R_Y_D_A_T_A)
            private BinaryData RFID_BINARY_DATA;




            public TDocBinaryInfo withRFIDBINARYDATA(BinaryData RFID_BINARY_DATA) {
              this.RFID_BINARY_DATA = RFID_BINARY_DATA;
              return this;
            }


    /**
        * Get RFID_BINARY_DATA
    * @return RFID_BINARY_DATA
    **/
    
    

        public BinaryData getRFIDBINARYDATA() {
        return RFID_BINARY_DATA;
    }


            public void setRFIDBINARYDATA(BinaryData RFID_BINARY_DATA) {
            this.RFID_BINARY_DATA = RFID_BINARY_DATA;
        }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
        return true;
        }
        if (o == null || getClass() != o.getClass()) {
        return false;
        }
            TDocBinaryInfo tdocBinaryInfo = (TDocBinaryInfo) o;
            return Objects.equals(this.RFID_BINARY_DATA, tdocBinaryInfo.RFID_BINARY_DATA);
    }

    @Override
    public int hashCode() {
        return Objects.hash(RFID_BINARY_DATA);
    }


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class TDocBinaryInfo {\n");
    sb.append("    RFID_BINARY_DATA: ").append(toIndentedString(RFID_BINARY_DATA)).append("\n");
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

