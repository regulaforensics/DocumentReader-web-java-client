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

/** ParsedData */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class ParsedData {
  public static final String SERIALIZED_NAME_PARSING_NOTIFICATIONS = "ParsingNotifications";

  @SerializedName(SERIALIZED_NAME_PARSING_NOTIFICATIONS)
  @javax.annotation.Nullable
  private List<Long> parsingNotifications;

  public ParsedData() {}

  public ParsedData parsingNotifications(
      @javax.annotation.Nullable List<Long> parsingNotifications) {
    this.parsingNotifications = parsingNotifications;
    return this;
  }

  public ParsedData addParsingNotificationsItem(Long parsingNotificationsItem) {
    if (this.parsingNotifications == null) {
      this.parsingNotifications = new ArrayList<>();
    }
    this.parsingNotifications.add(parsingNotificationsItem);
    return this;
  }

  /**
   * Get parsingNotifications
   *
   * @return parsingNotifications
   */
  @javax.annotation.Nullable
  public List<Long> getParsingNotifications() {
    return parsingNotifications;
  }

  public void setParsingNotifications(@javax.annotation.Nullable List<Long> parsingNotifications) {
    this.parsingNotifications = parsingNotifications;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParsedData parsedData = (ParsedData) o;
    return Objects.equals(this.parsingNotifications, parsedData.parsingNotifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parsingNotifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParsedData {\n");
    sb.append("    parsingNotifications: ")
        .append(toIndentedString(parsingNotifications))
        .append("\n");
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
    openapiFields.add("ParsingNotifications");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ParsedData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!ParsedData.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in ParsedData is not found in the empty JSON string",
                ParsedData.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!ParsedData.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `ParsedData` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // ensure the optional json data is an array if present
    if (jsonObj.get("ParsingNotifications") != null
        && !jsonObj.get("ParsingNotifications").isJsonNull()
        && !jsonObj.get("ParsingNotifications").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `ParsingNotifications` to be an array in the JSON string but got `%s`",
              jsonObj.get("ParsingNotifications").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!ParsedData.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'ParsedData' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<ParsedData> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(ParsedData.class));

      return (TypeAdapter<T>)
          new TypeAdapter<ParsedData>() {
            @Override
            public void write(JsonWriter out, ParsedData value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public ParsedData read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of ParsedData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ParsedData
   * @throws IOException if the JSON string is invalid with respect to ParsedData
   */
  public static ParsedData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ParsedData.class);
  }

  /**
   * Convert an instance of ParsedData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
