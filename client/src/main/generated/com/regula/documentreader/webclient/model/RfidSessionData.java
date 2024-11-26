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
 * Structure is used to describe the results of work with the SDK within the context of the current
 * communication session with electronic document
 */
public class RfidSessionData {
  public static final String SERIALIZED_NAME_VIRTUAL_MODE = "VirtualMode";

  @SerializedName(SERIALIZED_NAME_VIRTUAL_MODE)
  private Object virtualMode = null;

  public static final String SERIALIZED_NAME_SD_K_VERSION = "SDKVersion";

  @SerializedName(SERIALIZED_NAME_SD_K_VERSION)
  private Object sdKVersion = null;

  public static final String SERIALIZED_NAME_DRIVER_VERSION = "DriverVersion";

  @SerializedName(SERIALIZED_NAME_DRIVER_VERSION)
  private Object driverVersion = null;

  public static final String SERIALIZED_NAME_FIRMWARE_VERSION = "FirmwareVersion";

  @SerializedName(SERIALIZED_NAME_FIRMWARE_VERSION)
  private Object firmwareVersion = null;

  public static final String SERIALIZED_NAME_APPLICATIONS = "Applications";

  @SerializedName(SERIALIZED_NAME_APPLICATIONS)
  private List<RfidApplication> applications = new ArrayList<RfidApplication>();

  public static final String SERIALIZED_NAME_ACCESS_CONTROLS = "AccessControls";

  @SerializedName(SERIALIZED_NAME_ACCESS_CONTROLS)
  private List<RfidAccessControlInfo> accessControls = new ArrayList<RfidAccessControlInfo>();

  public static final String SERIALIZED_NAME_CARD_PROPERTIES = "CardProperties";

  @SerializedName(SERIALIZED_NAME_CARD_PROPERTIES)
  private RfidCardPropertiesExt cardProperties;

  public static final String SERIALIZED_NAME_EXT_LE_SUPPORT = "ExtLeSupport";

  @SerializedName(SERIALIZED_NAME_EXT_LE_SUPPORT)
  private RFIDErrorCodes extLeSupport;

  public static final String SERIALIZED_NAME_PROCESS_TIME = "ProcessTime";

  @SerializedName(SERIALIZED_NAME_PROCESS_TIME)
  private BigDecimal processTime;

  public static final String SERIALIZED_NAME_ROOT_FILES = "RootFiles";

  @SerializedName(SERIALIZED_NAME_ROOT_FILES)
  private List<Object> rootFiles = new ArrayList<Object>();

  public static final String SERIALIZED_NAME_TOTAL_BYTES_SENT = "TotalBytesSent";

  @SerializedName(SERIALIZED_NAME_TOTAL_BYTES_SENT)
  private BigDecimal totalBytesSent;

  public static final String SERIALIZED_NAME_TOTAL_BYTES_RECEIVED = "TotalBytesReceived";

  @SerializedName(SERIALIZED_NAME_TOTAL_BYTES_RECEIVED)
  private BigDecimal totalBytesReceived;

  public static final String SERIALIZED_NAME_SESSION_KEY = "Session_key";

  @SerializedName(SERIALIZED_NAME_SESSION_KEY)
  private RfidAccessKey sessionKey;

  public static final String SERIALIZED_NAME_SESSION_TERMINAL = "Session_terminal";

  @SerializedName(SERIALIZED_NAME_SESSION_TERMINAL)
  private RfidTerminal sessionTerminal;

  public static final String SERIALIZED_NAME_SESSION_PROCEDURE = "Session_procedure";

  @SerializedName(SERIALIZED_NAME_SESSION_PROCEDURE)
  private RfidAuthenticationProcedureType sessionProcedure;

  public static final String SERIALIZED_NAME_SECURITY_OBJECTS = "SecurityObjects";

  @SerializedName(SERIALIZED_NAME_SECURITY_OBJECTS)
  private List<RfidSecurityObject> securityObjects = new ArrayList<RfidSecurityObject>();

  public RfidSessionData withVirtualMode(Object virtualMode) {
    this.virtualMode = virtualMode;
    return this;
  }

  /**
   * Sign of virtual session when working with loaded data from a previous communication session
   * with the electronic document
   *
   * @return virtualMode
   */
  @javax.annotation.Nullable
  public Object getVirtualMode() {
    return virtualMode;
  }

  public void setVirtualMode(Object virtualMode) {
    this.virtualMode = virtualMode;
  }

  public RfidSessionData withSdKVersion(Object sdKVersion) {
    this.sdKVersion = sdKVersion;
    return this;
  }

  /**
   * Text SDKVersion value in format A.B (e.g. 3.1)
   *
   * @return sdKVersion
   */
  @javax.annotation.Nullable
  public Object getSdKVersion() {
    return sdKVersion;
  }

  public void setSdKVersion(Object sdKVersion) {
    this.sdKVersion = sdKVersion;
  }

  public RfidSessionData withDriverVersion(Object driverVersion) {
    this.driverVersion = driverVersion;
    return this;
  }

