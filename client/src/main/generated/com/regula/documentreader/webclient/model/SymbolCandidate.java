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
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** Describes an individual character recognition candidate */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0")
public class SymbolCandidate {
  public static final String SERIALIZED_NAME_SYMBOL_CODE = "SymbolCode";

  @SerializedName(SERIALIZED_NAME_SYMBOL_CODE)
  @javax.annotation.Nonnull
  private Integer symbolCode;

  public static final String SERIALIZED_NAME_SYMBOL_PROBABILITY = "SymbolProbability";

  @SerializedName(SERIALIZED_NAME_SYMBOL_PROBABILITY)
  @javax.annotation.Nonnull
  private Integer symbolProbability;

  public static final String SERIALIZED_NAME_RESERVED = "Reserved";

  @SerializedName(SERIALIZED_NAME_RESERVED)
  @javax.annotation.Nullable
  private Object reserved = null;

  public SymbolCandidate() {}

  public SymbolCandidate symbolCode(@javax.annotation.Nonnull Integer symbolCode) {
    this.symbolCode = symbolCode;
    return this;
  }

  /**
   * Unicode symbol code
   *
   * @return symbolCode
   */
  @javax.annotation.Nonnull
  public Integer getSymbolCode() {
    return symbolCode;
  }

  public void setSymbolCode(@javax.annotation.Nonnull Integer symbolCode) {
    this.symbolCode = symbolCode;
  }

  public SymbolCandidate symbolProbability(@javax.annotation.Nonnull Integer symbolProbability) {
    this.symbolProbability = symbolProbability;
    return this;
  }

  /**
   * character recognition probability (0–100,%) minimum: 0 maximum: 100
   *
   * @return symbolProbability
   */
  @javax.annotation.Nonnull
  public Integer getSymbolProbability() {
    return symbolProbability;
  }

  public void setSymbolProbability(@javax.annotation.Nonnull Integer symbolProbability) {
    this.symbolProbability = symbolProbability;
  }

  public SymbolCandidate reserved(@javax.annotation.Nullable Object reserved) {
    this.reserved = reserved;
    return this;
  }

  /**
   * Get reserved
   *
   * @return reserved
   */
  @javax.annotation.Nullable
  public Object getReserved() {
    return reserved;
  }

  public void setReserved(@javax.annotation.Nullable Object reserved) {
    this.reserved = reserved;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SymbolCandidate symbolCandidate = (SymbolCandidate) o;
    return Objects.equals(this.symbolCode, symbolCandidate.symbolCode)
        && Objects.equals(this.symbolProbability, symbolCandidate.symbolProbability)
        && Objects.equals(this.reserved, symbolCandidate.reserved);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b
        || (a != null
            && b != null
            && a.isPresent()
            && b.isPresent()
            && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbolCode, symbolProbability, reserved);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SymbolCandidate {\n");
    sb.append("    symbolCode: ").append(toIndentedString(symbolCode)).append("\n");
    sb.append("    symbolProbability: ").append(toIndentedString(symbolProbability)).append("\n");
    sb.append("    reserved: ").append(toIndentedString(reserved)).append("\n");
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
    openapiFields.add("SymbolCode");
    openapiFields.add("SymbolProbability");
    openapiFields.add("Reserved");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("SymbolCode");
    openapiRequiredFields.add("SymbolProbability");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SymbolCandidate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!SymbolCandidate.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in SymbolCandidate is not found in the empty JSON string",
                SymbolCandidate.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!SymbolCandidate.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `SymbolCandidate` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : SymbolCandidate.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!SymbolCandidate.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'SymbolCandidate' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<SymbolCandidate> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(SymbolCandidate.class));

      return (TypeAdapter<T>)
          new TypeAdapter<SymbolCandidate>() {
            @Override
            public void write(JsonWriter out, SymbolCandidate value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public SymbolCandidate read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of SymbolCandidate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SymbolCandidate
   * @throws IOException if the JSON string is invalid with respect to SymbolCandidate
   */
  public static SymbolCandidate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SymbolCandidate.class);
  }

  /**
   * Convert an instance of SymbolCandidate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
