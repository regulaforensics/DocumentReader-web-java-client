/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 6.3.0
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

/** PArrayField */
public class PArrayField {
  public static final String SERIALIZED_NAME_BC_ANGLE_D_E_T_E_C_T = "bcAngle_DETECT";

  @SerializedName(SERIALIZED_NAME_BC_ANGLE_D_E_T_E_C_T)
  private Float bcAngleDETECT = null;

  public static final String SERIALIZED_NAME_BC_CODE_RESULT = "bcCodeResult";

  @SerializedName(SERIALIZED_NAME_BC_CODE_RESULT)
  private Integer bcCodeResult;

  public static final String SERIALIZED_NAME_BC_COUNT_MODULE = "bcCountModule";

  @SerializedName(SERIALIZED_NAME_BC_COUNT_MODULE)
  private Integer bcCountModule;

  public static final String SERIALIZED_NAME_BC_DATA_MODULE = "bcDataModule";

  @SerializedName(SERIALIZED_NAME_BC_DATA_MODULE)
  private List<DataModule> bcDataModule = null;

  public static final String SERIALIZED_NAME_BC_P_D_F417_I_N_F_O = "bcPDF417INFO";

  @SerializedName(SERIALIZED_NAME_BC_P_D_F417_I_N_F_O)
  private BcPDF417INFO bcPDF417INFO;

  public static final String SERIALIZED_NAME_BC_R_O_I_D_E_T_E_C_T = "bcROI_DETECT";

  @SerializedName(SERIALIZED_NAME_BC_R_O_I_D_E_T_E_C_T)
  private BcROIDETECT bcROIDETECT;

  public static final String SERIALIZED_NAME_BC_TEXT_DECODER_TYPES = "bcTextDecoderTypes";

  @SerializedName(SERIALIZED_NAME_BC_TEXT_DECODER_TYPES)
  private Integer bcTextDecoderTypes;

  public static final String SERIALIZED_NAME_BC_TEXT_FIELD_TYPE = "bcTextFieldType";

  @SerializedName(SERIALIZED_NAME_BC_TEXT_FIELD_TYPE)
  private Integer bcTextFieldType;

  public static final String SERIALIZED_NAME_BC_TYPE_D_E_C_O_D_E = "bcType_DECODE";

  @SerializedName(SERIALIZED_NAME_BC_TYPE_D_E_C_O_D_E)
  private Integer bcTypeDECODE;

  public static final String SERIALIZED_NAME_BC_TYPE_D_E_T_E_C_T = "bcType_DETECT";

  @SerializedName(SERIALIZED_NAME_BC_TYPE_D_E_T_E_C_T)
  private Integer bcTypeDETECT;

  public PArrayField withBcAngleDETECT(Float bcAngleDETECT) {
    this.bcAngleDETECT = bcAngleDETECT;
    return this;
  }

  /**
   * Get bcAngleDETECT
   *
   * @return bcAngleDETECT
   */
  @javax.annotation.Nullable
  public Float getBcAngleDETECT() {
    return bcAngleDETECT;
  }

  public void setBcAngleDETECT(Float bcAngleDETECT) {
    this.bcAngleDETECT = bcAngleDETECT;
  }

  public PArrayField withBcCodeResult(Integer bcCodeResult) {
    this.bcCodeResult = bcCodeResult;
    return this;
  }

  /**
   * Get bcCodeResult
   *
   * @return bcCodeResult
   */
  @javax.annotation.Nullable
  public Integer getBcCodeResult() {
    return bcCodeResult;
  }

  public void setBcCodeResult(Integer bcCodeResult) {
    this.bcCodeResult = bcCodeResult;
  }

  public PArrayField withBcCountModule(Integer bcCountModule) {
    this.bcCountModule = bcCountModule;
    return this;
  }

  /**
   * Get bcCountModule
   *
   * @return bcCountModule
   */
  @javax.annotation.Nullable
  public Integer getBcCountModule() {
    return bcCountModule;
  }

  public void setBcCountModule(Integer bcCountModule) {
    this.bcCountModule = bcCountModule;
  }

  public PArrayField withBcDataModule(List<DataModule> bcDataModule) {
    this.bcDataModule = bcDataModule;
    return this;
  }

  public PArrayField addBcDataModuleItem(DataModule bcDataModuleItem) {
    if (this.bcDataModule == null) {
      this.bcDataModule = new ArrayList<DataModule>();
    }
    this.bcDataModule.add(bcDataModuleItem);
    return this;
  }

  /**
   * Get bcDataModule
   *
   * @return bcDataModule
   */
  @javax.annotation.Nullable
  public List<DataModule> getBcDataModule() {
    return bcDataModule;
  }

  public void setBcDataModule(List<DataModule> bcDataModule) {
    this.bcDataModule = bcDataModule;
  }

  public PArrayField withBcPDF417INFO(BcPDF417INFO bcPDF417INFO) {
    this.bcPDF417INFO = bcPDF417INFO;
    return this;
  }

  /**
   * Get bcPDF417INFO
   *
   * @return bcPDF417INFO
   */
  @javax.annotation.Nullable
  public BcPDF417INFO getBcPDF417INFO() {
    return bcPDF417INFO;
  }