  /**
   * Text DriverVersion value in format A.B.C.D (e.g. 6.2.5.4)
   *
   * @return driverVersion
   */
  @javax.annotation.Nullable
  public Object getDriverVersion() {
    return driverVersion;
  }

  public void setDriverVersion(Object driverVersion) {
    this.driverVersion = driverVersion;
  }

  public RfidSessionData withFirmwareVersion(Object firmwareVersion) {
    this.firmwareVersion = firmwareVersion;
    return this;
  }

  /**
   * Text FirmwareVersion value in format A.B (e.g. 5.19)
   *
   * @return firmwareVersion
   */
  @javax.annotation.Nullable
  public Object getFirmwareVersion() {
    return firmwareVersion;
  }

  public void setFirmwareVersion(Object firmwareVersion) {
    this.firmwareVersion = firmwareVersion;
  }

  public RfidSessionData withApplications(List<RfidApplication> applications) {
    this.applications = applications;
    return this;
  }

  public RfidSessionData addApplicationsItem(RfidApplication applicationsItem) {
    this.applications.add(applicationsItem);
    return this;
  }

  /**
   * List of containers to store information about the involved applications of electronic document
   *
   * @return applications
   */
  public List<RfidApplication> getApplications() {
    return applications;
  }

  public void setApplications(List<RfidApplication> applications) {
    this.applications = applications;
  }

  public RfidSessionData withAccessControls(List<RfidAccessControlInfo> accessControls) {
    this.accessControls = accessControls;
    return this;
  }

  public RfidSessionData addAccessControlsItem(RfidAccessControlInfo accessControlsItem) {
    this.accessControls.add(accessControlsItem);
    return this;
  }

  /**
   * List of containers to store information about the supported procedures of authentication and
   * secure data access within the context of the session
   *
   * @return accessControls
   */
  public List<RfidAccessControlInfo> getAccessControls() {
    return accessControls;
  }

  public void setAccessControls(List<RfidAccessControlInfo> accessControls) {
    this.accessControls = accessControls;
  }

  public RfidSessionData withCardProperties(RfidCardPropertiesExt cardProperties) {
    this.cardProperties = cardProperties;
    return this;
  }

  /**
   * Get cardProperties
   *
   * @return cardProperties
   */
  public RfidCardPropertiesExt getCardProperties() {
    return cardProperties;
  }

  public void setCardProperties(RfidCardPropertiesExt cardProperties) {
    this.cardProperties = cardProperties;
  }

  public RfidSessionData withExtLeSupport(RFIDErrorCodes extLeSupport) {
    this.extLeSupport = extLeSupport;
    return this;
  }

  /**
   * Get extLeSupport
   *
   * @return extLeSupport
   */
  public RFIDErrorCodes getExtLeSupport() {
    return extLeSupport;
  }

  public void setExtLeSupport(RFIDErrorCodes extLeSupport) {
    this.extLeSupport = extLeSupport;
  }

  public RfidSessionData withProcessTime(BigDecimal processTime) {
    this.processTime = processTime;
    return this;
  }

  /**
   * Time of processing, milliseconds
   *
   * @return processTime
   */
  public BigDecimal getProcessTime() {
    return processTime;
  }

  public void setProcessTime(BigDecimal processTime) {
    this.processTime = processTime;
  }

  public RfidSessionData withRootFiles(List<Object> rootFiles) {
    this.rootFiles = rootFiles;
    return this;
  }

  public RfidSessionData addRootFilesItem(Object rootFilesItem) {
    this.rootFiles.add(rootFilesItem);
    return this;
  }

  /**
   * List of containers to store information about the read files of the root Master File
   *
   * @return rootFiles
   */
  public List<Object> getRootFiles() {
    return rootFiles;
  }

  public void setRootFiles(List<Object> rootFiles) {
    this.rootFiles = rootFiles;
  }

  public RfidSessionData withTotalBytesSent(BigDecimal totalBytesSent) {
    this.totalBytesSent = totalBytesSent;
    return this;
  }

  /**
   * Total number of bytes transmitted to the RFID-chip during the whole session
   *
   * @return totalBytesSent
   */
  public BigDecimal getTotalBytesSent() {
    return totalBytesSent;
  }

  public void setTotalBytesSent(BigDecimal totalBytesSent) {
    this.totalBytesSent = totalBytesSent;
  }

  public RfidSessionData withTotalBytesReceived(BigDecimal totalBytesReceived) {
    this.totalBytesReceived = totalBytesReceived;
    return this;
  }

  /**
   * Total number of bytes received from the RFID-chip during the whole session
   *
   * @return totalBytesReceived
   */
  public BigDecimal getTotalBytesReceived() {
    return totalBytesReceived;
  }

  public void setTotalBytesReceived(BigDecimal totalBytesReceived) {
    this.totalBytesReceived = totalBytesReceived;
  }

  public RfidSessionData withSessionKey(RfidAccessKey sessionKey) {
    this.sessionKey = sessionKey;
    return this;
  }

