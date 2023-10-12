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

/** GraphicField */
public class GraphicField {
  public static final String SERIALIZED_NAME_FIELD_TYPE = "FieldType";

  @SerializedName(SERIALIZED_NAME_FIELD_TYPE)
  private Integer fieldType;

  public static final String SERIALIZED_NAME_IMAGE = "image";

  @SerializedName(SERIALIZED_NAME_IMAGE)
  private ImageData image;

  public static final String SERIALIZED_NAME_FIELD_RECT = "FieldRect";

  @SerializedName(SERIALIZED_NAME_FIELD_RECT)
  private RectangleCoordinates fieldRect;

  public static final String SERIALIZED_NAME_RF_I_D_ORIGIN_D_G = "RFID_OriginDG";

  @SerializedName(SERIALIZED_NAME_RF_I_D_ORIGIN_D_G)
  private Integer rfIDOriginDG;

  public static final String SERIALIZED_NAME_RF_I_D_ORIGIN_D_G_TAG = "RFID_OriginDGTag";

  @SerializedName(SERIALIZED_NAME_RF_I_D_ORIGIN_D_G_TAG)
  private Integer rfIDOriginDGTag;

  public static final String SERIALIZED_NAME_RF_I_D_ORIGIN_TAG_ENTRY = "RFID_OriginTagEntry";

  @SerializedName(SERIALIZED_NAME_RF_I_D_ORIGIN_TAG_ENTRY)
  private Integer rfIDOriginTagEntry;

  public static final String SERIALIZED_NAME_RF_I_D_ORIGIN_ENTRY_VIEW = "RFID_OriginEntryView";

  @SerializedName(SERIALIZED_NAME_RF_I_D_ORIGIN_ENTRY_VIEW)
  private Integer rfIDOriginEntryView;

  public GraphicField withFieldType(Integer fieldType) {
    this.fieldType = fieldType;
    return this;
  }

  /**
   * Get fieldType
   *
   * @return fieldType
   */
  public Integer getFieldType() {
    return fieldType;
  }

  public void setFieldType(Integer fieldType) {
    this.fieldType = fieldType;
  }

  public GraphicField withImage(ImageData image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   *
   * @return image
   */
  public ImageData getImage() {
    return image;
  }

  public void setImage(ImageData image) {
    this.image = image;
  }

  public GraphicField withFieldRect(RectangleCoordinates fieldRect) {
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

  public GraphicField withRfIDOriginDG(Integer rfIDOriginDG) {
    this.rfIDOriginDG = rfIDOriginDG;
    return this;
  }

  /**
   * Source data group file. Only for Result.RFID_GRAPHICS result.
   *
   * @return rfIDOriginDG
   */
  @javax.annotation.Nullable
  public Integer getRfIDOriginDG() {
    return rfIDOriginDG;
  }

  public void setRfIDOriginDG(Integer rfIDOriginDG) {
    this.rfIDOriginDG = rfIDOriginDG;
  }

  public GraphicField withRfIDOriginDGTag(Integer rfIDOriginDGTag) {
    this.rfIDOriginDGTag = rfIDOriginDGTag;
    return this;
  }

  /**
   * Index of the source record of the image with biometric information in the information data
   * group. Only for Result.RFID_GRAPHICS result.
   *
   * @return rfIDOriginDGTag
   */
  @javax.annotation.Nullable
  public Integer getRfIDOriginDGTag() {
    return rfIDOriginDGTag;
  }

  public void setRfIDOriginDGTag(Integer rfIDOriginDGTag) {
    this.rfIDOriginDGTag = rfIDOriginDGTag;
  }

  public GraphicField withRfIDOriginTagEntry(Integer rfIDOriginTagEntry) {
    this.rfIDOriginTagEntry = rfIDOriginTagEntry;
    return this;
  }

  /**
   * Index of the template in the record with biometric data. Only for Result.RFID_GRAPHICS result.
   *
   * @return rfIDOriginTagEntry
   */
  @javax.annotation.Nullable
  public Integer getRfIDOriginTagEntry() {
    return rfIDOriginTagEntry;
  }

  public void setRfIDOriginTagEntry(Integer rfIDOriginTagEntry) {
    this.rfIDOriginTagEntry = rfIDOriginTagEntry;
  }

  public GraphicField withRfIDOriginEntryView(Integer rfIDOriginEntryView) {
    this.rfIDOriginEntryView = rfIDOriginEntryView;
    return this;
  }

  /**
   * Index of the variant of the biometric data template. Only for Result.RFID_GRAPHICS result.
   *
   * @return rfIDOriginEntryView
   */
  @javax.annotation.Nullable
  public Integer getRfIDOriginEntryView() {
    return rfIDOriginEntryView;
  }

  public void setRfIDOriginEntryView(Integer rfIDOriginEntryView) {
    this.rfIDOriginEntryView = rfIDOriginEntryView;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphicField graphicField = (GraphicField) o;
    return Objects.equals(this.fieldType, graphicField.fieldType)
        && Objects.equals(this.image, graphicField.image)
        && Objects.equals(this.fieldRect, graphicField.fieldRect)
        && Objects.equals(this.rfIDOriginDG, graphicField.rfIDOriginDG)
        && Objects.equals(this.rfIDOriginDGTag, graphicField.rfIDOriginDGTag)
        && Objects.equals(this.rfIDOriginTagEntry, graphicField.rfIDOriginTagEntry)
        && Objects.equals(this.rfIDOriginEntryView, graphicField.rfIDOriginEntryView);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        fieldType,
        image,
        fieldRect,
        rfIDOriginDG,
        rfIDOriginDGTag,
        rfIDOriginTagEntry,
        rfIDOriginEntryView);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphicField {\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    fieldRect: ").append(toIndentedString(fieldRect)).append("\n");
    sb.append("    rfIDOriginDG: ").append(toIndentedString(rfIDOriginDG)).append("\n");
    sb.append("    rfIDOriginDGTag: ").append(toIndentedString(rfIDOriginDGTag)).append("\n");
    sb.append("    rfIDOriginTagEntry: ").append(toIndentedString(rfIDOriginTagEntry)).append("\n");
    sb.append("    rfIDOriginEntryView: ")
        .append(toIndentedString(rfIDOriginEntryView))
        .append("\n");
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
