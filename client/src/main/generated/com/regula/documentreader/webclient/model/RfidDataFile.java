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
import com.regula.documentreader.webclient.model.TrfFtBytes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
* Structure is used to describe the contents of a single file of the LDS of electronic document and the analysis of its contents within the context of the communication session with electronic document
*/

public class RfidDataFile {
        public static final String SERIALIZED_NAME_FILE_I_D = "FileID";
        @SerializedName(SERIALIZED_NAME_FILE_I_D)
            private String fileID;



        public static final String SERIALIZED_NAME_TYPE = "Type";
        @SerializedName(SERIALIZED_NAME_TYPE)
            private Integer type;



        public static final String SERIALIZED_NAME_FILE_DATA = "FileData";
        @SerializedName(SERIALIZED_NAME_FILE_DATA)
            private TrfFtBytes fileData;



        public static final String SERIALIZED_NAME_READING_STATUS = "ReadingStatus";
        @SerializedName(SERIALIZED_NAME_READING_STATUS)
            private Integer readingStatus;



        public static final String SERIALIZED_NAME_READING_TIME = "ReadingTime";
        @SerializedName(SERIALIZED_NAME_READING_TIME)
            private BigDecimal readingTime;



        public static final String SERIALIZED_NAME_PA_STATUS = "PA_Status";
        @SerializedName(SERIALIZED_NAME_PA_STATUS)
            private Integer paStatus;



        public static final String SERIALIZED_NAME_NOTIFICATIONS = "Notifications";
        @SerializedName(SERIALIZED_NAME_NOTIFICATIONS)
                private List<Integer> notifications = new ArrayList<Integer>();



        public static final String SERIALIZED_NAME_DOC_FIELDS_TEXT = "DocFields_Text";
        @SerializedName(SERIALIZED_NAME_DOC_FIELDS_TEXT)
                private List<Integer> docFieldsText = new ArrayList<Integer>();



        public static final String SERIALIZED_NAME_DOC_FIELDS_GRAPHICS = "DocFields_Graphics";
        @SerializedName(SERIALIZED_NAME_DOC_FIELDS_GRAPHICS)
                private List<Integer> docFieldsGraphics = new ArrayList<Integer>();



        public static final String SERIALIZED_NAME_DOC_FIELDS_ORIGINALS = "DocFields_Originals";
        @SerializedName(SERIALIZED_NAME_DOC_FIELDS_ORIGINALS)
                private List<Integer> docFieldsOriginals = new ArrayList<Integer>();




            public RfidDataFile withFileID(String fileID) {
              this.fileID = fileID;
              return this;
            }


    /**
        * File identifier. Each byte of FileID represented by its hexadecimal value. The individual bytes are separated by spaces (e.g. 01 1E)
    * @return fileID
    **/
        @javax.annotation.Nullable
    
    

        public String getFileID() {
        return fileID;
    }


            public void setFileID(String fileID) {
            this.fileID = fileID;
        }


            public RfidDataFile withType(Integer type) {
              this.type = type;
              return this;
            }


    /**
        * Get type
    * @return type
    **/
    
    

        public Integer getType() {
        return type;
    }


            public void setType(Integer type) {
            this.type = type;
        }


            public RfidDataFile withFileData(TrfFtBytes fileData) {
              this.fileData = fileData;
              return this;
            }


    /**
        * Get fileData
    * @return fileData
    **/
        @javax.annotation.Nullable
    
    

        public TrfFtBytes getFileData() {
        return fileData;
    }


            public void setFileData(TrfFtBytes fileData) {
            this.fileData = fileData;
        }


            public RfidDataFile withReadingStatus(Integer readingStatus) {
              this.readingStatus = readingStatus;
              return this;
            }


    /**
        * Get readingStatus
    * @return readingStatus
    **/
    
    

        public Integer getReadingStatus() {
        return readingStatus;
    }


            public void setReadingStatus(Integer readingStatus) {
            this.readingStatus = readingStatus;
        }


            public RfidDataFile withReadingTime(BigDecimal readingTime) {
              this.readingTime = readingTime;
              return this;
            }


    /**
        * Time of reading, milliseconds
    * @return readingTime
    **/
    
    

        public BigDecimal getReadingTime() {
        return readingTime;
    }


            public void setReadingTime(BigDecimal readingTime) {
            this.readingTime = readingTime;
        }


            public RfidDataFile withPaStatus(Integer paStatus) {
              this.paStatus = paStatus;
              return this;
            }


    /**
        * Get paStatus
    * @return paStatus
    **/
    
    

        public Integer getPaStatus() {
        return paStatus;
    }


