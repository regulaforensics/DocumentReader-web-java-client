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

import com.google.gson.Gson;
import com.google.gson.JsonArray;
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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Structure and serves for storing information from one text data field. Variant with field logical
 * type and field rectangular area coordinates on the image.
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0")
public class DocVisualExtendedFieldRect {
  public static final String SERIALIZED_NAME_FIELD_RECT = "FieldRect";

  @SerializedName(SERIALIZED_NAME_FIELD_RECT)
  @javax.annotation.Nullable
  private RectangleCoordinates fieldRect;

  public static final String SERIALIZED_NAME_FIELD_TYPE = "FieldType";

  @SerializedName(SERIALIZED_NAME_FIELD_TYPE)
  @javax.annotation.Nonnull
  private Integer fieldType;

  public static final String SERIALIZED_NAME_W_FIELD_TYPE = "wFieldType";

  @SerializedName(SERIALIZED_NAME_W_FIELD_TYPE)
  @javax.annotation.Nonnull
  private TextFieldType wFieldType;

  public static final String SERIALIZED_NAME_FIELD_NAME = "FieldName";

  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  @javax.annotation.Nonnull
  private String fieldName;

  public static final String SERIALIZED_NAME_STRINGS_COUNT = "StringsCount";

  @SerializedName(SERIALIZED_NAME_STRINGS_COUNT)
  @javax.annotation.Nonnull
  private BigDecimal stringsCount;

  public static final String SERIALIZED_NAME_STRINGS_RESULT = "StringsResult";

  @SerializedName(SERIALIZED_NAME_STRINGS_RESULT)
  @javax.annotation.Nonnull
  private List<StringRecognitionResult> stringsResult = new ArrayList<>();

  public static final String SERIALIZED_NAME_BUF_LENGTH = "Buf_Length";

  @SerializedName(SERIALIZED_NAME_BUF_LENGTH)
  @javax.annotation.Nonnull
  private BigDecimal bufLength;

  public static final String SERIALIZED_NAME_BUF_TEXT = "Buf_Text";

  @SerializedName(SERIALIZED_NAME_BUF_TEXT)
  @javax.annotation.Nonnull
  private String bufText;

  public static final String SERIALIZED_NAME_FIELD_MASK = "FieldMask";

  @SerializedName(SERIALIZED_NAME_FIELD_MASK)
  @javax.annotation.Nullable
  private String fieldMask;

  public static final String SERIALIZED_NAME_VALIDITY = "Validity";

  @SerializedName(SERIALIZED_NAME_VALIDITY)
  @javax.annotation.Nullable
  private Integer validity;

  public static final String SERIALIZED_NAME_IN_COMPARISON = "InComparison";

  @SerializedName(SERIALIZED_NAME_IN_COMPARISON)
  @javax.annotation.Nullable
  private Integer inComparison;

  public DocVisualExtendedFieldRect() {}

