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

/** PointsContainer */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0")
public class PointsContainer {
  public static final String SERIALIZED_NAME_POINT_COUNT = "PointCount";

  @SerializedName(SERIALIZED_NAME_POINT_COUNT)
  @javax.annotation.Nullable
  private Integer pointCount;

  public static final String SERIALIZED_NAME_POINTS_LIST = "PointsList";

  @SerializedName(SERIALIZED_NAME_POINTS_LIST)
  @javax.annotation.Nonnull
  private List<Point> pointsList = new ArrayList<>();

  public PointsContainer() {}

  public PointsContainer pointCount(@javax.annotation.Nullable Integer pointCount) {
    this.pointCount = pointCount;
    return this;
  }

  /**
   * Get pointCount
   *
   * @return pointCount
   */
  @javax.annotation.Nullable
  public Integer getPointCount() {
    return pointCount;
  }

  public void setPointCount(@javax.annotation.Nullable Integer pointCount) {
    this.pointCount = pointCount;
  }

  public PointsContainer pointsList(@javax.annotation.Nonnull List<Point> pointsList) {
    this.pointsList = pointsList;
    return this;
  }

  public PointsContainer addPointsListItem(Point pointsListItem) {
    if (this.pointsList == null) {
      this.pointsList = new ArrayList<>();
    }
    this.pointsList.add(pointsListItem);
    return this;
  }

  /**
   * Get pointsList
   *
   * @return pointsList
   */
  @javax.annotation.Nonnull
  public List<Point> getPointsList() {
    return pointsList;
  }

  public void setPointsList(@javax.annotation.Nonnull List<Point> pointsList) {
    this.pointsList = pointsList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointsContainer pointsContainer = (PointsContainer) o;
    return Objects.equals(this.pointCount, pointsContainer.pointCount)
        && Objects.equals(this.pointsList, pointsContainer.pointsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointCount, pointsList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointsContainer {\n");
    sb.append("    pointCount: ").append(toIndentedString(pointCount)).append("\n");
    sb.append("    pointsList: ").append(toIndentedString(pointsList)).append("\n");
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
    openapiFields.add("PointCount");
    openapiFields.add("PointsList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("PointsList");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PointsContainer
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!PointsContainer.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in PointsContainer is not found in the empty JSON string",
                PointsContainer.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!PointsContainer.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `PointsContainer` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : PointsContainer.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // ensure the json data is an array
    if (!jsonObj.get("PointsList").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `PointsList` to be an array in the JSON string but got `%s`",
              jsonObj.get("PointsList").toString()));
    }

    JsonArray jsonArraypointsList = jsonObj.getAsJsonArray("PointsList");
    // validate the required field `PointsList` (array)
    for (int i = 0; i < jsonArraypointsList.size(); i++) {
      Point.validateJsonElement(jsonArraypointsList.get(i));
    }
    ;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!PointsContainer.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'PointsContainer' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<PointsContainer> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(PointsContainer.class));

      return (TypeAdapter<T>)
          new TypeAdapter<PointsContainer>() {
            @Override
            public void write(JsonWriter out, PointsContainer value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public PointsContainer read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of PointsContainer given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PointsContainer
   * @throws IOException if the JSON string is invalid with respect to PointsContainer
   */
  public static PointsContainer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PointsContainer.class);
  }

  /**
   * Convert an instance of PointsContainer to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
