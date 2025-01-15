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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Structure is used to describe the contents of a single document security object (SO) and the
 * results of its check within the context of the communication session with electronic document
 */
public class RfidSecurityObject {
  public static final String SERIALIZED_NAME_VERSION = "Version";

  @SerializedName(SERIALIZED_NAME_VERSION)
  private BigDecimal version;

  public static final String SERIALIZED_NAME_OBJECT_TYPE = "ObjectType";

  @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
  private String objectType;

  public static final String SERIALIZED_NAME_FILE_REFERENCE = "FileReference";

  @SerializedName(SERIALIZED_NAME_FILE_REFERENCE)
  private BigDecimal fileReference;

  public static final String SERIALIZED_NAME_NOTIFICATIONS = "Notifications";

  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS)
  private List<ParsingErrorCodes> notifications = new ArrayList<ParsingErrorCodes>();

  public static final String SERIALIZED_NAME_SIGNER_INFOS = "SignerInfos";

  @SerializedName(SERIALIZED_NAME_SIGNER_INFOS)
  private List<RfidSignerInfoEx> signerInfos = new ArrayList<RfidSignerInfoEx>();

  public RfidSecurityObject withVersion(BigDecimal version) {
    this.version = version;
    return this;
  }

  /**
   * Security object version
   *
   * @return version
   */
  public BigDecimal getVersion() {
    return version;
  }

  public void setVersion(BigDecimal version) {
    this.version = version;
  }

  public RfidSecurityObject withObjectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

  /**
   * Identifier of the security object
   *
   * @return objectType
   */
  public String getObjectType() {
    return objectType;
  }

  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }

  public RfidSecurityObject withFileReference(BigDecimal fileReference) {
    this.fileReference = fileReference;
    return this;
  }

  /**
   * Reference to the source file of the security object data
   *
   * @return fileReference
   */
  public BigDecimal getFileReference() {
    return fileReference;
  }

  public void setFileReference(BigDecimal fileReference) {
    this.fileReference = fileReference;
  }

  public RfidSecurityObject withNotifications(List<ParsingErrorCodes> notifications) {
    this.notifications = notifications;
    return this;
  }

  public RfidSecurityObject addNotificationsItem(ParsingErrorCodes notificationsItem) {
    this.notifications.add(notificationsItem);
    return this;
  }

  /**
   * List of remarks arisen during the analysis of SO data structure.
   *
   * @return notifications
   */
  public List<ParsingErrorCodes> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<ParsingErrorCodes> notifications) {
    this.notifications = notifications;
  }

  public RfidSecurityObject withSignerInfos(List<RfidSignerInfoEx> signerInfos) {
    this.signerInfos = signerInfos;
    return this;
  }

  public RfidSecurityObject addSignerInfosItem(RfidSignerInfoEx signerInfosItem) {
    this.signerInfos.add(signerInfosItem);
    return this;
  }

  /**
   * List of containers to store information about digital signature objects contained in the SO
   *
   * @return signerInfos
   */
  public List<RfidSignerInfoEx> getSignerInfos() {
    return signerInfos;
  }

  public void setSignerInfos(List<RfidSignerInfoEx> signerInfos) {
    this.signerInfos = signerInfos;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RfidSecurityObject rfidSecurityObject = (RfidSecurityObject) o;
    return Objects.equals(this.version, rfidSecurityObject.version)
        && Objects.equals(this.objectType, rfidSecurityObject.objectType)
        && Objects.equals(this.fileReference, rfidSecurityObject.fileReference)
        && Objects.equals(this.notifications, rfidSecurityObject.notifications)
        && Objects.equals(this.signerInfos, rfidSecurityObject.signerInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, objectType, fileReference, notifications, signerInfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RfidSecurityObject {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    fileReference: ").append(toIndentedString(fileReference)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    signerInfos: ").append(toIndentedString(signerInfos)).append("\n");
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