  public DocVisualExtendedFieldRect fieldRect(
      @javax.annotation.Nullable RectangleCoordinates fieldRect) {
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

  public void setFieldRect(@javax.annotation.Nullable RectangleCoordinates fieldRect) {
    this.fieldRect = fieldRect;
  }

  public DocVisualExtendedFieldRect fieldType(@javax.annotation.Nonnull Integer fieldType) {
    this.fieldType = fieldType;
    return this;
  }

  /**
   * Get fieldType
   *
   * @return fieldType
   */
  @javax.annotation.Nonnull
  public Integer getFieldType() {
    return fieldType;
  }

  public void setFieldType(@javax.annotation.Nonnull Integer fieldType) {
    this.fieldType = fieldType;
  }

  public DocVisualExtendedFieldRect wFieldType(@javax.annotation.Nonnull TextFieldType wFieldType) {
    this.wFieldType = wFieldType;
    return this;
  }

  /**
   * Get wFieldType
   *
   * @return wFieldType
   */
  @javax.annotation.Nonnull
  public TextFieldType getwFieldType() {
    return wFieldType;
  }

  public void setwFieldType(@javax.annotation.Nonnull TextFieldType wFieldType) {
    this.wFieldType = wFieldType;
  }

  public DocVisualExtendedFieldRect fieldName(@javax.annotation.Nonnull String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Field symbolic name (null-terminated string)
   *
   * @return fieldName
   */
  @javax.annotation.Nonnull
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(@javax.annotation.Nonnull String fieldName) {
    this.fieldName = fieldName;
  }

  public DocVisualExtendedFieldRect stringsCount(
      @javax.annotation.Nonnull BigDecimal stringsCount) {
    this.stringsCount = stringsCount;
    return this;
  }

  /**
   * Number of StringsResult array elements
   *
   * @return stringsCount
   */
  @javax.annotation.Nonnull
  public BigDecimal getStringsCount() {
    return stringsCount;
  }

  public void setStringsCount(@javax.annotation.Nonnull BigDecimal stringsCount) {
    this.stringsCount = stringsCount;
  }

  public DocVisualExtendedFieldRect stringsResult(
      @javax.annotation.Nonnull List<StringRecognitionResult> stringsResult) {
    this.stringsResult = stringsResult;
    return this;
  }

  public DocVisualExtendedFieldRect addStringsResultItem(
      StringRecognitionResult stringsResultItem) {
    if (this.stringsResult == null) {
      this.stringsResult = new ArrayList<>();
    }
    this.stringsResult.add(stringsResultItem);
    return this;
  }

  /**
   * Array of recognizing probabilities for a each line of text field. Only for Result.VISUAL_TEXT
   * and Result.MRZ_TEXT results.
   *
   * @return stringsResult
   */
  @javax.annotation.Nonnull
  public List<StringRecognitionResult> getStringsResult() {
    return stringsResult;
  }

  public void setStringsResult(
      @javax.annotation.Nonnull List<StringRecognitionResult> stringsResult) {
    this.stringsResult = stringsResult;
  }

  public DocVisualExtendedFieldRect bufLength(@javax.annotation.Nonnull BigDecimal bufLength) {
    this.bufLength = bufLength;
    return this;
  }

  /**
   * Buf_Text text string length
   *
   * @return bufLength
   */
  @javax.annotation.Nonnull
  public BigDecimal getBufLength() {
    return bufLength;
  }

  public void setBufLength(@javax.annotation.Nonnull BigDecimal bufLength) {
    this.bufLength = bufLength;
  }

  public DocVisualExtendedFieldRect bufText(@javax.annotation.Nonnull String bufText) {
    this.bufText = bufText;
    return this;
  }

  /**
   * Text field data in UTF8 format. Results of reading different lines of a multi-line field are
   * separated by &#39;^&#39;
   *
   * @return bufText
   */
  @javax.annotation.Nonnull
  public String getBufText() {
    return bufText;
  }

  public void setBufText(@javax.annotation.Nonnull String bufText) {
    this.bufText = bufText;
  }

  public DocVisualExtendedFieldRect fieldMask(@javax.annotation.Nullable String fieldMask) {
    this.fieldMask = fieldMask;
    return this;
  }

  /**
   * Get fieldMask
   *
   * @return fieldMask
   */
  @javax.annotation.Nullable
  public String getFieldMask() {
    return fieldMask;
  }

  public void setFieldMask(@javax.annotation.Nullable String fieldMask) {
    this.fieldMask = fieldMask;
  }

  public DocVisualExtendedFieldRect validity(@javax.annotation.Nullable Integer validity) {
    this.validity = validity;
    return this;
  }

  /**
   * Get validity
   *
   * @return validity
   */
  @javax.annotation.Nullable
  public Integer getValidity() {
    return validity;
  }

  public void setValidity(@javax.annotation.Nullable Integer validity) {
    this.validity = validity;
  }

  public DocVisualExtendedFieldRect inComparison(@javax.annotation.Nullable Integer inComparison) {
    this.inComparison = inComparison;
    return this;
  }

  /**
   * Get inComparison
   *
   * @return inComparison
   */
  @javax.annotation.Nullable
  public Integer getInComparison() {
    return inComparison;
  }

  public void setInComparison(@javax.annotation.Nullable Integer inComparison) {
    this.inComparison = inComparison;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocVisualExtendedFieldRect docVisualExtendedFieldRect = (DocVisualExtendedFieldRect) o;
    return Objects.equals(this.fieldRect, docVisualExtendedFieldRect.fieldRect)
        && Objects.equals(this.fieldType, docVisualExtendedFieldRect.fieldType)
        && Objects.equals(this.wFieldType, docVisualExtendedFieldRect.wFieldType)
        && Objects.equals(this.fieldName, docVisualExtendedFieldRect.fieldName)
        && Objects.equals(this.stringsCount, docVisualExtendedFieldRect.stringsCount)
        && Objects.equals(this.stringsResult, docVisualExtendedFieldRect.stringsResult)
        && Objects.equals(this.bufLength, docVisualExtendedFieldRect.bufLength)
        && Objects.equals(this.bufText, docVisualExtendedFieldRect.bufText)
        && Objects.equals(this.fieldMask, docVisualExtendedFieldRect.fieldMask)
        && Objects.equals(this.validity, docVisualExtendedFieldRect.validity)
        && Objects.equals(this.inComparison, docVisualExtendedFieldRect.inComparison);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        fieldRect,
        fieldType,
        wFieldType,
        fieldName,
        stringsCount,
        stringsResult,
        bufLength,
        bufText,
        fieldMask,
        validity,
        inComparison);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocVisualExtendedFieldRect {\n");
    sb.append("    fieldRect: ").append(toIndentedString(fieldRect)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    wFieldType: ").append(toIndentedString(wFieldType)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    stringsCount: ").append(toIndentedString(stringsCount)).append("\n");
    sb.append("    stringsResult: ").append(toIndentedString(stringsResult)).append("\n");
    sb.append("    bufLength: ").append(toIndentedString(bufLength)).append("\n");
    sb.append("    bufText: ").append(toIndentedString(bufText)).append("\n");
    sb.append("    fieldMask: ").append(toIndentedString(fieldMask)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    sb.append("    inComparison: ").append(toIndentedString(inComparison)).append("\n");
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
    openapiFields.add("FieldRect");
    openapiFields.add("FieldType");
    openapiFields.add("wFieldType");
    openapiFields.add("FieldName");
    openapiFields.add("StringsCount");
    openapiFields.add("StringsResult");
    openapiFields.add("Buf_Length");
    openapiFields.add("Buf_Text");
    openapiFields.add("FieldMask");
    openapiFields.add("Validity");
    openapiFields.add("InComparison");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("FieldType");
    openapiRequiredFields.add("wFieldType");
    openapiRequiredFields.add("FieldName");
    openapiRequiredFields.add("StringsCount");
    openapiRequiredFields.add("StringsResult");
    openapiRequiredFields.add("Buf_Length");
    openapiRequiredFields.add("Buf_Text");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocVisualExtendedFieldRect
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!DocVisualExtendedFieldRect.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in DocVisualExtendedFieldRect is not found in the empty JSON string",
                DocVisualExtendedFieldRect.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!DocVisualExtendedFieldRect.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `DocVisualExtendedFieldRect` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : DocVisualExtendedFieldRect.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the optional field `FieldRect`
    if (jsonObj.get("FieldRect") != null && !jsonObj.get("FieldRect").isJsonNull()) {
      RectangleCoordinates.validateJsonElement(jsonObj.get("FieldRect"));
    }
    // validate the required field `wFieldType`
    TextFieldType.validateJsonElement(jsonObj.get("wFieldType"));
    if (!jsonObj.get("FieldName").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `FieldName` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("FieldName").toString()));
    }
    // ensure the json data is an array
    if (!jsonObj.get("StringsResult").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `StringsResult` to be an array in the JSON string but got `%s`",
              jsonObj.get("StringsResult").toString()));
    }

