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

/** Contains information about one document type candidate */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0")
public class OneCandidate {
  public static final String SERIALIZED_NAME_DOCUMENT_NAME = "DocumentName";

  @SerializedName(SERIALIZED_NAME_DOCUMENT_NAME)
  @javax.annotation.Nonnull
  private String documentName;

  public static final String SERIALIZED_NAME_I_D = "ID";

  @SerializedName(SERIALIZED_NAME_I_D)
  @javax.annotation.Nonnull
  private Integer ID;

  public static final String SERIALIZED_NAME_P = "P";

  @SerializedName(SERIALIZED_NAME_P)
  @javax.annotation.Nonnull
  private BigDecimal P;

  public static final String SERIALIZED_NAME_ROTATED180 = "Rotated180";

  @SerializedName(SERIALIZED_NAME_ROTATED180)
  @javax.annotation.Nonnull
  private Integer rotated180;

  public static final String SERIALIZED_NAME_RF_I_D_PRESENCE = "RFID_Presence";

  @SerializedName(SERIALIZED_NAME_RF_I_D_PRESENCE)
  @javax.annotation.Nonnull
  private RfidLocation rfIDPresence;

  public static final String SERIALIZED_NAME_FD_S_I_D_LIST = "FDSIDList";

  @SerializedName(SERIALIZED_NAME_FD_S_I_D_LIST)
  @javax.annotation.Nonnull
  private FDSIDList fdSIDList;

  public static final String SERIALIZED_NAME_NECESSARY_LIGHTS = "NecessaryLights";

  @SerializedName(SERIALIZED_NAME_NECESSARY_LIGHTS)
  @javax.annotation.Nonnull
  private Integer necessaryLights;

  public static final String SERIALIZED_NAME_CHECK_AUTHENTICITY = "CheckAuthenticity";

  @SerializedName(SERIALIZED_NAME_CHECK_AUTHENTICITY)
  @javax.annotation.Nonnull
  private Integer checkAuthenticity;

  public static final String SERIALIZED_NAME_UV_EXP = "UVExp";

  @SerializedName(SERIALIZED_NAME_UV_EXP)
  @javax.annotation.Nonnull
  private Integer uvExp;

  public static final String SERIALIZED_NAME_AUTHENTICITY_NECESSARY_LIGHTS =
      "AuthenticityNecessaryLights";

  @SerializedName(SERIALIZED_NAME_AUTHENTICITY_NECESSARY_LIGHTS)
  @javax.annotation.Nonnull
  private Integer authenticityNecessaryLights;

  public static final String SERIALIZED_NAME_OV_I_EXP = "OVIExp";

  @SerializedName(SERIALIZED_NAME_OV_I_EXP)
  @javax.annotation.Nonnull
  private BigDecimal ovIExp;

  public static final String SERIALIZED_NAME_ROTATION_ANGLE = "RotationAngle";

  @SerializedName(SERIALIZED_NAME_ROTATION_ANGLE)
  @javax.annotation.Nullable
  private Integer rotationAngle;

  public OneCandidate() {}

  public OneCandidate documentName(@javax.annotation.Nonnull String documentName) {
    this.documentName = documentName;
    return this;
  }

  /**
   * Document name
   *
   * @return documentName
   */
  @javax.annotation.Nonnull
  public String getDocumentName() {
    return documentName;
  }

  public void setDocumentName(@javax.annotation.Nonnull String documentName) {
    this.documentName = documentName;
  }

  public OneCandidate ID(@javax.annotation.Nonnull Integer ID) {
    this.ID = ID;
    return this;
  }

  /**
   * Unique document type template identifier (Regula&#39;s internal numeric code)
   *
   * @return ID
   */
  @javax.annotation.Nonnull
  public Integer getID() {
    return ID;
  }

  public void setID(@javax.annotation.Nonnull Integer ID) {
    this.ID = ID;
  }

  public OneCandidate P(@javax.annotation.Nonnull BigDecimal P) {
    this.P = P;
    return this;
  }

  /**
   * A measure of the likelihood of correct recognition in the analysis of this type of document
   * minimum: 0 maximum: 1
   *
   * @return P
   */
  @javax.annotation.Nonnull
  public BigDecimal getP() {
    return P;
  }

  public void setP(@javax.annotation.Nonnull BigDecimal P) {
    this.P = P;
  }

  public OneCandidate rotated180(@javax.annotation.Nonnull Integer rotated180) {
    this.rotated180 = rotated180;
    return this;
  }

