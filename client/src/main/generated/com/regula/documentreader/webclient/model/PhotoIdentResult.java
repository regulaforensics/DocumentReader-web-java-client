/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.   # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 7.6.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.regula.documentreader.webclient.JSON;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** PhotoIdentResult */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class PhotoIdentResult extends AuthenticityCheckResultItem {
  public static final String SERIALIZED_NAME_LIGHT_INDEX = "LightIndex";

  @SerializedName(SERIALIZED_NAME_LIGHT_INDEX)
  @javax.annotation.Nonnull
  private Light lightIndex;

  public static final String SERIALIZED_NAME_AREA = "Area";

  @SerializedName(SERIALIZED_NAME_AREA)
  @javax.annotation.Nonnull
  private RectangleCoordinates area;

  public static final String SERIALIZED_NAME_SOURCE_IMAGE = "SourceImage";

  @SerializedName(SERIALIZED_NAME_SOURCE_IMAGE)
  @javax.annotation.Nonnull
  private ImageData sourceImage;

  public static final String SERIALIZED_NAME_RESULT_IMAGES = "ResultImages";

  @SerializedName(SERIALIZED_NAME_RESULT_IMAGES)
  @javax.annotation.Nonnull
  private RawImageContainerList resultImages;

  public static final String SERIALIZED_NAME_FIELD_TYPES_COUNT = "FieldTypesCount";

  @SerializedName(SERIALIZED_NAME_FIELD_TYPES_COUNT)
  @javax.annotation.Nullable
  private Integer fieldTypesCount;

  public static final String SERIALIZED_NAME_FIELD_TYPES_LIST = "FieldTypesList";

  @SerializedName(SERIALIZED_NAME_FIELD_TYPES_LIST)
  @javax.annotation.Nullable
  private List<Integer> fieldTypesList;

  public static final String SERIALIZED_NAME_STEP = "Step";

  @SerializedName(SERIALIZED_NAME_STEP)
  @javax.annotation.Nullable
  private Integer step;

  public static final String SERIALIZED_NAME_ANGLE = "Angle";

  @SerializedName(SERIALIZED_NAME_ANGLE)
  @javax.annotation.Nullable
  private Integer angle;

  public static final String SERIALIZED_NAME_RESERVED1 = "Reserved1";

  @SerializedName(SERIALIZED_NAME_RESERVED1)
  @javax.annotation.Nullable
  private Integer reserved1;

  public static final String SERIALIZED_NAME_RESERVED2 = "Reserved2";

  @SerializedName(SERIALIZED_NAME_RESERVED2)
  @javax.annotation.Nullable
  private Integer reserved2;

  public static final String SERIALIZED_NAME_RESERVED3 = "Reserved3";

  @SerializedName(SERIALIZED_NAME_RESERVED3)
  @javax.annotation.Nullable
  private Integer reserved3;

  public PhotoIdentResult() {}

  public PhotoIdentResult lightIndex(@javax.annotation.Nonnull Light lightIndex) {
    this.lightIndex = lightIndex;
    return this;
  }

  /**
   * Get lightIndex
   *
   * @return lightIndex
   */
  @javax.annotation.Nonnull
  public Light getLightIndex() {
    return lightIndex;
  }

  public void setLightIndex(@javax.annotation.Nonnull Light lightIndex) {
    this.lightIndex = lightIndex;
  }

  public PhotoIdentResult area(@javax.annotation.Nonnull RectangleCoordinates area) {
    this.area = area;
    return this;
  }

  /**
   * Get area
   *
   * @return area
   */
  @javax.annotation.Nonnull
  public RectangleCoordinates getArea() {
    return area;
  }

  public void setArea(@javax.annotation.Nonnull RectangleCoordinates area) {
    this.area = area;
  }

  public PhotoIdentResult sourceImage(@javax.annotation.Nonnull ImageData sourceImage) {
    this.sourceImage = sourceImage;
    return this;
  }

  /**
   * Get sourceImage
   *
   * @return sourceImage
   */
  @javax.annotation.Nonnull
  public ImageData getSourceImage() {
    return sourceImage;
  }

  public void setSourceImage(@javax.annotation.Nonnull ImageData sourceImage) {
    this.sourceImage = sourceImage;
  }

  public PhotoIdentResult resultImages(
      @javax.annotation.Nonnull RawImageContainerList resultImages) {
    this.resultImages = resultImages;
    return this;
  }

  /**
   * Get resultImages
   *
   * @return resultImages
   */
  @javax.annotation.Nonnull
  public RawImageContainerList getResultImages() {
    return resultImages;
  }

  public void setResultImages(@javax.annotation.Nonnull RawImageContainerList resultImages) {
    this.resultImages = resultImages;
  }

  public PhotoIdentResult fieldTypesCount(@javax.annotation.Nullable Integer fieldTypesCount) {
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

  public void setFieldTypesCount(@javax.annotation.Nullable Integer fieldTypesCount) {
    this.fieldTypesCount = fieldTypesCount;
  }

  public PhotoIdentResult fieldTypesList(@javax.annotation.Nullable List<Integer> fieldTypesList) {
    this.fieldTypesList = fieldTypesList;
    return this;
  }

  public PhotoIdentResult addFieldTypesListItem(Integer fieldTypesListItem) {
    if (this.fieldTypesList == null) {
      this.fieldTypesList = new ArrayList<>();
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

  public void setFieldTypesList(@javax.annotation.Nullable List<Integer> fieldTypesList) {
    this.fieldTypesList = fieldTypesList;
  }

  public PhotoIdentResult step(@javax.annotation.Nullable Integer step) {
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

  public void setStep(@javax.annotation.Nullable Integer step) {
    this.step = step;
  }

  public PhotoIdentResult angle(@javax.annotation.Nullable Integer angle) {
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

  public void setAngle(@javax.annotation.Nullable Integer angle) {
    this.angle = angle;
  }

  public PhotoIdentResult reserved1(@javax.annotation.Nullable Integer reserved1) {
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

  public void setReserved1(@javax.annotation.Nullable Integer reserved1) {
    this.reserved1 = reserved1;
  }

  public PhotoIdentResult reserved2(@javax.annotation.Nullable Integer reserved2) {
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

  public void setReserved2(@javax.annotation.Nullable Integer reserved2) {
    this.reserved2 = reserved2;
  }

  public PhotoIdentResult reserved3(@javax.annotation.Nullable Integer reserved3) {
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

  public void setReserved3(@javax.annotation.Nullable Integer reserved3) {
    this.reserved3 = reserved3;
  }

  @Override
  public boolean equals(Object o) {
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
        && Objects.equals(this.reserved1, photoIdentResult.reserved1)
        && Objects.equals(this.reserved2, photoIdentResult.reserved2)
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
        reserved1,
        reserved2,
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
    sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
    sb.append("    reserved2: ").append(toIndentedString(reserved2)).append("\n");
    sb.append("    reserved3: ").append(toIndentedString(reserved3)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("Type");
    openapiFields.add("ElementResult");
    openapiFields.add("ElementDiagnose");
    openapiFields.add("PercentValue");
    openapiFields.add("LightIndex");
    openapiFields.add("Area");
    openapiFields.add("SourceImage");
    openapiFields.add("ResultImages");
    openapiFields.add("FieldTypesCount");
    openapiFields.add("FieldTypesList");
    openapiFields.add("Step");
    openapiFields.add("Angle");
    openapiFields.add("Reserved1");
    openapiFields.add("Reserved2");
    openapiFields.add("Reserved3");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("LightIndex");
    openapiRequiredFields.add("Area");
    openapiRequiredFields.add("SourceImage");
    openapiRequiredFields.add("ResultImages");
    openapiRequiredFields.add("Type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PhotoIdentResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!PhotoIdentResult.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in PhotoIdentResult is not found in the empty JSON string",
                PhotoIdentResult.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!PhotoIdentResult.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `PhotoIdentResult` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : PhotoIdentResult.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!PhotoIdentResult.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'PhotoIdentResult' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<PhotoIdentResult> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(PhotoIdentResult.class));

      return (TypeAdapter<T>)
          new TypeAdapter<PhotoIdentResult>() {
            @Override
            public void write(JsonWriter out, PhotoIdentResult value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public PhotoIdentResult read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of PhotoIdentResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PhotoIdentResult
   * @throws IOException if the JSON string is invalid with respect to PhotoIdentResult
   */
  public static PhotoIdentResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PhotoIdentResult.class);
  }

  /**
   * Convert an instance of PhotoIdentResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
