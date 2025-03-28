/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 7.2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ImageQA */
public class ImageQA {
  public static final String SERIALIZED_NAME_BRIGHTNESS_THRESHOLD = "brightnessThreshold";

  @SerializedName(SERIALIZED_NAME_BRIGHTNESS_THRESHOLD)
  private Double brightnessThreshold;

  public static final String SERIALIZED_NAME_DPI_THRESHOLD = "dpiThreshold";

  @SerializedName(SERIALIZED_NAME_DPI_THRESHOLD)
  private Integer dpiThreshold;

  public static final String SERIALIZED_NAME_ANGLE_THRESHOLD = "angleThreshold";

  @SerializedName(SERIALIZED_NAME_ANGLE_THRESHOLD)
  private Integer angleThreshold;

  public static final String SERIALIZED_NAME_FOCUS_CHECK = "focusCheck";

  @SerializedName(SERIALIZED_NAME_FOCUS_CHECK)
  private Boolean focusCheck;

  public static final String SERIALIZED_NAME_GLARES_CHECK = "glaresCheck";

  @SerializedName(SERIALIZED_NAME_GLARES_CHECK)
  private Boolean glaresCheck;

  public static final String SERIALIZED_NAME_COLORNESS_CHECK = "colornessCheck";

  @SerializedName(SERIALIZED_NAME_COLORNESS_CHECK)
  private Boolean colornessCheck;

  public static final String SERIALIZED_NAME_DOCUMENT_POSITION_INDENT = "documentPositionIndent";

  @SerializedName(SERIALIZED_NAME_DOCUMENT_POSITION_INDENT)
  private Integer documentPositionIndent;

  public static final String SERIALIZED_NAME_EXPECTED_PASS = "expectedPass";

  @SerializedName(SERIALIZED_NAME_EXPECTED_PASS)
  private List<InputImageQualityChecks> expectedPass = null;

  public ImageQA withBrightnessThreshold(Double brightnessThreshold) {
    this.brightnessThreshold = brightnessThreshold;
    return this;
  }

  /**
   * Set the threshold for an actual document brightness below which the check fails
   *
   * @return brightnessThreshold
   */
  @javax.annotation.Nullable
  public Double getBrightnessThreshold() {
    return brightnessThreshold;
  }

  public void setBrightnessThreshold(Double brightnessThreshold) {
    this.brightnessThreshold = brightnessThreshold;
  }

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

  public ImageQA withFocusCheck(Boolean focusCheck) {
    this.focusCheck = focusCheck;
    return this;
  }

  /**
   * This option enables focus check while performing image quality validation.
   *
   * @return focusCheck
   */
  @javax.annotation.Nullable
  public Boolean getFocusCheck() {
    return focusCheck;
  }

  public void setFocusCheck(Boolean focusCheck) {
    this.focusCheck = focusCheck;
  }

  public ImageQA withGlaresCheck(Boolean glaresCheck) {
    this.glaresCheck = glaresCheck;
    return this;
  }

  /**
   * This option enables glares check while performing image quality validation.
   *
   * @return glaresCheck
   */
  @javax.annotation.Nullable
  public Boolean getGlaresCheck() {
    return glaresCheck;
  }

  public void setGlaresCheck(Boolean glaresCheck) {
    this.glaresCheck = glaresCheck;
  }

  public ImageQA withColornessCheck(Boolean colornessCheck) {
    this.colornessCheck = colornessCheck;
    return this;
  }

  /**
   * This option enables colorness check while performing image quality validation.
   *
   * @return colornessCheck
   */
  @javax.annotation.Nullable
  public Boolean getColornessCheck() {
    return colornessCheck;
  }

  public void setColornessCheck(Boolean colornessCheck) {
    this.colornessCheck = colornessCheck;
  }

  public ImageQA withDocumentPositionIndent(Integer documentPositionIndent) {
    this.documentPositionIndent = documentPositionIndent;
    return this;
  }

  /**
   * This parameter specifies the necessary margin. Default 0.
   *
   * @return documentPositionIndent
   */
  @javax.annotation.Nullable
  public Integer getDocumentPositionIndent() {
    return documentPositionIndent;
  }

  public void setDocumentPositionIndent(Integer documentPositionIndent) {
    this.documentPositionIndent = documentPositionIndent;
  }

  public ImageQA withExpectedPass(List<InputImageQualityChecks> expectedPass) {
    this.expectedPass = expectedPass;
    return this;
  }

  public ImageQA addExpectedPassItem(InputImageQualityChecks expectedPassItem) {
    if (this.expectedPass == null) {
      this.expectedPass = new ArrayList<InputImageQualityChecks>();
    }
    this.expectedPass.add(expectedPassItem);
    return this;
  }

  /**
   * This parameter controls the quality checks that the image should pass to be considered a valid
   * input during the scanning process.
   *
   * @return expectedPass
   */
  @javax.annotation.Nullable
  public List<InputImageQualityChecks> getExpectedPass() {
    return expectedPass;
  }

  public void setExpectedPass(List<InputImageQualityChecks> expectedPass) {
    this.expectedPass = expectedPass;
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
    return Objects.equals(this.brightnessThreshold, imageQA.brightnessThreshold)
        && Objects.equals(this.dpiThreshold, imageQA.dpiThreshold)
        && Objects.equals(this.angleThreshold, imageQA.angleThreshold)
        && Objects.equals(this.focusCheck, imageQA.focusCheck)
        && Objects.equals(this.glaresCheck, imageQA.glaresCheck)
        && Objects.equals(this.colornessCheck, imageQA.colornessCheck)
        && Objects.equals(this.documentPositionIndent, imageQA.documentPositionIndent)
        && Objects.equals(this.expectedPass, imageQA.expectedPass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        brightnessThreshold,
        dpiThreshold,
        angleThreshold,
        focusCheck,
        glaresCheck,
        colornessCheck,
        documentPositionIndent,
        expectedPass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageQA {\n");
    sb.append("    brightnessThreshold: ")
        .append(toIndentedString(brightnessThreshold))
        .append("\n");
    sb.append("    dpiThreshold: ").append(toIndentedString(dpiThreshold)).append("\n");
    sb.append("    angleThreshold: ").append(toIndentedString(angleThreshold)).append("\n");
    sb.append("    focusCheck: ").append(toIndentedString(focusCheck)).append("\n");
    sb.append("    glaresCheck: ").append(toIndentedString(glaresCheck)).append("\n");
    sb.append("    colornessCheck: ").append(toIndentedString(colornessCheck)).append("\n");
    sb.append("    documentPositionIndent: ")
        .append(toIndentedString(documentPositionIndent))
        .append("\n");
    sb.append("    expectedPass: ").append(toIndentedString(expectedPass)).append("\n");
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
