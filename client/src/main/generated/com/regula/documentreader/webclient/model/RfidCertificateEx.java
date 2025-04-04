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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Structure is used to describe the certificate contents used for the digital signature
 * verification of the document security object within the context of the communication session with
 * electronic document.
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class RfidCertificateEx {
  public static final String SERIALIZED_NAME_VERSION = "Version";

  @SerializedName(SERIALIZED_NAME_VERSION)
  @javax.annotation.Nonnull
  private BigDecimal version;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "SerialNumber";

  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  @javax.annotation.Nonnull
  private String serialNumber;

  public static final String SERIALIZED_NAME_SIGNATURE_ALGORITHM = "SignatureAlgorithm";

  @SerializedName(SERIALIZED_NAME_SIGNATURE_ALGORITHM)
  @javax.annotation.Nonnull
  private String signatureAlgorithm;

  public static final String SERIALIZED_NAME_ISSUER = "Issuer";

  @SerializedName(SERIALIZED_NAME_ISSUER)
  @javax.annotation.Nonnull
  private RfidDistinguishedName issuer;

  public static final String SERIALIZED_NAME_VALIDITY = "Validity";

  @SerializedName(SERIALIZED_NAME_VALIDITY)
  @javax.annotation.Nonnull
  private RfidValidity validity;

  public static final String SERIALIZED_NAME_SUBJECT = "Subject";

  @SerializedName(SERIALIZED_NAME_SUBJECT)
  @javax.annotation.Nonnull
  private RfidDistinguishedName subject;

  public static final String SERIALIZED_NAME_SUBJECT_P_K_ALGORITHM = "SubjectPKAlgorithm";

  @SerializedName(SERIALIZED_NAME_SUBJECT_P_K_ALGORITHM)
  @javax.annotation.Nonnull
  private String subjectPKAlgorithm;

  public static final String SERIALIZED_NAME_EXTENSIONS = "Extensions";

  @SerializedName(SERIALIZED_NAME_EXTENSIONS)
  @javax.annotation.Nonnull
  private List<RfidPkiExtension> extensions;

  public static final String SERIALIZED_NAME_NOTIFICATIONS = "Notifications";

  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS)
  @javax.annotation.Nonnull
  private List<ParsingNotificationCodes> notifications;

  public static final String SERIALIZED_NAME_ORIGIN = "Origin";

  @SerializedName(SERIALIZED_NAME_ORIGIN)
  @javax.annotation.Nonnull
  private RfidCertificateOrigin origin;

  public static final String SERIALIZED_NAME_TYPE = "Type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private RfidCertificateType type;

  public static final String SERIALIZED_NAME_FILE_NAME = "FileName";

  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  @javax.annotation.Nonnull
  private TrfFtString fileName;

  public static final String SERIALIZED_NAME_PA_STATUS = "PA_Status";

  @SerializedName(SERIALIZED_NAME_PA_STATUS)
  @javax.annotation.Nonnull
  private RFIDErrorCodes paStatus;

  public RfidCertificateEx() {}

  public RfidCertificateEx version(@javax.annotation.Nonnull BigDecimal version) {
    this.version = version;
    return this;
  }

  /**
   * Version of Certificate ASN.1 structure
   *
   * @return version
   */
  @javax.annotation.Nonnull
  public BigDecimal getVersion() {
    return version;
  }

  public void setVersion(@javax.annotation.Nonnull BigDecimal version) {
    this.version = version;
  }

  public RfidCertificateEx serialNumber(@javax.annotation.Nonnull String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Certificate serial number. Base64 encoded.
   *
   * @return serialNumber
   */
  @javax.annotation.Nonnull
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(@javax.annotation.Nonnull String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public RfidCertificateEx signatureAlgorithm(@javax.annotation.Nonnull String signatureAlgorithm) {
    this.signatureAlgorithm = signatureAlgorithm;
    return this;
  }

  /**
   * Certificate digital signature algorithm identifier (OID); String in the format S1 (S2), where
   * S1 – algorithm name, S2 – identifier (OID string).
   *
   * @return signatureAlgorithm
   */
  @javax.annotation.Nonnull
  public String getSignatureAlgorithm() {
    return signatureAlgorithm;
  }

  public void setSignatureAlgorithm(@javax.annotation.Nonnull String signatureAlgorithm) {
    this.signatureAlgorithm = signatureAlgorithm;
  }

  public RfidCertificateEx issuer(@javax.annotation.Nonnull RfidDistinguishedName issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Get issuer
   *
   * @return issuer
   */
  @javax.annotation.Nonnull
  public RfidDistinguishedName getIssuer() {
    return issuer;
  }

  public void setIssuer(@javax.annotation.Nonnull RfidDistinguishedName issuer) {
    this.issuer = issuer;
  }

  public RfidCertificateEx validity(@javax.annotation.Nonnull RfidValidity validity) {
    this.validity = validity;
    return this;
  }

  /**
   * Get validity
   *
   * @return validity
   */
  @javax.annotation.Nonnull
  public RfidValidity getValidity() {
    return validity;
  }

  public void setValidity(@javax.annotation.Nonnull RfidValidity validity) {
    this.validity = validity;
  }

  public RfidCertificateEx subject(@javax.annotation.Nonnull RfidDistinguishedName subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   *
   * @return subject
   */
  @javax.annotation.Nonnull
  public RfidDistinguishedName getSubject() {
    return subject;
  }

  public void setSubject(@javax.annotation.Nonnull RfidDistinguishedName subject) {
    this.subject = subject;
  }

  public RfidCertificateEx subjectPKAlgorithm(@javax.annotation.Nonnull String subjectPKAlgorithm) {
    this.subjectPKAlgorithm = subjectPKAlgorithm;
    return this;
  }

  /**
   * Certificate public key algorithm identifier (OID); String in the format S1 (S2), where S1 –
   * algorithm name, S2 – identifier (OID string).
   *
   * @return subjectPKAlgorithm
   */
  @javax.annotation.Nonnull
  public String getSubjectPKAlgorithm() {
    return subjectPKAlgorithm;
  }

  public void setSubjectPKAlgorithm(@javax.annotation.Nonnull String subjectPKAlgorithm) {
    this.subjectPKAlgorithm = subjectPKAlgorithm;
  }

  public RfidCertificateEx extensions(@javax.annotation.Nonnull List<RfidPkiExtension> extensions) {
    this.extensions = extensions;
    return this;
  }

  public RfidCertificateEx addExtensionsItem(RfidPkiExtension extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new ArrayList<>();
    }
    this.extensions.add(extensionsItem);
    return this;
  }

  /**
   * List of the certificate extensions
   *
   * @return extensions
   */
  @javax.annotation.Nonnull
  public List<RfidPkiExtension> getExtensions() {
    return extensions;
  }

  public void setExtensions(@javax.annotation.Nonnull List<RfidPkiExtension> extensions) {
    this.extensions = extensions;
  }

  public RfidCertificateEx notifications(
      @javax.annotation.Nonnull List<ParsingNotificationCodes> notifications) {
    this.notifications = notifications;
    return this;
  }

  public RfidCertificateEx addNotificationsItem(ParsingNotificationCodes notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

  /**
   * List of remarks arisen during the analysis of the certificate data structure and its validity
   * verification.
   *
   * @return notifications
   */
  @javax.annotation.Nonnull
  public List<ParsingNotificationCodes> getNotifications() {
    return notifications;
  }

  public void setNotifications(
      @javax.annotation.Nonnull List<ParsingNotificationCodes> notifications) {
    this.notifications = notifications;
  }

  public RfidCertificateEx origin(@javax.annotation.Nonnull RfidCertificateOrigin origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Get origin
   *
   * @return origin
   */
  @javax.annotation.Nonnull
  public RfidCertificateOrigin getOrigin() {
    return origin;
  }

  public void setOrigin(@javax.annotation.Nonnull RfidCertificateOrigin origin) {
    this.origin = origin;
  }

  public RfidCertificateEx type(@javax.annotation.Nonnull RfidCertificateType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @javax.annotation.Nonnull
  public RfidCertificateType getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull RfidCertificateType type) {
    this.type = type;
  }

  public RfidCertificateEx fileName(@javax.annotation.Nonnull TrfFtString fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   *
   * @return fileName
   */
  @javax.annotation.Nonnull
  public TrfFtString getFileName() {
    return fileName;
  }

  public void setFileName(@javax.annotation.Nonnull TrfFtString fileName) {
    this.fileName = fileName;
  }

  public RfidCertificateEx paStatus(@javax.annotation.Nonnull RFIDErrorCodes paStatus) {
    this.paStatus = paStatus;
    return this;
  }

  /**
   * Get paStatus
   *
   * @return paStatus
   */
  @javax.annotation.Nonnull
  public RFIDErrorCodes getPaStatus() {
    return paStatus;
  }

  public void setPaStatus(@javax.annotation.Nonnull RFIDErrorCodes paStatus) {
    this.paStatus = paStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RfidCertificateEx rfidCertificateEx = (RfidCertificateEx) o;
    return Objects.equals(this.version, rfidCertificateEx.version)
        && Objects.equals(this.serialNumber, rfidCertificateEx.serialNumber)
        && Objects.equals(this.signatureAlgorithm, rfidCertificateEx.signatureAlgorithm)
        && Objects.equals(this.issuer, rfidCertificateEx.issuer)
        && Objects.equals(this.validity, rfidCertificateEx.validity)
        && Objects.equals(this.subject, rfidCertificateEx.subject)
        && Objects.equals(this.subjectPKAlgorithm, rfidCertificateEx.subjectPKAlgorithm)
        && Objects.equals(this.extensions, rfidCertificateEx.extensions)
        && Objects.equals(this.notifications, rfidCertificateEx.notifications)
        && Objects.equals(this.origin, rfidCertificateEx.origin)
        && Objects.equals(this.type, rfidCertificateEx.type)
        && Objects.equals(this.fileName, rfidCertificateEx.fileName)
        && Objects.equals(this.paStatus, rfidCertificateEx.paStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        version,
        serialNumber,
        signatureAlgorithm,
        issuer,
        validity,
        subject,
        subjectPKAlgorithm,
        extensions,
        notifications,
        origin,
        type,
        fileName,
        paStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RfidCertificateEx {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    subjectPKAlgorithm: ").append(toIndentedString(subjectPKAlgorithm)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    paStatus: ").append(toIndentedString(paStatus)).append("\n");
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
    openapiFields.add("Version");
    openapiFields.add("SerialNumber");
    openapiFields.add("SignatureAlgorithm");
    openapiFields.add("Issuer");
    openapiFields.add("Validity");
    openapiFields.add("Subject");
    openapiFields.add("SubjectPKAlgorithm");
    openapiFields.add("Extensions");
    openapiFields.add("Notifications");
    openapiFields.add("Origin");
    openapiFields.add("Type");
    openapiFields.add("FileName");
    openapiFields.add("PA_Status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Version");
    openapiRequiredFields.add("SerialNumber");
    openapiRequiredFields.add("SignatureAlgorithm");
    openapiRequiredFields.add("Issuer");
    openapiRequiredFields.add("Validity");
    openapiRequiredFields.add("Subject");
    openapiRequiredFields.add("SubjectPKAlgorithm");
    openapiRequiredFields.add("Extensions");
    openapiRequiredFields.add("Notifications");
    openapiRequiredFields.add("Origin");
    openapiRequiredFields.add("Type");
    openapiRequiredFields.add("FileName");
    openapiRequiredFields.add("PA_Status");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RfidCertificateEx
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!RfidCertificateEx.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in RfidCertificateEx is not found in the empty JSON string",
                RfidCertificateEx.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!RfidCertificateEx.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `RfidCertificateEx` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : RfidCertificateEx.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if (!jsonObj.get("SerialNumber").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `SerialNumber` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("SerialNumber").toString()));
    }
    if (!jsonObj.get("SignatureAlgorithm").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `SignatureAlgorithm` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("SignatureAlgorithm").toString()));
    }
    // validate the required field `Issuer`
    RfidDistinguishedName.validateJsonElement(jsonObj.get("Issuer"));
    // validate the required field `Validity`
    RfidValidity.validateJsonElement(jsonObj.get("Validity"));
    // validate the required field `Subject`
    RfidDistinguishedName.validateJsonElement(jsonObj.get("Subject"));
    if (!jsonObj.get("SubjectPKAlgorithm").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `SubjectPKAlgorithm` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("SubjectPKAlgorithm").toString()));
    }
    // ensure the json data is an array
    if (!jsonObj.get("Extensions").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `Extensions` to be an array in the JSON string but got `%s`",
              jsonObj.get("Extensions").toString()));
    }

    JsonArray jsonArrayextensions = jsonObj.getAsJsonArray("Extensions");
    // validate the required field `Extensions` (array)
    for (int i = 0; i < jsonArrayextensions.size(); i++) {
      RfidPkiExtension.validateJsonElement(jsonArrayextensions.get(i));
    }
    ;
    // ensure the required json array is present
    if (jsonObj.get("Notifications") == null) {
      throw new IllegalArgumentException(
          "Expected the field `linkedContent` to be an array in the JSON string but got `null`");
    } else if (!jsonObj.get("Notifications").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `Notifications` to be an array in the JSON string but got `%s`",
              jsonObj.get("Notifications").toString()));
    }
    // validate the required field `Origin`
    RfidCertificateOrigin.validateJsonElement(jsonObj.get("Origin"));
    // validate the required field `Type`
    RfidCertificateType.validateJsonElement(jsonObj.get("Type"));
    // validate the required field `FileName`
    TrfFtString.validateJsonElement(jsonObj.get("FileName"));
    // validate the required field `PA_Status`
    RFIDErrorCodes.validateJsonElement(jsonObj.get("PA_Status"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!RfidCertificateEx.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'RfidCertificateEx' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<RfidCertificateEx> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(RfidCertificateEx.class));

      return (TypeAdapter<T>)
          new TypeAdapter<RfidCertificateEx>() {
            @Override
            public void write(JsonWriter out, RfidCertificateEx value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public RfidCertificateEx read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of RfidCertificateEx given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RfidCertificateEx
   * @throws IOException if the JSON string is invalid with respect to RfidCertificateEx
   */
  public static RfidCertificateEx fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RfidCertificateEx.class);
  }

  /**
   * Convert an instance of RfidCertificateEx to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
