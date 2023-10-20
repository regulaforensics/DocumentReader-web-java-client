/*
 * Regula Document Reader Web
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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** PhotoIdentResult */
public class PhotoIdentResult extends AuthenticityCheckResultItem {
  public static final String SERIALIZED_NAME_LIGHT_INDEX = "LightIndex";

  @SerializedName(SERIALIZED_NAME_LIGHT_INDEX)
  private Integer lightIndex;

  public static final String SERIALIZED_NAME_AREA = "Area";

  @SerializedName(SERIALIZED_NAME_AREA)
  private RectangleCoordinates area;

  public static final String SERIALIZED_NAME_SOURCE_IMAGE = "SourceImage";

  @SerializedName(SERIALIZED_NAME_SOURCE_IMAGE)
  private ImageData sourceImage;

  public static final String SERIALIZED_NAME_RESULT_IMAGES = "ResultImages";

  @SerializedName(SERIALIZED_NAME_RESULT_IMAGES)
  private RawImageContainerList resultImages;

  public static final String SERIALIZED_NAME_FIELD_TYPES_COUNT = "FieldTypesCount";

  @SerializedName(SERIALIZED_NAME_FIELD_TYPES_COUNT)
  private Integer fieldTypesCount;

  public static final String SERIALIZED_NAME_FIELD_TYPES_LIST = "FieldTypesList";

  @SerializedName(SERIALIZED_NAME_FIELD_TYPES_LIST)
  private List<Integer> fieldTypesList = null;

  public static final String SERIALIZED_NAME_STEP = "Step";

  @SerializedName(SERIALIZED_NAME_STEP)
  private Integer step;

  public static final String SERIALIZED_NAME_ANGLE = "Angle";

  @SerializedName(SERIALIZED_NAME_ANGLE)
  private Integer angle;

  public static final String SERIALIZED_NAME_RESERVED3 = "Reserved3";

  @SerializedName(SERIALIZED_NAME_RESERVED3)
  private Integer reserved3;

  public PhotoIdentResult withLightIndex(Integer lightIndex) {
    this.lightIndex = lightIndex;
    return this;
  }

  /**
   * Get lightIndex
   *
   * @return lightIndex
   */
  @javax.annotation.Nullable
  public Integer getLightIndex() {
    return lightIndex;
  }

  public void setLightIndex(Integer lightIndex) {
    this.lightIndex = lightIndex;
  }

  public PhotoIdentResult withArea(RectangleCoordinates area) {
    this.area = area;
    return this;
  }

  /**
   * Get area
   *
   * @return area
   */
  @javax.annotation.Nullable
  public RectangleCoordinates getArea() {
    return area;
  }

  public void setArea(RectangleCoordinates area) {
    this.area = area;
  }

  public PhotoIdentResult withSourceImage(ImageData sourceImage) {
    this.sourceImage = sourceImage;
    return this;
  }

  /**
   * Get sourceImage
   *
   * @return sourceImage
   */
  @javax.annotation.Nullable
  public ImageData getSourceImage() {
    return sourceImage;
  }

  public void setSourceImage(ImageData sourceImage) {
    this.sourceImage = sourceImage;
  }

  public PhotoIdentResult withResultImages(RawImageContainerList resultImages) {
    this.resultImages = resultImages;
    return this;
  }

  /**
   * Get resultImages
   *
   * @return resultImages
   */
  @javax.annotation.Nullable
  public RawImageContainerList getResultImages() {
    return resultImages;
  }

  public void setResultImages(RawImageContainerList resultImages) {
    this.resultImages = resultImages;
  }

  public PhotoIdentResult withFieldTypesCount(Integer fieldTypesCount) {
    this.fieldTypesCount = fieldTypesCount;
    return this;
  }

  /**
   * Get fieldTypesCount
   *
   * @return fieldTypesCount
   */
  @javax.annotation.Nullable
  public Integer getFieldTypesCount() {
    return fieldTypesCount;
  }

  public void setFieldTypesCount(Integer fieldTypesCount) {
    this.fieldTypesCount = fieldTypesCount;
  }

  public PhotoIdentResult withFieldTypesList(List<Integer> fieldTypesList) {
    this.fieldTypesList = fieldTypesList;
    return this;
  }

  public PhotoIdentResult addFieldTypesListItem(Integer fieldTypesListItem) {
    if (this.fieldTypesList == null) {
      this.fieldTypesList = new ArrayList<Integer>();
    }
    this.fieldTypesList.add(fieldTypesListItem);
    return this;
  }

  /**
   * Get fieldTypesList
   *
   * @return fieldTypesList
   */
  @javax.annotation.Nullable
  public List<Integer> getFieldTypesList() {
    return fieldTypesList;
  }

  public void setFieldTypesList(List<Integer> fieldTypesList) {
    this.fieldTypesList = fieldTypesList;
  }

  public PhotoIdentResult withStep(Integer step) {
    this.step = step;
    return this;
  }

  /**
   * Get step
   *
   * @return step
   */
  @javax.annotation.Nullable
  public Integer getStep() {
    return step;
  }

  public void setStep(Integer step) {
    this.step = step;
  }

  public PhotoIdentResult withAngle(Integer angle) {
    this.angle = angle;
    return this;
  }

  /**
   * Get angle
   *
   * @return angle
   */
  @javax.annotation.Nullable
  public Integer getAngle() {
    return angle;
  }

  public void setAngle(Integer angle) {
    this.angle = angle;
  }

  public PhotoIdentResult withReserved3(Integer reserved3) {
    this.reserved3 = reserved3;
    return this;
  }

  /**
   * Get reserved3
   *
   * @return reserved3
   */
  @javax.annotation.Nullable
  public Integer getReserved3() {
    return reserved3;
  }

  public void setReserved3(Integer reserved3) {
    this.reserved3 = reserved3;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhotoIdentResult photoIdentResult = (PhotoIdentResult) o;
    return Objects.equals(this.lightIndex, photoIdentResult.lightIndex)
        && Objects.equals(this.area, photoIdentResult.area)
        && Objects.equals(this.sourceImage, photoIdentResult.sourceImage)
        && Objects.equals(this.resultImages, photoIdentResult.resultImages)
        && Objects.equals(this.fieldTypesCount, photoIdentResult.fieldTypesCount)
        && Objects.equals(this.fieldTypesList, photoIdentResult.fieldTypesList)
        && Objects.equals(this.step, photoIdentResult.step)
        && Objects.equals(this.angle, photoIdentResult.angle)
        && Objects.equals(this.reserved3, photoIdentResult.reserved3)
        && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        lightIndex,
        area,
        sourceImage,
        resultImages,
        fieldTypesCount,
        fieldTypesList,
        step,
        angle,
        reserved3,
        super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhotoIdentResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    lightIndex: ").append(toIndentedString(lightIndex)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    sourceImage: ").append(toIndentedString(sourceImage)).append("\n");
    sb.append("    resultImages: ").append(toIndentedString(resultImages)).append("\n");
    sb.append("    fieldTypesCount: ").append(toIndentedString(fieldTypesCount)).append("\n");
    sb.append("    fieldTypesList: ").append(toIndentedString(fieldTypesList)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    angle: ").append(toIndentedString(angle)).append("\n");
    sb.append("    reserved3: ").append(toIndentedString(reserved3)).append("\n");
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
