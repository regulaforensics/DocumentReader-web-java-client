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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;


/**
* Structure is used to describe the contents of secure data access key within the context of the communication session with electronic document
*/

public class RfidAccessKey {
        public static final String SERIALIZED_NAME_ACCESS_KEY = "AccessKey";
        @SerializedName(SERIALIZED_NAME_ACCESS_KEY)
            private String accessKey;



        public static final String SERIALIZED_NAME_KEY_TYPE = "KeyType";
        @SerializedName(SERIALIZED_NAME_KEY_TYPE)
            private Integer keyType;



        public static final String SERIALIZED_NAME_ACCESS_TYPE = "AccessType";
        @SerializedName(SERIALIZED_NAME_ACCESS_TYPE)
            private Integer accessType;



        public static final String SERIALIZED_NAME_CHECK_FULL_KEY_MATCHING = "CheckFullKeyMatching";
        @SerializedName(SERIALIZED_NAME_CHECK_FULL_KEY_MATCHING)
            private Boolean checkFullKeyMatching;




            public RfidAccessKey withAccessKey(String accessKey) {
              this.accessKey = accessKey;
              return this;
            }


    /**
        * Key contents
    * @return accessKey
    **/
    
    

        public String getAccessKey() {
        return accessKey;
    }


            public void setAccessKey(String accessKey) {
            this.accessKey = accessKey;
        }


            public RfidAccessKey withKeyType(Integer keyType) {
              this.keyType = keyType;
              return this;
            }


    /**
        * Get keyType
    * @return keyType
    **/
    
    

        public Integer getKeyType() {
        return keyType;
    }


            public void setKeyType(Integer keyType) {
            this.keyType = keyType;
        }


            public RfidAccessKey withAccessType(Integer accessType) {
              this.accessType = accessType;
              return this;
            }


    /**
        * Get accessType
    * @return accessType
    **/
    
    

        public Integer getAccessType() {
        return accessType;
    }


            public void setAccessType(Integer accessType) {
            this.accessType = accessType;
        }


            public RfidAccessKey withCheckFullKeyMatching(Boolean checkFullKeyMatching) {
              this.checkFullKeyMatching = checkFullKeyMatching;
              return this;
            }


    /**
        * Logical sign of the need for a full comparison of AccessKey contents with the contents of DG1 (MRZ) data group
    * @return checkFullKeyMatching
    **/
    
    

        public Boolean getCheckFullKeyMatching() {
        return checkFullKeyMatching;
    }


            public void setCheckFullKeyMatching(Boolean checkFullKeyMatching) {
            this.checkFullKeyMatching = checkFullKeyMatching;
        }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
        return true;
        }
        if (o == null || getClass() != o.getClass()) {
        return false;
        }
            RfidAccessKey rfidAccessKey = (RfidAccessKey) o;
            return Objects.equals(this.accessKey, rfidAccessKey.accessKey) &&
            Objects.equals(this.keyType, rfidAccessKey.keyType) &&
            Objects.equals(this.accessType, rfidAccessKey.accessType) &&
            Objects.equals(this.checkFullKeyMatching, rfidAccessKey.checkFullKeyMatching);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKey, keyType, accessType, checkFullKeyMatching);
    }


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class RfidAccessKey {\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    checkFullKeyMatching: ").append(toIndentedString(checkFullKeyMatching)).append("\n");
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