  /**
   * Get sessionKey
   *
   * @return sessionKey
   */
  public RfidAccessKey getSessionKey() {
    return sessionKey;
  }

  public void setSessionKey(RfidAccessKey sessionKey) {
    this.sessionKey = sessionKey;
  }

  public RfidSessionData withSessionTerminal(RfidTerminal sessionTerminal) {
    this.sessionTerminal = sessionTerminal;
    return this;
  }

  /**
   * Get sessionTerminal
   *
   * @return sessionTerminal
   */
  public RfidTerminal getSessionTerminal() {
    return sessionTerminal;
  }

  public void setSessionTerminal(RfidTerminal sessionTerminal) {
    this.sessionTerminal = sessionTerminal;
  }

  public RfidSessionData withSessionProcedure(RfidAuthenticationProcedureType sessionProcedure) {
    this.sessionProcedure = sessionProcedure;
    return this;
  }

  /**
   * Get sessionProcedure
   *
   * @return sessionProcedure
   */
  public RfidAuthenticationProcedureType getSessionProcedure() {
    return sessionProcedure;
  }

  public void setSessionProcedure(RfidAuthenticationProcedureType sessionProcedure) {
    this.sessionProcedure = sessionProcedure;
  }

  public RfidSessionData withSecurityObjects(List<RfidSecurityObject> securityObjects) {
    this.securityObjects = securityObjects;
    return this;
  }

  public RfidSessionData addSecurityObjectsItem(RfidSecurityObject securityObjectsItem) {
    this.securityObjects.add(securityObjectsItem);
    return this;
  }

  /**
   * List of containers to store information about the detected document security objects
   *
   * @return securityObjects
   */
  public List<RfidSecurityObject> getSecurityObjects() {
    return securityObjects;
  }

  public void setSecurityObjects(List<RfidSecurityObject> securityObjects) {
    this.securityObjects = securityObjects;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RfidSessionData rfidSessionData = (RfidSessionData) o;
    return Objects.equals(this.virtualMode, rfidSessionData.virtualMode)
        && Objects.equals(this.sdKVersion, rfidSessionData.sdKVersion)
        && Objects.equals(this.driverVersion, rfidSessionData.driverVersion)
        && Objects.equals(this.firmwareVersion, rfidSessionData.firmwareVersion)
        && Objects.equals(this.applications, rfidSessionData.applications)
        && Objects.equals(this.accessControls, rfidSessionData.accessControls)
        && Objects.equals(this.cardProperties, rfidSessionData.cardProperties)
        && Objects.equals(this.extLeSupport, rfidSessionData.extLeSupport)
        && Objects.equals(this.processTime, rfidSessionData.processTime)
        && Objects.equals(this.rootFiles, rfidSessionData.rootFiles)
        && Objects.equals(this.totalBytesSent, rfidSessionData.totalBytesSent)
        && Objects.equals(this.totalBytesReceived, rfidSessionData.totalBytesReceived)
        && Objects.equals(this.sessionKey, rfidSessionData.sessionKey)
        && Objects.equals(this.sessionTerminal, rfidSessionData.sessionTerminal)
        && Objects.equals(this.sessionProcedure, rfidSessionData.sessionProcedure)
        && Objects.equals(this.securityObjects, rfidSessionData.securityObjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        virtualMode,
        sdKVersion,
        driverVersion,
        firmwareVersion,
        applications,
        accessControls,
        cardProperties,
        extLeSupport,
        processTime,
        rootFiles,
        totalBytesSent,
        totalBytesReceived,
        sessionKey,
        sessionTerminal,
        sessionProcedure,
        securityObjects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RfidSessionData {\n");
    sb.append("    virtualMode: ").append(toIndentedString(virtualMode)).append("\n");
    sb.append("    sdKVersion: ").append(toIndentedString(sdKVersion)).append("\n");
    sb.append("    driverVersion: ").append(toIndentedString(driverVersion)).append("\n");
    sb.append("    firmwareVersion: ").append(toIndentedString(firmwareVersion)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    accessControls: ").append(toIndentedString(accessControls)).append("\n");
    sb.append("    cardProperties: ").append(toIndentedString(cardProperties)).append("\n");
    sb.append("    extLeSupport: ").append(toIndentedString(extLeSupport)).append("\n");
    sb.append("    processTime: ").append(toIndentedString(processTime)).append("\n");
    sb.append("    rootFiles: ").append(toIndentedString(rootFiles)).append("\n");
    sb.append("    totalBytesSent: ").append(toIndentedString(totalBytesSent)).append("\n");
    sb.append("    totalBytesReceived: ").append(toIndentedString(totalBytesReceived)).append("\n");
    sb.append("    sessionKey: ").append(toIndentedString(sessionKey)).append("\n");
    sb.append("    sessionTerminal: ").append(toIndentedString(sessionTerminal)).append("\n");
    sb.append("    sessionProcedure: ").append(toIndentedString(sessionProcedure)).append("\n");
    sb.append("    securityObjects: ").append(toIndentedString(securityObjects)).append("\n");
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
