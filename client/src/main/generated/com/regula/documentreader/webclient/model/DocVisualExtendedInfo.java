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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** Container for extracted text fields. Fields are identified by type and language */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0")
public class DocVisualExtendedInfo {
  public static final String SERIALIZED_NAME_N_FIELDS = "nFields";

  @SerializedName(SERIALIZED_NAME_N_FIELDS)
  @javax.annotation.Nonnull
  private BigDecimal nFields;

  public static final String SERIALIZED_NAME_P_ARRAY_FIELDS = "pArrayFields";

  @SerializedName(SERIALIZED_NAME_P_ARRAY_FIELDS)
  @javax.annotation.Nonnull
  private List<DocVisualExtendedInfoPArrayFieldsInner> pArrayFields;

  public DocVisualExtendedInfo() {}

  public DocVisualExtendedInfo nFields(@javax.annotation.Nonnull BigDecimal nFields) {
    this.nFields = nFields;
    return this;
  }

  /**
   * Number of pArrayFields array elements
   *
   * @return nFields
   */
  @javax.annotation.Nonnull
  public BigDecimal getnFields() {
    return nFields;
  }

  public void setnFields(@javax.annotation.Nonnull BigDecimal nFields) {
    this.nFields = nFields;
  }

  public DocVisualExtendedInfo pArrayFields(
      @javax.annotation.Nonnull List<DocVisualExtendedInfoPArrayFieldsInner> pArrayFields) {
    this.pArrayFields = pArrayFields;
    return this;
  }

  public DocVisualExtendedInfo addPArrayFieldsItem(
      DocVisualExtendedInfoPArrayFieldsInner pArrayFieldsItem) {
    if (this.pArrayFields == null) {
      this.pArrayFields = new ArrayList<>();
    }
    this.pArrayFields.add(pArrayFieldsItem);
    return this;
  }

  /**
   * Get pArrayFields
   *
   * @return pArrayFields
   */
  @javax.annotation.Nonnull
  public List<DocVisualExtendedInfoPArrayFieldsInner> getpArrayFields() {
    return pArrayFields;
  }

  public void setpArrayFields(
      @javax.annotation.Nonnull List<DocVisualExtendedInfoPArrayFieldsInner> pArrayFields) {
    this.pArrayFields = pArrayFields;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocVisualExtendedInfo docVisualExtendedInfo = (DocVisualExtendedInfo) o;
    return Objects.equals(this.nFields, docVisualExtendedInfo.nFields)
        && Objects.equals(this.pArrayFields, docVisualExtendedInfo.pArrayFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nFields, pArrayFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocVisualExtendedInfo {\n");
    sb.append("    nFields: ").append(toIndentedString(nFields)).append("\n");
    sb.append("    pArrayFields: ").append(toIndentedString(pArrayFields)).append("\n");
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
    openapiFields.add("nFields");
    openapiFields.add("pArrayFields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("nFields");
    openapiRequiredFields.add("pArrayFields");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocVisualExtendedInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!DocVisualExtendedInfo.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in DocVisualExtendedInfo is not found in the empty JSON string",
                DocVisualExtendedInfo.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!DocVisualExtendedInfo.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `DocVisualExtendedInfo` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : DocVisualExtendedInfo.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // ensure the json data is an array
    if (!jsonObj.get("pArrayFields").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `pArrayFields` to be an array in the JSON string but got `%s`",
              jsonObj.get("pArrayFields").toString()));
    }

    JsonArray jsonArraypArrayFields = jsonObj.getAsJsonArray("pArrayFields");
    // validate the required field `pArrayFields` (array)
    for (int i = 0; i < jsonArraypArrayFields.size(); i++) {
      DocVisualExtendedInfoPArrayFieldsInner.validateJsonElement(jsonArraypArrayFields.get(i));
    }
    ;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!DocVisualExtendedInfo.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'DocVisualExtendedInfo' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<DocVisualExtendedInfo> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(DocVisualExtendedInfo.class));

      return (TypeAdapter<T>)
          new TypeAdapter<DocVisualExtendedInfo>() {
            @Override
            public void write(JsonWriter out, DocVisualExtendedInfo value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public DocVisualExtendedInfo read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of DocVisualExtendedInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocVisualExtendedInfo
   * @throws IOException if the JSON string is invalid with respect to DocVisualExtendedInfo
   */
  public static DocVisualExtendedInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocVisualExtendedInfo.class);
  }

  /**
   * Convert an instance of DocVisualExtendedInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
