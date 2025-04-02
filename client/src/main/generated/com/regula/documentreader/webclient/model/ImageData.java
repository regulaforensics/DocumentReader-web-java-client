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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** ImageData */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class ImageData {
  public static final String SERIALIZED_NAME_IMAGE = "image";

  @SerializedName(SERIALIZED_NAME_IMAGE)
  @javax.annotation.Nonnull
  private String image;

  public static final String SERIALIZED_NAME_FORMAT = "format";

  @SerializedName(SERIALIZED_NAME_FORMAT)
  @javax.annotation.Nullable
  private String format;

  public ImageData() {}

  public ImageData image(@javax.annotation.Nonnull String image) {
    this.image = image;
    return this;
  }

  /**
   * Base64 encoded image
   *
   * @return image
   */
  @javax.annotation.Nonnull
  public String getImage() {
    return image;
  }

  public void setImage(@javax.annotation.Nonnull String image) {
    this.image = image;
  }

  public ImageData format(@javax.annotation.Nullable String format) {
    this.format = format;
    return this;
  }

  /**
   * Image format
   *
   * @return format
   */
  @javax.annotation.Nullable
  public String getFormat() {
    return format;
  }

  public void setFormat(@javax.annotation.Nullable String format) {
    this.format = format;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageData imageData = (ImageData) o;
    return Objects.equals(this.image, imageData.image)
        && Objects.equals(this.format, imageData.format);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, format);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageData {\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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
    openapiFields.add("image");
    openapiFields.add("format");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("image");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ImageData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!ImageData.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in ImageData is not found in the empty JSON string",
                ImageData.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!ImageData.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `ImageData` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : ImageData.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if (!jsonObj.get("image").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `image` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("image").toString()));
    }
    if ((jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull())
        && !jsonObj.get("format").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `format` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("format").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!ImageData.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'ImageData' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<ImageData> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(ImageData.class));

      return (TypeAdapter<T>)
          new TypeAdapter<ImageData>() {
            @Override
            public void write(JsonWriter out, ImageData value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public ImageData read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of ImageData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ImageData
   * @throws IOException if the JSON string is invalid with respect to ImageData
   */
  public static ImageData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImageData.class);
  }

  /**
   * Convert an instance of ImageData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
