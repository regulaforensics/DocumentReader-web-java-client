package com.regula.documentreader.webclient.model.changed;

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
import com.regula.documentreader.webclient.model.GraphicField;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** GraphicFieldsList */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class GraphicFieldsList {
  public static final String SERIALIZED_NAME_P_ARRAY_FIELDS = "pArrayFields";

  @SerializedName(SERIALIZED_NAME_P_ARRAY_FIELDS)
  @javax.annotation.Nonnull
  private List<GraphicField> pArrayFields;

  public static final String SERIALIZED_NAME_N_FIELDS = "nFields";

  @SerializedName(SERIALIZED_NAME_N_FIELDS)
  @javax.annotation.Nonnull
  private BigDecimal nFields;

  public GraphicFieldsList() {}

  public GraphicFieldsList pArrayFields(@javax.annotation.Nonnull List<GraphicField> pArrayFields) {
    this.pArrayFields = pArrayFields;
    return this;
  }

  public GraphicFieldsList addPArrayFieldsItem(GraphicField pArrayFieldsItem) {
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
  public List<GraphicField> getpArrayFields() {
    return pArrayFields;
  }

  public void setpArrayFields(@javax.annotation.Nonnull List<GraphicField> pArrayFields) {
    this.pArrayFields = pArrayFields;
  }

  public GraphicFieldsList nFields(@javax.annotation.Nonnull BigDecimal nFields) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphicFieldsList graphicFieldsList = (GraphicFieldsList) o;
    return Objects.equals(this.pArrayFields, graphicFieldsList.pArrayFields)
        && Objects.equals(this.nFields, graphicFieldsList.nFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pArrayFields, nFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphicFieldsList {\n");
    sb.append("    pArrayFields: ").append(toIndentedString(pArrayFields)).append("\n");
    sb.append("    nFields: ").append(toIndentedString(nFields)).append("\n");
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
    openapiFields.add("pArrayFields");
    openapiFields.add("nFields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pArrayFields");
    openapiRequiredFields.add("nFields");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GraphicFieldsList
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!GraphicFieldsList.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in GraphicFieldsList is not found in the empty JSON string",
                GraphicFieldsList.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!GraphicFieldsList.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `GraphicFieldsList` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : GraphicFieldsList.openapiRequiredFields) {
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
      GraphicField.validateJsonElement(jsonArraypArrayFields.get(i));
    }
    ;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!GraphicFieldsList.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GraphicFieldsList' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GraphicFieldsList> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(GraphicFieldsList.class));

      return (TypeAdapter<T>)
          new TypeAdapter<GraphicFieldsList>() {
            @Override
            public void write(JsonWriter out, GraphicFieldsList value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public GraphicFieldsList read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of GraphicFieldsList given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GraphicFieldsList
   * @throws IOException if the JSON string is invalid with respect to GraphicFieldsList
   */
  public static GraphicFieldsList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GraphicFieldsList.class);
  }

  /**
   * Convert an instance of GraphicFieldsList to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
