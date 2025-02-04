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

/** ByteArrayResult */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0")
public class ByteArrayResult {
  public static final String SERIALIZED_NAME_BYTE_ARRAY = "ByteArray";

  @SerializedName(SERIALIZED_NAME_BYTE_ARRAY)
  @javax.annotation.Nonnull
  private String byteArray;

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

  public ByteArrayResult() {}

  public ByteArrayResult byteArray(@javax.annotation.Nonnull String byteArray) {
    this.byteArray = byteArray;
    return this;
  }

  /**
   * Byte array in base64
   *
   * @return byteArray
   */
  @javax.annotation.Nonnull
  public String getByteArray() {
    return byteArray;
  }

  public void setByteArray(@javax.annotation.Nonnull String byteArray) {
    this.byteArray = byteArray;
  }

  public ByteArrayResult bufLength(@javax.annotation.Nullable Integer bufLength) {
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

  public ByteArrayResult light(@javax.annotation.Nullable Integer light) {
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

  public ByteArrayResult listIdx(@javax.annotation.Nullable Integer listIdx) {
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

  public ByteArrayResult pageIdx(@javax.annotation.Nullable Integer pageIdx) {
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

  public ByteArrayResult resultType(@javax.annotation.Nonnull Integer resultType) {
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
    ByteArrayResult byteArrayResult = (ByteArrayResult) o;
    return Objects.equals(this.byteArray, byteArrayResult.byteArray)
        && Objects.equals(this.bufLength, byteArrayResult.bufLength)
        && Objects.equals(this.light, byteArrayResult.light)
        && Objects.equals(this.listIdx, byteArrayResult.listIdx)
        && Objects.equals(this.pageIdx, byteArrayResult.pageIdx)
        && Objects.equals(this.resultType, byteArrayResult.resultType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(byteArray, bufLength, light, listIdx, pageIdx, resultType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ByteArrayResult {\n");
    sb.append("    byteArray: ").append(toIndentedString(byteArray)).append("\n");
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
    openapiFields.add("ByteArray");
    openapiFields.add("buf_length");
    openapiFields.add("light");
    openapiFields.add("list_idx");
    openapiFields.add("page_idx");
    openapiFields.add("result_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ByteArray");
    openapiRequiredFields.add("result_type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ByteArrayResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!ByteArrayResult.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in ByteArrayResult is not found in the empty JSON string",
                ByteArrayResult.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!ByteArrayResult.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `ByteArrayResult` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : ByteArrayResult.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if (!jsonObj.get("ByteArray").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `ByteArray` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("ByteArray").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!ByteArrayResult.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'ByteArrayResult' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<ByteArrayResult> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(ByteArrayResult.class));

      return (TypeAdapter<T>)
          new TypeAdapter<ByteArrayResult>() {
            @Override
            public void write(JsonWriter out, ByteArrayResult value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public ByteArrayResult read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of ByteArrayResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ByteArrayResult
   * @throws IOException if the JSON string is invalid with respect to ByteArrayResult
   */
  public static ByteArrayResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ByteArrayResult.class);
  }

  /**
   * Convert an instance of ByteArrayResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
