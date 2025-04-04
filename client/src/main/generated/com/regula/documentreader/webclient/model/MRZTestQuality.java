/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.   # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 7.6.0
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

/** MRZTestQuality */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class MRZTestQuality {
  public static final String SERIALIZED_NAME_C_H_E_C_K_S_U_M_S = "CHECK_SUMS";

  @SerializedName(SERIALIZED_NAME_C_H_E_C_K_S_U_M_S)
  @javax.annotation.Nonnull
  private Integer CHECK_SUMS;

  public static final String SERIALIZED_NAME_C_O_N_T_R_A_S_T_P_R_I_N_T = "CONTRAST_PRINT";

  @SerializedName(SERIALIZED_NAME_C_O_N_T_R_A_S_T_P_R_I_N_T)
  @javax.annotation.Nonnull
  private Integer CONTRAST_PRINT;

  public static final String SERIALIZED_NAME_D_O_C_F_O_R_M_A_T = "DOC_FORMAT";

  @SerializedName(SERIALIZED_NAME_D_O_C_F_O_R_M_A_T)
  @javax.annotation.Nonnull
  private Integer DOC_FORMAT;

  public static final String SERIALIZED_NAME_M_R_Z_F_O_R_M_A_T = "MRZ_FORMAT";

  @SerializedName(SERIALIZED_NAME_M_R_Z_F_O_R_M_A_T)
  @javax.annotation.Nonnull
  private Integer MRZ_FORMAT;

  public static final String SERIALIZED_NAME_P_R_I_N_T_P_O_S_I_T_I_O_N = "PRINT_POSITION";

  @SerializedName(SERIALIZED_NAME_P_R_I_N_T_P_O_S_I_T_I_O_N)
  @javax.annotation.Nonnull
  private Integer PRINT_POSITION;

  public static final String SERIALIZED_NAME_S_T_A_I_N_M_R_Z = "STAIN_MRZ";

  @SerializedName(SERIALIZED_NAME_S_T_A_I_N_M_R_Z)
  @javax.annotation.Nonnull
  private Integer STAIN_MRZ;

  public static final String SERIALIZED_NAME_S_Y_M_B_O_L_S_P_A_R_A_M = "SYMBOLS_PARAM";

  @SerializedName(SERIALIZED_NAME_S_Y_M_B_O_L_S_P_A_R_A_M)
  @javax.annotation.Nonnull
  private Integer SYMBOLS_PARAM;

  public static final String SERIALIZED_NAME_STR_COUNT = "StrCount";

  @SerializedName(SERIALIZED_NAME_STR_COUNT)
  @javax.annotation.Nonnull
  private Integer strCount;

  public static final String SERIALIZED_NAME_STRINGS = "Strings";

  @SerializedName(SERIALIZED_NAME_STRINGS)
  @javax.annotation.Nonnull
  private List<StringItem> strings;

  public static final String SERIALIZED_NAME_T_E_X_T_U_A_L_F_I_L_L_I_N_G = "TEXTUAL_FILLING";

  @SerializedName(SERIALIZED_NAME_T_E_X_T_U_A_L_F_I_L_L_I_N_G)
  @javax.annotation.Nonnull
  private Integer TEXTUAL_FILLING;

  public MRZTestQuality() {}

  public MRZTestQuality CHECK_SUMS(@javax.annotation.Nonnull Integer CHECK_SUMS) {
    this.CHECK_SUMS = CHECK_SUMS;
    return this;
  }

  /**
   * Get CHECK_SUMS
   *
   * @return CHECK_SUMS
   */
  @javax.annotation.Nonnull
  public Integer getCHECKSUMS() {
    return CHECK_SUMS;
  }

  public void setCHECKSUMS(@javax.annotation.Nonnull Integer CHECK_SUMS) {
    this.CHECK_SUMS = CHECK_SUMS;
  }

  public MRZTestQuality CONTRAST_PRINT(@javax.annotation.Nonnull Integer CONTRAST_PRINT) {
    this.CONTRAST_PRINT = CONTRAST_PRINT;
    return this;
  }

  /**
   * Get CONTRAST_PRINT
   *
   * @return CONTRAST_PRINT
   */
  @javax.annotation.Nonnull
  public Integer getCONTRASTPRINT() {
    return CONTRAST_PRINT;
  }

  public void setCONTRASTPRINT(@javax.annotation.Nonnull Integer CONTRAST_PRINT) {
    this.CONTRAST_PRINT = CONTRAST_PRINT;
  }

  public MRZTestQuality DOC_FORMAT(@javax.annotation.Nonnull Integer DOC_FORMAT) {
    this.DOC_FORMAT = DOC_FORMAT;
    return this;
  }

  /**
   * Get DOC_FORMAT
   *
   * @return DOC_FORMAT
   */
  @javax.annotation.Nonnull
  public Integer getDOCFORMAT() {
    return DOC_FORMAT;
  }

  public void setDOCFORMAT(@javax.annotation.Nonnull Integer DOC_FORMAT) {
    this.DOC_FORMAT = DOC_FORMAT;
  }

  public MRZTestQuality MRZ_FORMAT(@javax.annotation.Nonnull Integer MRZ_FORMAT) {
    this.MRZ_FORMAT = MRZ_FORMAT;
    return this;
  }

  /**
   * Get MRZ_FORMAT
   *
   * @return MRZ_FORMAT
   */
  @javax.annotation.Nonnull
  public Integer getMRZFORMAT() {
    return MRZ_FORMAT;
  }

  public void setMRZFORMAT(@javax.annotation.Nonnull Integer MRZ_FORMAT) {
    this.MRZ_FORMAT = MRZ_FORMAT;
  }

  public MRZTestQuality PRINT_POSITION(@javax.annotation.Nonnull Integer PRINT_POSITION) {
    this.PRINT_POSITION = PRINT_POSITION;
    return this;
  }

  /**
   * Get PRINT_POSITION
   *
   * @return PRINT_POSITION
   */
  @javax.annotation.Nonnull
  public Integer getPRINTPOSITION() {
    return PRINT_POSITION;
  }

  public void setPRINTPOSITION(@javax.annotation.Nonnull Integer PRINT_POSITION) {
    this.PRINT_POSITION = PRINT_POSITION;
  }

  public MRZTestQuality STAIN_MRZ(@javax.annotation.Nonnull Integer STAIN_MRZ) {
    this.STAIN_MRZ = STAIN_MRZ;
    return this;
  }

  /**
   * Get STAIN_MRZ
   *
   * @return STAIN_MRZ
   */
  @javax.annotation.Nonnull
  public Integer getSTAINMRZ() {
    return STAIN_MRZ;
  }

  public void setSTAINMRZ(@javax.annotation.Nonnull Integer STAIN_MRZ) {
    this.STAIN_MRZ = STAIN_MRZ;
  }

  public MRZTestQuality SYMBOLS_PARAM(@javax.annotation.Nonnull Integer SYMBOLS_PARAM) {
    this.SYMBOLS_PARAM = SYMBOLS_PARAM;
    return this;
  }

  /**
   * Get SYMBOLS_PARAM
   *
   * @return SYMBOLS_PARAM
   */
  @javax.annotation.Nonnull
  public Integer getSYMBOLSPARAM() {
    return SYMBOLS_PARAM;
  }

  public void setSYMBOLSPARAM(@javax.annotation.Nonnull Integer SYMBOLS_PARAM) {
    this.SYMBOLS_PARAM = SYMBOLS_PARAM;
  }

  public MRZTestQuality strCount(@javax.annotation.Nonnull Integer strCount) {
    this.strCount = strCount;
    return this;
  }

  /**
   * Get strCount
   *
   * @return strCount
   */
  @javax.annotation.Nonnull
  public Integer getStrCount() {
    return strCount;
  }

  public void setStrCount(@javax.annotation.Nonnull Integer strCount) {
    this.strCount = strCount;
  }

  public MRZTestQuality strings(@javax.annotation.Nonnull List<StringItem> strings) {
    this.strings = strings;
    return this;
  }

  public MRZTestQuality addStringsItem(StringItem stringsItem) {
    if (this.strings == null) {
      this.strings = new ArrayList<>();
    }
    this.strings.add(stringsItem);
    return this;
  }

  /**
   * Get strings
   *
   * @return strings
   */
  @javax.annotation.Nonnull
  public List<StringItem> getStrings() {
    return strings;
  }

  public void setStrings(@javax.annotation.Nonnull List<StringItem> strings) {
    this.strings = strings;
  }

  public MRZTestQuality TEXTUAL_FILLING(@javax.annotation.Nonnull Integer TEXTUAL_FILLING) {
    this.TEXTUAL_FILLING = TEXTUAL_FILLING;
    return this;
  }

  /**
   * Get TEXTUAL_FILLING
   *
   * @return TEXTUAL_FILLING
   */
  @javax.annotation.Nonnull
  public Integer getTEXTUALFILLING() {
    return TEXTUAL_FILLING;
  }

  public void setTEXTUALFILLING(@javax.annotation.Nonnull Integer TEXTUAL_FILLING) {
    this.TEXTUAL_FILLING = TEXTUAL_FILLING;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MRZTestQuality mrZTestQuality = (MRZTestQuality) o;
    return Objects.equals(this.CHECK_SUMS, mrZTestQuality.CHECK_SUMS)
        && Objects.equals(this.CONTRAST_PRINT, mrZTestQuality.CONTRAST_PRINT)
        && Objects.equals(this.DOC_FORMAT, mrZTestQuality.DOC_FORMAT)
        && Objects.equals(this.MRZ_FORMAT, mrZTestQuality.MRZ_FORMAT)
        && Objects.equals(this.PRINT_POSITION, mrZTestQuality.PRINT_POSITION)
        && Objects.equals(this.STAIN_MRZ, mrZTestQuality.STAIN_MRZ)
        && Objects.equals(this.SYMBOLS_PARAM, mrZTestQuality.SYMBOLS_PARAM)
        && Objects.equals(this.strCount, mrZTestQuality.strCount)
        && Objects.equals(this.strings, mrZTestQuality.strings)
        && Objects.equals(this.TEXTUAL_FILLING, mrZTestQuality.TEXTUAL_FILLING);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        CHECK_SUMS,
        CONTRAST_PRINT,
        DOC_FORMAT,
        MRZ_FORMAT,
        PRINT_POSITION,
        STAIN_MRZ,
        SYMBOLS_PARAM,
        strCount,
        strings,
        TEXTUAL_FILLING);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MRZTestQuality {\n");
    sb.append("    CHECK_SUMS: ").append(toIndentedString(CHECK_SUMS)).append("\n");
    sb.append("    CONTRAST_PRINT: ").append(toIndentedString(CONTRAST_PRINT)).append("\n");
    sb.append("    DOC_FORMAT: ").append(toIndentedString(DOC_FORMAT)).append("\n");
    sb.append("    MRZ_FORMAT: ").append(toIndentedString(MRZ_FORMAT)).append("\n");
    sb.append("    PRINT_POSITION: ").append(toIndentedString(PRINT_POSITION)).append("\n");
    sb.append("    STAIN_MRZ: ").append(toIndentedString(STAIN_MRZ)).append("\n");
    sb.append("    SYMBOLS_PARAM: ").append(toIndentedString(SYMBOLS_PARAM)).append("\n");
    sb.append("    strCount: ").append(toIndentedString(strCount)).append("\n");
    sb.append("    strings: ").append(toIndentedString(strings)).append("\n");
    sb.append("    TEXTUAL_FILLING: ").append(toIndentedString(TEXTUAL_FILLING)).append("\n");
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
    openapiFields.add("CHECK_SUMS");
    openapiFields.add("CONTRAST_PRINT");
    openapiFields.add("DOC_FORMAT");
    openapiFields.add("MRZ_FORMAT");
    openapiFields.add("PRINT_POSITION");
    openapiFields.add("STAIN_MRZ");
    openapiFields.add("SYMBOLS_PARAM");
    openapiFields.add("StrCount");
    openapiFields.add("Strings");
    openapiFields.add("TEXTUAL_FILLING");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("CHECK_SUMS");
    openapiRequiredFields.add("CONTRAST_PRINT");
    openapiRequiredFields.add("DOC_FORMAT");
    openapiRequiredFields.add("MRZ_FORMAT");
    openapiRequiredFields.add("PRINT_POSITION");
    openapiRequiredFields.add("STAIN_MRZ");
    openapiRequiredFields.add("SYMBOLS_PARAM");
    openapiRequiredFields.add("StrCount");
    openapiRequiredFields.add("Strings");
    openapiRequiredFields.add("TEXTUAL_FILLING");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MRZTestQuality
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!MRZTestQuality.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in MRZTestQuality is not found in the empty JSON string",
                MRZTestQuality.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!MRZTestQuality.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `MRZTestQuality` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : MRZTestQuality.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // ensure the json data is an array
    if (!jsonObj.get("Strings").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `Strings` to be an array in the JSON string but got `%s`",
              jsonObj.get("Strings").toString()));
    }

    JsonArray jsonArraystrings = jsonObj.getAsJsonArray("Strings");
    // validate the required field `Strings` (array)
    for (int i = 0; i < jsonArraystrings.size(); i++) {
      StringItem.validateJsonElement(jsonArraystrings.get(i));
    }
    ;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!MRZTestQuality.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'MRZTestQuality' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<MRZTestQuality> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(MRZTestQuality.class));

      return (TypeAdapter<T>)
          new TypeAdapter<MRZTestQuality>() {
            @Override
            public void write(JsonWriter out, MRZTestQuality value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public MRZTestQuality read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of MRZTestQuality given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MRZTestQuality
   * @throws IOException if the JSON string is invalid with respect to MRZTestQuality
   */
  public static MRZTestQuality fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MRZTestQuality.class);
  }

  /**
   * Convert an instance of MRZTestQuality to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
