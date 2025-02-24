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

/** ResultMRZDetector */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0")
public class ResultMRZDetector {
  public static final String SERIALIZED_NAME_MR_Z_FORMAT = "MRZFormat";

  @SerializedName(SERIALIZED_NAME_MR_Z_FORMAT)
  @javax.annotation.Nonnull
  private Integer mrZFormat;

  public static final String SERIALIZED_NAME_MR_Z_ROWS = "MRZRows";

  @SerializedName(SERIALIZED_NAME_MR_Z_ROWS)
  @javax.annotation.Nonnull
  private List<MRZRowsItem> mrZRows;

  public static final String SERIALIZED_NAME_MR_Z_ROWS_NUM = "MRZRowsNum";

  @SerializedName(SERIALIZED_NAME_MR_Z_ROWS_NUM)
  @javax.annotation.Nonnull
  private Integer mrZRowsNum;

  public static final String SERIALIZED_NAME_BOUNDING_QUADRANGLE = "boundingQuadrangle";

  @SerializedName(SERIALIZED_NAME_BOUNDING_QUADRANGLE)
  @javax.annotation.Nonnull
  private List<Integer> boundingQuadrangle;

  public ResultMRZDetector() {}

  public ResultMRZDetector mrZFormat(@javax.annotation.Nonnull Integer mrZFormat) {
    this.mrZFormat = mrZFormat;
    return this;
  }

  /**
   * Get mrZFormat
   *
   * @return mrZFormat
   */
  @javax.annotation.Nonnull
  public Integer getMrZFormat() {
    return mrZFormat;
  }

  public void setMrZFormat(@javax.annotation.Nonnull Integer mrZFormat) {
    this.mrZFormat = mrZFormat;
  }

  public ResultMRZDetector mrZRows(@javax.annotation.Nonnull List<MRZRowsItem> mrZRows) {
    this.mrZRows = mrZRows;
    return this;
  }

  public ResultMRZDetector addMrZRowsItem(MRZRowsItem mrZRowsItem) {
    if (this.mrZRows == null) {
      this.mrZRows = new ArrayList<>();
    }
    this.mrZRows.add(mrZRowsItem);
    return this;
  }

  /**
   * Get mrZRows
   *
   * @return mrZRows
   */
  @javax.annotation.Nonnull
  public List<MRZRowsItem> getMrZRows() {
    return mrZRows;
  }

  public void setMrZRows(@javax.annotation.Nonnull List<MRZRowsItem> mrZRows) {
    this.mrZRows = mrZRows;
  }

  public ResultMRZDetector mrZRowsNum(@javax.annotation.Nonnull Integer mrZRowsNum) {
    this.mrZRowsNum = mrZRowsNum;
    return this;
  }

  /**
   * Get mrZRowsNum
   *
   * @return mrZRowsNum
   */
  @javax.annotation.Nonnull
  public Integer getMrZRowsNum() {
    return mrZRowsNum;
  }

  public void setMrZRowsNum(@javax.annotation.Nonnull Integer mrZRowsNum) {
    this.mrZRowsNum = mrZRowsNum;
  }

  public ResultMRZDetector boundingQuadrangle(
      @javax.annotation.Nonnull List<Integer> boundingQuadrangle) {
    this.boundingQuadrangle = boundingQuadrangle;
    return this;
  }

  public ResultMRZDetector addBoundingQuadrangleItem(Integer boundingQuadrangleItem) {
    if (this.boundingQuadrangle == null) {
      this.boundingQuadrangle = new ArrayList<>();
    }
    this.boundingQuadrangle.add(boundingQuadrangleItem);
    return this;
  }

  /**
   * Get boundingQuadrangle
   *
   * @return boundingQuadrangle
   */
  @javax.annotation.Nonnull
  public List<Integer> getBoundingQuadrangle() {
    return boundingQuadrangle;
  }

  public void setBoundingQuadrangle(@javax.annotation.Nonnull List<Integer> boundingQuadrangle) {
    this.boundingQuadrangle = boundingQuadrangle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultMRZDetector resultMRZDetector = (ResultMRZDetector) o;
    return Objects.equals(this.mrZFormat, resultMRZDetector.mrZFormat)
        && Objects.equals(this.mrZRows, resultMRZDetector.mrZRows)
        && Objects.equals(this.mrZRowsNum, resultMRZDetector.mrZRowsNum)
        && Objects.equals(this.boundingQuadrangle, resultMRZDetector.boundingQuadrangle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mrZFormat, mrZRows, mrZRowsNum, boundingQuadrangle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultMRZDetector {\n");
    sb.append("    mrZFormat: ").append(toIndentedString(mrZFormat)).append("\n");
    sb.append("    mrZRows: ").append(toIndentedString(mrZRows)).append("\n");
    sb.append("    mrZRowsNum: ").append(toIndentedString(mrZRowsNum)).append("\n");
    sb.append("    boundingQuadrangle: ").append(toIndentedString(boundingQuadrangle)).append("\n");
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
    openapiFields.add("MRZFormat");
    openapiFields.add("MRZRows");
    openapiFields.add("MRZRowsNum");
    openapiFields.add("boundingQuadrangle");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MRZFormat");
    openapiRequiredFields.add("MRZRows");
    openapiRequiredFields.add("MRZRowsNum");
    openapiRequiredFields.add("boundingQuadrangle");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResultMRZDetector
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!ResultMRZDetector.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in ResultMRZDetector is not found in the empty JSON string",
                ResultMRZDetector.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!ResultMRZDetector.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `ResultMRZDetector` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : ResultMRZDetector.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // ensure the json data is an array
    if (!jsonObj.get("MRZRows").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `MRZRows` to be an array in the JSON string but got `%s`",
              jsonObj.get("MRZRows").toString()));
    }

    JsonArray jsonArraymrZRows = jsonObj.getAsJsonArray("MRZRows");
    // validate the required field `MRZRows` (array)
    for (int i = 0; i < jsonArraymrZRows.size(); i++) {
      MRZRowsItem.validateJsonElement(jsonArraymrZRows.get(i));
    }
    ;
    // ensure the required json array is present
    if (jsonObj.get("boundingQuadrangle") == null) {
      throw new IllegalArgumentException(
          "Expected the field `linkedContent` to be an array in the JSON string but got `null`");
    } else if (!jsonObj.get("boundingQuadrangle").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `boundingQuadrangle` to be an array in the JSON string but got `%s`",
              jsonObj.get("boundingQuadrangle").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!ResultMRZDetector.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'ResultMRZDetector' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<ResultMRZDetector> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(ResultMRZDetector.class));

      return (TypeAdapter<T>)
          new TypeAdapter<ResultMRZDetector>() {
            @Override
            public void write(JsonWriter out, ResultMRZDetector value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public ResultMRZDetector read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of ResultMRZDetector given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResultMRZDetector
   * @throws IOException if the JSON string is invalid with respect to ResultMRZDetector
   */
  public static ResultMRZDetector fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResultMRZDetector.class);
  }

  /**
   * Convert an instance of ResultMRZDetector to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
