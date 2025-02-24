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

/** Contains all document text fields data with validity and cross-source compare checks */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0")
public class Text {
  public static final String SERIALIZED_NAME_STATUS = "status";

  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private CheckResult status;

  public static final String SERIALIZED_NAME_VALIDITY_STATUS = "validityStatus";

  @SerializedName(SERIALIZED_NAME_VALIDITY_STATUS)
  @javax.annotation.Nonnull
  private CheckResult validityStatus;

  public static final String SERIALIZED_NAME_COMPARISON_STATUS = "comparisonStatus";

  @SerializedName(SERIALIZED_NAME_COMPARISON_STATUS)
  @javax.annotation.Nonnull
  private CheckResult comparisonStatus;

  public static final String SERIALIZED_NAME_DATE_FORMAT = "dateFormat";

  @SerializedName(SERIALIZED_NAME_DATE_FORMAT)
  @javax.annotation.Nonnull
  private String dateFormat;

  public static final String SERIALIZED_NAME_FIELD_LIST = "fieldList";

  @SerializedName(SERIALIZED_NAME_FIELD_LIST)
  @javax.annotation.Nonnull
  private List<TextField> fieldList;

  public static final String SERIALIZED_NAME_AVAILABLE_SOURCE_LIST = "availableSourceList";

  @SerializedName(SERIALIZED_NAME_AVAILABLE_SOURCE_LIST)
  @javax.annotation.Nonnull
  private List<TextAvailableSource> availableSourceList;

  public Text() {}

  public Text status(@javax.annotation.Nonnull CheckResult status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @javax.annotation.Nonnull
  public CheckResult getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull CheckResult status) {
    this.status = status;
  }

  public Text validityStatus(@javax.annotation.Nonnull CheckResult validityStatus) {
    this.validityStatus = validityStatus;
    return this;
  }

  /**
   * Get validityStatus
   *
   * @return validityStatus
   */
  @javax.annotation.Nonnull
  public CheckResult getValidityStatus() {
    return validityStatus;
  }

  public void setValidityStatus(@javax.annotation.Nonnull CheckResult validityStatus) {
    this.validityStatus = validityStatus;
  }

  public Text comparisonStatus(@javax.annotation.Nonnull CheckResult comparisonStatus) {
    this.comparisonStatus = comparisonStatus;
    return this;
  }

  /**
   * Get comparisonStatus
   *
   * @return comparisonStatus
   */
  @javax.annotation.Nonnull
  public CheckResult getComparisonStatus() {
    return comparisonStatus;
  }

  public void setComparisonStatus(@javax.annotation.Nonnull CheckResult comparisonStatus) {
    this.comparisonStatus = comparisonStatus;
  }

