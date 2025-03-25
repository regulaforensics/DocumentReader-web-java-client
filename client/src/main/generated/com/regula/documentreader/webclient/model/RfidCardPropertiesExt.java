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
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Structure is used to store extended information about the characteristics of the RFID-chip
 * located in the scope of the reader
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class RfidCardPropertiesExt {
  public static final String SERIALIZED_NAME_RF_I_D_TYPE = "RFID_Type";

  @SerializedName(SERIALIZED_NAME_RF_I_D_TYPE)
  @javax.annotation.Nonnull
  private RfidType rfIDType;

  public static final String SERIALIZED_NAME_BAUDRATE1 = "Baudrate1";

  @SerializedName(SERIALIZED_NAME_BAUDRATE1)
  @javax.annotation.Nonnull
  private String baudrate1;

  public static final String SERIALIZED_NAME_BAUDRATE2 = "Baudrate2";

  @SerializedName(SERIALIZED_NAME_BAUDRATE2)
  @javax.annotation.Nonnull
  private String baudrate2;

  public static final String SERIALIZED_NAME_SUPPORT4 = "Support_4";

  @SerializedName(SERIALIZED_NAME_SUPPORT4)
  @javax.annotation.Nonnull
  private Boolean support4;

  public static final String SERIALIZED_NAME_CHIP_TYPE_A = "ChipType_A";

  @SerializedName(SERIALIZED_NAME_CHIP_TYPE_A)
  @javax.annotation.Nonnull
  private RfidAChip chipTypeA;

  public static final String SERIALIZED_NAME_SUPPORT_MIFARE = "Support_Mifare";

  @SerializedName(SERIALIZED_NAME_SUPPORT_MIFARE)
  @javax.annotation.Nonnull
  private Boolean supportMifare;

  public static final String SERIALIZED_NAME_MIFARE_MEMORY = "MifareMemory";

  @SerializedName(SERIALIZED_NAME_MIFARE_MEMORY)
  @javax.annotation.Nonnull
  private BigDecimal mifareMemory;

  public static final String SERIALIZED_NAME_U_I_D = "UID";

  @SerializedName(SERIALIZED_NAME_U_I_D)
  @javax.annotation.Nonnull
  private String UID;

  public static final String SERIALIZED_NAME_A_T_Q_A = "ATQ_A";

  @SerializedName(SERIALIZED_NAME_A_T_Q_A)
  @javax.annotation.Nullable
  private Object ATQ_A = null;

  public static final String SERIALIZED_NAME_S_A_K = "SAK";

  @SerializedName(SERIALIZED_NAME_S_A_K)
  @javax.annotation.Nullable
  private Object SAK = null;

  public static final String SERIALIZED_NAME_A_T_Q_B = "ATQ_B";

  @SerializedName(SERIALIZED_NAME_A_T_Q_B)
  @javax.annotation.Nullable
  private Object ATQ_B = null;

  public static final String SERIALIZED_NAME_BIT_RATE_S = "BitRateS";

  @SerializedName(SERIALIZED_NAME_BIT_RATE_S)
  @javax.annotation.Nonnull
  private RfidBaudRate bitRateS;

  public static final String SERIALIZED_NAME_BIT_RATE_R = "BitRateR";

  @SerializedName(SERIALIZED_NAME_BIT_RATE_R)
  @javax.annotation.Nonnull
  private RfidBaudRate bitRateR;

  public static final String SERIALIZED_NAME_A_T_R = "ATR";

  @SerializedName(SERIALIZED_NAME_A_T_R)
  @javax.annotation.Nonnull
  private String ATR;

  public RfidCardPropertiesExt() {}

  public RfidCardPropertiesExt rfIDType(@javax.annotation.Nonnull RfidType rfIDType) {
    this.rfIDType = rfIDType;
    return this;
  }

  /**
   * Get rfIDType
   *
   * @return rfIDType
   */
  @javax.annotation.Nonnull
  public RfidType getRfIDType() {
    return rfIDType;
  }

  public void setRfIDType(@javax.annotation.Nonnull RfidType rfIDType) {
    this.rfIDType = rfIDType;
  }

  public RfidCardPropertiesExt baudrate1(@javax.annotation.Nonnull String baudrate1) {
    this.baudrate1 = baudrate1;
    return this;
  }

  /**
   * Numeric Baudrate1 value in hexadecimal format (e.g. 0x0000000F)
   *
   * @return baudrate1
   */
  @javax.annotation.Nonnull
  public String getBaudrate1() {
    return baudrate1;
  }

  public void setBaudrate1(@javax.annotation.Nonnull String baudrate1) {
    this.baudrate1 = baudrate1;
  }

  public RfidCardPropertiesExt baudrate2(@javax.annotation.Nonnull String baudrate2) {
    this.baudrate2 = baudrate2;
    return this;
  }

  /**
   * Numeric Baudrate2 value in hexadecimal format
   *
   * @return baudrate2
   */
  @javax.annotation.Nonnull
  public String getBaudrate2() {
    return baudrate2;
  }

  public void setBaudrate2(@javax.annotation.Nonnull String baudrate2) {
    this.baudrate2 = baudrate2;
  }

  public RfidCardPropertiesExt support4(@javax.annotation.Nonnull Boolean support4) {
    this.support4 = support4;
    return this;
  }

  /**
   * Boolean Support_4 value
   *
   * @return support4
   */
  @javax.annotation.Nonnull
  public Boolean getSupport4() {
    return support4;
  }

  public void setSupport4(@javax.annotation.Nonnull Boolean support4) {
    this.support4 = support4;
  }

  public RfidCardPropertiesExt chipTypeA(@javax.annotation.Nonnull RfidAChip chipTypeA) {
    this.chipTypeA = chipTypeA;
    return this;
  }

  /**
   * Get chipTypeA
   *
   * @return chipTypeA
   */
  @javax.annotation.Nonnull
  public RfidAChip getChipTypeA() {
    return chipTypeA;
  }

  public void setChipTypeA(@javax.annotation.Nonnull RfidAChip chipTypeA) {
    this.chipTypeA = chipTypeA;
  }

  public RfidCardPropertiesExt supportMifare(@javax.annotation.Nonnull Boolean supportMifare) {
    this.supportMifare = supportMifare;
    return this;
  }

  /**
   * Sign of support for ISO/IEC 14443-3 data exchange protocol
   *
   * @return supportMifare
   */
  @javax.annotation.Nonnull
  public Boolean getSupportMifare() {
    return supportMifare;
  }

  public void setSupportMifare(@javax.annotation.Nonnull Boolean supportMifare) {
    this.supportMifare = supportMifare;
  }

  public RfidCardPropertiesExt mifareMemory(@javax.annotation.Nonnull BigDecimal mifareMemory) {
    this.mifareMemory = mifareMemory;
    return this;
  }

  /**
   * Amount of operational memory MIFARE® of the chip, kilobytes
   *
   * @return mifareMemory
   */
  @javax.annotation.Nonnull
  public BigDecimal getMifareMemory() {
    return mifareMemory;
  }

  public void setMifareMemory(@javax.annotation.Nonnull BigDecimal mifareMemory) {
    this.mifareMemory = mifareMemory;
  }

  public RfidCardPropertiesExt UID(@javax.annotation.Nonnull String UID) {
    this.UID = UID;
    return this;
  }

  /**
   * UID contents in text format. Each byte is represented by its hexadecimal value. The individual
   * bytes are separated by spaces (e.g. F9 4F 41 60)
   *
   * @return UID
   */
  @javax.annotation.Nonnull
  public String getUID() {
    return UID;
  }

  public void setUID(@javax.annotation.Nonnull String UID) {
    this.UID = UID;
  }

  public RfidCardPropertiesExt ATQ_A(@javax.annotation.Nullable Object ATQ_A) {
    this.ATQ_A = ATQ_A;
    return this;
  }

  /**
   * Reply of the «A» type chip to «REQA» command of ISO/IEC 14443-3 protocol (Answer To Request,
   * Type A – ATQA) – for the internal use by the main control library
   *
   * @return ATQ_A
   */
  @javax.annotation.Nullable
  public Object getATQA() {
    return ATQ_A;
  }

  public void setATQA(@javax.annotation.Nullable Object ATQ_A) {
    this.ATQ_A = ATQ_A;
  }

  public RfidCardPropertiesExt SAK(@javax.annotation.Nullable Object SAK) {
    this.SAK = SAK;
    return this;
  }

  /**
   * Response of type-A RFID-chip to SELECT command of ISO/IEC 14443-3 protocol (Select Acknowledge,
   * SAK).
   *
   * @return SAK
   */
  @javax.annotation.Nullable
  public Object getSAK() {
    return SAK;
  }

  public void setSAK(@javax.annotation.Nullable Object SAK) {
    this.SAK = SAK;
  }

  public RfidCardPropertiesExt ATQ_B(@javax.annotation.Nullable Object ATQ_B) {
    this.ATQ_B = ATQ_B;
    return this;
  }

  /**
   * ATQ_B contents in text format. Each byte is represented by its hexadecimal value. The
   * individual bytes are separated by spaces (e.g. 50 F9 4F 41 60 00 00 00 00 77 81 81)
   *
   * @return ATQ_B
   */
  @javax.annotation.Nullable
  public Object getATQB() {
    return ATQ_B;
  }

  public void setATQB(@javax.annotation.Nullable Object ATQ_B) {
    this.ATQ_B = ATQ_B;
  }

  public RfidCardPropertiesExt bitRateS(@javax.annotation.Nonnull RfidBaudRate bitRateS) {
    this.bitRateS = bitRateS;
    return this;
  }

  /**
   * Get bitRateS
   *
   * @return bitRateS
   */
  @javax.annotation.Nonnull
  public RfidBaudRate getBitRateS() {
    return bitRateS;
  }

  public void setBitRateS(@javax.annotation.Nonnull RfidBaudRate bitRateS) {
    this.bitRateS = bitRateS;
  }

  public RfidCardPropertiesExt bitRateR(@javax.annotation.Nonnull RfidBaudRate bitRateR) {
    this.bitRateR = bitRateR;
    return this;
  }

  /**
   * Get bitRateR
   *
   * @return bitRateR
   */
  @javax.annotation.Nonnull
  public RfidBaudRate getBitRateR() {
    return bitRateR;
  }

  public void setBitRateR(@javax.annotation.Nonnull RfidBaudRate bitRateR) {
    this.bitRateR = bitRateR;
  }

  public RfidCardPropertiesExt ATR(@javax.annotation.Nonnull String ATR) {
    this.ATR = ATR;
    return this;
  }

  /**
   * ATR-string of RFID-chip
   *
   * @return ATR
   */
  @javax.annotation.Nonnull
  public String getATR() {
    return ATR;
  }

  public void setATR(@javax.annotation.Nonnull String ATR) {
    this.ATR = ATR;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RfidCardPropertiesExt rfidCardPropertiesExt = (RfidCardPropertiesExt) o;
    return Objects.equals(this.rfIDType, rfidCardPropertiesExt.rfIDType)
        && Objects.equals(this.baudrate1, rfidCardPropertiesExt.baudrate1)
        && Objects.equals(this.baudrate2, rfidCardPropertiesExt.baudrate2)
        && Objects.equals(this.support4, rfidCardPropertiesExt.support4)
        && Objects.equals(this.chipTypeA, rfidCardPropertiesExt.chipTypeA)
        && Objects.equals(this.supportMifare, rfidCardPropertiesExt.supportMifare)
        && Objects.equals(this.mifareMemory, rfidCardPropertiesExt.mifareMemory)
        && Objects.equals(this.UID, rfidCardPropertiesExt.UID)
        && Objects.equals(this.ATQ_A, rfidCardPropertiesExt.ATQ_A)
        && Objects.equals(this.SAK, rfidCardPropertiesExt.SAK)
        && Objects.equals(this.ATQ_B, rfidCardPropertiesExt.ATQ_B)
        && Objects.equals(this.bitRateS, rfidCardPropertiesExt.bitRateS)
        && Objects.equals(this.bitRateR, rfidCardPropertiesExt.bitRateR)
        && Objects.equals(this.ATR, rfidCardPropertiesExt.ATR);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        rfIDType,
        baudrate1,
        baudrate2,
        support4,
        chipTypeA,
        supportMifare,
        mifareMemory,
        UID,
        ATQ_A,
        SAK,
        ATQ_B,
        bitRateS,
        bitRateR,
        ATR);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RfidCardPropertiesExt {\n");
    sb.append("    rfIDType: ").append(toIndentedString(rfIDType)).append("\n");
    sb.append("    baudrate1: ").append(toIndentedString(baudrate1)).append("\n");
    sb.append("    baudrate2: ").append(toIndentedString(baudrate2)).append("\n");
    sb.append("    support4: ").append(toIndentedString(support4)).append("\n");
    sb.append("    chipTypeA: ").append(toIndentedString(chipTypeA)).append("\n");
    sb.append("    supportMifare: ").append(toIndentedString(supportMifare)).append("\n");
    sb.append("    mifareMemory: ").append(toIndentedString(mifareMemory)).append("\n");
    sb.append("    UID: ").append(toIndentedString(UID)).append("\n");
    sb.append("    ATQ_A: ").append(toIndentedString(ATQ_A)).append("\n");
    sb.append("    SAK: ").append(toIndentedString(SAK)).append("\n");
    sb.append("    ATQ_B: ").append(toIndentedString(ATQ_B)).append("\n");
    sb.append("    bitRateS: ").append(toIndentedString(bitRateS)).append("\n");
    sb.append("    bitRateR: ").append(toIndentedString(bitRateR)).append("\n");
    sb.append("    ATR: ").append(toIndentedString(ATR)).append("\n");
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
    openapiFields.add("RFID_Type");
    openapiFields.add("Baudrate1");
    openapiFields.add("Baudrate2");
    openapiFields.add("Support_4");
    openapiFields.add("ChipType_A");
    openapiFields.add("Support_Mifare");
    openapiFields.add("MifareMemory");
    openapiFields.add("UID");
    openapiFields.add("ATQ_A");
    openapiFields.add("SAK");
    openapiFields.add("ATQ_B");
    openapiFields.add("BitRateS");
    openapiFields.add("BitRateR");
    openapiFields.add("ATR");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("RFID_Type");
    openapiRequiredFields.add("Baudrate1");
    openapiRequiredFields.add("Baudrate2");
    openapiRequiredFields.add("Support_4");
    openapiRequiredFields.add("ChipType_A");
    openapiRequiredFields.add("Support_Mifare");
    openapiRequiredFields.add("MifareMemory");
    openapiRequiredFields.add("UID");
    openapiRequiredFields.add("ATQ_A");
    openapiRequiredFields.add("SAK");
    openapiRequiredFields.add("ATQ_B");
    openapiRequiredFields.add("BitRateS");
    openapiRequiredFields.add("BitRateR");
    openapiRequiredFields.add("ATR");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RfidCardPropertiesExt
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!RfidCardPropertiesExt.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in RfidCardPropertiesExt is not found in the empty JSON string",
                RfidCardPropertiesExt.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!RfidCardPropertiesExt.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `RfidCardPropertiesExt` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : RfidCardPropertiesExt.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the required field `RFID_Type`
    RfidType.validateJsonElement(jsonObj.get("RFID_Type"));
    if (!jsonObj.get("Baudrate1").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `Baudrate1` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("Baudrate1").toString()));
    }
    if (!jsonObj.get("Baudrate2").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `Baudrate2` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("Baudrate2").toString()));
    }
    // validate the required field `ChipType_A`
    RfidAChip.validateJsonElement(jsonObj.get("ChipType_A"));
    if (!jsonObj.get("UID").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `UID` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("UID").toString()));
    }
    // validate the required field `BitRateS`
    RfidBaudRate.validateJsonElement(jsonObj.get("BitRateS"));
    // validate the required field `BitRateR`
    RfidBaudRate.validateJsonElement(jsonObj.get("BitRateR"));
    if (!jsonObj.get("ATR").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `ATR` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("ATR").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!RfidCardPropertiesExt.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'RfidCardPropertiesExt' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<RfidCardPropertiesExt> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(RfidCardPropertiesExt.class));

      return (TypeAdapter<T>)
          new TypeAdapter<RfidCardPropertiesExt>() {
            @Override
            public void write(JsonWriter out, RfidCardPropertiesExt value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public RfidCardPropertiesExt read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of RfidCardPropertiesExt given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RfidCardPropertiesExt
   * @throws IOException if the JSON string is invalid with respect to RfidCardPropertiesExt
   */
  public static RfidCardPropertiesExt fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RfidCardPropertiesExt.class);
  }

  /**
   * Convert an instance of RfidCardPropertiesExt to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
