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

/** Structure contains information on a certificate validity. */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class RfidValidity {
  public static final String SERIALIZED_NAME_NOT_BEFORE = "NotBefore";

  @SerializedName(SERIALIZED_NAME_NOT_BEFORE)
  @javax.annotation.Nonnull
  private TrfFtString notBefore;

  public static final String SERIALIZED_NAME_NOT_AFTER = "NotAfter";

  @SerializedName(SERIALIZED_NAME_NOT_AFTER)
  @javax.annotation.Nonnull
  private TrfFtString notAfter;

  public RfidValidity() {}

  public RfidValidity notBefore(@javax.annotation.Nonnull TrfFtString notBefore) {
    this.notBefore = notBefore;
    return this;
  }

  /**
   * Get notBefore
   *
   * @return notBefore
   */
  @javax.annotation.Nonnull
  public TrfFtString getNotBefore() {
    return notBefore;
  }

  public void setNotBefore(@javax.annotation.Nonnull TrfFtString notBefore) {
    this.notBefore = notBefore;
  }

  public RfidValidity notAfter(@javax.annotation.Nonnull TrfFtString notAfter) {
    this.notAfter = notAfter;
    return this;
  }

  /**
   * Get notAfter
   *
   * @return notAfter
   */
  @javax.annotation.Nonnull
  public TrfFtString getNotAfter() {
    return notAfter;
  }

  public void setNotAfter(@javax.annotation.Nonnull TrfFtString notAfter) {
    this.notAfter = notAfter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RfidValidity rfidValidity = (RfidValidity) o;
    return Objects.equals(this.notBefore, rfidValidity.notBefore)
        && Objects.equals(this.notAfter, rfidValidity.notAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notBefore, notAfter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RfidValidity {\n");
    sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
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
    openapiFields.add("NotBefore");
    openapiFields.add("NotAfter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("NotBefore");
    openapiRequiredFields.add("NotAfter");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RfidValidity
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!RfidValidity.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in RfidValidity is not found in the empty JSON string",
                RfidValidity.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!RfidValidity.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `RfidValidity` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : RfidValidity.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the required field `NotBefore`
    TrfFtString.validateJsonElement(jsonObj.get("NotBefore"));
    // validate the required field `NotAfter`
    TrfFtString.validateJsonElement(jsonObj.get("NotAfter"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!RfidValidity.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'RfidValidity' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<RfidValidity> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(RfidValidity.class));

      return (TypeAdapter<T>)
          new TypeAdapter<RfidValidity>() {
            @Override
            public void write(JsonWriter out, RfidValidity value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public RfidValidity read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of RfidValidity given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RfidValidity
   * @throws IOException if the JSON string is invalid with respect to RfidValidity
   */
  public static RfidValidity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RfidValidity.class);
  }

  /**
   * Convert an instance of RfidValidity to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
