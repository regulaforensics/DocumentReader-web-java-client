/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 5.4.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** ImageQA */
public class ImageQA {
  public static final String SERIALIZED_NAME_DPI_THRESHOLD = "dpiThreshold";

  @SerializedName(SERIALIZED_NAME_DPI_THRESHOLD)
  private Integer dpiThreshold = 150;

  public static final String SERIALIZED_NAME_ANGLE_THRESHOLD = "angleThreshold";

  @SerializedName(SERIALIZED_NAME_ANGLE_THRESHOLD)
  private Integer angleThreshold = 5;

  public ImageQA withDpiThreshold(Integer dpiThreshold) {
    this.dpiThreshold = dpiThreshold;
    return this;
  }

  /**
   * This parameter sets threshold for Image QA check of the presented document physical dpi. If
   * actual document dpi is below this threshold, check will fail.
   *
   * @return dpiThreshold
   */
  @javax.annotation.Nullable
  public Integer getDpiThreshold() {
    return dpiThreshold;
  }

  public void setDpiThreshold(Integer dpiThreshold) {
    this.dpiThreshold = dpiThreshold;
  }

  public ImageQA withAngleThreshold(Integer angleThreshold) {
    this.angleThreshold = angleThreshold;
    return this;
  }

  /**
   * This parameter sets threshold for Image QA check of the presented document perspective angle in
   * degrees. If actual document perspective angle is above this threshold, check will fail.
   *
   * @return angleThreshold
   */
  @javax.annotation.Nullable
  public Integer getAngleThreshold() {
    return angleThreshold;
  }

  public void setAngleThreshold(Integer angleThreshold) {
    this.angleThreshold = angleThreshold;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageQA imageQA = (ImageQA) o;
    return Objects.equals(this.dpiThreshold, imageQA.dpiThreshold)
        && Objects.equals(this.angleThreshold, imageQA.angleThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dpiThreshold, angleThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageQA {\n");
    sb.append("    dpiThreshold: ").append(toIndentedString(dpiThreshold)).append("\n");
    sb.append("    angleThreshold: ").append(toIndentedString(angleThreshold)).append("\n");
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
