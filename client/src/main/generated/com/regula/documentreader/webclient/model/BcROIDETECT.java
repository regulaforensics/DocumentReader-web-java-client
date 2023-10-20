/*
 * Regula Document Reader Web
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 6.9.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** BcROIDETECT */
public class BcROIDETECT {
  public static final String SERIALIZED_NAME_BOTTOM = "bottom";

  @SerializedName(SERIALIZED_NAME_BOTTOM)
  private Integer bottom;

  public static final String SERIALIZED_NAME_LEFT = "left";

  @SerializedName(SERIALIZED_NAME_LEFT)
  private Integer left;

  public static final String SERIALIZED_NAME_RIGHT = "right";

  @SerializedName(SERIALIZED_NAME_RIGHT)
  private Integer right;

  public static final String SERIALIZED_NAME_TOP = "top";

  @SerializedName(SERIALIZED_NAME_TOP)
  private Integer top;

  public BcROIDETECT withBottom(Integer bottom) {
    this.bottom = bottom;
    return this;
  }

  /**
   * Get bottom
   *
   * @return bottom
   */
  @javax.annotation.Nullable
  public Integer getBottom() {
    return bottom;
  }

  public void setBottom(Integer bottom) {
    this.bottom = bottom;
  }

  public BcROIDETECT withLeft(Integer left) {
    this.left = left;
    return this;
  }

  /**
   * Get left
   *
   * @return left
   */
  @javax.annotation.Nullable
  public Integer getLeft() {
    return left;
  }

  public void setLeft(Integer left) {
    this.left = left;
  }

  public BcROIDETECT withRight(Integer right) {
    this.right = right;
    return this;
  }

  /**
   * Get right
   *
   * @return right
   */
  @javax.annotation.Nullable
  public Integer getRight() {
    return right;
  }

  public void setRight(Integer right) {
    this.right = right;
  }

  public BcROIDETECT withTop(Integer top) {
    this.top = top;
    return this;
  }

  /**
   * Get top
   *
   * @return top
   */
  @javax.annotation.Nullable
  public Integer getTop() {
    return top;
  }

  public void setTop(Integer top) {
    this.top = top;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BcROIDETECT bcROIDETECT = (BcROIDETECT) o;
    return Objects.equals(this.bottom, bcROIDETECT.bottom)
        && Objects.equals(this.left, bcROIDETECT.left)
        && Objects.equals(this.right, bcROIDETECT.right)
        && Objects.equals(this.top, bcROIDETECT.top);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bottom, left, right, top);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BcROIDETECT {\n");
    sb.append("    bottom: ").append(toIndentedString(bottom)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
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
