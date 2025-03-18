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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** AuthParams */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class AuthParams {
  public static final String SERIALIZED_NAME_CHECK_LIVENESS = "checkLiveness";

  @SerializedName(SERIALIZED_NAME_CHECK_LIVENESS)
  @javax.annotation.Nullable
  private Boolean checkLiveness;

  public static final String SERIALIZED_NAME_LIVENESS_PARAMS = "livenessParams";

  @SerializedName(SERIALIZED_NAME_LIVENESS_PARAMS)
  @javax.annotation.Nullable
  private LivenessParams livenessParams;

  public static final String SERIALIZED_NAME_CHECK_U_V_LUMINISCENCE = "checkUVLuminiscence";

  @SerializedName(SERIALIZED_NAME_CHECK_U_V_LUMINISCENCE)
  @javax.annotation.Nullable
  private Boolean checkUVLuminiscence;

  public static final String SERIALIZED_NAME_CHECK_I_R_B900 = "checkIRB900";

  @SerializedName(SERIALIZED_NAME_CHECK_I_R_B900)
  @javax.annotation.Nullable
  private Boolean checkIRB900;

  public static final String SERIALIZED_NAME_CHECK_IMAGE_PATTERNS = "checkImagePatterns";

  @SerializedName(SERIALIZED_NAME_CHECK_IMAGE_PATTERNS)
  @javax.annotation.Nullable
  private Boolean checkImagePatterns;

  public static final String SERIALIZED_NAME_CHECK_FIBERS = "checkFibers";

  @SerializedName(SERIALIZED_NAME_CHECK_FIBERS)
  @javax.annotation.Nullable
  private Boolean checkFibers;

  public static final String SERIALIZED_NAME_CHECK_EXT_M_R_Z = "checkExtMRZ";

  @SerializedName(SERIALIZED_NAME_CHECK_EXT_M_R_Z)
  @javax.annotation.Nullable
  private Boolean checkExtMRZ;

  public static final String SERIALIZED_NAME_CHECK_EXT_O_C_R = "checkExtOCR";

  @SerializedName(SERIALIZED_NAME_CHECK_EXT_O_C_R)
  @javax.annotation.Nullable
  private Boolean checkExtOCR;

  public static final String SERIALIZED_NAME_CHECK_AXIAL = "checkAxial";

  @SerializedName(SERIALIZED_NAME_CHECK_AXIAL)
  @javax.annotation.Nullable
  private Boolean checkAxial;

  public static final String SERIALIZED_NAME_CHECK_BARCODE_FORMAT = "checkBarcodeFormat";

  @SerializedName(SERIALIZED_NAME_CHECK_BARCODE_FORMAT)
  @javax.annotation.Nullable
  private Boolean checkBarcodeFormat;

  public static final String SERIALIZED_NAME_CHECK_I_R_VISIBILITY = "checkIRVisibility";

  @SerializedName(SERIALIZED_NAME_CHECK_I_R_VISIBILITY)
  @javax.annotation.Nullable
  private Boolean checkIRVisibility;

  public static final String SERIALIZED_NAME_CHECK_I_P_I = "checkIPI";

  @SerializedName(SERIALIZED_NAME_CHECK_I_P_I)
  @javax.annotation.Nullable
  private Boolean checkIPI;

  public static final String SERIALIZED_NAME_CHECK_PHOTO_EMBEDDING = "checkPhotoEmbedding";

  @SerializedName(SERIALIZED_NAME_CHECK_PHOTO_EMBEDDING)
  @javax.annotation.Nullable
  private Boolean checkPhotoEmbedding;

  public static final String SERIALIZED_NAME_CHECK_PHOTO_COMPARISON = "checkPhotoComparison";

  @SerializedName(SERIALIZED_NAME_CHECK_PHOTO_COMPARISON)
  @javax.annotation.Nullable
  private Boolean checkPhotoComparison;

  public static final String SERIALIZED_NAME_CHECK_LETTER_SCREEN = "checkLetterScreen";

  @SerializedName(SERIALIZED_NAME_CHECK_LETTER_SCREEN)
  @javax.annotation.Nullable
  private Boolean checkLetterScreen;

  public static final String SERIALIZED_NAME_CHECK_SECURITY_TEXT = "checkSecurityText";

  @SerializedName(SERIALIZED_NAME_CHECK_SECURITY_TEXT)
  @javax.annotation.Nullable
  private Boolean checkSecurityText;

  public AuthParams() {}

  public AuthParams checkLiveness(@javax.annotation.Nullable Boolean checkLiveness) {
    this.checkLiveness = checkLiveness;
    return this;
  }

  /**
   * This parameter is used to enable document liveness check
   *
   * @return checkLiveness
   */
  @javax.annotation.Nullable
  public Boolean getCheckLiveness() {
    return checkLiveness;
  }

  public void setCheckLiveness(@javax.annotation.Nullable Boolean checkLiveness) {
    this.checkLiveness = checkLiveness;
  }

  public AuthParams livenessParams(@javax.annotation.Nullable LivenessParams livenessParams) {
    this.livenessParams = livenessParams;
    return this;
  }

  /**
   * Get livenessParams
   *
   * @return livenessParams
   */
  @javax.annotation.Nullable
  public LivenessParams getLivenessParams() {
    return livenessParams;
  }

  public void setLivenessParams(@javax.annotation.Nullable LivenessParams livenessParams) {
    this.livenessParams = livenessParams;
  }

  public AuthParams checkUVLuminiscence(@javax.annotation.Nullable Boolean checkUVLuminiscence) {
    this.checkUVLuminiscence = checkUVLuminiscence;
    return this;
  }

  /**
   * This parameter is used to enable Document luminescence check in UV light
   *
   * @return checkUVLuminiscence
   */
  @javax.annotation.Nullable
  public Boolean getCheckUVLuminiscence() {
    return checkUVLuminiscence;
  }

  public void setCheckUVLuminiscence(@javax.annotation.Nullable Boolean checkUVLuminiscence) {
    this.checkUVLuminiscence = checkUVLuminiscence;
  }

  public AuthParams checkIRB900(@javax.annotation.Nullable Boolean checkIRB900) {
    this.checkIRB900 = checkIRB900;
    return this;
  }

  /**
   * This parameter is used to enable B900 ink MRZ contrast check in IR light
   *
   * @return checkIRB900
   */
  @javax.annotation.Nullable
  public Boolean getCheckIRB900() {
    return checkIRB900;
  }

  public void setCheckIRB900(@javax.annotation.Nullable Boolean checkIRB900) {
    this.checkIRB900 = checkIRB900;
  }

  public AuthParams checkImagePatterns(@javax.annotation.Nullable Boolean checkImagePatterns) {
    this.checkImagePatterns = checkImagePatterns;
    return this;
  }

  /**
   * This parameter is used to enable Image patterns presence/absence check (position, shape, color)
   *
   * @return checkImagePatterns
   */
  @javax.annotation.Nullable
  public Boolean getCheckImagePatterns() {
    return checkImagePatterns;
  }

  public void setCheckImagePatterns(@javax.annotation.Nullable Boolean checkImagePatterns) {
    this.checkImagePatterns = checkImagePatterns;
  }

  public AuthParams checkFibers(@javax.annotation.Nullable Boolean checkFibers) {
    this.checkFibers = checkFibers;
    return this;
  }

  /**
   * This parameter is used to enable Fibers detection
   *
   * @return checkFibers
   */
  @javax.annotation.Nullable
  public Boolean getCheckFibers() {
    return checkFibers;
  }

  public void setCheckFibers(@javax.annotation.Nullable Boolean checkFibers) {
    this.checkFibers = checkFibers;
  }

  public AuthParams checkExtMRZ(@javax.annotation.Nullable Boolean checkExtMRZ) {
    this.checkExtMRZ = checkExtMRZ;
    return this;
  }

  /**
   * This parameter is used to enable Extended MRZ Check
   *
   * @return checkExtMRZ
   */
  @javax.annotation.Nullable
  public Boolean getCheckExtMRZ() {
    return checkExtMRZ;
  }

  public void setCheckExtMRZ(@javax.annotation.Nullable Boolean checkExtMRZ) {
    this.checkExtMRZ = checkExtMRZ;
  }

  public AuthParams checkExtOCR(@javax.annotation.Nullable Boolean checkExtOCR) {
    this.checkExtOCR = checkExtOCR;
    return this;
  }

  /**
   * This parameter is used to enable Extended OCR Check
   *
   * @return checkExtOCR
   */
  @javax.annotation.Nullable
  public Boolean getCheckExtOCR() {
    return checkExtOCR;
  }

  public void setCheckExtOCR(@javax.annotation.Nullable Boolean checkExtOCR) {
    this.checkExtOCR = checkExtOCR;
  }

  public AuthParams checkAxial(@javax.annotation.Nullable Boolean checkAxial) {
    this.checkAxial = checkAxial;
    return this;
  }

  /**
   * This parameter is used to enable laminate integrity check in axial light
   *
   * @return checkAxial
   */
  @javax.annotation.Nullable
  public Boolean getCheckAxial() {
    return checkAxial;
  }

  public void setCheckAxial(@javax.annotation.Nullable Boolean checkAxial) {
    this.checkAxial = checkAxial;
  }

  public AuthParams checkBarcodeFormat(@javax.annotation.Nullable Boolean checkBarcodeFormat) {
    this.checkBarcodeFormat = checkBarcodeFormat;
    return this;
  }

  /**
   * This parameter is used to enable Barcode format check (code metadata, data format, contents
   * format, etc.)
   *
   * @return checkBarcodeFormat
   */
  @javax.annotation.Nullable
  public Boolean getCheckBarcodeFormat() {
    return checkBarcodeFormat;
  }

  public void setCheckBarcodeFormat(@javax.annotation.Nullable Boolean checkBarcodeFormat) {
    this.checkBarcodeFormat = checkBarcodeFormat;
  }

  public AuthParams checkIRVisibility(@javax.annotation.Nullable Boolean checkIRVisibility) {
    this.checkIRVisibility = checkIRVisibility;
    return this;
  }

  /**
   * This parameter is used to enable Document elements visibility check in IR light
   *
   * @return checkIRVisibility
   */
  @javax.annotation.Nullable
  public Boolean getCheckIRVisibility() {
    return checkIRVisibility;
  }

  public void setCheckIRVisibility(@javax.annotation.Nullable Boolean checkIRVisibility) {
    this.checkIRVisibility = checkIRVisibility;
  }

  public AuthParams checkIPI(@javax.annotation.Nullable Boolean checkIPI) {
    this.checkIPI = checkIPI;
    return this;
  }

  /**
   * This parameter is used to enable Invisible Personal Information (IPI) check
   *
   * @return checkIPI
   */
  @javax.annotation.Nullable
  public Boolean getCheckIPI() {
    return checkIPI;
  }

  public void setCheckIPI(@javax.annotation.Nullable Boolean checkIPI) {
    this.checkIPI = checkIPI;
  }

  public AuthParams checkPhotoEmbedding(@javax.annotation.Nullable Boolean checkPhotoEmbedding) {
    this.checkPhotoEmbedding = checkPhotoEmbedding;
    return this;
  }

  /**
   * This parameter is used to enable Owner&#39;s photo embedding check (is photo printed or
   * sticked)
   *
   * @return checkPhotoEmbedding
   */
  @javax.annotation.Nullable
  public Boolean getCheckPhotoEmbedding() {
    return checkPhotoEmbedding;
  }

  public void setCheckPhotoEmbedding(@javax.annotation.Nullable Boolean checkPhotoEmbedding) {
    this.checkPhotoEmbedding = checkPhotoEmbedding;
  }

  public AuthParams checkPhotoComparison(@javax.annotation.Nullable Boolean checkPhotoComparison) {
    this.checkPhotoComparison = checkPhotoComparison;
    return this;
  }

  /**
   * This parameter is used to enable Portrait comparison check
   *
   * @return checkPhotoComparison
   */
  @javax.annotation.Nullable
  public Boolean getCheckPhotoComparison() {
    return checkPhotoComparison;
  }

  public void setCheckPhotoComparison(@javax.annotation.Nullable Boolean checkPhotoComparison) {
    this.checkPhotoComparison = checkPhotoComparison;
  }

  public AuthParams checkLetterScreen(@javax.annotation.Nullable Boolean checkLetterScreen) {
    this.checkLetterScreen = checkLetterScreen;
    return this;
  }

  /**
   * This parameter is used to enable LetterScreen check
   *
   * @return checkLetterScreen
   */
  @javax.annotation.Nullable
  public Boolean getCheckLetterScreen() {
    return checkLetterScreen;
  }

  public void setCheckLetterScreen(@javax.annotation.Nullable Boolean checkLetterScreen) {
    this.checkLetterScreen = checkLetterScreen;
  }

  public AuthParams checkSecurityText(@javax.annotation.Nullable Boolean checkSecurityText) {
    this.checkSecurityText = checkSecurityText;
    return this;
  }

  /**
   * This parameter is used to enable Security text check
   *
   * @return checkSecurityText
   */
  @javax.annotation.Nullable
  public Boolean getCheckSecurityText() {
    return checkSecurityText;
  }

  public void setCheckSecurityText(@javax.annotation.Nullable Boolean checkSecurityText) {
    this.checkSecurityText = checkSecurityText;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthParams authParams = (AuthParams) o;
    return Objects.equals(this.checkLiveness, authParams.checkLiveness)
        && Objects.equals(this.livenessParams, authParams.livenessParams)
        && Objects.equals(this.checkUVLuminiscence, authParams.checkUVLuminiscence)
        && Objects.equals(this.checkIRB900, authParams.checkIRB900)
        && Objects.equals(this.checkImagePatterns, authParams.checkImagePatterns)
        && Objects.equals(this.checkFibers, authParams.checkFibers)
        && Objects.equals(this.checkExtMRZ, authParams.checkExtMRZ)
        && Objects.equals(this.checkExtOCR, authParams.checkExtOCR)
        && Objects.equals(this.checkAxial, authParams.checkAxial)
        && Objects.equals(this.checkBarcodeFormat, authParams.checkBarcodeFormat)
        && Objects.equals(this.checkIRVisibility, authParams.checkIRVisibility)
        && Objects.equals(this.checkIPI, authParams.checkIPI)
        && Objects.equals(this.checkPhotoEmbedding, authParams.checkPhotoEmbedding)
        && Objects.equals(this.checkPhotoComparison, authParams.checkPhotoComparison)
        && Objects.equals(this.checkLetterScreen, authParams.checkLetterScreen)
        && Objects.equals(this.checkSecurityText, authParams.checkSecurityText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        checkLiveness,
        livenessParams,
        checkUVLuminiscence,
        checkIRB900,
        checkImagePatterns,
        checkFibers,
        checkExtMRZ,
        checkExtOCR,
        checkAxial,
        checkBarcodeFormat,
        checkIRVisibility,
        checkIPI,
        checkPhotoEmbedding,
        checkPhotoComparison,
        checkLetterScreen,
        checkSecurityText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthParams {\n");
    sb.append("    checkLiveness: ").append(toIndentedString(checkLiveness)).append("\n");
    sb.append("    livenessParams: ").append(toIndentedString(livenessParams)).append("\n");
    sb.append("    checkUVLuminiscence: ")
        .append(toIndentedString(checkUVLuminiscence))
        .append("\n");
    sb.append("    checkIRB900: ").append(toIndentedString(checkIRB900)).append("\n");
    sb.append("    checkImagePatterns: ").append(toIndentedString(checkImagePatterns)).append("\n");
    sb.append("    checkFibers: ").append(toIndentedString(checkFibers)).append("\n");
    sb.append("    checkExtMRZ: ").append(toIndentedString(checkExtMRZ)).append("\n");
    sb.append("    checkExtOCR: ").append(toIndentedString(checkExtOCR)).append("\n");
    sb.append("    checkAxial: ").append(toIndentedString(checkAxial)).append("\n");
    sb.append("    checkBarcodeFormat: ").append(toIndentedString(checkBarcodeFormat)).append("\n");
    sb.append("    checkIRVisibility: ").append(toIndentedString(checkIRVisibility)).append("\n");
    sb.append("    checkIPI: ").append(toIndentedString(checkIPI)).append("\n");
    sb.append("    checkPhotoEmbedding: ")
        .append(toIndentedString(checkPhotoEmbedding))
        .append("\n");
    sb.append("    checkPhotoComparison: ")
        .append(toIndentedString(checkPhotoComparison))
        .append("\n");
    sb.append("    checkLetterScreen: ").append(toIndentedString(checkLetterScreen)).append("\n");
    sb.append("    checkSecurityText: ").append(toIndentedString(checkSecurityText)).append("\n");
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
    openapiFields.add("checkLiveness");
    openapiFields.add("livenessParams");
    openapiFields.add("checkUVLuminiscence");
    openapiFields.add("checkIRB900");
    openapiFields.add("checkImagePatterns");
    openapiFields.add("checkFibers");
    openapiFields.add("checkExtMRZ");
    openapiFields.add("checkExtOCR");
    openapiFields.add("checkAxial");
    openapiFields.add("checkBarcodeFormat");
    openapiFields.add("checkIRVisibility");
    openapiFields.add("checkIPI");
    openapiFields.add("checkPhotoEmbedding");
    openapiFields.add("checkPhotoComparison");
    openapiFields.add("checkLetterScreen");
    openapiFields.add("checkSecurityText");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AuthParams
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!AuthParams.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in AuthParams is not found in the empty JSON string",
                AuthParams.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!AuthParams.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `AuthParams` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the optional field `livenessParams`
    if (jsonObj.get("livenessParams") != null && !jsonObj.get("livenessParams").isJsonNull()) {
      LivenessParams.validateJsonElement(jsonObj.get("livenessParams"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!AuthParams.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'AuthParams' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<AuthParams> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(AuthParams.class));

      return (TypeAdapter<T>)
          new TypeAdapter<AuthParams>() {
            @Override
            public void write(JsonWriter out, AuthParams value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public AuthParams read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of AuthParams given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AuthParams
   * @throws IOException if the JSON string is invalid with respect to AuthParams
   */
  public static AuthParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthParams.class);
  }

  /**
   * Convert an instance of AuthParams to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
