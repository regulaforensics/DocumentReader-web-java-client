/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 6.9.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** OCRSecurityTextResult */
public class OCRSecurityTextResult extends AuthenticityCheckResultItem {
  public static final String SERIALIZED_NAME_CRITICAL_FLAG = "CriticalFlag";

  @SerializedName(SERIALIZED_NAME_CRITICAL_FLAG)
  private Integer criticalFlag;

  public static final String SERIALIZED_NAME_LIGHT_TYPE = "LightType";

  @SerializedName(SERIALIZED_NAME_LIGHT_TYPE)
  private Integer lightType;

  public static final String SERIALIZED_NAME_FIELD_RECT = "FieldRect";

  @SerializedName(SERIALIZED_NAME_FIELD_RECT)
  private RectangleCoordinates fieldRect;

  public static final String SERIALIZED_NAME_ETALON_RESULT_TYPE = "EtalonResultType";

  @SerializedName(SERIALIZED_NAME_ETALON_RESULT_TYPE)
  private Integer etalonResultType;

  public static final String SERIALIZED_NAME_ETALON_FIELD_TYPE = "EtalonFieldType";

  @SerializedName(SERIALIZED_NAME_ETALON_FIELD_TYPE)
  private Integer etalonFieldType;

  public static final String SERIALIZED_NAME_ETALON_LIGHT_TYPE = "EtalonLightType";

  @SerializedName(SERIALIZED_NAME_ETALON_LIGHT_TYPE)
  private Integer etalonLightType;

  public static final String SERIALIZED_NAME_SECURITY_TEXT_RESULT_O_C_R = "SecurityTextResultOCR";

  @SerializedName(SERIALIZED_NAME_SECURITY_TEXT_RESULT_O_C_R)
  private String securityTextResultOCR;

  public static final String SERIALIZED_NAME_ETALON_RESULT_O_C_R = "EtalonResultOCR";

  @SerializedName(SERIALIZED_NAME_ETALON_RESULT_O_C_R)
  private String etalonResultOCR;

  public static final String SERIALIZED_NAME_RESERVED1 = "Reserved1";

  @SerializedName(SERIALIZED_NAME_RESERVED1)
  private Integer reserved1;

  public static final String SERIALIZED_NAME_RESERVED2 = "Reserved2";

  @SerializedName(SERIALIZED_NAME_RESERVED2)
  private Integer reserved2;

  public OCRSecurityTextResult withCriticalFlag(Integer criticalFlag) {
    this.criticalFlag = criticalFlag;
    return this;
  }

  /**
   * Get criticalFlag
   *
   * @return criticalFlag
   */
  @javax.annotation.Nullable
  public Integer getCriticalFlag() {
    return criticalFlag;
  }

  public void setCriticalFlag(Integer criticalFlag) {
    this.criticalFlag = criticalFlag;
  }

  public OCRSecurityTextResult withLightType(Integer lightType) {
    this.lightType = lightType;
    return this;
  }

  /**
   * Get lightType
   *
   * @return lightType
   */
  @javax.annotation.Nullable
  public Integer getLightType() {
    return lightType;
  }

  public void setLightType(Integer lightType) {
    this.lightType = lightType;
  }

  public OCRSecurityTextResult withFieldRect(RectangleCoordinates fieldRect) {
    this.fieldRect = fieldRect;
    return this;
  }

  /**
   * Get fieldRect
   *
   * @return fieldRect
   */
  @javax.annotation.Nullable
  public RectangleCoordinates getFieldRect() {
    return fieldRect;
  }

  public void setFieldRect(RectangleCoordinates fieldRect) {
    this.fieldRect = fieldRect;
  }

  public OCRSecurityTextResult withEtalonResultType(Integer etalonResultType) {
    this.etalonResultType = etalonResultType;
    return this;
  }

  /**
   * Get etalonResultType
   *
   * @return etalonResultType
   */
  @javax.annotation.Nullable
  public Integer getEtalonResultType() {
    return etalonResultType;
  }

  public void setEtalonResultType(Integer etalonResultType) {
    this.etalonResultType = etalonResultType;
  }

  public OCRSecurityTextResult withEtalonFieldType(Integer etalonFieldType) {
    this.etalonFieldType = etalonFieldType;
    return this;
  }

  /**
   * Get etalonFieldType
   *
   * @return etalonFieldType
   */
  @javax.annotation.Nullable
  public Integer getEtalonFieldType() {
    return etalonFieldType;
  }

  public void setEtalonFieldType(Integer etalonFieldType) {
    this.etalonFieldType = etalonFieldType;
  }

