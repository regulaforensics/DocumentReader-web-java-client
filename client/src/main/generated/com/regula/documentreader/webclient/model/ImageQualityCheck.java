/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 7.1.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** ImageQualityCheck */
public class ImageQualityCheck {
  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private Integer type;

  public static final String SERIALIZED_NAME_RESULT = "result";

  @SerializedName(SERIALIZED_NAME_RESULT)
  private Integer result;

  public static final String SERIALIZED_NAME_FEATURE_TYPE = "featureType";

  @SerializedName(SERIALIZED_NAME_FEATURE_TYPE)
  private Integer featureType;

  public static final String SERIALIZED_NAME_AREAS = "areas";

  @SerializedName(SERIALIZED_NAME_AREAS)
  private AreaArray areas;

  public static final String SERIALIZED_NAME_MEAN = "mean";

  @SerializedName(SERIALIZED_NAME_MEAN)
  private Float mean;

  public static final String SERIALIZED_NAME_STD_DEV = "std_dev";

  @SerializedName(SERIALIZED_NAME_STD_DEV)
  private Float stdDev;

  public static final String SERIALIZED_NAME_PROBABILITY = "probability";

  @SerializedName(SERIALIZED_NAME_PROBABILITY)
  private Integer probability;

  public ImageQualityCheck withType(Integer type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @javax.annotation.Nullable
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public ImageQualityCheck withResult(Integer result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   *
   * @return result
   */
  @javax.annotation.Nullable
  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public ImageQualityCheck withFeatureType(Integer featureType) {
    this.featureType = featureType;
    return this;
  }

  /**
   * Get featureType
   *
   * @return featureType
   */
  @javax.annotation.Nullable
  public Integer getFeatureType() {
    return featureType;
  }

  public void setFeatureType(Integer featureType) {
    this.featureType = featureType;
  }

  public ImageQualityCheck withAreas(AreaArray areas) {
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

  public void setAreas(AreaArray areas) {
    this.areas = areas;
  }

  public ImageQualityCheck withMean(Float mean) {
    this.mean = mean;
    return this;
  }

  /**
   * Get mean
   *
   * @return mean
   */
  @javax.annotation.Nullable
  public Float getMean() {
    return mean;
  }

  public void setMean(Float mean) {
    this.mean = mean;
  }

  public ImageQualityCheck withStdDev(Float stdDev) {
    this.stdDev = stdDev;
    return this;
  }

  /**
   * Get stdDev
   *
   * @return stdDev
   */
  @javax.annotation.Nullable
  public Float getStdDev() {
    return stdDev;
  }

  public void setStdDev(Float stdDev) {
    this.stdDev = stdDev;
  }

  public ImageQualityCheck withProbability(Integer probability) {
    this.probability = probability;
    return this;
  }

  /**
   * Get probability
   *
   * @return probability
   */
  @javax.annotation.Nullable
  public Integer getProbability() {
    return probability;
  }

  public void setProbability(Integer probability) {
    this.probability = probability;
  }

  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
