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
* DocumentsDatabase
*/
public class DocumentsDatabase {
        public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
        @SerializedName(SERIALIZED_NAME_DESCRIPTION)
            private String description;



        public static final String SERIALIZED_NAME_EXPORT_DATE = "ExportDate";
        @SerializedName(SERIALIZED_NAME_EXPORT_DATE)
            private String exportDate;



        public static final String SERIALIZED_NAME_I_D = "ID";
        @SerializedName(SERIALIZED_NAME_I_D)
            private String ID;



        public static final String SERIALIZED_NAME_VERSION = "Version";
        @SerializedName(SERIALIZED_NAME_VERSION)
            private String version;




            public DocumentsDatabase withDescription(String description) {
              this.description = description;
              return this;
            }


    /**
        * Get description
    * @return description
    **/
        @javax.annotation.Nullable
    
    

        public String getDescription() {
        return description;
    }


            public void setDescription(String description) {
            this.description = description;
        }


            public DocumentsDatabase withExportDate(String exportDate) {
              this.exportDate = exportDate;
              return this;
            }


    /**
        * Get exportDate
    * @return exportDate
    **/
        @javax.annotation.Nullable
    
    

        public String getExportDate() {
        return exportDate;
    }


            public void setExportDate(String exportDate) {
            this.exportDate = exportDate;
        }


            public DocumentsDatabase withID(String ID) {
              this.ID = ID;
              return this;
            }


    /**
        * Get ID
    * @return ID
    **/
        @javax.annotation.Nullable
    
    

        public String getID() {
        return ID;
    }


            public void setID(String ID) {
            this.ID = ID;
        }


            public DocumentsDatabase withVersion(String version) {
              this.version = version;
              return this;
            }


    /**
        * Get version
    * @return version
    **/
        @javax.annotation.Nullable
    
    

        public String getVersion() {
        return version;
    }


            public void setVersion(String version) {
            this.version = version;
        }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
        return true;
        }
        if (o == null || getClass() != o.getClass()) {
        return false;
        }
            DocumentsDatabase documentsDatabase = (DocumentsDatabase) o;
            return Objects.equals(this.description, documentsDatabase.description) &&
            Objects.equals(this.exportDate, documentsDatabase.exportDate) &&
            Objects.equals(this.ID, documentsDatabase.ID) &&
            Objects.equals(this.version, documentsDatabase.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, exportDate, ID, version);
    }


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class DocumentsDatabase {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    exportDate: ").append(toIndentedString(exportDate)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