  public OCRSecurityTextResult withEtalonLightType(Integer etalonLightType) {
    this.etalonLightType = etalonLightType;
    return this;
  }

  /**
   * Get etalonLightType
   *
   * @return etalonLightType
   */
  @javax.annotation.Nullable
  public Integer getEtalonLightType() {
    return etalonLightType;
  }

  public void setEtalonLightType(Integer etalonLightType) {
    this.etalonLightType = etalonLightType;
  }

  public OCRSecurityTextResult withSecurityTextResultOCR(String securityTextResultOCR) {
    this.securityTextResultOCR = securityTextResultOCR;
    return this;
  }

  /**
   * Get securityTextResultOCR
   *
   * @return securityTextResultOCR
   */
  @javax.annotation.Nullable
  public String getSecurityTextResultOCR() {
    return securityTextResultOCR;
  }

  public void setSecurityTextResultOCR(String securityTextResultOCR) {
    this.securityTextResultOCR = securityTextResultOCR;
  }

  public OCRSecurityTextResult withEtalonResultOCR(String etalonResultOCR) {
    this.etalonResultOCR = etalonResultOCR;
    return this;
  }

  /**
   * Get etalonResultOCR
   *
   * @return etalonResultOCR
   */
  @javax.annotation.Nullable
  public String getEtalonResultOCR() {
    return etalonResultOCR;
  }

  public void setEtalonResultOCR(String etalonResultOCR) {
    this.etalonResultOCR = etalonResultOCR;
  }

  public OCRSecurityTextResult withReserved1(Integer reserved1) {
    this.reserved1 = reserved1;
    return this;
  }

  /**
   * Get reserved1
   *
   * @return reserved1
   */
  @javax.annotation.Nullable
  public Integer getReserved1() {
    return reserved1;
  }

  public void setReserved1(Integer reserved1) {
    this.reserved1 = reserved1;
  }

  public OCRSecurityTextResult withReserved2(Integer reserved2) {
    this.reserved2 = reserved2;
    return this;
  }

  /**
   * Get reserved2
   *
   * @return reserved2
   */
  @javax.annotation.Nullable
  public Integer getReserved2() {
    return reserved2;
  }

  public void setReserved2(Integer reserved2) {
    this.reserved2 = reserved2;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OCRSecurityTextResult ocRSecurityTextResult = (OCRSecurityTextResult) o;
    return Objects.equals(this.criticalFlag, ocRSecurityTextResult.criticalFlag)
        && Objects.equals(this.lightType, ocRSecurityTextResult.lightType)
        && Objects.equals(this.fieldRect, ocRSecurityTextResult.fieldRect)
        && Objects.equals(this.etalonResultType, ocRSecurityTextResult.etalonResultType)
        && Objects.equals(this.etalonFieldType, ocRSecurityTextResult.etalonFieldType)
        && Objects.equals(this.etalonLightType, ocRSecurityTextResult.etalonLightType)
        && Objects.equals(this.securityTextResultOCR, ocRSecurityTextResult.securityTextResultOCR)
        && Objects.equals(this.etalonResultOCR, ocRSecurityTextResult.etalonResultOCR)
        && Objects.equals(this.reserved1, ocRSecurityTextResult.reserved1)
        && Objects.equals(this.reserved2, ocRSecurityTextResult.reserved2)
        && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        criticalFlag,
        lightType,
        fieldRect,
        etalonResultType,
        etalonFieldType,
        etalonLightType,
        securityTextResultOCR,
        etalonResultOCR,
        reserved1,
        reserved2,
        super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OCRSecurityTextResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    criticalFlag: ").append(toIndentedString(criticalFlag)).append("\n");
    sb.append("    lightType: ").append(toIndentedString(lightType)).append("\n");
    sb.append("    fieldRect: ").append(toIndentedString(fieldRect)).append("\n");
    sb.append("    etalonResultType: ").append(toIndentedString(etalonResultType)).append("\n");
    sb.append("    etalonFieldType: ").append(toIndentedString(etalonFieldType)).append("\n");
    sb.append("    etalonLightType: ").append(toIndentedString(etalonLightType)).append("\n");
    sb.append("    securityTextResultOCR: ")
        .append(toIndentedString(securityTextResultOCR))
        .append("\n");
    sb.append("    etalonResultOCR: ").append(toIndentedString(etalonResultOCR)).append("\n");
    sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
    sb.append("    reserved2: ").append(toIndentedString(reserved2)).append("\n");
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
