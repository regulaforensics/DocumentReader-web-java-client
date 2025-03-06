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
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Structure is used to describe the terminal type within the context of the communication session
 * with electronic document
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class RfidTerminal {
  public static final String SERIALIZED_NAME_TERM_TYPE = "TermType";

  @SerializedName(SERIALIZED_NAME_TERM_TYPE)
  @javax.annotation.Nonnull
  private RfidTerminalType termType;

  public static final String SERIALIZED_NAME_AUTH_REQ = "AuthReq";

  @SerializedName(SERIALIZED_NAME_AUTH_REQ)
  @javax.annotation.Nonnull
  private BigDecimal authReq;

  public static final String SERIALIZED_NAME_AUTH_REQ2 = "AuthReq2";

  @SerializedName(SERIALIZED_NAME_AUTH_REQ2)
  @javax.annotation.Nonnull
  private BigDecimal authReq2;

  public RfidTerminal() {}

  public RfidTerminal termType(@javax.annotation.Nonnull RfidTerminalType termType) {
    this.termType = termType;
    return this;
  }

  /**
   * Get termType
   *
   * @return termType
   */
  @javax.annotation.Nonnull
  public RfidTerminalType getTermType() {
    return termType;
  }

  public void setTermType(@javax.annotation.Nonnull RfidTerminalType termType) {
    this.termType = termType;
  }

  public RfidTerminal authReq(@javax.annotation.Nonnull BigDecimal authReq) {
    this.authReq = authReq;
    return this;
  }

  /**
   * Declared (set) combination of flags of access rights to the functionality of the document
   * (combination of eRfidTerminalAuthorizationRequirement values)
   *
   * @return authReq
   */
  @javax.annotation.Nonnull
  public BigDecimal getAuthReq() {
    return authReq;
  }

  public void setAuthReq(@javax.annotation.Nonnull BigDecimal authReq) {
    this.authReq = authReq;
  }

  public RfidTerminal authReq2(@javax.annotation.Nonnull BigDecimal authReq2) {
    this.authReq2 = authReq2;
    return this;
  }

  /**
   * Declared (set) combination of flags of access rights to the functionality of the document
   * (combination of RfidTerminalAuthorizationRequirement values)
   *
   * @return authReq2
   */
  @javax.annotation.Nonnull
  public BigDecimal getAuthReq2() {
    return authReq2;
  }

  public void setAuthReq2(@javax.annotation.Nonnull BigDecimal authReq2) {
    this.authReq2 = authReq2;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RfidTerminal rfidTerminal = (RfidTerminal) o;
    return Objects.equals(this.termType, rfidTerminal.termType)
        && Objects.equals(this.authReq, rfidTerminal.authReq)
        && Objects.equals(this.authReq2, rfidTerminal.authReq2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(termType, authReq, authReq2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RfidTerminal {\n");
    sb.append("    termType: ").append(toIndentedString(termType)).append("\n");
    sb.append("    authReq: ").append(toIndentedString(authReq)).append("\n");
    sb.append("    authReq2: ").append(toIndentedString(authReq2)).append("\n");
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
    openapiFields.add("TermType");
    openapiFields.add("AuthReq");
    openapiFields.add("AuthReq2");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("TermType");
    openapiRequiredFields.add("AuthReq");
    openapiRequiredFields.add("AuthReq2");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RfidTerminal
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!RfidTerminal.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in RfidTerminal is not found in the empty JSON string",
                RfidTerminal.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!RfidTerminal.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `RfidTerminal` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : RfidTerminal.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the required field `TermType`
    RfidTerminalType.validateJsonElement(jsonObj.get("TermType"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!RfidTerminal.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'RfidTerminal' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<RfidTerminal> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(RfidTerminal.class));

      return (TypeAdapter<T>)
          new TypeAdapter<RfidTerminal>() {
            @Override
            public void write(JsonWriter out, RfidTerminal value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public RfidTerminal read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of RfidTerminal given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RfidTerminal
   * @throws IOException if the JSON string is invalid with respect to RfidTerminal
   */
  public static RfidTerminal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RfidTerminal.class);
  }

  /**
   * Convert an instance of RfidTerminal to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
