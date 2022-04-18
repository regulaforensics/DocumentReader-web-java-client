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
import java.util.Objects;

/** ProcessSystemInfo */
public class ProcessSystemInfo {
  public static final String SERIALIZED_NAME_LICENSE = "license";

  @SerializedName(SERIALIZED_NAME_LICENSE)
  private String license;

  public static final String SERIALIZED_NAME_RECAPTCHA_TOKEN = "recaptcha_token";

  @SerializedName(SERIALIZED_NAME_RECAPTCHA_TOKEN)
  private String recaptchaToken;

  public ProcessSystemInfo withLicense(String license) {
    this.license = license;
    return this;
  }

  /**
   * Base64 encoded license file
   *
   * @return license
   */
  @javax.annotation.Nullable
  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public ProcessSystemInfo withRecaptchaToken(String recaptchaToken) {
    this.recaptchaToken = recaptchaToken;
    return this;
  }

  /**
   * For internal use. Demo-sites recaptcha token.
   *
   * @return recaptchaToken
   */
  @javax.annotation.Nullable
  public String getRecaptchaToken() {
    return recaptchaToken;
  }

  public void setRecaptchaToken(String recaptchaToken) {
    this.recaptchaToken = recaptchaToken;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessSystemInfo processSystemInfo = (ProcessSystemInfo) o;
    return Objects.equals(this.license, processSystemInfo.license)
        && Objects.equals(this.recaptchaToken, processSystemInfo.recaptchaToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(license, recaptchaToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessSystemInfo {\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    recaptchaToken: ").append(toIndentedString(recaptchaToken)).append("\n");
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
