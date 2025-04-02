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

/** FiberResult */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class FiberResult extends AuthenticityCheckResultItem {
  public static final String SERIALIZED_NAME_RECT_COUNT = "RectCount";

  @SerializedName(SERIALIZED_NAME_RECT_COUNT)
  @javax.annotation.Nonnull
  private Integer rectCount;

  public static final String SERIALIZED_NAME_EXPECTED_COUNT = "ExpectedCount";

  @SerializedName(SERIALIZED_NAME_EXPECTED_COUNT)
  @javax.annotation.Nonnull
  private Integer expectedCount;

  public static final String SERIALIZED_NAME_LIGHT_VALUE = "LightValue";

  @SerializedName(SERIALIZED_NAME_LIGHT_VALUE)
  @javax.annotation.Nullable
  private Light lightValue;

  public static final String SERIALIZED_NAME_LIGHT_DISP = "LightDisp";

  @SerializedName(SERIALIZED_NAME_LIGHT_DISP)
  @javax.annotation.Nullable
  private Integer lightDisp;

  public static final String SERIALIZED_NAME_RECT_ARRAY = "RectArray";

  @SerializedName(SERIALIZED_NAME_RECT_ARRAY)
  @javax.annotation.Nonnull
  private List<RectangleCoordinates> rectArray;

  public static final String SERIALIZED_NAME_WIDTH = "Width";

  @SerializedName(SERIALIZED_NAME_WIDTH)
  @javax.annotation.Nonnull
  private List<Integer> width;

  public static final String SERIALIZED_NAME_LENGTH = "Length";

  @SerializedName(SERIALIZED_NAME_LENGTH)
  @javax.annotation.Nonnull
  private List<Integer> length;

  public static final String SERIALIZED_NAME_AREA = "Area";

  @SerializedName(SERIALIZED_NAME_AREA)
  @javax.annotation.Nonnull
  private List<Integer> area;

  public static final String SERIALIZED_NAME_COLOR_VALUES = "ColorValues";

  @SerializedName(SERIALIZED_NAME_COLOR_VALUES)
  @javax.annotation.Nonnull
  private List<Integer> colorValues;

  public FiberResult() {}

  public FiberResult rectCount(@javax.annotation.Nonnull Integer rectCount) {
    this.rectCount = rectCount;
    return this;
  }

  /**
   * For UV_Fibers authenticity result type
   *
   * @return rectCount
   */
  @javax.annotation.Nonnull
  public Integer getRectCount() {
    return rectCount;
  }

  public void setRectCount(@javax.annotation.Nonnull Integer rectCount) {
    this.rectCount = rectCount;
  }

  public FiberResult expectedCount(@javax.annotation.Nonnull Integer expectedCount) {
    this.expectedCount = expectedCount;
    return this;
  }

  /**
   * Expected fibers number. For UV_Fibers authentication result type
   *
   * @return expectedCount
   */
  @javax.annotation.Nonnull
  public Integer getExpectedCount() {
    return expectedCount;
  }

  public void setExpectedCount(@javax.annotation.Nonnull Integer expectedCount) {
    this.expectedCount = expectedCount;
  }

  public FiberResult lightValue(@javax.annotation.Nullable Light lightValue) {
    this.lightValue = lightValue;
    return this;
  }

  /**
   * Get lightValue
   *
   * @return lightValue
   */
  @javax.annotation.Nullable
  public Light getLightValue() {
    return lightValue;
  }

  public void setLightValue(@javax.annotation.Nullable Light lightValue) {
    this.lightValue = lightValue;
  }

  public FiberResult lightDisp(@javax.annotation.Nullable Integer lightDisp) {
    this.lightDisp = lightDisp;
    return this;
  }

  /**
   * For UV_Background authentication result type
   *
   * @return lightDisp
   */
  @javax.annotation.Nullable
  public Integer getLightDisp() {
    return lightDisp;
  }

  public void setLightDisp(@javax.annotation.Nullable Integer lightDisp) {
    this.lightDisp = lightDisp;
  }

  public FiberResult rectArray(@javax.annotation.Nonnull List<RectangleCoordinates> rectArray) {
    this.rectArray = rectArray;
    return this;
  }

  public FiberResult addRectArrayItem(RectangleCoordinates rectArrayItem) {
    if (this.rectArray == null) {
      this.rectArray = new ArrayList<>();
    }
    this.rectArray.add(rectArrayItem);
    return this;
  }

  /**
   * Coordinates of located areas for defined fibers type
   *
   * @return rectArray
   */
  @javax.annotation.Nonnull
  public List<RectangleCoordinates> getRectArray() {
    return rectArray;
  }

  public void setRectArray(@javax.annotation.Nonnull List<RectangleCoordinates> rectArray) {
    this.rectArray = rectArray;
  }

  public FiberResult width(@javax.annotation.Nonnull List<Integer> width) {
    this.width = width;
    return this;
  }

  public FiberResult addWidthItem(Integer widthItem) {
    if (this.width == null) {
      this.width = new ArrayList<>();
    }
    this.width.add(widthItem);
    return this;
  }

  /**
   * Fibers width value for located areas (in pixels)
   *
   * @return width
   */
  @javax.annotation.Nonnull
  public List<Integer> getWidth() {
    return width;
  }

  public void setWidth(@javax.annotation.Nonnull List<Integer> width) {
    this.width = width;
  }

  public FiberResult length(@javax.annotation.Nonnull List<Integer> length) {
    this.length = length;
    return this;
  }

  public FiberResult addLengthItem(Integer lengthItem) {
    if (this.length == null) {
      this.length = new ArrayList<>();
    }
    this.length.add(lengthItem);
    return this;
  }

  /**
   * Fibers length value for located areas (in pixels)
   *
   * @return length
   */
  @javax.annotation.Nonnull
  public List<Integer> getLength() {
    return length;
  }

  public void setLength(@javax.annotation.Nonnull List<Integer> length) {
    this.length = length;
  }

  public FiberResult area(@javax.annotation.Nonnull List<Integer> area) {
    this.area = area;
    return this;
  }

  public FiberResult addAreaItem(Integer areaItem) {
    if (this.area == null) {
      this.area = new ArrayList<>();
    }
    this.area.add(areaItem);
    return this;
  }

  /**
   * Fibers value for areas (in pixels)
   *
   * @return area
   */
  @javax.annotation.Nonnull
  public List<Integer> getArea() {
    return area;
  }

  public void setArea(@javax.annotation.Nonnull List<Integer> area) {
    this.area = area;
  }

  public FiberResult colorValues(@javax.annotation.Nonnull List<Integer> colorValues) {
    this.colorValues = colorValues;
    return this;
  }

  public FiberResult addColorValuesItem(Integer colorValuesItem) {
    if (this.colorValues == null) {
      this.colorValues = new ArrayList<>();
    }
    this.colorValues.add(colorValuesItem);
    return this;
  }

  /**
   * Fibers color value
   *
   * @return colorValues
   */
  @javax.annotation.Nonnull
  public List<Integer> getColorValues() {
    return colorValues;
  }

  public void setColorValues(@javax.annotation.Nonnull List<Integer> colorValues) {
    this.colorValues = colorValues;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiberResult fiberResult = (FiberResult) o;
    return Objects.equals(this.rectCount, fiberResult.rectCount)
        && Objects.equals(this.expectedCount, fiberResult.expectedCount)
        && Objects.equals(this.lightValue, fiberResult.lightValue)
        && Objects.equals(this.lightDisp, fiberResult.lightDisp)
        && Objects.equals(this.rectArray, fiberResult.rectArray)
        && Objects.equals(this.width, fiberResult.width)
        && Objects.equals(this.length, fiberResult.length)
        && Objects.equals(this.area, fiberResult.area)
        && Objects.equals(this.colorValues, fiberResult.colorValues)
        && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        rectCount,
        expectedCount,
        lightValue,
        lightDisp,
        rectArray,
        width,
        length,
        area,
        colorValues,
        super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiberResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    rectCount: ").append(toIndentedString(rectCount)).append("\n");
    sb.append("    expectedCount: ").append(toIndentedString(expectedCount)).append("\n");
    sb.append("    lightValue: ").append(toIndentedString(lightValue)).append("\n");
    sb.append("    lightDisp: ").append(toIndentedString(lightDisp)).append("\n");
    sb.append("    rectArray: ").append(toIndentedString(rectArray)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    colorValues: ").append(toIndentedString(colorValues)).append("\n");
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
    openapiFields.add("RectCount");
    openapiFields.add("ExpectedCount");
    openapiFields.add("LightValue");
    openapiFields.add("LightDisp");
    openapiFields.add("RectArray");
    openapiFields.add("Width");
    openapiFields.add("Length");
    openapiFields.add("Area");
    openapiFields.add("ColorValues");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("RectCount");
    openapiRequiredFields.add("ExpectedCount");
    openapiRequiredFields.add("RectArray");
    openapiRequiredFields.add("Width");
    openapiRequiredFields.add("Length");
    openapiRequiredFields.add("Area");
    openapiRequiredFields.add("ColorValues");
    openapiRequiredFields.add("Type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FiberResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!FiberResult.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in FiberResult is not found in the empty JSON string",
                FiberResult.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!FiberResult.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `FiberResult` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : FiberResult.openapiRequiredFields) {
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
      if (!FiberResult.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'FiberResult' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<FiberResult> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(FiberResult.class));

      return (TypeAdapter<T>)
          new TypeAdapter<FiberResult>() {
            @Override
            public void write(JsonWriter out, FiberResult value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public FiberResult read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of FiberResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FiberResult
   * @throws IOException if the JSON string is invalid with respect to FiberResult
   */
  public static FiberResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FiberResult.class);
  }

  /**
   * Convert an instance of FiberResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
