/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 6.6.1
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

/** Extended document type info and Regula&#39;s &#39;Information Reference Systems&#39; links */
public class FDSIDList {
  public static final String SERIALIZED_NAME_IC_A_O_CODE = "ICAOCode";

  @SerializedName(SERIALIZED_NAME_IC_A_O_CODE)
  private String icAOCode;

  public static final String SERIALIZED_NAME_LIST = "List";

  @SerializedName(SERIALIZED_NAME_LIST)
  private List<Integer> list = null;

  public static final String SERIALIZED_NAME_D_TYPE = "dType";

  @SerializedName(SERIALIZED_NAME_D_TYPE)
  private Integer dType;

  public static final String SERIALIZED_NAME_D_FORMAT = "dFormat";

  @SerializedName(SERIALIZED_NAME_D_FORMAT)
  private Integer dFormat;

  public static final String SERIALIZED_NAME_D_M_R_Z = "dMRZ";

  @SerializedName(SERIALIZED_NAME_D_M_R_Z)
  private Boolean dMRZ;

  public static final String SERIALIZED_NAME_D_DESCRIPTION = "dDescription";

  @SerializedName(SERIALIZED_NAME_D_DESCRIPTION)
  private String dDescription;

  public static final String SERIALIZED_NAME_D_YEAR = "dYear";

  @SerializedName(SERIALIZED_NAME_D_YEAR)
  private String dYear;

  public static final String SERIALIZED_NAME_D_COUNTRY_NAME = "dCountryName";

  @SerializedName(SERIALIZED_NAME_D_COUNTRY_NAME)
  private String dCountryName;

  public static final String SERIALIZED_NAME_D_STATE_CODE = "dStateCode";

  @SerializedName(SERIALIZED_NAME_D_STATE_CODE)
  private String dStateCode;

  public static final String SERIALIZED_NAME_D_STATE_NAME = "dStateName";

  @SerializedName(SERIALIZED_NAME_D_STATE_NAME)
  private String dStateName;

  public FDSIDList withIcAOCode(String icAOCode) {
    this.icAOCode = icAOCode;
    return this;
  }

  /**
   * ICAO code of the issuing country
   *
   * @return icAOCode
   */
  @javax.annotation.Nullable
  public String getIcAOCode() {
    return icAOCode;
  }

  public void setIcAOCode(String icAOCode) {
    this.icAOCode = icAOCode;
  }

  public FDSIDList withList(List<Integer> list) {
    this.list = list;
    return this;
  }

  public FDSIDList addListItem(Integer listItem) {
    if (this.list == null) {
      this.list = new ArrayList<Integer>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * Document identifiers in &#39;Information Reference Systems&#39;
   *
   * @return list
   */
  @javax.annotation.Nullable
  public List<Integer> getList() {
    return list;
  }

  public void setList(List<Integer> list) {
    this.list = list;
  }

  public FDSIDList withDType(Integer dType) {
    this.dType = dType;
    return this;
  }

  /**
   * Get dType
   *
   * @return dType
   */
  @javax.annotation.Nullable
  public Integer getdType() {
    return dType;
  }

  public void setdType(Integer dType) {
    this.dType = dType;
  }

  public FDSIDList withDFormat(Integer dFormat) {
    this.dFormat = dFormat;
    return this;
  }

  /**
   * Get dFormat
   *
   * @return dFormat
   */
  @javax.annotation.Nullable
  public Integer getdFormat() {
    return dFormat;
  }

  public void setdFormat(Integer dFormat) {
    this.dFormat = dFormat;
  }

  public FDSIDList withDMRZ(Boolean dMRZ) {
    this.dMRZ = dMRZ;
    return this;
  }

  /**
   * Flag indicating the presence of MRZ on the document
   *
   * @return dMRZ
   */
  @javax.annotation.Nullable
  public Boolean getdMRZ() {
    return dMRZ;
  }

  public void setdMRZ(Boolean dMRZ) {
    this.dMRZ = dMRZ;
  }

  public FDSIDList withDDescription(String dDescription) {
    this.dDescription = dDescription;
    return this;
  }

  /**
   * Document description
   *
   * @return dDescription
   */
  @javax.annotation.Nullable
  public String getdDescription() {
    return dDescription;
  }

  public void setdDescription(String dDescription) {
    this.dDescription = dDescription;
  }

  public FDSIDList withDYear(String dYear) {
    this.dYear = dYear;
    return this;
  }

  /**
   * Year of publication of the document
   *
   * @return dYear
   */
  @javax.annotation.Nullable
  public String getdYear() {
    return dYear;
  }

  public void setdYear(String dYear) {
    this.dYear = dYear;
  }

  public FDSIDList withDCountryName(String dCountryName) {
    this.dCountryName = dCountryName;
    return this;
  }

  /**
   * Issuing country name
   *
   * @return dCountryName
   */
  @javax.annotation.Nullable
  public String getdCountryName() {
    return dCountryName;
  }

  public void setdCountryName(String dCountryName) {
    this.dCountryName = dCountryName;
  }

  public FDSIDList withDStateCode(String dStateCode) {
    this.dStateCode = dStateCode;
    return this;
  }

  /**
   * Issuing state code
   *
   * @return dStateCode
   */
  @javax.annotation.Nullable
  public String getdStateCode() {
    return dStateCode;
  }

  public void setdStateCode(String dStateCode) {
    this.dStateCode = dStateCode;
  }

  public FDSIDList withDStateName(String dStateName) {
    this.dStateName = dStateName;
    return this;
  }

  /**
   * Issuing state name
   *
   * @return dStateName
   */
  @javax.annotation.Nullable
  public String getdStateName() {
    return dStateName;
  }

  public void setdStateName(String dStateName) {
    this.dStateName = dStateName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FDSIDList fdSIDList = (FDSIDList) o;
    return Objects.equals(this.icAOCode, fdSIDList.icAOCode)
        && Objects.equals(this.list, fdSIDList.list)
        && Objects.equals(this.dType, fdSIDList.dType)
        && Objects.equals(this.dFormat, fdSIDList.dFormat)
        && Objects.equals(this.dMRZ, fdSIDList.dMRZ)
        && Objects.equals(this.dDescription, fdSIDList.dDescription)
        && Objects.equals(this.dYear, fdSIDList.dYear)
        && Objects.equals(this.dCountryName, fdSIDList.dCountryName)
        && Objects.equals(this.dStateCode, fdSIDList.dStateCode)
        && Objects.equals(this.dStateName, fdSIDList.dStateName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        icAOCode,
        list,
        dType,
        dFormat,
        dMRZ,
        dDescription,
        dYear,
        dCountryName,
        dStateCode,
        dStateName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FDSIDList {\n");
    sb.append("    icAOCode: ").append(toIndentedString(icAOCode)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    dType: ").append(toIndentedString(dType)).append("\n");
    sb.append("    dFormat: ").append(toIndentedString(dFormat)).append("\n");
    sb.append("    dMRZ: ").append(toIndentedString(dMRZ)).append("\n");
    sb.append("    dDescription: ").append(toIndentedString(dDescription)).append("\n");
    sb.append("    dYear: ").append(toIndentedString(dYear)).append("\n");
    sb.append("    dCountryName: ").append(toIndentedString(dCountryName)).append("\n");
    sb.append("    dStateCode: ").append(toIndentedString(dStateCode)).append("\n");
    sb.append("    dStateName: ").append(toIndentedString(dStateName)).append("\n");
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
