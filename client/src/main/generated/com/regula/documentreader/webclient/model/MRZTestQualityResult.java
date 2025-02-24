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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** MRZTestQualityResult */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0")
public class MRZTestQualityResult {
  public static final String SERIALIZED_NAME_MR_Z_TEST_QUALITY = "MRZTestQuality";

  @SerializedName(SERIALIZED_NAME_MR_Z_TEST_QUALITY)
  @javax.annotation.Nonnull
  private MRZTestQuality mrZTestQuality;

  public static final String SERIALIZED_NAME_BUF_LENGTH = "buf_length";

  @SerializedName(SERIALIZED_NAME_BUF_LENGTH)
  @javax.annotation.Nullable
  private Integer bufLength;

  public static final String SERIALIZED_NAME_LIGHT = "light";

  @SerializedName(SERIALIZED_NAME_LIGHT)
  @javax.annotation.Nullable
  private Integer light;

  public static final String SERIALIZED_NAME_LIST_IDX = "list_idx";

  @SerializedName(SERIALIZED_NAME_LIST_IDX)
  @javax.annotation.Nullable
  private Integer listIdx;

  public static final String SERIALIZED_NAME_PAGE_IDX = "page_idx";

  @SerializedName(SERIALIZED_NAME_PAGE_IDX)
  @javax.annotation.Nullable
  private Integer pageIdx;

  public static final String SERIALIZED_NAME_RESULT_TYPE = "result_type";

  @SerializedName(SERIALIZED_NAME_RESULT_TYPE)
  @javax.annotation.Nonnull
  private Integer resultType = 0;

  public MRZTestQualityResult() {}

  public MRZTestQualityResult mrZTestQuality(
      @javax.annotation.Nonnull MRZTestQuality mrZTestQuality) {
    this.mrZTestQuality = mrZTestQuality;
    return this;
  }

  /**
   * Get mrZTestQuality
   *
   * @return mrZTestQuality
   */
  @javax.annotation.Nonnull
  public MRZTestQuality getMrZTestQuality() {
    return mrZTestQuality;
  }

  public void setMrZTestQuality(@javax.annotation.Nonnull MRZTestQuality mrZTestQuality) {
    this.mrZTestQuality = mrZTestQuality;
  }

  public MRZTestQualityResult bufLength(@javax.annotation.Nullable Integer bufLength) {
    this.bufLength = bufLength;
    return this;
  }

  /**
   * Get bufLength
   *
   * @return bufLength
   */
  @javax.annotation.Nullable
  public Integer getBufLength() {
    return bufLength;
  }

  public void setBufLength(@javax.annotation.Nullable Integer bufLength) {
    this.bufLength = bufLength;
  }

  public MRZTestQualityResult light(@javax.annotation.Nullable Integer light) {
    this.light = light;
    return this;
  }

  /**
   * Get light
   *
   * @return light
   */
  @javax.annotation.Nullable
  public Integer getLight() {
    return light;
  }

  public void setLight(@javax.annotation.Nullable Integer light) {
    this.light = light;
  }

  public MRZTestQualityResult listIdx(@javax.annotation.Nullable Integer listIdx) {
    this.listIdx = listIdx;
    return this;
  }

  /**
   * Get listIdx
   *
   * @return listIdx
   */
  @javax.annotation.Nullable
  public Integer getListIdx() {
    return listIdx;
  }

  public void setListIdx(@javax.annotation.Nullable Integer listIdx) {
    this.listIdx = listIdx;
  }

  public MRZTestQualityResult pageIdx(@javax.annotation.Nullable Integer pageIdx) {
    this.pageIdx = pageIdx;
    return this;
  }

  /**
   * Get pageIdx
   *
   * @return pageIdx
   */
  @javax.annotation.Nullable
  public Integer getPageIdx() {
    return pageIdx;
  }

  public void setPageIdx(@javax.annotation.Nullable Integer pageIdx) {
    this.pageIdx = pageIdx;
  }

  public MRZTestQualityResult resultType(@javax.annotation.Nonnull Integer resultType) {
    this.resultType = resultType;
    return this;
  }

  /**
   * Same as Result type, but used for safe parsing of not-described values. See Result type.
   *
   * @return resultType
   */
  @javax.annotation.Nonnull
  public Integer getResultType() {
    return resultType;
  }

  public void setResultType(@javax.annotation.Nonnull Integer resultType) {
    this.resultType = resultType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MRZTestQualityResult mrZTestQualityResult = (MRZTestQualityResult) o;
    return Objects.equals(this.mrZTestQuality, mrZTestQualityResult.mrZTestQuality)
        && Objects.equals(this.bufLength, mrZTestQualityResult.bufLength)
        && Objects.equals(this.light, mrZTestQualityResult.light)
        && Objects.equals(this.listIdx, mrZTestQualityResult.listIdx)
        && Objects.equals(this.pageIdx, mrZTestQualityResult.pageIdx)
        && Objects.equals(this.resultType, mrZTestQualityResult.resultType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mrZTestQuality, bufLength, light, listIdx, pageIdx, resultType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MRZTestQualityResult {\n");
    sb.append("    mrZTestQuality: ").append(toIndentedString(mrZTestQuality)).append("\n");
    sb.append("    bufLength: ").append(toIndentedString(bufLength)).append("\n");
    sb.append("    light: ").append(toIndentedString(light)).append("\n");
    sb.append("    listIdx: ").append(toIndentedString(listIdx)).append("\n");
    sb.append("    pageIdx: ").append(toIndentedString(pageIdx)).append("\n");
    sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
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
    openapiFields.add("MRZTestQuality");
    openapiFields.add("buf_length");
    openapiFields.add("light");
    openapiFields.add("list_idx");
    openapiFields.add("page_idx");
    openapiFields.add("result_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MRZTestQuality");
    openapiRequiredFields.add("result_type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MRZTestQualityResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!MRZTestQualityResult.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in MRZTestQualityResult is not found in the empty JSON string",
                MRZTestQualityResult.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!MRZTestQualityResult.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `MRZTestQualityResult` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : MRZTestQualityResult.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the required field `MRZTestQuality`
    MRZTestQuality.validateJsonElement(jsonObj.get("MRZTestQuality"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!MRZTestQualityResult.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'MRZTestQualityResult' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<MRZTestQualityResult> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(MRZTestQualityResult.class));

      return (TypeAdapter<T>)
          new TypeAdapter<MRZTestQualityResult>() {
            @Override
            public void write(JsonWriter out, MRZTestQualityResult value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public MRZTestQualityResult read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of MRZTestQualityResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MRZTestQualityResult
   * @throws IOException if the JSON string is invalid with respect to MRZTestQualityResult
   */
  public static MRZTestQualityResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MRZTestQualityResult.class);
  }

  /**
   * Convert an instance of MRZTestQualityResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
