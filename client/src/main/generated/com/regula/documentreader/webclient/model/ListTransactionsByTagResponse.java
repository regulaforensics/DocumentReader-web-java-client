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
import com.regula.documentreader.webclient.model.GetTransactionsByTagResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
* ListTransactionsByTagResponse
*/
public class ListTransactionsByTagResponse {
        public static final String SERIALIZED_NAME_ITEMS = "items";
        @SerializedName(SERIALIZED_NAME_ITEMS)
                private List<GetTransactionsByTagResponse> items = null;



        public static final String SERIALIZED_NAME_METADATA = "metadata";
        @SerializedName(SERIALIZED_NAME_METADATA)
                private Map<String, Object> metadata = null;




            public ListTransactionsByTagResponse withItems(List<GetTransactionsByTagResponse> items) {
              this.items = items;
              return this;
            }

            public ListTransactionsByTagResponse addItemsItem(GetTransactionsByTagResponse itemsItem) {
                    if (this.items == null) {
                    this.items = new ArrayList<GetTransactionsByTagResponse>();
                    }
                this.items.add(itemsItem);
                return this;
            }

    /**
        * Get items
    * @return items
    **/
        @javax.annotation.Nullable
    
    

        public  List<GetTransactionsByTagResponse> getItems() {
        return items;
    }


            public void setItems(List<GetTransactionsByTagResponse> items) {
            this.items = items;
        }


            public ListTransactionsByTagResponse withMetadata(Map<String, Object> metadata) {
              this.metadata = metadata;
              return this;
            }


            public ListTransactionsByTagResponse putMetadataItem(String key, Object metadataItem) {
                    if (this.metadata == null) {
                    this.metadata = new HashMap<String, Object>();
                    }
                this.metadata.put(key, metadataItem);
                return this;
            }

    /**
        * Get metadata
    * @return metadata
    **/
        @javax.annotation.Nullable
    
    

        public Map<String, Object> getMetadata() {
        return metadata;
    }


            public void setMetadata(Map<String, Object> metadata) {
            this.metadata = metadata;
        }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
        return true;
        }
        if (o == null || getClass() != o.getClass()) {
        return false;
        }
            ListTransactionsByTagResponse listTransactionsByTagResponse = (ListTransactionsByTagResponse) o;
            return Objects.equals(this.items, listTransactionsByTagResponse.items) &&
            Objects.equals(this.metadata, listTransactionsByTagResponse.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, metadata);
    }


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class ListTransactionsByTagResponse {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

