/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 5.7.0
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

/** FiberResult */
public class FiberResult extends AuthenticityCheckResultItem {
  public static final String SERIALIZED_NAME_RECT_COUNT = "RectCount";

  @SerializedName(SERIALIZED_NAME_RECT_COUNT)
  private Integer rectCount;

  public static final String SERIALIZED_NAME_EXPECTED_COUNT = "ExpectedCount";

  @SerializedName(SERIALIZED_NAME_EXPECTED_COUNT)
  private Integer expectedCount;

  public static final String SERIALIZED_NAME_LIGHT_VALUE = "LightValue";

  @SerializedName(SERIALIZED_NAME_LIGHT_VALUE)
  private Integer lightValue;

  public static final String SERIALIZED_NAME_LIGHT_DISP = "LightDisp";

  @SerializedName(SERIALIZED_NAME_LIGHT_DISP)
  private Integer lightDisp;

  public static final String SERIALIZED_NAME_RECT_ARRAY = "RectArray";

  @SerializedName(SERIALIZED_NAME_RECT_ARRAY)
  private List<RectangleCoordinates> rectArray = null;

  public static final String SERIALIZED_NAME_WIDTH = "Width";

  @SerializedName(SERIALIZED_NAME_WIDTH)
  private List<Integer> width = null;

  public static final String SERIALIZED_NAME_LENGTH = "Length";

  @SerializedName(SERIALIZED_NAME_LENGTH)
  private List<Integer> length = null;

  public static final String SERIALIZED_NAME_AREA = "Area";

  @SerializedName(SERIALIZED_NAME_AREA)
  private List<Integer> area = null;

  public static final String SERIALIZED_NAME_COLOR_VALUES = "ColorValues";

  @SerializedName(SERIALIZED_NAME_COLOR_VALUES)
  private List<Integer> colorValues = null;

  public FiberResult withRectCount(Integer rectCount) {
    this.rectCount = rectCount;
    return this;
  }

  /**
   * For UV_Fibers authenticity result type
   *
   * @return rectCount
   */
  @javax.annotation.Nullable
  public Integer getRectCount() {
    return rectCount;
  }

  public void setRectCount(Integer rectCount) {
    this.rectCount = rectCount;
  }

  public FiberResult withExpectedCount(Integer expectedCount) {
    this.expectedCount = expectedCount;
    return this;
  }

  /**
   * Expected fibers number. For UV_Fibers authentication result type
   *
   * @return expectedCount
   */
  @javax.annotation.Nullable
  public Integer getExpectedCount() {
    return expectedCount;
  }

  public void setExpectedCount(Integer expectedCount) {
    this.expectedCount = expectedCount;
  }

  public FiberResult withLightValue(Integer lightValue) {
    this.lightValue = lightValue;
    return this;
  }

  /**
   * Get lightValue
   *
   * @return lightValue
   */
  @javax.annotation.Nullable
  public Integer getLightValue() {
    return lightValue;
  }

  public void setLightValue(Integer lightValue) {
    this.lightValue = lightValue;
  }

  public FiberResult withLightDisp(Integer lightDisp) {
    this.lightDisp = lightDisp;
    return this;
  }

  /**
   * For UV_Background authentication result type
   *
   * @return lightDisp
   */
  @javax.annotation.Nullable
  public Integer getLightDisp() {
    return lightDisp;
  }

  public void setLightDisp(Integer lightDisp) {
    this.lightDisp = lightDisp;
  }

  public FiberResult withRectArray(List<RectangleCoordinates> rectArray) {
    this.rectArray = rectArray;
    return this;
  }

  public FiberResult addRectArrayItem(RectangleCoordinates rectArrayItem) {
    if (this.rectArray == null) {
      this.rectArray = new ArrayList<RectangleCoordinates>();
    }
    this.rectArray.add(rectArrayItem);
    return this;
  }

  /**
   * Coordinates of located areas for defined fibers type
   *
   * @return rectArray
   */
  @javax.annotation.Nullable
  public List<RectangleCoordinates> getRectArray() {
    return rectArray;
  }

  public void setRectArray(List<RectangleCoordinates> rectArray) {
    this.rectArray = rectArray;
  }

  public FiberResult withWidth(List<Integer> width) {
    this.width = width;
    return this;
  }

  public FiberResult addWidthItem(Integer widthItem) {
    if (this.width == null) {
      this.width = new ArrayList<Integer>();
    }
    this.width.add(widthItem);
    return this;
  }

  /**
   * Fibers width value for located areas (in pixels)
   *
   * @return width
   */
  @javax.annotation.Nullable
  public List<Integer> getWidth() {
    return width;
  }

  public void setWidth(List<Integer> width) {
    this.width = width;
  }

  public FiberResult withLength(List<Integer> length) {
    this.length = length;
    return this;
  }

  public FiberResult addLengthItem(Integer lengthItem) {
    if (this.length == null) {
      this.length = new ArrayList<Integer>();
    }
    this.length.add(lengthItem);
    return this;
  }

  /**
   * Fibers length value for located areas (in pixels)
   *
   * @return length
   */
  @javax.annotation.Nullable
  public List<Integer> getLength() {
    return length;
  }

  public void setLength(List<Integer> length) {
    this.length = length;
  }

  public FiberResult withArea(List<Integer> area) {
    this.area = area;
    return this;
  }

  public FiberResult addAreaItem(Integer areaItem) {
    if (this.area == null) {
      this.area = new ArrayList<Integer>();
    }
    this.area.add(areaItem);
    return this;
  }

  /**
   * Fibers value for areas (in pixels)
   *
   * @return area
   */
  @javax.annotation.Nullable
  public List<Integer> getArea() {
    return area;
  }

  public void setArea(List<Integer> area) {
    this.area = area;
  }

  public FiberResult withColorValues(List<Integer> colorValues) {
    this.colorValues = colorValues;
    return this;
  }

  public FiberResult addColorValuesItem(Integer colorValuesItem) {
    if (this.colorValues == null) {
      this.colorValues = new ArrayList<Integer>();
    }
    this.colorValues.add(colorValuesItem);
    return this;
  }

  /**
   * Fibers color value
   *
   * @return colorValues
   */
  @javax.annotation.Nullable
  public List<Integer> getColorValues() {
    return colorValues;
  }

  public void setColorValues(List<Integer> colorValues) {
    this.colorValues = colorValues;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiberResult fiberResult = (FiberResult) o;
    return Objects.equals(this.rectCount, fiberResult.rectCount)
        && Objects.equals(this.expectedCount, fiberResult.expectedCount)
        && Objects.equals(this.lightValue, fiberResult.lightValue)
        && Objects.equals(this.lightDisp, fiberResult.lightDisp)
        && Objects.equals(this.rectArray, fiberResult.rectArray)
        && Objects.equals(this.width, fiberResult.width)
        && Objects.equals(this.length, fiberResult.length)
        && Objects.equals(this.area, fiberResult.area)
        && Objects.equals(this.colorValues, fiberResult.colorValues)
        && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        rectCount,
        expectedCount,
        lightValue,
        lightDisp,
        rectArray,
        width,
        length,
        area,
        colorValues,
        super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiberResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    rectCount: ").append(toIndentedString(rectCount)).append("\n");
    sb.append("    expectedCount: ").append(toIndentedString(expectedCount)).append("\n");
    sb.append("    lightValue: ").append(toIndentedString(lightValue)).append("\n");
    sb.append("    lightDisp: ").append(toIndentedString(lightDisp)).append("\n");
    sb.append("    rectArray: ").append(toIndentedString(rectArray)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    colorValues: ").append(toIndentedString(colorValues)).append("\n");
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
