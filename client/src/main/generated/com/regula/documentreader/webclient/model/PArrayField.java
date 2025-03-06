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

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.regula.documentreader.webclient.JSON;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** PArrayField */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class PArrayField {
  public static final String SERIALIZED_NAME_BC_ANGLE_D_E_T_E_C_T = "bcAngle_DETECT";

  @SerializedName(SERIALIZED_NAME_BC_ANGLE_D_E_T_E_C_T)
  @javax.annotation.Nonnull
  private Float bcAngleDETECT;

  public static final String SERIALIZED_NAME_BC_CODE_RESULT = "bcCodeResult";

  @SerializedName(SERIALIZED_NAME_BC_CODE_RESULT)
  @javax.annotation.Nonnull
  private Integer bcCodeResult;

  public static final String SERIALIZED_NAME_BC_COUNT_MODULE = "bcCountModule";

  @SerializedName(SERIALIZED_NAME_BC_COUNT_MODULE)
  @javax.annotation.Nonnull
  private Integer bcCountModule;

  public static final String SERIALIZED_NAME_BC_DATA_MODULE = "bcDataModule";

  @SerializedName(SERIALIZED_NAME_BC_DATA_MODULE)
  @javax.annotation.Nonnull
  private List<DataModule> bcDataModule;

  public static final String SERIALIZED_NAME_BC_P_D_F417_I_N_F_O = "bcPDF417INFO";

  @SerializedName(SERIALIZED_NAME_BC_P_D_F417_I_N_F_O)
  @javax.annotation.Nullable
  private BcPDF417INFO bcPDF417INFO;

  public static final String SERIALIZED_NAME_BC_R_O_I_D_E_T_E_C_T = "bcROI_DETECT";

  @SerializedName(SERIALIZED_NAME_BC_R_O_I_D_E_T_E_C_T)
  @javax.annotation.Nonnull
  private BcROIDETECT bcROIDETECT;

  public static final String SERIALIZED_NAME_BC_TEXT_DECODER_TYPES = "bcTextDecoderTypes";

  @SerializedName(SERIALIZED_NAME_BC_TEXT_DECODER_TYPES)
  @javax.annotation.Nullable
  private Integer bcTextDecoderTypes;

  public static final String SERIALIZED_NAME_BC_TEXT_FIELD_TYPE = "bcTextFieldType";

  @SerializedName(SERIALIZED_NAME_BC_TEXT_FIELD_TYPE)
  @javax.annotation.Nullable
  private Integer bcTextFieldType;

  public static final String SERIALIZED_NAME_BC_TYPE_D_E_C_O_D_E = "bcType_DECODE";

  @SerializedName(SERIALIZED_NAME_BC_TYPE_D_E_C_O_D_E)
  @javax.annotation.Nonnull
  private BarcodeType bcTypeDECODE;

  public static final String SERIALIZED_NAME_BC_TYPE_D_E_T_E_C_T = "bcType_DETECT";

  @SerializedName(SERIALIZED_NAME_BC_TYPE_D_E_T_E_C_T)
  @javax.annotation.Nonnull
  private Integer bcTypeDETECT;

  public PArrayField() {}

  public PArrayField bcAngleDETECT(@javax.annotation.Nonnull Float bcAngleDETECT) {
    this.bcAngleDETECT = bcAngleDETECT;
    return this;
  }

  /**
   * Get bcAngleDETECT
   *
   * @return bcAngleDETECT
   */
  @javax.annotation.Nonnull
  public Float getBcAngleDETECT() {
    return bcAngleDETECT;
  }

  public void setBcAngleDETECT(@javax.annotation.Nonnull Float bcAngleDETECT) {
    this.bcAngleDETECT = bcAngleDETECT;
  }

  public PArrayField bcCodeResult(@javax.annotation.Nonnull Integer bcCodeResult) {
    this.bcCodeResult = bcCodeResult;
    return this;
  }

  /**
   * Get bcCodeResult
   *
   * @return bcCodeResult
   */
  @javax.annotation.Nonnull
  public Integer getBcCodeResult() {
    return bcCodeResult;
  }

  public void setBcCodeResult(@javax.annotation.Nonnull Integer bcCodeResult) {
    this.bcCodeResult = bcCodeResult;
  }

  public PArrayField bcCountModule(@javax.annotation.Nonnull Integer bcCountModule) {
    this.bcCountModule = bcCountModule;
    return this;
  }

  /**
   * Get bcCountModule
   *
   * @return bcCountModule
   */
  @javax.annotation.Nonnull
  public Integer getBcCountModule() {
    return bcCountModule;
  }

  public void setBcCountModule(@javax.annotation.Nonnull Integer bcCountModule) {
    this.bcCountModule = bcCountModule;
  }

  public PArrayField bcDataModule(@javax.annotation.Nonnull List<DataModule> bcDataModule) {
    this.bcDataModule = bcDataModule;
    return this;
  }

  public PArrayField addBcDataModuleItem(DataModule bcDataModuleItem) {
    if (this.bcDataModule == null) {
      this.bcDataModule = new ArrayList<>();
    }
    this.bcDataModule.add(bcDataModuleItem);
    return this;
  }

  /**
   * Get bcDataModule
   *
   * @return bcDataModule
   */
  @javax.annotation.Nonnull
  public List<DataModule> getBcDataModule() {
    return bcDataModule;
  }

  public void setBcDataModule(@javax.annotation.Nonnull List<DataModule> bcDataModule) {
    this.bcDataModule = bcDataModule;
  }

  public PArrayField bcPDF417INFO(@javax.annotation.Nullable BcPDF417INFO bcPDF417INFO) {
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

  public void setBcPDF417INFO(@javax.annotation.Nullable BcPDF417INFO bcPDF417INFO) {
    this.bcPDF417INFO = bcPDF417INFO;
  }

  public PArrayField bcROIDETECT(@javax.annotation.Nonnull BcROIDETECT bcROIDETECT) {
    this.bcROIDETECT = bcROIDETECT;
    return this;
  }

  /**
   * Get bcROIDETECT
   *
   * @return bcROIDETECT
   */
  @javax.annotation.Nonnull
  public BcROIDETECT getBcROIDETECT() {
    return bcROIDETECT;
  }

  public void setBcROIDETECT(@javax.annotation.Nonnull BcROIDETECT bcROIDETECT) {
    this.bcROIDETECT = bcROIDETECT;
  }

  public PArrayField bcTextDecoderTypes(@javax.annotation.Nullable Integer bcTextDecoderTypes) {
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

  public void setBcTextDecoderTypes(@javax.annotation.Nullable Integer bcTextDecoderTypes) {
    this.bcTextDecoderTypes = bcTextDecoderTypes;
  }

  public PArrayField bcTextFieldType(@javax.annotation.Nullable Integer bcTextFieldType) {
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

  public void setBcTextFieldType(@javax.annotation.Nullable Integer bcTextFieldType) {
    this.bcTextFieldType = bcTextFieldType;
  }

  public PArrayField bcTypeDECODE(@javax.annotation.Nonnull BarcodeType bcTypeDECODE) {
    this.bcTypeDECODE = bcTypeDECODE;
    return this;
  }

  /**
   * Get bcTypeDECODE
   *
   * @return bcTypeDECODE
   */
  @javax.annotation.Nonnull
  public BarcodeType getBcTypeDECODE() {
    return bcTypeDECODE;
  }

  public void setBcTypeDECODE(@javax.annotation.Nonnull BarcodeType bcTypeDECODE) {
    this.bcTypeDECODE = bcTypeDECODE;
  }

  public PArrayField bcTypeDETECT(@javax.annotation.Nonnull Integer bcTypeDETECT) {
    this.bcTypeDETECT = bcTypeDETECT;
    return this;
  }

  /**
   * Get bcTypeDETECT
   *
   * @return bcTypeDETECT
   */
  @javax.annotation.Nonnull
  public Integer getBcTypeDETECT() {
    return bcTypeDETECT;
  }

  public void setBcTypeDETECT(@javax.annotation.Nonnull Integer bcTypeDETECT) {
    this.bcTypeDETECT = bcTypeDETECT;
  }

  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("bcAngle_DETECT");
    openapiFields.add("bcCodeResult");
    openapiFields.add("bcCountModule");
    openapiFields.add("bcDataModule");
    openapiFields.add("bcPDF417INFO");
    openapiFields.add("bcROI_DETECT");
    openapiFields.add("bcTextDecoderTypes");
    openapiFields.add("bcTextFieldType");
    openapiFields.add("bcType_DECODE");
    openapiFields.add("bcType_DETECT");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("bcAngle_DETECT");
    openapiRequiredFields.add("bcCodeResult");
    openapiRequiredFields.add("bcCountModule");
    openapiRequiredFields.add("bcDataModule");
    openapiRequiredFields.add("bcROI_DETECT");
    openapiRequiredFields.add("bcType_DECODE");
    openapiRequiredFields.add("bcType_DETECT");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PArrayField
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!PArrayField.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in PArrayField is not found in the empty JSON string",
                PArrayField.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!PArrayField.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `PArrayField` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : PArrayField.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // ensure the json data is an array
    if (!jsonObj.get("bcDataModule").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `bcDataModule` to be an array in the JSON string but got `%s`",
              jsonObj.get("bcDataModule").toString()));
    }

    JsonArray jsonArraybcDataModule = jsonObj.getAsJsonArray("bcDataModule");
    // validate the required field `bcDataModule` (array)
    for (int i = 0; i < jsonArraybcDataModule.size(); i++) {
      DataModule.validateJsonElement(jsonArraybcDataModule.get(i));
    }
    ;
    // validate the optional field `bcPDF417INFO`
    if (jsonObj.get("bcPDF417INFO") != null && !jsonObj.get("bcPDF417INFO").isJsonNull()) {
      BcPDF417INFO.validateJsonElement(jsonObj.get("bcPDF417INFO"));
    }
    // validate the required field `bcROI_DETECT`
    BcROIDETECT.validateJsonElement(jsonObj.get("bcROI_DETECT"));
    // validate the required field `bcType_DECODE`
    BarcodeType.validateJsonElement(jsonObj.get("bcType_DECODE"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!PArrayField.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'PArrayField' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<PArrayField> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(PArrayField.class));

      return (TypeAdapter<T>)
          new TypeAdapter<PArrayField>() {
            @Override
            public void write(JsonWriter out, PArrayField value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public PArrayField read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of PArrayField given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PArrayField
   * @throws IOException if the JSON string is invalid with respect to PArrayField
   */
  public static PArrayField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PArrayField.class);
  }

  /**
   * Convert an instance of PArrayField to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
