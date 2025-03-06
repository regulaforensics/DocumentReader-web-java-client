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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** MRZRowsItem */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class MRZRowsItem {
  public static final String SERIALIZED_NAME_LENGTH = "length";

  @SerializedName(SERIALIZED_NAME_LENGTH)
  @javax.annotation.Nonnull
  private Integer length;

  public static final String SERIALIZED_NAME_MAX_LENGTH = "maxLength";

  @SerializedName(SERIALIZED_NAME_MAX_LENGTH)
  @javax.annotation.Nonnull
  private Integer maxLength;

  public static final String SERIALIZED_NAME_SYMBOLS = "symbols";

  @SerializedName(SERIALIZED_NAME_SYMBOLS)
  @javax.annotation.Nonnull
  private List<Symbol> symbols;

  public MRZRowsItem() {}

  public MRZRowsItem length(@javax.annotation.Nonnull Integer length) {
    this.length = length;
    return this;
  }

  /**
   * Get length
   *
   * @return length
   */
  @javax.annotation.Nonnull
  public Integer getLength() {
    return length;
  }

  public void setLength(@javax.annotation.Nonnull Integer length) {
    this.length = length;
  }

  public MRZRowsItem maxLength(@javax.annotation.Nonnull Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

  /**
   * Get maxLength
   *
   * @return maxLength
   */
  @javax.annotation.Nonnull
  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(@javax.annotation.Nonnull Integer maxLength) {
    this.maxLength = maxLength;
  }

  public MRZRowsItem symbols(@javax.annotation.Nonnull List<Symbol> symbols) {
    this.symbols = symbols;
    return this;
  }

  public MRZRowsItem addSymbolsItem(Symbol symbolsItem) {
    if (this.symbols == null) {
      this.symbols = new ArrayList<>();
    }
    this.symbols.add(symbolsItem);
    return this;
  }

  /**
   * Get symbols
   *
   * @return symbols
   */
  @javax.annotation.Nonnull
  public List<Symbol> getSymbols() {
    return symbols;
  }

  public void setSymbols(@javax.annotation.Nonnull List<Symbol> symbols) {
    this.symbols = symbols;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MRZRowsItem mrZRowsItem = (MRZRowsItem) o;
    return Objects.equals(this.length, mrZRowsItem.length)
        && Objects.equals(this.maxLength, mrZRowsItem.maxLength)
        && Objects.equals(this.symbols, mrZRowsItem.symbols);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, maxLength, symbols);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MRZRowsItem {\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    symbols: ").append(toIndentedString(symbols)).append("\n");
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
    openapiFields.add("length");
    openapiFields.add("maxLength");
    openapiFields.add("symbols");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("length");
    openapiRequiredFields.add("maxLength");
    openapiRequiredFields.add("symbols");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MRZRowsItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!MRZRowsItem.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in MRZRowsItem is not found in the empty JSON string",
                MRZRowsItem.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!MRZRowsItem.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `MRZRowsItem` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : MRZRowsItem.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // ensure the json data is an array
    if (!jsonObj.get("symbols").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `symbols` to be an array in the JSON string but got `%s`",
              jsonObj.get("symbols").toString()));
    }

    JsonArray jsonArraysymbols = jsonObj.getAsJsonArray("symbols");
    // validate the required field `symbols` (array)
    for (int i = 0; i < jsonArraysymbols.size(); i++) {
      Symbol.validateJsonElement(jsonArraysymbols.get(i));
    }
    ;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!MRZRowsItem.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'MRZRowsItem' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<MRZRowsItem> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(MRZRowsItem.class));

      return (TypeAdapter<T>)
          new TypeAdapter<MRZRowsItem>() {
            @Override
            public void write(JsonWriter out, MRZRowsItem value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public MRZRowsItem read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of MRZRowsItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MRZRowsItem
   * @throws IOException if the JSON string is invalid with respect to MRZRowsItem
   */
  public static MRZRowsItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MRZRowsItem.class);
  }

  /**
   * Convert an instance of MRZRowsItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
