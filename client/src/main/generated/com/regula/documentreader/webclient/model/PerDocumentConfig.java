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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
* PerDocumentConfig
*/
public class PerDocumentConfig {
        public static final String SERIALIZED_NAME_DOC_I_D = "docID";
        @SerializedName(SERIALIZED_NAME_DOC_I_D)
                private List<Integer> docID = null;



        public static final String SERIALIZED_NAME_EXCLUDE_AUTH_CHECKS = "excludeAuthChecks";
        @SerializedName(SERIALIZED_NAME_EXCLUDE_AUTH_CHECKS)
            private Integer excludeAuthChecks;




            public PerDocumentConfig withDocID(List<Integer> docID) {
              this.docID = docID;
              return this;
            }

            public PerDocumentConfig addDocIDItem(Integer docIDItem) {
                    if (this.docID == null) {
                    this.docID = new ArrayList<Integer>();
                    }
                this.docID.add(docIDItem);
                return this;
            }

    /**
        * Specific template IDs, for which apply current custom configuration
    * @return docID
    **/
        @javax.annotation.Nullable
    
    

        public  List<Integer> getDocID() {
        return docID;
    }


            public void setDocID(List<Integer> docID) {
            this.docID = docID;
        }


            public PerDocumentConfig withExcludeAuthChecks(Integer excludeAuthChecks) {
              this.excludeAuthChecks = excludeAuthChecks;
              return this;
            }


    /**
        * Contains items from AuthenticityResultType as sum via OR operation
    * @return excludeAuthChecks
    **/
        @javax.annotation.Nullable
    
    

        public Integer getExcludeAuthChecks() {
        return excludeAuthChecks;
    }


            public void setExcludeAuthChecks(Integer excludeAuthChecks) {
            this.excludeAuthChecks = excludeAuthChecks;
        }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
        return true;
        }
        if (o == null || getClass() != o.getClass()) {
        return false;
        }
            PerDocumentConfig perDocumentConfig = (PerDocumentConfig) o;
            return Objects.equals(this.docID, perDocumentConfig.docID) &&
            Objects.equals(this.excludeAuthChecks, perDocumentConfig.excludeAuthChecks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(docID, excludeAuthChecks);
    }


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class PerDocumentConfig {\n");
    sb.append("    docID: ").append(toIndentedString(docID)).append("\n");
    sb.append("    excludeAuthChecks: ").append(toIndentedString(excludeAuthChecks)).append("\n");
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

