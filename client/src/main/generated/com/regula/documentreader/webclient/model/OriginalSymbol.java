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

/** OriginalSymbol */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0")
public class OriginalSymbol {
  public static final String SERIALIZED_NAME_CODE = "code";

  @SerializedName(SERIALIZED_NAME_CODE)
  @javax.annotation.Nonnull
  private Long code;

  public static final String SERIALIZED_NAME_PROBABILITY = "probability";

  @SerializedName(SERIALIZED_NAME_PROBABILITY)
  @javax.annotation.Nonnull
  private Integer probability;

  public static final String SERIALIZED_NAME_RECT = "rect";

  @SerializedName(SERIALIZED_NAME_RECT)
  @javax.annotation.Nullable
  private RectangleCoordinates rect;

  public OriginalSymbol() {}

  public OriginalSymbol code(@javax.annotation.Nonnull Long code) {
    this.code = code;
    return this;
  }

  /**
   * Unicode symbol code
   *
   * @return code
   */
  @javax.annotation.Nonnull
  public Long getCode() {
    return code;
  }

  public void setCode(@javax.annotation.Nonnull Long code) {
    this.code = code;
  }

  public OriginalSymbol probability(@javax.annotation.Nonnull Integer probability) {
    this.probability = probability;
    return this;
  }

  /**
   * Probability of correctness reading of a single character minimum: 0 maximum: 100
   *
   * @return probability
   */
  @javax.annotation.Nonnull
  public Integer getProbability() {
    return probability;
  }

  public void setProbability(@javax.annotation.Nonnull Integer probability) {
    this.probability = probability;
  }

  public OriginalSymbol rect(@javax.annotation.Nullable RectangleCoordinates rect) {
    this.rect = rect;
    return this;
  }

  /**
   * Get rect
   *
   * @return rect
   */
  @javax.annotation.Nullable
  public RectangleCoordinates getRect() {
    return rect;
  }

  public void setRect(@javax.annotation.Nullable RectangleCoordinates rect) {
    this.rect = rect;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginalSymbol originalSymbol = (OriginalSymbol) o;
    return Objects.equals(this.code, originalSymbol.code)
        && Objects.equals(this.probability, originalSymbol.probability)
        && Objects.equals(this.rect, originalSymbol.rect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, probability, rect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginalSymbol {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
    sb.append("    rect: ").append(toIndentedString(rect)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("probability");
    openapiFields.add("rect");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("probability");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OriginalSymbol
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!OriginalSymbol.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in OriginalSymbol is not found in the empty JSON string",
                OriginalSymbol.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!OriginalSymbol.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `OriginalSymbol` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : OriginalSymbol.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the optional field `rect`
    if (jsonObj.get("rect") != null && !jsonObj.get("rect").isJsonNull()) {
      RectangleCoordinates.validateJsonElement(jsonObj.get("rect"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!OriginalSymbol.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'OriginalSymbol' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<OriginalSymbol> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(OriginalSymbol.class));

      return (TypeAdapter<T>)
          new TypeAdapter<OriginalSymbol>() {
            @Override
            public void write(JsonWriter out, OriginalSymbol value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public OriginalSymbol read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of OriginalSymbol given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OriginalSymbol
   * @throws IOException if the JSON string is invalid with respect to OriginalSymbol
   */
  public static OriginalSymbol fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OriginalSymbol.class);
  }

  /**
   * Convert an instance of OriginalSymbol to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
