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
import com.regula.documentreader.webclient.model.RectangleCoordinates;
import com.regula.documentreader.webclient.model.SymbolCandidate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
* Describes a single character recognition results in the text field line
*/

public class SymbolRecognitionResult {
        public static final String SERIALIZED_NAME_SYMBOL_RECT = "SymbolRect";
        @SerializedName(SERIALIZED_NAME_SYMBOL_RECT)
            private RectangleCoordinates symbolRect;



        public static final String SERIALIZED_NAME_CANDIDATES_COUNT = "CandidatesCount";
        @SerializedName(SERIALIZED_NAME_CANDIDATES_COUNT)
            private BigDecimal candidatesCount;



        public static final String SERIALIZED_NAME_LIST_OF_CANDIDATES = "ListOfCandidates";
        @SerializedName(SERIALIZED_NAME_LIST_OF_CANDIDATES)
                private List<SymbolCandidate> listOfCandidates = new ArrayList<SymbolCandidate>();



        public static final String SERIALIZED_NAME_RESERVED = "Reserved";
        @SerializedName(SERIALIZED_NAME_RESERVED)
            private Object reserved = null;




            public SymbolRecognitionResult withSymbolRect(RectangleCoordinates symbolRect) {
              this.symbolRect = symbolRect;
              return this;
            }


    /**
        * Get symbolRect
    * @return symbolRect
    **/
    
    

        public RectangleCoordinates getSymbolRect() {
        return symbolRect;
    }


            public void setSymbolRect(RectangleCoordinates symbolRect) {
            this.symbolRect = symbolRect;
        }


            public SymbolRecognitionResult withCandidatesCount(BigDecimal candidatesCount) {
              this.candidatesCount = candidatesCount;
              return this;
            }


    /**
        * Number of significant elements of ListOfCandidates array
    * @return candidatesCount
    **/
    
    

        public BigDecimal getCandidatesCount() {
        return candidatesCount;
    }


            public void setCandidatesCount(BigDecimal candidatesCount) {
            this.candidatesCount = candidatesCount;
        }


            public SymbolRecognitionResult withListOfCandidates(List<SymbolCandidate> listOfCandidates) {
              this.listOfCandidates = listOfCandidates;
              return this;
            }

            public SymbolRecognitionResult addListOfCandidatesItem(SymbolCandidate listOfCandidatesItem) {
                this.listOfCandidates.add(listOfCandidatesItem);
                return this;
            }

    /**
        * Array of candidate characters. Sorted in descending order of recognition probabilities (the first element has highest probability)
    * @return listOfCandidates
    **/
    
    

        public  List<SymbolCandidate> getListOfCandidates() {
        return listOfCandidates;
    }


            public void setListOfCandidates(List<SymbolCandidate> listOfCandidates) {
            this.listOfCandidates = listOfCandidates;
        }


            public SymbolRecognitionResult withReserved(Object reserved) {
              this.reserved = reserved;
              return this;
            }


    /**
        * Get reserved
    * @return reserved
    **/
        @javax.annotation.Nullable
    
    

        public Object getReserved() {
        return reserved;
    }


            public void setReserved(Object reserved) {
            this.reserved = reserved;
        }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
        return true;
        }
        if (o == null || getClass() != o.getClass()) {
        return false;
        }
            SymbolRecognitionResult symbolRecognitionResult = (SymbolRecognitionResult) o;
            return Objects.equals(this.symbolRect, symbolRecognitionResult.symbolRect) &&
            Objects.equals(this.candidatesCount, symbolRecognitionResult.candidatesCount) &&
            Objects.equals(this.listOfCandidates, symbolRecognitionResult.listOfCandidates) &&
            Objects.equals(this.reserved, symbolRecognitionResult.reserved);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbolRect, candidatesCount, listOfCandidates, reserved);
    }


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class SymbolRecognitionResult {\n");
    sb.append("    symbolRect: ").append(toIndentedString(symbolRect)).append("\n");
    sb.append("    candidatesCount: ").append(toIndentedString(candidatesCount)).append("\n");
    sb.append("    listOfCandidates: ").append(toIndentedString(listOfCandidates)).append("\n");
    sb.append("    reserved: ").append(toIndentedString(reserved)).append("\n");
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

