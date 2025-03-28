/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 7.2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** LivenessParams */
public class LivenessParams {
  public static final String SERIALIZED_NAME_CHECK_O_V_I = "checkOVI";

  @SerializedName(SERIALIZED_NAME_CHECK_O_V_I)
  private Boolean checkOVI;

  public static final String SERIALIZED_NAME_CHECK_M_L_I = "checkMLI";

  @SerializedName(SERIALIZED_NAME_CHECK_M_L_I)
  private Boolean checkMLI;

  public static final String SERIALIZED_NAME_CHECK_HOLO = "checkHolo";

  @SerializedName(SERIALIZED_NAME_CHECK_HOLO)
  private Boolean checkHolo;

  public static final String SERIALIZED_NAME_CHECK_E_D = "checkED";

  @SerializedName(SERIALIZED_NAME_CHECK_E_D)
  private Boolean checkED;

  public static final String SERIALIZED_NAME_CHECK_BLACK_AND_WHITE_COPY = "checkBlackAndWhiteCopy";

  @SerializedName(SERIALIZED_NAME_CHECK_BLACK_AND_WHITE_COPY)
  private Boolean checkBlackAndWhiteCopy;

  public static final String SERIALIZED_NAME_CHECK_DYNAPRINT = "checkDynaprint";

  @SerializedName(SERIALIZED_NAME_CHECK_DYNAPRINT)
  private Boolean checkDynaprint;

  public LivenessParams withCheckOVI(Boolean checkOVI) {
    this.checkOVI = checkOVI;
    return this;
  }

  /**
   * This parameter is used to enable OVI check
   *
   * @return checkOVI
   */
  @javax.annotation.Nullable
  public Boolean getCheckOVI() {
    return checkOVI;
  }

  public void setCheckOVI(Boolean checkOVI) {
    this.checkOVI = checkOVI;
  }

  public LivenessParams withCheckMLI(Boolean checkMLI) {
    this.checkMLI = checkMLI;
    return this;
  }

  /**
   * This parameter is used to enable MLI check
   *
   * @return checkMLI
   */
  @javax.annotation.Nullable
  public Boolean getCheckMLI() {
    return checkMLI;
  }

  public void setCheckMLI(Boolean checkMLI) {
    this.checkMLI = checkMLI;
  }

  public LivenessParams withCheckHolo(Boolean checkHolo) {
    this.checkHolo = checkHolo;
    return this;
  }

  /**
   * This parameter is used to enable Hologram detection
   *
   * @return checkHolo
   */
  @javax.annotation.Nullable
  public Boolean getCheckHolo() {
    return checkHolo;
  }

  public void setCheckHolo(Boolean checkHolo) {
    this.checkHolo = checkHolo;
  }

  public LivenessParams withCheckED(Boolean checkED) {
    this.checkED = checkED;
    return this;
  }

  /**
   * This parameter is used to enable Electronic device detection
   *
   * @return checkED
   */
  @javax.annotation.Nullable
  public Boolean getCheckED() {
    return checkED;
  }

  public void setCheckED(Boolean checkED) {
    this.checkED = checkED;
  }

  public LivenessParams withCheckBlackAndWhiteCopy(Boolean checkBlackAndWhiteCopy) {
    this.checkBlackAndWhiteCopy = checkBlackAndWhiteCopy;
    return this;
  }

  /**
   * This parameter is used to enable Black and white copy check
   *
   * @return checkBlackAndWhiteCopy
   */
  @javax.annotation.Nullable
  public Boolean getCheckBlackAndWhiteCopy() {
    return checkBlackAndWhiteCopy;
  }

  public void setCheckBlackAndWhiteCopy(Boolean checkBlackAndWhiteCopy) {
    this.checkBlackAndWhiteCopy = checkBlackAndWhiteCopy;
  }

  public LivenessParams withCheckDynaprint(Boolean checkDynaprint) {
    this.checkDynaprint = checkDynaprint;
    return this;
  }

  /**
   * This parameter is used to enable Dynaprint check
   *
   * @return checkDynaprint
   */
  @javax.annotation.Nullable
  public Boolean getCheckDynaprint() {
    return checkDynaprint;
  }

  public void setCheckDynaprint(Boolean checkDynaprint) {
    this.checkDynaprint = checkDynaprint;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LivenessParams livenessParams = (LivenessParams) o;
    return Objects.equals(this.checkOVI, livenessParams.checkOVI)
        && Objects.equals(this.checkMLI, livenessParams.checkMLI)
        && Objects.equals(this.checkHolo, livenessParams.checkHolo)
        && Objects.equals(this.checkED, livenessParams.checkED)
        && Objects.equals(this.checkBlackAndWhiteCopy, livenessParams.checkBlackAndWhiteCopy)
        && Objects.equals(this.checkDynaprint, livenessParams.checkDynaprint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        checkOVI, checkMLI, checkHolo, checkED, checkBlackAndWhiteCopy, checkDynaprint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LivenessParams {\n");
    sb.append("    checkOVI: ").append(toIndentedString(checkOVI)).append("\n");
    sb.append("    checkMLI: ").append(toIndentedString(checkMLI)).append("\n");
    sb.append("    checkHolo: ").append(toIndentedString(checkHolo)).append("\n");
    sb.append("    checkED: ").append(toIndentedString(checkED)).append("\n");
    sb.append("    checkBlackAndWhiteCopy: ")
        .append(toIndentedString(checkBlackAndWhiteCopy))
        .append("\n");
    sb.append("    checkDynaprint: ").append(toIndentedString(checkDynaprint)).append("\n");
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
