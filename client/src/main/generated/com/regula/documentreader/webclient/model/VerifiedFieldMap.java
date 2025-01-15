/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.   # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 7.4.0
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

/** VerifiedFieldMap */
public class VerifiedFieldMap {
  public static final String SERIALIZED_NAME_W_FIELD_TYPE = "wFieldType";

  @SerializedName(SERIALIZED_NAME_W_FIELD_TYPE)
  private Integer wFieldType;

  public static final String SERIALIZED_NAME_W_L_C_I_D = "wLCID";

  @SerializedName(SERIALIZED_NAME_W_L_C_I_D)
  private Integer wLCID;

  public static final String SERIALIZED_NAME_FIELD_M_R_Z = "Field_MRZ";

  @SerializedName(SERIALIZED_NAME_FIELD_M_R_Z)
  private String fieldMRZ;

  public static final String SERIALIZED_NAME_FIELD_VISUAL = "Field_Visual";

  @SerializedName(SERIALIZED_NAME_FIELD_VISUAL)
  private String fieldVisual;

  public static final String SERIALIZED_NAME_FIELD_BARCODE = "Field_Barcode";

  @SerializedName(SERIALIZED_NAME_FIELD_BARCODE)
  private String fieldBarcode;

  public static final String SERIALIZED_NAME_FIELD_R_F_I_D = "Field_RFID";

  @SerializedName(SERIALIZED_NAME_FIELD_R_F_I_D)
  private String fieldRFID;

  public static final String SERIALIZED_NAME_MATRIX = "Matrix";

  @SerializedName(SERIALIZED_NAME_MATRIX)
  private List<Integer> matrix = new ArrayList<Integer>();

  public VerifiedFieldMap withWFieldType(Integer wFieldType) {
    this.wFieldType = wFieldType;
    return this;
  }

  /**
   * Get wFieldType
   *
   * @return wFieldType
   */
  public Integer getwFieldType() {
    return wFieldType;
  }

  public void setwFieldType(Integer wFieldType) {
    this.wFieldType = wFieldType;
  }

  public VerifiedFieldMap withWLCID(Integer wLCID) {
    this.wLCID = wLCID;
    return this;
  }

  /**
   * Get wLCID
   *
   * @return wLCID
   */
  public Integer getwLCID() {
    return wLCID;
  }

  public void setwLCID(Integer wLCID) {
    this.wLCID = wLCID;
  }

  public VerifiedFieldMap withFieldMRZ(String fieldMRZ) {
    this.fieldMRZ = fieldMRZ;
    return this;
  }

  /**
   * Field data extracted from mrz(machine readable zone)
   *
   * @return fieldMRZ
   */
  @javax.annotation.Nullable
  public String getFieldMRZ() {
    return fieldMRZ;
  }

  public void setFieldMRZ(String fieldMRZ) {
    this.fieldMRZ = fieldMRZ;
  }

  public VerifiedFieldMap withFieldVisual(String fieldVisual) {
    this.fieldVisual = fieldVisual;
    return this;
  }

  /**
   * Field data extracted from visual zone
   *
   * @return fieldVisual
   */
  @javax.annotation.Nullable
  public String getFieldVisual() {
    return fieldVisual;
  }

  public void setFieldVisual(String fieldVisual) {
    this.fieldVisual = fieldVisual;
  }

  public VerifiedFieldMap withFieldBarcode(String fieldBarcode) {
    this.fieldBarcode = fieldBarcode;
    return this;
  }

  /**
   * Field data extracted from barcode
   *
   * @return fieldBarcode
   */
  @javax.annotation.Nullable
  public String getFieldBarcode() {
    return fieldBarcode;
  }

  public void setFieldBarcode(String fieldBarcode) {
    this.fieldBarcode = fieldBarcode;
  }

  public VerifiedFieldMap withFieldRFID(String fieldRFID) {
    this.fieldRFID = fieldRFID;
    return this;
  }

  /**
   * Field data extracted from rfid chip
   *
   * @return fieldRFID
   */
  @javax.annotation.Nullable
  public String getFieldRFID() {
    return fieldRFID;
  }

  public void setFieldRFID(String fieldRFID) {
    this.fieldRFID = fieldRFID;
  }

  public VerifiedFieldMap withMatrix(List<Integer> matrix) {
    this.matrix = matrix;
    return this;
  }

  public VerifiedFieldMap addMatrixItem(Integer matrixItem) {
    this.matrix.add(matrixItem);
    return this;
  }

  /**
   * results comparison matrix. Elements of the matrix with indices 0, 1, 2, 3 take one of the
   * values Disabled(0), Verified(1) or Not_Verified(2), elements with indices 4, 5, 6, 7, 8 are one
   * of the values Disabled(0), Compare_Match(3) or Compare_Not_Match(4). Elements of the Matrix
   * matrix have the following semantic meaning: - element with index 0 –– the result of
   * verification of data from the MRZ; - 1 –– the result of verification of data from the RFID
   * microcircuit; - 2 –– the result of verification of data from text areas of the document; - 3 ––
   * the result of verification data from barcodes; - 4 - the result of comparing MRZ data and RFID
   * microcircuits; - 5 - the result of comparing MRZ data and text areas of document filling; - 6 -
   * the result of comparing MRZ data and bar codes; - 7 - the result of comparing the data of text
   * areas of the document and the RFID chip; - 8 - the result of comparing the data of the text
   * areas of the document and barcodes; - 9 - the result of comparing the data of the RFID chip and
   * barcodes.
   *
   * @return matrix
   */
  public List<Integer> getMatrix() {
    return matrix;
  }

  public void setMatrix(List<Integer> matrix) {
    this.matrix = matrix;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifiedFieldMap verifiedFieldMap = (VerifiedFieldMap) o;
    return Objects.equals(this.wFieldType, verifiedFieldMap.wFieldType)
        && Objects.equals(this.wLCID, verifiedFieldMap.wLCID)
        && Objects.equals(this.fieldMRZ, verifiedFieldMap.fieldMRZ)
        && Objects.equals(this.fieldVisual, verifiedFieldMap.fieldVisual)
        && Objects.equals(this.fieldBarcode, verifiedFieldMap.fieldBarcode)
        && Objects.equals(this.fieldRFID, verifiedFieldMap.fieldRFID)
        && Objects.equals(this.matrix, verifiedFieldMap.matrix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wFieldType, wLCID, fieldMRZ, fieldVisual, fieldBarcode, fieldRFID, matrix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifiedFieldMap {\n");
    sb.append("    wFieldType: ").append(toIndentedString(wFieldType)).append("\n");
    sb.append("    wLCID: ").append(toIndentedString(wLCID)).append("\n");
    sb.append("    fieldMRZ: ").append(toIndentedString(fieldMRZ)).append("\n");
    sb.append("    fieldVisual: ").append(toIndentedString(fieldVisual)).append("\n");
    sb.append("    fieldBarcode: ").append(toIndentedString(fieldBarcode)).append("\n");
    sb.append("    fieldRFID: ").append(toIndentedString(fieldRFID)).append("\n");
    sb.append("    matrix: ").append(toIndentedString(matrix)).append("\n");
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
