/*
 * Regula Document Reader Web API
 * Regula Document Reader Web API
 *
 * The version of the OpenAPI document: 5.1.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** Location of data in RFID chip */
public class RfidOrigin {
  public static final String SERIALIZED_NAME_DG = "dg";

  @SerializedName(SERIALIZED_NAME_DG)
  private int dg;

  public static final String SERIALIZED_NAME_DG_TAG = "dgTag";

  @SerializedName(SERIALIZED_NAME_DG_TAG)
  private int dgTag;

  public static final String SERIALIZED_NAME_TAG_ENTRY = "tagEntry";

  @SerializedName(SERIALIZED_NAME_TAG_ENTRY)
  private int tagEntry;

  public static final String SERIALIZED_NAME_ENTRY_VIEW = "entryView";

  @SerializedName(SERIALIZED_NAME_ENTRY_VIEW)
  private int entryView;

  public RfidOrigin withDg(int dg) {
    this.dg = dg;
    return this;
  }

  /**
   * Source data group file
   *
   * @return dg
   */
  public int getDg() {
    return dg;
  }

  public void setDg(int dg) {
    this.dg = dg;
  }

  public RfidOrigin withDgTag(int dgTag) {
    this.dgTag = dgTag;
    return this;
  }

  /**
   * Index of the source record of the image with biometric information in the information data
   * group
   *
   * @return dgTag
   */
  @javax.annotation.Nullable
  public int getDgTag() {
    return dgTag;
  }

  public void setDgTag(int dgTag) {
    this.dgTag = dgTag;
  }

  public RfidOrigin withTagEntry(int tagEntry) {
    this.tagEntry = tagEntry;
    return this;
  }

  /**
   * Index of the template in the record with biometric data
   *
   * @return tagEntry
   */
  @javax.annotation.Nullable
  public int getTagEntry() {
    return tagEntry;
  }

  public void setTagEntry(int tagEntry) {
    this.tagEntry = tagEntry;
  }

  public RfidOrigin withEntryView(int entryView) {
    this.entryView = entryView;
    return this;
  }

  /**
   * Index of the variant of the biometric data template
   *
   * @return entryView
   */
  @javax.annotation.Nullable
  public int getEntryView() {
    return entryView;
  }

  public void setEntryView(int entryView) {
    this.entryView = entryView;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RfidOrigin rfidOrigin = (RfidOrigin) o;
    return Objects.equals(this.dg, rfidOrigin.dg)
        && Objects.equals(this.dgTag, rfidOrigin.dgTag)
        && Objects.equals(this.tagEntry, rfidOrigin.tagEntry)
        && Objects.equals(this.entryView, rfidOrigin.entryView);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dg, dgTag, tagEntry, entryView);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RfidOrigin {\n");
    sb.append("    dg: ").append(toIndentedString(dg)).append("\n");
    sb.append("    dgTag: ").append(toIndentedString(dgTag)).append("\n");
    sb.append("    tagEntry: ").append(toIndentedString(tagEntry)).append("\n");
    sb.append("    entryView: ").append(toIndentedString(entryView)).append("\n");
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