            public void setPaStatus(Integer paStatus) {
            this.paStatus = paStatus;
        }


            public RfidDataFile withNotifications(List<Integer> notifications) {
              this.notifications = notifications;
              return this;
            }

            public RfidDataFile addNotificationsItem(Integer notificationsItem) {
                this.notifications.add(notificationsItem);
                return this;
            }

    /**
        * List of remarks arisen when reading data from the memory of the chip and analysing their ASN.1-structure.
    * @return notifications
    **/
    
    

        public  List<Integer> getNotifications() {
        return notifications;
    }


            public void setNotifications(List<Integer> notifications) {
            this.notifications = notifications;
        }


            public RfidDataFile withDocFieldsText(List<Integer> docFieldsText) {
              this.docFieldsText = docFieldsText;
              return this;
            }

            public RfidDataFile addDocFieldsTextItem(Integer docFieldsTextItem) {
                this.docFieldsText.add(docFieldsTextItem);
                return this;
            }

    /**
        * List of document text fields formed on the basis of the file contents
    * @return docFieldsText
    **/
    
    

        public  List<Integer> getDocFieldsText() {
        return docFieldsText;
    }


            public void setDocFieldsText(List<Integer> docFieldsText) {
            this.docFieldsText = docFieldsText;
        }


            public RfidDataFile withDocFieldsGraphics(List<Integer> docFieldsGraphics) {
              this.docFieldsGraphics = docFieldsGraphics;
              return this;
            }

            public RfidDataFile addDocFieldsGraphicsItem(Integer docFieldsGraphicsItem) {
                this.docFieldsGraphics.add(docFieldsGraphicsItem);
                return this;
            }

    /**
        * List of document graphic fields formed on the basis of the file contents
    * @return docFieldsGraphics
    **/
    
    

        public  List<Integer> getDocFieldsGraphics() {
        return docFieldsGraphics;
    }


            public void setDocFieldsGraphics(List<Integer> docFieldsGraphics) {
            this.docFieldsGraphics = docFieldsGraphics;
        }


            public RfidDataFile withDocFieldsOriginals(List<Integer> docFieldsOriginals) {
              this.docFieldsOriginals = docFieldsOriginals;
              return this;
            }

            public RfidDataFile addDocFieldsOriginalsItem(Integer docFieldsOriginalsItem) {
                this.docFieldsOriginals.add(docFieldsOriginalsItem);
                return this;
            }

    /**
        * List of the original binary representation of graphic document fields formed on the basis of the file contents
    * @return docFieldsOriginals
    **/
    
    

        public  List<Integer> getDocFieldsOriginals() {
        return docFieldsOriginals;
    }


            public void setDocFieldsOriginals(List<Integer> docFieldsOriginals) {
            this.docFieldsOriginals = docFieldsOriginals;
        }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
        return true;
        }
        if (o == null || getClass() != o.getClass()) {
        return false;
        }
            RfidDataFile rfidDataFile = (RfidDataFile) o;
            return Objects.equals(this.fileID, rfidDataFile.fileID) &&
            Objects.equals(this.type, rfidDataFile.type) &&
            Objects.equals(this.fileData, rfidDataFile.fileData) &&
            Objects.equals(this.readingStatus, rfidDataFile.readingStatus) &&
            Objects.equals(this.readingTime, rfidDataFile.readingTime) &&
            Objects.equals(this.paStatus, rfidDataFile.paStatus) &&
            Objects.equals(this.notifications, rfidDataFile.notifications) &&
            Objects.equals(this.docFieldsText, rfidDataFile.docFieldsText) &&
            Objects.equals(this.docFieldsGraphics, rfidDataFile.docFieldsGraphics) &&
            Objects.equals(this.docFieldsOriginals, rfidDataFile.docFieldsOriginals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileID, type, fileData, readingStatus, readingTime, paStatus, notifications, docFieldsText, docFieldsGraphics, docFieldsOriginals);
    }


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class RfidDataFile {\n");
    sb.append("    fileID: ").append(toIndentedString(fileID)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fileData: ").append(toIndentedString(fileData)).append("\n");
    sb.append("    readingStatus: ").append(toIndentedString(readingStatus)).append("\n");
    sb.append("    readingTime: ").append(toIndentedString(readingTime)).append("\n");
    sb.append("    paStatus: ").append(toIndentedString(paStatus)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    docFieldsText: ").append(toIndentedString(docFieldsText)).append("\n");
    sb.append("    docFieldsGraphics: ").append(toIndentedString(docFieldsGraphics)).append("\n");
    sb.append("    docFieldsOriginals: ").append(toIndentedString(docFieldsOriginals)).append("\n");
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

