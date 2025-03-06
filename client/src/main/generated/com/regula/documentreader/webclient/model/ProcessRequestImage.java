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

/** ProcessRequestImage */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class ProcessRequestImage {
  public static final String SERIALIZED_NAME_IMAGE_DATA = "ImageData";

  @SerializedName(SERIALIZED_NAME_IMAGE_DATA)
  @javax.annotation.Nullable
  private ImageData imageData;

  public static final String SERIALIZED_NAME_LIGHT = "light";

  @SerializedName(SERIALIZED_NAME_LIGHT)
  @javax.annotation.Nullable
  private Light light;

  public static final String SERIALIZED_NAME_PAGE_IDX = "page_idx";

  @SerializedName(SERIALIZED_NAME_PAGE_IDX)
  @javax.annotation.Nullable
  private Integer pageIdx;

  public ProcessRequestImage() {}

  public ProcessRequestImage imageData(@javax.annotation.Nullable ImageData imageData) {
    this.imageData = imageData;
    return this;
  }

  /**
   * Get imageData
   *
   * @return imageData
   */
  @javax.annotation.Nullable
  public ImageData getImageData() {
    return imageData;
  }

  public void setImageData(@javax.annotation.Nullable ImageData imageData) {
    this.imageData = imageData;
  }

  public ProcessRequestImage light(@javax.annotation.Nullable Light light) {
    this.light = light;
    return this;
  }

  /**
   * Get light
   *
   * @return light
   */
  @javax.annotation.Nullable
  public Light getLight() {
    return light;
  }

  public void setLight(@javax.annotation.Nullable Light light) {
    this.light = light;
  }

  public ProcessRequestImage pageIdx(@javax.annotation.Nullable Integer pageIdx) {
    this.pageIdx = pageIdx;
    return this;
  }

  /**
   * page/image number
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessRequestImage processRequestImage = (ProcessRequestImage) o;
    return Objects.equals(this.imageData, processRequestImage.imageData)
        && Objects.equals(this.light, processRequestImage.light)
        && Objects.equals(this.pageIdx, processRequestImage.pageIdx);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageData, light, pageIdx);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessRequestImage {\n");
    sb.append("    imageData: ").append(toIndentedString(imageData)).append("\n");
    sb.append("    light: ").append(toIndentedString(light)).append("\n");
    sb.append("    pageIdx: ").append(toIndentedString(pageIdx)).append("\n");
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
    openapiFields.add("ImageData");
    openapiFields.add("light");
    openapiFields.add("page_idx");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProcessRequestImage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!ProcessRequestImage.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in ProcessRequestImage is not found in the empty JSON string",
                ProcessRequestImage.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!ProcessRequestImage.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `ProcessRequestImage` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the optional field `ImageData`
    if (jsonObj.get("ImageData") != null && !jsonObj.get("ImageData").isJsonNull()) {
      ImageData.validateJsonElement(jsonObj.get("ImageData"));
    }
    // validate the optional field `light`
    if (jsonObj.get("light") != null && !jsonObj.get("light").isJsonNull()) {
      Light.validateJsonElement(jsonObj.get("light"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!ProcessRequestImage.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'ProcessRequestImage' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<ProcessRequestImage> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(ProcessRequestImage.class));

      return (TypeAdapter<T>)
          new TypeAdapter<ProcessRequestImage>() {
            @Override
            public void write(JsonWriter out, ProcessRequestImage value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public ProcessRequestImage read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of ProcessRequestImage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProcessRequestImage
   * @throws IOException if the JSON string is invalid with respect to ProcessRequestImage
   */
  public static ProcessRequestImage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProcessRequestImage.class);
  }

  /**
   * Convert an instance of ProcessRequestImage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