    JsonArray jsonArraystringsResult = jsonObj.getAsJsonArray("StringsResult");
    // validate the required field `StringsResult` (array)
    for (int i = 0; i < jsonArraystringsResult.size(); i++) {
      StringRecognitionResult.validateJsonElement(jsonArraystringsResult.get(i));
    }
    ;
    if (!jsonObj.get("Buf_Text").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `Buf_Text` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("Buf_Text").toString()));
    }
    if ((jsonObj.get("FieldMask") != null && !jsonObj.get("FieldMask").isJsonNull())
        && !jsonObj.get("FieldMask").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `FieldMask` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("FieldMask").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!DocVisualExtendedFieldRect.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'DocVisualExtendedFieldRect' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<DocVisualExtendedFieldRect> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(DocVisualExtendedFieldRect.class));

      return (TypeAdapter<T>)
          new TypeAdapter<DocVisualExtendedFieldRect>() {
            @Override
            public void write(JsonWriter out, DocVisualExtendedFieldRect value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public DocVisualExtendedFieldRect read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of DocVisualExtendedFieldRect given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocVisualExtendedFieldRect
   * @throws IOException if the JSON string is invalid with respect to DocVisualExtendedFieldRect
   */
  public static DocVisualExtendedFieldRect fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocVisualExtendedFieldRect.class);
  }

  /**
   * Convert an instance of DocVisualExtendedFieldRect to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
