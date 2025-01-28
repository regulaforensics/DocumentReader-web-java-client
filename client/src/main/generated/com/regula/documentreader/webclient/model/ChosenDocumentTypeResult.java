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
import com.regula.documentreader.webclient.model.AuthenticityResult;
import com.regula.documentreader.webclient.model.ByteArrayResult;
import com.regula.documentreader.webclient.model.ChosenDocumentTypeResult;
import com.regula.documentreader.webclient.model.ChosenDocumentTypeResultAllOf;
import com.regula.documentreader.webclient.model.DocBarCodeInfo;
import com.regula.documentreader.webclient.model.DocumentBinaryInfoResult;
import com.regula.documentreader.webclient.model.DocumentImageResult;
import com.regula.documentreader.webclient.model.DocumentPositionResult;
import com.regula.documentreader.webclient.model.DocumentTypesCandidatesResult;
import com.regula.documentreader.webclient.model.EncryptedRCLResult;
import com.regula.documentreader.webclient.model.GraphicsResult;
import com.regula.documentreader.webclient.model.ImageQualityResult;
import com.regula.documentreader.webclient.model.ImagesResult;
import com.regula.documentreader.webclient.model.LexicalAnalysisResult;
import com.regula.documentreader.webclient.model.LicenseResult;
import com.regula.documentreader.webclient.model.OneCandidate;
import com.regula.documentreader.webclient.model.ResultItem;
import com.regula.documentreader.webclient.model.StatusResult;
import com.regula.documentreader.webclient.model.TextDataResult;
import com.regula.documentreader.webclient.model.TextResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;


/**
* Contains information about the type of document that was determined based on the analysis of the provided image
*/

public class ChosenDocumentTypeResult extends ResultItem {
        public static final String SERIALIZED_NAME_ONE_CANDIDATE = "OneCandidate";
        @SerializedName(SERIALIZED_NAME_ONE_CANDIDATE)
            private OneCandidate oneCandidate;



        public static final String SERIALIZED_NAME_XM_L_BUFFER = "XML_buffer";
        @SerializedName(SERIALIZED_NAME_XM_L_BUFFER)
            private String xmLBuffer;




            public ChosenDocumentTypeResult withOneCandidate(OneCandidate oneCandidate) {
              this.oneCandidate = oneCandidate;
              return this;
            }


    /**
        * Get oneCandidate
    * @return oneCandidate
    **/
    
    

        public OneCandidate getOneCandidate() {
        return oneCandidate;
    }


            public void setOneCandidate(OneCandidate oneCandidate) {
            this.oneCandidate = oneCandidate;
        }


    /**
        * Get xmLBuffer
    * @return xmLBuffer
    **/
        @javax.annotation.Nullable
    
    

        public String getXmLBuffer() {
        return xmLBuffer;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
        return true;
        }
        if (o == null || getClass() != o.getClass()) {
        return false;
        }
            ChosenDocumentTypeResult chosenDocumentTypeResult = (ChosenDocumentTypeResult) o;
            return Objects.equals(this.oneCandidate, chosenDocumentTypeResult.oneCandidate) &&
            Objects.equals(this.xmLBuffer, chosenDocumentTypeResult.xmLBuffer) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oneCandidate, xmLBuffer, super.hashCode());
    }


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class ChosenDocumentTypeResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    oneCandidate: ").append(toIndentedString(oneCandidate)).append("\n");
    sb.append("    xmLBuffer: ").append(toIndentedString(xmLBuffer)).append("\n");
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