  /**
   * true if the document of the given type is rotated by 180 degrees
   *
   * @return rotated180
   */
  @javax.annotation.Nonnull
  public Integer getRotated180() {
    return rotated180;
  }

  public void setRotated180(@javax.annotation.Nonnull Integer rotated180) {
    this.rotated180 = rotated180;
  }

  public OneCandidate rfIDPresence(@javax.annotation.Nonnull RfidLocation rfIDPresence) {
    this.rfIDPresence = rfIDPresence;
    return this;
  }

  /**
   * Get rfIDPresence
   *
   * @return rfIDPresence
   */
  @javax.annotation.Nonnull
  public RfidLocation getRfIDPresence() {
    return rfIDPresence;
  }

  public void setRfIDPresence(@javax.annotation.Nonnull RfidLocation rfIDPresence) {
    this.rfIDPresence = rfIDPresence;
  }

  public OneCandidate fdSIDList(@javax.annotation.Nonnull FDSIDList fdSIDList) {
    this.fdSIDList = fdSIDList;
    return this;
  }

  /**
   * Get fdSIDList
   *
   * @return fdSIDList
   */
  @javax.annotation.Nonnull
  public FDSIDList getFdSIDList() {
    return fdSIDList;
  }

  public void setFdSIDList(@javax.annotation.Nonnull FDSIDList fdSIDList) {
    this.fdSIDList = fdSIDList;
  }

  public OneCandidate necessaryLights(@javax.annotation.Nonnull Integer necessaryLights) {
    this.necessaryLights = necessaryLights;
    return this;
  }

  /**
   * Combination of lighting scheme identifiers (Light enum) required to conduct OCR for this type
   * of document
   *
   * @return necessaryLights
   */
  @javax.annotation.Nonnull
  public Integer getNecessaryLights() {
    return necessaryLights;
  }

  public void setNecessaryLights(@javax.annotation.Nonnull Integer necessaryLights) {
    this.necessaryLights = necessaryLights;
  }

  public OneCandidate checkAuthenticity(@javax.annotation.Nonnull Integer checkAuthenticity) {
    this.checkAuthenticity = checkAuthenticity;
    return this;
  }

  /**
   * Set of authentication options provided for this type of document (combination of Authenticity
   * enum)
   *
   * @return checkAuthenticity
   */
  @javax.annotation.Nonnull
  public Integer getCheckAuthenticity() {
    return checkAuthenticity;
  }

  public void setCheckAuthenticity(@javax.annotation.Nonnull Integer checkAuthenticity) {
    this.checkAuthenticity = checkAuthenticity;
  }

  public OneCandidate uvExp(@javax.annotation.Nonnull Integer uvExp) {
    this.uvExp = uvExp;
    return this;
  }

  /**
   * The required exposure value of the camera when receiving images of a document of this type for
   * a UV lighting scheme
   *
   * @return uvExp
   */
  @javax.annotation.Nonnull
  public Integer getUvExp() {
    return uvExp;
  }

  public void setUvExp(@javax.annotation.Nonnull Integer uvExp) {
    this.uvExp = uvExp;
  }

  public OneCandidate authenticityNecessaryLights(
      @javax.annotation.Nonnull Integer authenticityNecessaryLights) {
    this.authenticityNecessaryLights = authenticityNecessaryLights;
    return this;
  }

  /**
   * Combination of lighting scheme identifiers (combination of Light enum) needed to perform all
   * authenticity checks specified in CheckAuthenticity
   *
   * @return authenticityNecessaryLights
   */
  @javax.annotation.Nonnull
  public Integer getAuthenticityNecessaryLights() {
    return authenticityNecessaryLights;
  }

  public void setAuthenticityNecessaryLights(
      @javax.annotation.Nonnull Integer authenticityNecessaryLights) {
    this.authenticityNecessaryLights = authenticityNecessaryLights;
  }

  public OneCandidate ovIExp(@javax.annotation.Nonnull BigDecimal ovIExp) {
    this.ovIExp = ovIExp;
    return this;
  }

  /**
   * Camera exposure value necessary when obtaining document images of the given type for AXIAL
   * lighting scheme
   *
   * @return ovIExp
   */
  @javax.annotation.Nonnull
  public BigDecimal getOvIExp() {
    return ovIExp;
  }

  public void setOvIExp(@javax.annotation.Nonnull BigDecimal ovIExp) {
    this.ovIExp = ovIExp;
  }

  public OneCandidate rotationAngle(@javax.annotation.Nullable Integer rotationAngle) {
    this.rotationAngle = rotationAngle;
    return this;
  }

