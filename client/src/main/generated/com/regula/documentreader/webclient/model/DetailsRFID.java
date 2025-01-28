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


/**
* DetailsRFID
*/
public class DetailsRFID {
        public static final String SERIALIZED_NAME_OVERALL_STATUS = "overallStatus";
        @SerializedName(SERIALIZED_NAME_OVERALL_STATUS)
            private Integer overallStatus;



        public static final String SERIALIZED_NAME_A_A = "AA";
        @SerializedName(SERIALIZED_NAME_A_A)
            private Integer AA;



        public static final String SERIALIZED_NAME_B_A_C = "BAC";
        @SerializedName(SERIALIZED_NAME_B_A_C)
            private Integer BAC;



        public static final String SERIALIZED_NAME_C_A = "CA";
        @SerializedName(SERIALIZED_NAME_C_A)
            private Integer CA;



        public static final String SERIALIZED_NAME_P_A = "PA";
        @SerializedName(SERIALIZED_NAME_P_A)
            private Integer PA;



        public static final String SERIALIZED_NAME_P_A_C_E = "PACE";
        @SerializedName(SERIALIZED_NAME_P_A_C_E)
            private Integer PACE;



        public static final String SERIALIZED_NAME_T_A = "TA";
        @SerializedName(SERIALIZED_NAME_T_A)
            private Integer TA;




            public DetailsRFID withOverallStatus(Integer overallStatus) {
              this.overallStatus = overallStatus;
              return this;
            }


    /**
        * Get overallStatus
    * @return overallStatus
    **/
    
    

        public Integer getOverallStatus() {
        return overallStatus;
    }


            public void setOverallStatus(Integer overallStatus) {
            this.overallStatus = overallStatus;
        }


            public DetailsRFID withAA(Integer AA) {
              this.AA = AA;
              return this;
            }


    /**
        * Get AA
    * @return AA
    **/
    
    

        public Integer getAA() {
        return AA;
    }


            public void setAA(Integer AA) {
            this.AA = AA;
        }


            public DetailsRFID withBAC(Integer BAC) {
              this.BAC = BAC;
              return this;
            }


    /**
        * Get BAC
    * @return BAC
    **/
    
    

        public Integer getBAC() {
        return BAC;
    }


            public void setBAC(Integer BAC) {
            this.BAC = BAC;
        }


            public DetailsRFID withCA(Integer CA) {
              this.CA = CA;
              return this;
            }


    /**
        * Get CA
    * @return CA
    **/
    
    

        public Integer getCA() {
        return CA;
    }


            public void setCA(Integer CA) {
            this.CA = CA;
        }


            public DetailsRFID withPA(Integer PA) {
              this.PA = PA;
              return this;
            }


    /**
        * Get PA
    * @return PA
    **/
    
    

        public Integer getPA() {
        return PA;
    }


            public void setPA(Integer PA) {
            this.PA = PA;
        }


            public DetailsRFID withPACE(Integer PACE) {
              this.PACE = PACE;
              return this;
            }


    /**
        * Get PACE
    * @return PACE
    **/
    
    

        public Integer getPACE() {
        return PACE;
    }


            public void setPACE(Integer PACE) {
            this.PACE = PACE;
        }


            public DetailsRFID withTA(Integer TA) {
              this.TA = TA;
              return this;
            }


    /**
        * Get TA
    * @return TA
    **/
    
    

        public Integer getTA() {
        return TA;
    }


            public void setTA(Integer TA) {
            this.TA = TA;
        }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
        return true;
        }
        if (o == null || getClass() != o.getClass()) {
        return false;
        }
            DetailsRFID detailsRFID = (DetailsRFID) o;
            return Objects.equals(this.overallStatus, detailsRFID.overallStatus) &&
            Objects.equals(this.AA, detailsRFID.AA) &&
            Objects.equals(this.BAC, detailsRFID.BAC) &&
            Objects.equals(this.CA, detailsRFID.CA) &&
            Objects.equals(this.PA, detailsRFID.PA) &&
            Objects.equals(this.PACE, detailsRFID.PACE) &&
            Objects.equals(this.TA, detailsRFID.TA);
    }

    @Override
    public int hashCode() {
        return Objects.hash(overallStatus, AA, BAC, CA, PA, PACE, TA);
    }


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class DetailsRFID {\n");
    sb.append("    overallStatus: ").append(toIndentedString(overallStatus)).append("\n");
    sb.append("    AA: ").append(toIndentedString(AA)).append("\n");
    sb.append("    BAC: ").append(toIndentedString(BAC)).append("\n");
    sb.append("    CA: ").append(toIndentedString(CA)).append("\n");
    sb.append("    PA: ").append(toIndentedString(PA)).append("\n");
    sb.append("    PACE: ").append(toIndentedString(PACE)).append("\n");
    sb.append("    TA: ").append(toIndentedString(TA)).append("\n");
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

