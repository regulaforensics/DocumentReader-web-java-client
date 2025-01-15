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

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Structure is used to describe the contents of a single LDS application and their analysis within
 * the context of the communication session with electronic document
 */
public class RfidApplication {
  public static final String SERIALIZED_NAME_TYPE = "Type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private RfidApplicationType type;

  public static final String SERIALIZED_NAME_STATUS = "Status";

  @SerializedName(SERIALIZED_NAME_STATUS)
  private RFIDErrorCodes status;

  public static final String SERIALIZED_NAME_APPLICATION_I_D = "ApplicationID";

  @SerializedName(SERIALIZED_NAME_APPLICATION_I_D)
  private String applicationID;

  public static final String SERIALIZED_NAME_VERSION = "Version";

  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_UNICODE_VERSION = "UnicodeVersion";

  @SerializedName(SERIALIZED_NAME_UNICODE_VERSION)
  private String unicodeVersion;

  public static final String SERIALIZED_NAME_DATA_HASH_ALGORITHM = "DataHashAlgorithm";

  @SerializedName(SERIALIZED_NAME_DATA_HASH_ALGORITHM)
  private String dataHashAlgorithm;

  public static final String SERIALIZED_NAME_FILES = "Files";

  @SerializedName(SERIALIZED_NAME_FILES)
  private List<RfidDataFile> files = new ArrayList<RfidDataFile>();

  public RfidApplication withType(RfidApplicationType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  public RfidApplicationType getType() {
    return type;
  }

  public void setType(RfidApplicationType type) {
    this.type = type;
  }

  public RfidApplication withStatus(RFIDErrorCodes status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  public RFIDErrorCodes getStatus() {
    return status;
  }

  public void setStatus(RFIDErrorCodes status) {
    this.status = status;
  }

  public RfidApplication withApplicationID(String applicationID) {
    this.applicationID = applicationID;
    return this;
  }

  /**
   * Application identifier
   *
   * @return applicationID
   */
  public String getApplicationID() {
    return applicationID;
  }

  public void setApplicationID(String applicationID) {
    this.applicationID = applicationID;
  }

  public RfidApplication withVersion(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the application
   *
   * @return version
   */
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public RfidApplication withUnicodeVersion(String unicodeVersion) {
    this.unicodeVersion = unicodeVersion;
    return this;
  }

  /**
   * Unicode version for application
   *
   * @return unicodeVersion
   */
  public String getUnicodeVersion() {
    return unicodeVersion;
  }

  public void setUnicodeVersion(String unicodeVersion) {
    this.unicodeVersion = unicodeVersion;
  }

  public RfidApplication withDataHashAlgorithm(String dataHashAlgorithm) {
    this.dataHashAlgorithm = dataHashAlgorithm;
    return this;
  }

  /**
   * Algorithm for calculating hash values for files for the procedure of PA
   *
   * @return dataHashAlgorithm
   */
  public String getDataHashAlgorithm() {
    return dataHashAlgorithm;
  }

  public void setDataHashAlgorithm(String dataHashAlgorithm) {
    this.dataHashAlgorithm = dataHashAlgorithm;
  }

  public RfidApplication withFiles(List<RfidDataFile> files) {
    this.files = files;
    return this;
  }

  public RfidApplication addFilesItem(RfidDataFile filesItem) {
    this.files.add(filesItem);
    return this;
  }

  /**
   * List of containers to store information about the read files of the application
   *
   * @return files
   */
  public List<RfidDataFile> getFiles() {
    return files;
  }

  public void setFiles(List<RfidDataFile> files) {
    this.files = files;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RfidApplication rfidApplication = (RfidApplication) o;
    return Objects.equals(this.type, rfidApplication.type)
        && Objects.equals(this.status, rfidApplication.status)
        && Objects.equals(this.applicationID, rfidApplication.applicationID)
        && Objects.equals(this.version, rfidApplication.version)
        && Objects.equals(this.unicodeVersion, rfidApplication.unicodeVersion)
        && Objects.equals(this.dataHashAlgorithm, rfidApplication.dataHashAlgorithm)
        && Objects.equals(this.files, rfidApplication.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        type, status, applicationID, version, unicodeVersion, dataHashAlgorithm, files);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RfidApplication {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    applicationID: ").append(toIndentedString(applicationID)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    unicodeVersion: ").append(toIndentedString(unicodeVersion)).append("\n");
    sb.append("    dataHashAlgorithm: ").append(toIndentedString(dataHashAlgorithm)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
