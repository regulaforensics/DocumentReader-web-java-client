/*
 * Regula Document Reader Web API
 * Regula Document Reader Web API
 *
 * The version of the OpenAPI document: 5.2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** Status */
public class Status {
  public static final String SERIALIZED_NAME_OVERALL_STATUS = "overallStatus";

  @SerializedName(SERIALIZED_NAME_OVERALL_STATUS)
  private Integer overallStatus;

  public static final String SERIALIZED_NAME_OPTICAL = "optical";

  @SerializedName(SERIALIZED_NAME_OPTICAL)
  private Integer optical;

  public static final String SERIALIZED_NAME_PORTRAIT = "portrait";

  @SerializedName(SERIALIZED_NAME_PORTRAIT)
  private Integer portrait;

  public static final String SERIALIZED_NAME_RFID = "rfid";

  @SerializedName(SERIALIZED_NAME_RFID)
  private Integer rfid;

  public static final String SERIALIZED_NAME_STOP_LIST = "stopList";

  @SerializedName(SERIALIZED_NAME_STOP_LIST)
  private Integer stopList;

  public static final String SERIALIZED_NAME_DETAILS_R_F_I_D = "detailsRFID";

  @SerializedName(SERIALIZED_NAME_DETAILS_R_F_I_D)
  private DetailsRFID detailsRFID;

  public static final String SERIALIZED_NAME_DETAILS_OPTICAL = "detailsOptical";

  @SerializedName(SERIALIZED_NAME_DETAILS_OPTICAL)
  private DetailsOptical detailsOptical;

  public Status withOverallStatus(Integer overallStatus) {
    this.overallStatus = overallStatus;
    return this;
  }

  /**
   * Get overallStatus
   *
   * @return overallStatus
   */
  public Integer getOverallStatus() {
    return overallStatus;
  }

  public void setOverallStatus(Integer overallStatus) {
    this.overallStatus = overallStatus;
  }

  public Status withOptical(Integer optical) {
    this.optical = optical;
    return this;
  }

  /**
   * Get optical
   *
   * @return optical
   */
  public Integer getOptical() {
    return optical;
  }

  public void setOptical(Integer optical) {
    this.optical = optical;
  }

  public Status withPortrait(Integer portrait) {
    this.portrait = portrait;
    return this;
  }

  /**
   * Get portrait
   *
   * @return portrait
   */
  @javax.annotation.Nullable
  public Integer getPortrait() {
    return portrait;
  }

  public void setPortrait(Integer portrait) {
    this.portrait = portrait;
  }

  public Status withRfid(Integer rfid) {
    this.rfid = rfid;
    return this;
  }

  /**
   * Get rfid
   *
   * @return rfid
   */
  @javax.annotation.Nullable
  public Integer getRfid() {
    return rfid;
  }

  public void setRfid(Integer rfid) {
    this.rfid = rfid;
  }

  public Status withStopList(Integer stopList) {
    this.stopList = stopList;
    return this;
  }

  /**
   * Get stopList
   *
   * @return stopList
   */
  @javax.annotation.Nullable
  public Integer getStopList() {
    return stopList;
  }

  public void setStopList(Integer stopList) {
    this.stopList = stopList;
  }

  public Status withDetailsRFID(DetailsRFID detailsRFID) {
    this.detailsRFID = detailsRFID;
    return this;
  }

  /**
   * Get detailsRFID
   *
   * @return detailsRFID
   */
  @javax.annotation.Nullable
  public DetailsRFID getDetailsRFID() {
    return detailsRFID;
  }

  public void setDetailsRFID(DetailsRFID detailsRFID) {
    this.detailsRFID = detailsRFID;
  }

  public Status withDetailsOptical(DetailsOptical detailsOptical) {
    this.detailsOptical = detailsOptical;
    return this;
  }

  /**
   * Get detailsOptical
   *
   * @return detailsOptical
   */
  public DetailsOptical getDetailsOptical() {
    return detailsOptical;
  }

  public void setDetailsOptical(DetailsOptical detailsOptical) {
    this.detailsOptical = detailsOptical;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status status = (Status) o;
    return Objects.equals(this.overallStatus, status.overallStatus)
        && Objects.equals(this.optical, status.optical)
        && Objects.equals(this.portrait, status.portrait)
        && Objects.equals(this.rfid, status.rfid)
        && Objects.equals(this.stopList, status.stopList)
        && Objects.equals(this.detailsRFID, status.detailsRFID)
        && Objects.equals(this.detailsOptical, status.detailsOptical);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        overallStatus, optical, portrait, rfid, stopList, detailsRFID, detailsOptical);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    sb.append("    overallStatus: ").append(toIndentedString(overallStatus)).append("\n");
    sb.append("    optical: ").append(toIndentedString(optical)).append("\n");
    sb.append("    portrait: ").append(toIndentedString(portrait)).append("\n");
    sb.append("    rfid: ").append(toIndentedString(rfid)).append("\n");
    sb.append("    stopList: ").append(toIndentedString(stopList)).append("\n");
    sb.append("    detailsRFID: ").append(toIndentedString(detailsRFID)).append("\n");
    sb.append("    detailsOptical: ").append(toIndentedString(detailsOptical)).append("\n");
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
