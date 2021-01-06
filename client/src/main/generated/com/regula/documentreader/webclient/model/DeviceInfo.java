/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 5.3.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import org.threeten.bp.OffsetDateTime;

/** DeviceInfo */
public class DeviceInfo {
  public static final String SERIALIZED_NAME_APP_NAME = "app-name";

  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName;

  public static final String SERIALIZED_NAME_VERSION = "version";

  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_LICENSE_ID = "license-id";

  @SerializedName(SERIALIZED_NAME_LICENSE_ID)
  private String licenseId;

  public static final String SERIALIZED_NAME_LICENSE_SERIAL = "license-serial";

  @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL)
  private String licenseSerial;

  public static final String SERIALIZED_NAME_VALID_UNTIL = "valid-until";

  @SerializedName(SERIALIZED_NAME_VALID_UNTIL)
  private OffsetDateTime validUntil;

  public static final String SERIALIZED_NAME_SERVER_TIME = "server-time";

  @SerializedName(SERIALIZED_NAME_SERVER_TIME)
  private OffsetDateTime serverTime;

  public DeviceInfo withAppName(String appName) {
    this.appName = appName;
    return this;
  }

  /**
   * Get appName
   *
   * @return appName
   */
  @javax.annotation.Nullable
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public DeviceInfo withVersion(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   *
   * @return version
   */
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public DeviceInfo withLicenseId(String licenseId) {
    this.licenseId = licenseId;
    return this;
  }

  /**
   * Get licenseId
   *
   * @return licenseId
   */
  @javax.annotation.Nullable
  public String getLicenseId() {
    return licenseId;
  }

  public void setLicenseId(String licenseId) {
    this.licenseId = licenseId;
  }

  public DeviceInfo withLicenseSerial(String licenseSerial) {
    this.licenseSerial = licenseSerial;
    return this;
  }

  /**
   * Get licenseSerial
   *
   * @return licenseSerial
   */
  @javax.annotation.Nullable
  public String getLicenseSerial() {
    return licenseSerial;
  }

  public void setLicenseSerial(String licenseSerial) {
    this.licenseSerial = licenseSerial;
  }

  public DeviceInfo withValidUntil(OffsetDateTime validUntil) {
    this.validUntil = validUntil;
    return this;
  }

  /**
   * Get validUntil
   *
   * @return validUntil
   */
  @javax.annotation.Nullable
  public OffsetDateTime getValidUntil() {
    return validUntil;
  }

  public void setValidUntil(OffsetDateTime validUntil) {
    this.validUntil = validUntil;
  }

  public DeviceInfo withServerTime(OffsetDateTime serverTime) {
    this.serverTime = serverTime;
    return this;
  }

  /**
   * Get serverTime
   *
   * @return serverTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getServerTime() {
    return serverTime;
  }

  public void setServerTime(OffsetDateTime serverTime) {
    this.serverTime = serverTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceInfo deviceInfo = (DeviceInfo) o;
    return Objects.equals(this.appName, deviceInfo.appName)
        && Objects.equals(this.version, deviceInfo.version)
        && Objects.equals(this.licenseId, deviceInfo.licenseId)
        && Objects.equals(this.licenseSerial, deviceInfo.licenseSerial)
        && Objects.equals(this.validUntil, deviceInfo.validUntil)
        && Objects.equals(this.serverTime, deviceInfo.serverTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, version, licenseId, licenseSerial, validUntil, serverTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceInfo {\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
    sb.append("    licenseSerial: ").append(toIndentedString(licenseSerial)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    serverTime: ").append(toIndentedString(serverTime)).append("\n");
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
