/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 6.5.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.Objects;

/** DocumentPosition */
public class DocumentPosition {
  public static final String SERIALIZED_NAME_DOC_FORMAT = "docFormat";

  @SerializedName(SERIALIZED_NAME_DOC_FORMAT)
  private Integer docFormat;

  public static final String SERIALIZED_NAME_ANGLE = "Angle";

  @SerializedName(SERIALIZED_NAME_ANGLE)
  private BigDecimal angle;

  public static final String SERIALIZED_NAME_WIDTH = "Width";

  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width;

  public static final String SERIALIZED_NAME_HEIGHT = "Height";

  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_CENTER = "Center";

  @SerializedName(SERIALIZED_NAME_CENTER)
  private Point center;

  public static final String SERIALIZED_NAME_LEFT_BOTTOM = "LeftBottom";

  @SerializedName(SERIALIZED_NAME_LEFT_BOTTOM)
  private Point leftBottom;

  public static final String SERIALIZED_NAME_LEFT_TOP = "LeftTop";

  @SerializedName(SERIALIZED_NAME_LEFT_TOP)
  private Point leftTop;

  public static final String SERIALIZED_NAME_RIGHT_BOTTOM = "RightBottom";

  @SerializedName(SERIALIZED_NAME_RIGHT_BOTTOM)
  private Point rightBottom;

  public static final String SERIALIZED_NAME_RIGHT_TOP = "RightTop";

  @SerializedName(SERIALIZED_NAME_RIGHT_TOP)
  private Point rightTop;

  public static final String SERIALIZED_NAME_DPI = "Dpi";

  @SerializedName(SERIALIZED_NAME_DPI)
  private Integer dpi;

  public DocumentPosition withDocFormat(Integer docFormat) {
    this.docFormat = docFormat;
    return this;
  }

  /**
   * Get docFormat
   *
   * @return docFormat
   */
  @javax.annotation.Nullable
  public Integer getDocFormat() {
    return docFormat;
  }

  public void setDocFormat(Integer docFormat) {
    this.docFormat = docFormat;
  }

  public DocumentPosition withAngle(BigDecimal angle) {
    this.angle = angle;
    return this;
  }

  /**
   * Get angle
   *
   * @return angle
   */
  @javax.annotation.Nullable
  public BigDecimal getAngle() {
    return angle;
  }

  public void setAngle(BigDecimal angle) {
    this.angle = angle;
  }

  public DocumentPosition withWidth(Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   *
   * @return width
   */
  @javax.annotation.Nullable
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public DocumentPosition withHeight(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   *
   * @return height
   */
  @javax.annotation.Nullable
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public DocumentPosition withCenter(Point center) {
    this.center = center;
    return this;
  }

  /**
   * Get center
   *
   * @return center
   */
  @javax.annotation.Nullable
  public Point getCenter() {
    return center;
  }

  public void setCenter(Point center) {
    this.center = center;
  }

  public DocumentPosition withLeftBottom(Point leftBottom) {
    this.leftBottom = leftBottom;
    return this;
  }

  /**
   * Get leftBottom
   *
   * @return leftBottom
   */
  @javax.annotation.Nullable
  public Point getLeftBottom() {
    return leftBottom;
  }

  public void setLeftBottom(Point leftBottom) {
    this.leftBottom = leftBottom;
  }

  public DocumentPosition withLeftTop(Point leftTop) {
    this.leftTop = leftTop;
    return this;
  }

  /**
   * Get leftTop
   *
   * @return leftTop
   */
  @javax.annotation.Nullable
  public Point getLeftTop() {
    return leftTop;
  }

  public void setLeftTop(Point leftTop) {
    this.leftTop = leftTop;
  }

  public DocumentPosition withRightBottom(Point rightBottom) {
    this.rightBottom = rightBottom;
    return this;
  }

  /**
   * Get rightBottom
   *
   * @return rightBottom
   */
  @javax.annotation.Nullable
  public Point getRightBottom() {
    return rightBottom;
  }

  public void setRightBottom(Point rightBottom) {
    this.rightBottom = rightBottom;
  }

  public DocumentPosition withRightTop(Point rightTop) {
    this.rightTop = rightTop;
    return this;
  }

  /**
   * Get rightTop
   *
   * @return rightTop
   */
  @javax.annotation.Nullable
  public Point getRightTop() {
    return rightTop;
  }

  public void setRightTop(Point rightTop) {
    this.rightTop = rightTop;
  }

  public DocumentPosition withDpi(Integer dpi) {
    this.dpi = dpi;
    return this;
  }

  /**
   * Get dpi
   *
   * @return dpi
   */
  @javax.annotation.Nullable
  public Integer getDpi() {
    return dpi;
  }

  public void setDpi(Integer dpi) {
    this.dpi = dpi;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentPosition documentPosition = (DocumentPosition) o;
    return Objects.equals(this.docFormat, documentPosition.docFormat)
        && Objects.equals(this.angle, documentPosition.angle)
        && Objects.equals(this.width, documentPosition.width)
        && Objects.equals(this.height, documentPosition.height)
        && Objects.equals(this.center, documentPosition.center)
        && Objects.equals(this.leftBottom, documentPosition.leftBottom)
        && Objects.equals(this.leftTop, documentPosition.leftTop)
        && Objects.equals(this.rightBottom, documentPosition.rightBottom)
        && Objects.equals(this.rightTop, documentPosition.rightTop)
        && Objects.equals(this.dpi, documentPosition.dpi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        docFormat, angle, width, height, center, leftBottom, leftTop, rightBottom, rightTop, dpi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentPosition {\n");
    sb.append("    docFormat: ").append(toIndentedString(docFormat)).append("\n");
    sb.append("    angle: ").append(toIndentedString(angle)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    center: ").append(toIndentedString(center)).append("\n");
    sb.append("    leftBottom: ").append(toIndentedString(leftBottom)).append("\n");
    sb.append("    leftTop: ").append(toIndentedString(leftTop)).append("\n");
    sb.append("    rightBottom: ").append(toIndentedString(rightBottom)).append("\n");
    sb.append("    rightTop: ").append(toIndentedString(rightTop)).append("\n");
    sb.append("    dpi: ").append(toIndentedString(dpi)).append("\n");
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