  public void setBcPDF417INFO(BcPDF417INFO bcPDF417INFO) {
    this.bcPDF417INFO = bcPDF417INFO;
  }

  public PArrayField withBcROIDETECT(BcROIDETECT bcROIDETECT) {
    this.bcROIDETECT = bcROIDETECT;
    return this;
  }

  /**
   * Get bcROIDETECT
   *
   * @return bcROIDETECT
   */
  @javax.annotation.Nullable
  public BcROIDETECT getBcROIDETECT() {
    return bcROIDETECT;
  }

  public void setBcROIDETECT(BcROIDETECT bcROIDETECT) {
    this.bcROIDETECT = bcROIDETECT;
  }

  public PArrayField withBcTextDecoderTypes(Integer bcTextDecoderTypes) {
    this.bcTextDecoderTypes = bcTextDecoderTypes;
    return this;
  }

  /**
   * Get bcTextDecoderTypes
   *
   * @return bcTextDecoderTypes
   */
  @javax.annotation.Nullable
  public Integer getBcTextDecoderTypes() {
    return bcTextDecoderTypes;
  }

  public void setBcTextDecoderTypes(Integer bcTextDecoderTypes) {
    this.bcTextDecoderTypes = bcTextDecoderTypes;
  }

  public PArrayField withBcTextFieldType(Integer bcTextFieldType) {
    this.bcTextFieldType = bcTextFieldType;
    return this;
  }

  /**
   * Get bcTextFieldType
   *
   * @return bcTextFieldType
   */
  @javax.annotation.Nullable
  public Integer getBcTextFieldType() {
    return bcTextFieldType;
  }

  public void setBcTextFieldType(Integer bcTextFieldType) {
    this.bcTextFieldType = bcTextFieldType;
  }

  public PArrayField withBcTypeDECODE(Integer bcTypeDECODE) {
    this.bcTypeDECODE = bcTypeDECODE;
    return this;
  }

  /**
   * Get bcTypeDECODE
   *
   * @return bcTypeDECODE
   */
  @javax.annotation.Nullable
  public Integer getBcTypeDECODE() {
    return bcTypeDECODE;
  }

  public void setBcTypeDECODE(Integer bcTypeDECODE) {
    this.bcTypeDECODE = bcTypeDECODE;
  }

  public PArrayField withBcTypeDETECT(Integer bcTypeDETECT) {
    this.bcTypeDETECT = bcTypeDETECT;
    return this;
  }

  /**
   * Get bcTypeDETECT
   *
   * @return bcTypeDETECT
   */
  @javax.annotation.Nullable
  public Integer getBcTypeDETECT() {
    return bcTypeDETECT;
  }

  public void setBcTypeDETECT(Integer bcTypeDETECT) {
    this.bcTypeDETECT = bcTypeDETECT;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PArrayField pArrayField = (PArrayField) o;
    return Objects.equals(this.bcAngleDETECT, pArrayField.bcAngleDETECT)
        && Objects.equals(this.bcCodeResult, pArrayField.bcCodeResult)
        && Objects.equals(this.bcCountModule, pArrayField.bcCountModule)
        && Objects.equals(this.bcDataModule, pArrayField.bcDataModule)
        && Objects.equals(this.bcPDF417INFO, pArrayField.bcPDF417INFO)
        && Objects.equals(this.bcROIDETECT, pArrayField.bcROIDETECT)
        && Objects.equals(this.bcTextDecoderTypes, pArrayField.bcTextDecoderTypes)
        && Objects.equals(this.bcTextFieldType, pArrayField.bcTextFieldType)
        && Objects.equals(this.bcTypeDECODE, pArrayField.bcTypeDECODE)
        && Objects.equals(this.bcTypeDETECT, pArrayField.bcTypeDETECT);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        bcAngleDETECT,
        bcCodeResult,
        bcCountModule,
        bcDataModule,
        bcPDF417INFO,
        bcROIDETECT,
        bcTextDecoderTypes,
        bcTextFieldType,
        bcTypeDECODE,
        bcTypeDETECT);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PArrayField {\n");
    sb.append("    bcAngleDETECT: ").append(toIndentedString(bcAngleDETECT)).append("\n");
    sb.append("    bcCodeResult: ").append(toIndentedString(bcCodeResult)).append("\n");
    sb.append("    bcCountModule: ").append(toIndentedString(bcCountModule)).append("\n");
    sb.append("    bcDataModule: ").append(toIndentedString(bcDataModule)).append("\n");
    sb.append("    bcPDF417INFO: ").append(toIndentedString(bcPDF417INFO)).append("\n");
    sb.append("    bcROIDETECT: ").append(toIndentedString(bcROIDETECT)).append("\n");
    sb.append("    bcTextDecoderTypes: ").append(toIndentedString(bcTextDecoderTypes)).append("\n");
    sb.append("    bcTextFieldType: ").append(toIndentedString(bcTextFieldType)).append("\n");
    sb.append("    bcTypeDECODE: ").append(toIndentedString(bcTypeDECODE)).append("\n");
    sb.append("    bcTypeDETECT: ").append(toIndentedString(bcTypeDETECT)).append("\n");
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
