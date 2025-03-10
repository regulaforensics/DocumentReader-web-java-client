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

/** TDocBinaryInfoItem */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class TDocBinaryInfoItem {
  public static final String SERIALIZED_NAME_TDOC_BINARY_INFO = "TDocBinaryInfo";

  @SerializedName(SERIALIZED_NAME_TDOC_BINARY_INFO)
  @javax.annotation.Nonnull
  private TDocBinaryInfo tdocBinaryInfo;

  public TDocBinaryInfoItem() {}

  public TDocBinaryInfoItem tdocBinaryInfo(
      @javax.annotation.Nonnull TDocBinaryInfo tdocBinaryInfo) {
    this.tdocBinaryInfo = tdocBinaryInfo;
    return this;
  }

  /**
   * Get tdocBinaryInfo
   *
   * @return tdocBinaryInfo
   */
  @javax.annotation.Nonnull
  public TDocBinaryInfo getTdocBinaryInfo() {
    return tdocBinaryInfo;
  }

  public void setTdocBinaryInfo(@javax.annotation.Nonnull TDocBinaryInfo tdocBinaryInfo) {
    this.tdocBinaryInfo = tdocBinaryInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TDocBinaryInfoItem tdocBinaryInfoItem = (TDocBinaryInfoItem) o;
    return Objects.equals(this.tdocBinaryInfo, tdocBinaryInfoItem.tdocBinaryInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tdocBinaryInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TDocBinaryInfoItem {\n");
    sb.append("    tdocBinaryInfo: ").append(toIndentedString(tdocBinaryInfo)).append("\n");
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
    openapiFields.add("TDocBinaryInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("TDocBinaryInfo");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TDocBinaryInfoItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!TDocBinaryInfoItem.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in TDocBinaryInfoItem is not found in the empty JSON string",
                TDocBinaryInfoItem.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!TDocBinaryInfoItem.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `TDocBinaryInfoItem` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : TDocBinaryInfoItem.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the required field `TDocBinaryInfo`
    TDocBinaryInfo.validateJsonElement(jsonObj.get("TDocBinaryInfo"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!TDocBinaryInfoItem.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'TDocBinaryInfoItem' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<TDocBinaryInfoItem> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(TDocBinaryInfoItem.class));

      return (TypeAdapter<T>)
          new TypeAdapter<TDocBinaryInfoItem>() {
            @Override
            public void write(JsonWriter out, TDocBinaryInfoItem value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public TDocBinaryInfoItem read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of TDocBinaryInfoItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TDocBinaryInfoItem
   * @throws IOException if the JSON string is invalid with respect to TDocBinaryInfoItem
   */
  public static TDocBinaryInfoItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TDocBinaryInfoItem.class);
  }

  /**
   * Convert an instance of TDocBinaryInfoItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
