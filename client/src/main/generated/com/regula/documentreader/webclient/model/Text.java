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
import com.regula.documentreader.webclient.model.TextAvailableSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
* Contains all document text fields data with validity and cross-source compare checks
*/

public class Text {
        public static final String SERIALIZED_NAME_STATUS = "status";
        @SerializedName(SERIALIZED_NAME_STATUS)
            private Integer status;



        public static final String SERIALIZED_NAME_VALIDITY_STATUS = "validityStatus";
        @SerializedName(SERIALIZED_NAME_VALIDITY_STATUS)
            private Integer validityStatus;



        public static final String SERIALIZED_NAME_COMPARISON_STATUS = "comparisonStatus";
        @SerializedName(SERIALIZED_NAME_COMPARISON_STATUS)
            private Integer comparisonStatus;



        public static final String SERIALIZED_NAME_DATE_FORMAT = "dateFormat";
        @SerializedName(SERIALIZED_NAME_DATE_FORMAT)
            private String dateFormat;



        public static final String SERIALIZED_NAME_FIELD_LIST = "fieldList";
        @SerializedName(SERIALIZED_NAME_FIELD_LIST)
                private List<com.regula.documentreader.webclient.model.ext.TextField> fieldList = new ArrayList<com.regula.documentreader.webclient.model.ext.TextField>();



        public static final String SERIALIZED_NAME_AVAILABLE_SOURCE_LIST = "availableSourceList";
        @SerializedName(SERIALIZED_NAME_AVAILABLE_SOURCE_LIST)
                private List<TextAvailableSource> availableSourceList = new ArrayList<TextAvailableSource>();




            public Text withStatus(Integer status) {
              this.status = status;
              return this;
            }


    /**
        * Get status
    * @return status
    **/
    
    

        public Integer getStatus() {
        return status;
    }


            public void setStatus(Integer status) {
            this.status = status;
        }


            public Text withValidityStatus(Integer validityStatus) {
              this.validityStatus = validityStatus;
              return this;
            }


    /**
        * Get validityStatus
    * @return validityStatus
    **/
    
    

        public Integer getValidityStatus() {
        return validityStatus;
    }


            public void setValidityStatus(Integer validityStatus) {
            this.validityStatus = validityStatus;
        }


            public Text withComparisonStatus(Integer comparisonStatus) {
              this.comparisonStatus = comparisonStatus;
              return this;
            }


    /**
        * Get comparisonStatus
    * @return comparisonStatus
    **/
    
    

        public Integer getComparisonStatus() {
        return comparisonStatus;
    }


            public void setComparisonStatus(Integer comparisonStatus) {
            this.comparisonStatus = comparisonStatus;
        }


            public Text withDateFormat(String dateFormat) {
              this.dateFormat = dateFormat;
              return this;
            }


    /**
        * Date format
    * @return dateFormat
    **/
    
    

        public String getDateFormat() {
        return dateFormat;
    }


            public void setDateFormat(String dateFormat) {
            this.dateFormat = dateFormat;
        }


            public Text withFieldList(List<com.regula.documentreader.webclient.model.ext.TextField> fieldList) {
              this.fieldList = fieldList;
              return this;
            }

            public Text addFieldListItem(com.regula.documentreader.webclient.model.ext.TextField fieldListItem) {
                this.fieldList.add(fieldListItem);
                return this;
            }

    /**
        * Get fieldList
    * @return fieldList
    **/
    
    

        public  List<com.regula.documentreader.webclient.model.ext.TextField> getFieldList() {
        return fieldList;
    }


            public void setFieldList(List<com.regula.documentreader.webclient.model.ext.TextField> fieldList) {
            this.fieldList = fieldList;
        }


            public Text withAvailableSourceList(List<TextAvailableSource> availableSourceList) {
              this.availableSourceList = availableSourceList;
              return this;
            }

            public Text addAvailableSourceListItem(TextAvailableSource availableSourceListItem) {
                this.availableSourceList.add(availableSourceListItem);
                return this;
            }

    /**
        * Get availableSourceList
    * @return availableSourceList
    **/
    
    

        public  List<TextAvailableSource> getAvailableSourceList() {
        return availableSourceList;
    }


            public void setAvailableSourceList(List<TextAvailableSource> availableSourceList) {
            this.availableSourceList = availableSourceList;
        }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
        return true;
        }
        if (o == null || getClass() != o.getClass()) {
        return false;
        }
            Text text = (Text) o;
            return Objects.equals(this.status, text.status) &&
            Objects.equals(this.validityStatus, text.validityStatus) &&
            Objects.equals(this.comparisonStatus, text.comparisonStatus) &&
            Objects.equals(this.dateFormat, text.dateFormat) &&
            Objects.equals(this.fieldList, text.fieldList) &&
            Objects.equals(this.availableSourceList, text.availableSourceList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, validityStatus, comparisonStatus, dateFormat, fieldList, availableSourceList);
    }


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class Text {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    validityStatus: ").append(toIndentedString(validityStatus)).append("\n");
    sb.append("    comparisonStatus: ").append(toIndentedString(comparisonStatus)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    fieldList: ").append(toIndentedString(fieldList)).append("\n");
    sb.append("    availableSourceList: ").append(toIndentedString(availableSourceList)).append("\n");
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

