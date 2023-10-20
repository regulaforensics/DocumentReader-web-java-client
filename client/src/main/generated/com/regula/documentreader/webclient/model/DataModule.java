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

/** DataModule */
public class DataModule {
  public static final String SERIALIZED_NAME_M_DATA = "mData";

  @SerializedName(SERIALIZED_NAME_M_DATA)
  private String mData;

  public static final String SERIALIZED_NAME_M_LENGTH = "mLength";

  @SerializedName(SERIALIZED_NAME_M_LENGTH)
  private Integer mLength;

  public static final String SERIALIZED_NAME_M_RESERVED1 = "mReserved1";

  @SerializedName(SERIALIZED_NAME_M_RESERVED1)
  private Integer mReserved1;

  public static final String SERIALIZED_NAME_M_RESERVER2 = "mReserver2";

  @SerializedName(SERIALIZED_NAME_M_RESERVER2)
  private Integer mReserver2;

  public static final String SERIALIZED_NAME_M_TYPE = "mType";

  @SerializedName(SERIALIZED_NAME_M_TYPE)
  private Integer mType;

  public DataModule withMData(String mData) {
    this.mData = mData;
    return this;
  }

  /**
   * Get mData
   *
   * @return mData
   */
  @javax.annotation.Nullable
  public String getmData() {
    return mData;
  }

  public void setmData(String mData) {
    this.mData = mData;
  }

  public DataModule withMLength(Integer mLength) {
    this.mLength = mLength;
    return this;
  }

  /**
   * Get mLength
   *
   * @return mLength
   */
  @javax.annotation.Nullable
  public Integer getmLength() {
    return mLength;
  }

  public void setmLength(Integer mLength) {
    this.mLength = mLength;
  }

  public DataModule withMReserved1(Integer mReserved1) {
    this.mReserved1 = mReserved1;
    return this;
  }

  /**
   * Get mReserved1
   *
   * @return mReserved1
   */
  @javax.annotation.Nullable
  public Integer getmReserved1() {
    return mReserved1;
  }

  public void setmReserved1(Integer mReserved1) {
    this.mReserved1 = mReserved1;
  }

  public DataModule withMReserver2(Integer mReserver2) {
    this.mReserver2 = mReserver2;
    return this;
  }

  /**
   * Get mReserver2
   *
   * @return mReserver2
   */
  @javax.annotation.Nullable
  public Integer getmReserver2() {
    return mReserver2;
  }

  public void setmReserver2(Integer mReserver2) {
    this.mReserver2 = mReserver2;
  }

  public DataModule withMType(Integer mType) {
    this.mType = mType;
    return this;
  }

  /**
   * Get mType
   *
   * @return mType
   */
  @javax.annotation.Nullable
  public Integer getmType() {
    return mType;
  }

  public void setmType(Integer mType) {
    this.mType = mType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModule dataModule = (DataModule) o;
    return Objects.equals(this.mData, dataModule.mData)
        && Objects.equals(this.mLength, dataModule.mLength)
        && Objects.equals(this.mReserved1, dataModule.mReserved1)
        && Objects.equals(this.mReserver2, dataModule.mReserver2)
        && Objects.equals(this.mType, dataModule.mType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mData, mLength, mReserved1, mReserver2, mType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModule {\n");
    sb.append("    mData: ").append(toIndentedString(mData)).append("\n");
    sb.append("    mLength: ").append(toIndentedString(mLength)).append("\n");
    sb.append("    mReserved1: ").append(toIndentedString(mReserved1)).append("\n");
    sb.append("    mReserver2: ").append(toIndentedString(mReserver2)).append("\n");
    sb.append("    mType: ").append(toIndentedString(mType)).append("\n");
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