  public Text dateFormat(@javax.annotation.Nonnull String dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

  /**
   * Date format
   *
   * @return dateFormat
   */
  @javax.annotation.Nonnull
  public String getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(@javax.annotation.Nonnull String dateFormat) {
    this.dateFormat = dateFormat;
  }

  public Text fieldList(@javax.annotation.Nonnull List<TextField> fieldList) {
    this.fieldList = fieldList;
    return this;
  }

  public Text addFieldListItem(TextField fieldListItem) {
    if (this.fieldList == null) {
      this.fieldList = new ArrayList<>();
    }
    this.fieldList.add(fieldListItem);
    return this;
  }

  /**
   * Get fieldList
   *
   * @return fieldList
   */
  @javax.annotation.Nonnull
  public List<TextField> getFieldList() {
    return fieldList;
  }

  public void setFieldList(@javax.annotation.Nonnull List<TextField> fieldList) {
    this.fieldList = fieldList;
  }

  public Text availableSourceList(
      @javax.annotation.Nonnull List<TextAvailableSource> availableSourceList) {
    this.availableSourceList = availableSourceList;
    return this;
  }

  public Text addAvailableSourceListItem(TextAvailableSource availableSourceListItem) {
    if (this.availableSourceList == null) {
      this.availableSourceList = new ArrayList<>();
    }
    this.availableSourceList.add(availableSourceListItem);
    return this;
  }

  /**
   * Get availableSourceList
   *
   * @return availableSourceList
   */
  @javax.annotation.Nonnull
  public List<TextAvailableSource> getAvailableSourceList() {
    return availableSourceList;
  }

  public void setAvailableSourceList(
      @javax.annotation.Nonnull List<TextAvailableSource> availableSourceList) {
    this.availableSourceList = availableSourceList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Text text = (Text) o;
    return Objects.equals(this.status, text.status)
        && Objects.equals(this.validityStatus, text.validityStatus)
        && Objects.equals(this.comparisonStatus, text.comparisonStatus)
        && Objects.equals(this.dateFormat, text.dateFormat)
        && Objects.equals(this.fieldList, text.fieldList)
        && Objects.equals(this.availableSourceList, text.availableSourceList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        status, validityStatus, comparisonStatus, dateFormat, fieldList, availableSourceList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Text {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    validityStatus: ").append(toIndentedString(validityStatus)).append("\n");
    sb.append("    comparisonStatus: ").append(toIndentedString(comparisonStatus)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    fieldList: ").append(toIndentedString(fieldList)).append("\n");
    sb.append("    availableSourceList: ")
        .append(toIndentedString(availableSourceList))
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
    openapiFields.add("status");
    openapiFields.add("validityStatus");
    openapiFields.add("comparisonStatus");
    openapiFields.add("dateFormat");
    openapiFields.add("fieldList");
    openapiFields.add("availableSourceList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("validityStatus");
    openapiRequiredFields.add("comparisonStatus");
    openapiRequiredFields.add("dateFormat");
    openapiRequiredFields.add("fieldList");
    openapiRequiredFields.add("availableSourceList");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Text
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!Text.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in Text is not found in the empty JSON string",
                Text.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!Text.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `Text` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : Text.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the required field `status`
    CheckResult.validateJsonElement(jsonObj.get("status"));
    // validate the required field `validityStatus`
    CheckResult.validateJsonElement(jsonObj.get("validityStatus"));
    // validate the required field `comparisonStatus`
    CheckResult.validateJsonElement(jsonObj.get("comparisonStatus"));
    if (!jsonObj.get("dateFormat").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `dateFormat` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("dateFormat").toString()));
    }
    // ensure the json data is an array
    if (!jsonObj.get("fieldList").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `fieldList` to be an array in the JSON string but got `%s`",
              jsonObj.get("fieldList").toString()));
    }

    JsonArray jsonArrayfieldList = jsonObj.getAsJsonArray("fieldList");
    // validate the required field `fieldList` (array)
    for (int i = 0; i < jsonArrayfieldList.size(); i++) {
      TextField.validateJsonElement(jsonArrayfieldList.get(i));
    }
    ;
    // ensure the json data is an array
    if (!jsonObj.get("availableSourceList").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `availableSourceList` to be an array in the JSON string but got `%s`",
              jsonObj.get("availableSourceList").toString()));
    }

    JsonArray jsonArrayavailableSourceList = jsonObj.getAsJsonArray("availableSourceList");
    // validate the required field `availableSourceList` (array)
    for (int i = 0; i < jsonArrayavailableSourceList.size(); i++) {
      TextAvailableSource.validateJsonElement(jsonArrayavailableSourceList.get(i));
    }
    ;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!Text.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'Text' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<Text> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(Text.class));

      return (TypeAdapter<T>)
          new TypeAdapter<Text>() {
            @Override
            public void write(JsonWriter out, Text value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public Text read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of Text given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Text
   * @throws IOException if the JSON string is invalid with respect to Text
   */
  public static Text fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Text.class);
  }

  /**
   * Convert an instance of Text to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
