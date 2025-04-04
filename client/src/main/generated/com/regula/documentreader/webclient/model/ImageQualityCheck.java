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

/** ImageQualityCheck */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class ImageQualityCheck {
  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private ImageQualityCheckType type;

  public static final String SERIALIZED_NAME_RESULT = "result";

  @SerializedName(SERIALIZED_NAME_RESULT)
  @javax.annotation.Nonnull
  private CheckResult result;

  public static final String SERIALIZED_NAME_FEATURE_TYPE = "featureType";

  @SerializedName(SERIALIZED_NAME_FEATURE_TYPE)
  @javax.annotation.Nonnull
  private SecurityFeatureType featureType;

  public static final String SERIALIZED_NAME_AREAS = "areas";

  @SerializedName(SERIALIZED_NAME_AREAS)
  @javax.annotation.Nullable
  private AreaArray areas;

  public static final String SERIALIZED_NAME_MEAN = "mean";

  @SerializedName(SERIALIZED_NAME_MEAN)
  @javax.annotation.Nonnull
  private Float mean;

  public static final String SERIALIZED_NAME_STD_DEV = "std_dev";

  @SerializedName(SERIALIZED_NAME_STD_DEV)
  @javax.annotation.Nonnull
  private Float stdDev;

  public static final String SERIALIZED_NAME_PROBABILITY = "probability";

  @SerializedName(SERIALIZED_NAME_PROBABILITY)
  @javax.annotation.Nonnull
  private Integer probability;

  public ImageQualityCheck() {}

  public ImageQualityCheck type(@javax.annotation.Nonnull ImageQualityCheckType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @javax.annotation.Nonnull
  public ImageQualityCheckType getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull ImageQualityCheckType type) {
    this.type = type;
  }

  public ImageQualityCheck result(@javax.annotation.Nonnull CheckResult result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   *
   * @return result
   */
  @javax.annotation.Nonnull
  public CheckResult getResult() {
    return result;
  }

  public void setResult(@javax.annotation.Nonnull CheckResult result) {
    this.result = result;
  }

  public ImageQualityCheck featureType(@javax.annotation.Nonnull SecurityFeatureType featureType) {
    this.featureType = featureType;
    return this;
  }

  /**
   * Get featureType
   *
   * @return featureType
   */
  @javax.annotation.Nonnull
  public SecurityFeatureType getFeatureType() {
    return featureType;
  }

  public void setFeatureType(@javax.annotation.Nonnull SecurityFeatureType featureType) {
    this.featureType = featureType;
  }

  public ImageQualityCheck areas(@javax.annotation.Nullable AreaArray areas) {
    this.areas = areas;
    return this;
  }

  /**
   * Get areas
   *
   * @return areas
   */
  @javax.annotation.Nullable
  public AreaArray getAreas() {
    return areas;
  }

  public void setAreas(@javax.annotation.Nullable AreaArray areas) {
    this.areas = areas;
  }

  public ImageQualityCheck mean(@javax.annotation.Nonnull Float mean) {
    this.mean = mean;
    return this;
  }

  /**
   * Check mean value
   *
   * @return mean
   */
  @javax.annotation.Nonnull
  public Float getMean() {
    return mean;
  }

  public void setMean(@javax.annotation.Nonnull Float mean) {
    this.mean = mean;
  }

  public ImageQualityCheck stdDev(@javax.annotation.Nonnull Float stdDev) {
    this.stdDev = stdDev;
    return this;
  }

  /**
   * Check deviation value
   *
   * @return stdDev
   */
  @javax.annotation.Nonnull
  public Float getStdDev() {
    return stdDev;
  }

  public void setStdDev(@javax.annotation.Nonnull Float stdDev) {
    this.stdDev = stdDev;
  }

  public ImageQualityCheck probability(@javax.annotation.Nonnull Integer probability) {
    this.probability = probability;
    return this;
  }

  /**
   * Check probability value
   *
   * @return probability
   */
  @javax.annotation.Nonnull
  public Integer getProbability() {
    return probability;
  }

  public void setProbability(@javax.annotation.Nonnull Integer probability) {
    this.probability = probability;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageQualityCheck imageQualityCheck = (ImageQualityCheck) o;
    return Objects.equals(this.type, imageQualityCheck.type)
        && Objects.equals(this.result, imageQualityCheck.result)
        && Objects.equals(this.featureType, imageQualityCheck.featureType)
        && Objects.equals(this.areas, imageQualityCheck.areas)
        && Objects.equals(this.mean, imageQualityCheck.mean)
        && Objects.equals(this.stdDev, imageQualityCheck.stdDev)
        && Objects.equals(this.probability, imageQualityCheck.probability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, result, featureType, areas, mean, stdDev, probability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageQualityCheck {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    featureType: ").append(toIndentedString(featureType)).append("\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    stdDev: ").append(toIndentedString(stdDev)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("result");
    openapiFields.add("featureType");
    openapiFields.add("areas");
    openapiFields.add("mean");
    openapiFields.add("std_dev");
    openapiFields.add("probability");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("result");
    openapiRequiredFields.add("featureType");
    openapiRequiredFields.add("mean");
    openapiRequiredFields.add("std_dev");
    openapiRequiredFields.add("probability");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ImageQualityCheck
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!ImageQualityCheck.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in ImageQualityCheck is not found in the empty JSON string",
                ImageQualityCheck.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!ImageQualityCheck.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `ImageQualityCheck` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : ImageQualityCheck.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the required field `type`
    ImageQualityCheckType.validateJsonElement(jsonObj.get("type"));
    // validate the required field `result`
    CheckResult.validateJsonElement(jsonObj.get("result"));
    // validate the required field `featureType`
    SecurityFeatureType.validateJsonElement(jsonObj.get("featureType"));
    // validate the optional field `areas`
    if (jsonObj.get("areas") != null && !jsonObj.get("areas").isJsonNull()) {
      AreaArray.validateJsonElement(jsonObj.get("areas"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!ImageQualityCheck.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'ImageQualityCheck' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<ImageQualityCheck> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(ImageQualityCheck.class));

      return (TypeAdapter<T>)
          new TypeAdapter<ImageQualityCheck>() {
            @Override
            public void write(JsonWriter out, ImageQualityCheck value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public ImageQualityCheck read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of ImageQualityCheck given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ImageQualityCheck
   * @throws IOException if the JSON string is invalid with respect to ImageQualityCheck
   */
  public static ImageQualityCheck fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImageQualityCheck.class);
  }

  /**
   * Convert an instance of ImageQualityCheck to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
