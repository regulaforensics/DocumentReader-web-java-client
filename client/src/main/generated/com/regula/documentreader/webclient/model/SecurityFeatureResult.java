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

/** SecurityFeatureResult */
public class SecurityFeatureResult extends AuthenticityCheckResultItem {
  public static final String SERIALIZED_NAME_ELEMENT_TYPE = "ElementType";

  @SerializedName(SERIALIZED_NAME_ELEMENT_TYPE)
  private Integer elementType;

  public static final String SERIALIZED_NAME_ELEMENT_RECT = "ElementRect";

  @SerializedName(SERIALIZED_NAME_ELEMENT_RECT)
  private RectangleCoordinates elementRect;

  public static final String SERIALIZED_NAME_VISIBILITY = "Visibility";

  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private Integer visibility;

  public static final String SERIALIZED_NAME_CRITICAL_FLAG = "CriticalFlag";

  @SerializedName(SERIALIZED_NAME_CRITICAL_FLAG)
  private Integer criticalFlag;

  public static final String SERIALIZED_NAME_AREA_LIST = "AreaList";

  @SerializedName(SERIALIZED_NAME_AREA_LIST)
  private AreaContainer areaList;

  public static final String SERIALIZED_NAME_RESERVED2 = "Reserved2";

  @SerializedName(SERIALIZED_NAME_RESERVED2)
  private Integer reserved2;

  public SecurityFeatureResult withElementType(Integer elementType) {
    this.elementType = elementType;
    return this;
  }

  /**
   * Get elementType
   *
   * @return elementType
   */
  @javax.annotation.Nullable
  public Integer getElementType() {
    return elementType;
  }

  public void setElementType(Integer elementType) {
    this.elementType = elementType;
  }

  public SecurityFeatureResult withElementRect(RectangleCoordinates elementRect) {
    this.elementRect = elementRect;
    return this;
  }

  /**
   * Get elementRect
   *
   * @return elementRect
   */
  @javax.annotation.Nullable
  public RectangleCoordinates getElementRect() {
    return elementRect;
  }

  public void setElementRect(RectangleCoordinates elementRect) {
    this.elementRect = elementRect;
  }

  public SecurityFeatureResult withVisibility(Integer visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Get visibility
   *
   * @return visibility
   */
  @javax.annotation.Nullable
  public Integer getVisibility() {
    return visibility;
  }

  public void setVisibility(Integer visibility) {
    this.visibility = visibility;
  }

  public SecurityFeatureResult withCriticalFlag(Integer criticalFlag) {
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

  public SecurityFeatureResult withAreaList(AreaContainer areaList) {
    this.areaList = areaList;
    return this;
  }

  /**
   * Get areaList
   *
   * @return areaList
   */
  @javax.annotation.Nullable
  public AreaContainer getAreaList() {
    return areaList;
  }

  public void setAreaList(AreaContainer areaList) {
    this.areaList = areaList;
  }

  public SecurityFeatureResult withReserved2(Integer reserved2) {
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
    SecurityFeatureResult securityFeatureResult = (SecurityFeatureResult) o;
    return Objects.equals(this.elementType, securityFeatureResult.elementType)
        && Objects.equals(this.elementRect, securityFeatureResult.elementRect)
        && Objects.equals(this.visibility, securityFeatureResult.visibility)
        && Objects.equals(this.criticalFlag, securityFeatureResult.criticalFlag)
        && Objects.equals(this.areaList, securityFeatureResult.areaList)
        && Objects.equals(this.reserved2, securityFeatureResult.reserved2)
        && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        elementType, elementRect, visibility, criticalFlag, areaList, reserved2, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityFeatureResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    elementType: ").append(toIndentedString(elementType)).append("\n");
    sb.append("    elementRect: ").append(toIndentedString(elementRect)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    criticalFlag: ").append(toIndentedString(criticalFlag)).append("\n");
    sb.append("    areaList: ").append(toIndentedString(areaList)).append("\n");
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
