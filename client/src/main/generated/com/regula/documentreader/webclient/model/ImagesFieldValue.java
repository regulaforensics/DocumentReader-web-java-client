/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 5.4.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Objects;

/** ImagesFieldValue */
public class ImagesFieldValue {
  public static final String SERIALIZED_NAME_SOURCE = "source";

  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_VALUE = "value";

  @SerializedName(SERIALIZED_NAME_VALUE)
  private byte[] value;

  public static final String SERIALIZED_NAME_ORIGINAL_VALUE = "originalValue";

  @SerializedName(SERIALIZED_NAME_ORIGINAL_VALUE)
  private byte[] originalValue;

  public static final String SERIALIZED_NAME_PAGE_INDEX = "pageIndex";

  @SerializedName(SERIALIZED_NAME_PAGE_INDEX)
  private Integer pageIndex;

  public static final String SERIALIZED_NAME_LIGHT_INDEX = "lightIndex";

  @SerializedName(SERIALIZED_NAME_LIGHT_INDEX)
  private Integer lightIndex;

  public static final String SERIALIZED_NAME_CONTAINER_TYPE = "containerType";

  @SerializedName(SERIALIZED_NAME_CONTAINER_TYPE)
  private Integer containerType = 0;

  public static final String SERIALIZED_NAME_FIELD_RECT = "fieldRect";

  @SerializedName(SERIALIZED_NAME_FIELD_RECT)
  private RectangleCoordinates fieldRect;

  public static final String SERIALIZED_NAME_RFID_ORIGIN = "rfidOrigin";

  @SerializedName(SERIALIZED_NAME_RFID_ORIGIN)
  private RfidOrigin rfidOrigin;

  public ImagesFieldValue withSource(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   *
   * @return source
   */
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public ImagesFieldValue withValue(byte[] value) {
    this.value = value;
    return this;
  }

  /**
   * Base64 encoded image
   *
   * @return value
   */
  public byte[] getValue() {
    return value;
  }

  public void setValue(byte[] value) {
    this.value = value;
  }

  public ImagesFieldValue withOriginalValue(byte[] originalValue) {
    this.originalValue = originalValue;
    return this;
  }

  /**
   * Base64 encoded image
   *
   * @return originalValue
   */
  @javax.annotation.Nullable
  public byte[] getOriginalValue() {
    return originalValue;
  }

  public void setOriginalValue(byte[] originalValue) {
    this.originalValue = originalValue;
  }

  public ImagesFieldValue withPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

  /**
   * Page index of the image from input list
   *
   * @return pageIndex
   */
  public Integer getPageIndex() {
    return pageIndex;
  }

  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public ImagesFieldValue withLightIndex(Integer lightIndex) {
    this.lightIndex = lightIndex;
    return this;
  }

  /**
   * Get lightIndex
   *
   * @return lightIndex
   */
  public Integer getLightIndex() {
    return lightIndex;
  }

  public void setLightIndex(Integer lightIndex) {
    this.lightIndex = lightIndex;
  }

  public ImagesFieldValue withContainerType(Integer containerType) {
    this.containerType = containerType;
    return this;
  }

  /**
   * Same as Result type, but used for safe parsing of not-described values. See Result type.
   *
   * @return containerType
   */
  public Integer getContainerType() {
    return containerType;
  }

  public void setContainerType(Integer containerType) {
    this.containerType = containerType;
  }

  public ImagesFieldValue withFieldRect(RectangleCoordinates fieldRect) {
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

  public ImagesFieldValue withRfidOrigin(RfidOrigin rfidOrigin) {
    this.rfidOrigin = rfidOrigin;
    return this;
  }

  /**
   * Get rfidOrigin
   *
   * @return rfidOrigin
   */
  @javax.annotation.Nullable
  public RfidOrigin getRfidOrigin() {
    return rfidOrigin;
  }

  public void setRfidOrigin(RfidOrigin rfidOrigin) {
    this.rfidOrigin = rfidOrigin;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImagesFieldValue imagesFieldValue = (ImagesFieldValue) o;
    return Objects.equals(this.source, imagesFieldValue.source)
        && Arrays.equals(this.value, imagesFieldValue.value)
        && Arrays.equals(this.originalValue, imagesFieldValue.originalValue)
        && Objects.equals(this.pageIndex, imagesFieldValue.pageIndex)
        && Objects.equals(this.lightIndex, imagesFieldValue.lightIndex)
        && Objects.equals(this.containerType, imagesFieldValue.containerType)
        && Objects.equals(this.fieldRect, imagesFieldValue.fieldRect)
        && Objects.equals(this.rfidOrigin, imagesFieldValue.rfidOrigin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        source,
        Arrays.hashCode(value),
        Arrays.hashCode(originalValue),
        pageIndex,
        lightIndex,
        containerType,
        fieldRect,
        rfidOrigin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImagesFieldValue {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    originalValue: ").append(toIndentedString(originalValue)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    lightIndex: ").append(toIndentedString(lightIndex)).append("\n");
    sb.append("    containerType: ").append(toIndentedString(containerType)).append("\n");
    sb.append("    fieldRect: ").append(toIndentedString(fieldRect)).append("\n");
    sb.append("    rfidOrigin: ").append(toIndentedString(rfidOrigin)).append("\n");
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