  /**
   * Get rotationAngle
   *
   * @return rotationAngle
   */
  @javax.annotation.Nullable
  public Integer getRotationAngle() {
    return rotationAngle;
  }

  public void setRotationAngle(@javax.annotation.Nullable Integer rotationAngle) {
    this.rotationAngle = rotationAngle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OneCandidate oneCandidate = (OneCandidate) o;
    return Objects.equals(this.documentName, oneCandidate.documentName)
        && Objects.equals(this.ID, oneCandidate.ID)
        && Objects.equals(this.P, oneCandidate.P)
        && Objects.equals(this.rotated180, oneCandidate.rotated180)
        && Objects.equals(this.rfIDPresence, oneCandidate.rfIDPresence)
        && Objects.equals(this.fdSIDList, oneCandidate.fdSIDList)
        && Objects.equals(this.necessaryLights, oneCandidate.necessaryLights)
        && Objects.equals(this.checkAuthenticity, oneCandidate.checkAuthenticity)
        && Objects.equals(this.uvExp, oneCandidate.uvExp)
        && Objects.equals(
            this.authenticityNecessaryLights, oneCandidate.authenticityNecessaryLights)
        && Objects.equals(this.ovIExp, oneCandidate.ovIExp)
        && Objects.equals(this.rotationAngle, oneCandidate.rotationAngle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        documentName,
        ID,
        P,
        rotated180,
        rfIDPresence,
        fdSIDList,
        necessaryLights,
        checkAuthenticity,
        uvExp,
        authenticityNecessaryLights,
        ovIExp,
        rotationAngle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OneCandidate {\n");
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    P: ").append(toIndentedString(P)).append("\n");
    sb.append("    rotated180: ").append(toIndentedString(rotated180)).append("\n");
    sb.append("    rfIDPresence: ").append(toIndentedString(rfIDPresence)).append("\n");
    sb.append("    fdSIDList: ").append(toIndentedString(fdSIDList)).append("\n");
    sb.append("    necessaryLights: ").append(toIndentedString(necessaryLights)).append("\n");
    sb.append("    checkAuthenticity: ").append(toIndentedString(checkAuthenticity)).append("\n");
    sb.append("    uvExp: ").append(toIndentedString(uvExp)).append("\n");
    sb.append("    authenticityNecessaryLights: ")
        .append(toIndentedString(authenticityNecessaryLights))
        .append("\n");
    sb.append("    ovIExp: ").append(toIndentedString(ovIExp)).append("\n");
    sb.append("    rotationAngle: ").append(toIndentedString(rotationAngle)).append("\n");
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
    openapiFields.add("DocumentName");
    openapiFields.add("ID");
    openapiFields.add("P");
    openapiFields.add("Rotated180");
    openapiFields.add("RFID_Presence");
    openapiFields.add("FDSIDList");
    openapiFields.add("NecessaryLights");
    openapiFields.add("CheckAuthenticity");
    openapiFields.add("UVExp");
    openapiFields.add("AuthenticityNecessaryLights");
    openapiFields.add("OVIExp");
    openapiFields.add("RotationAngle");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("DocumentName");
    openapiRequiredFields.add("ID");
    openapiRequiredFields.add("P");
    openapiRequiredFields.add("Rotated180");
    openapiRequiredFields.add("RFID_Presence");
    openapiRequiredFields.add("FDSIDList");
    openapiRequiredFields.add("NecessaryLights");
    openapiRequiredFields.add("CheckAuthenticity");
    openapiRequiredFields.add("UVExp");
    openapiRequiredFields.add("AuthenticityNecessaryLights");
    openapiRequiredFields.add("OVIExp");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OneCandidate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!OneCandidate.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in OneCandidate is not found in the empty JSON string",
                OneCandidate.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!OneCandidate.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `OneCandidate` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : OneCandidate.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if (!jsonObj.get("DocumentName").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `DocumentName` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("DocumentName").toString()));
    }
    // validate the required field `RFID_Presence`
    RfidLocation.validateJsonElement(jsonObj.get("RFID_Presence"));
    // validate the required field `FDSIDList`
    FDSIDList.validateJsonElement(jsonObj.get("FDSIDList"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!OneCandidate.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'OneCandidate' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<OneCandidate> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(OneCandidate.class));

      return (TypeAdapter<T>)
          new TypeAdapter<OneCandidate>() {
            @Override
            public void write(JsonWriter out, OneCandidate value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public OneCandidate read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of OneCandidate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OneCandidate
   * @throws IOException if the JSON string is invalid with respect to OneCandidate
   */
  public static OneCandidate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OneCandidate.class);
  }

  /**
   * Convert an instance of OneCandidate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
