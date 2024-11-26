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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Structure is used to describe the contents of a single copy of digital signature of the document
 * security object and the results of its check within the context of the communication session with
 * electronic document
 */
public class RfidSignerInfoEx {
  public static final String SERIALIZED_NAME_VERSION = "Version";

  @SerializedName(SERIALIZED_NAME_VERSION)
  private BigDecimal version;

  public static final String SERIALIZED_NAME_ISSUER = "Issuer";

  @SerializedName(SERIALIZED_NAME_ISSUER)
  private RfidDistinguishedName issuer;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "SerialNumber";

  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private TrfFtBytes serialNumber;

  public static final String SERIALIZED_NAME_SUBJECT_KEY_IDENTIFIER = "SubjectKeyIdentifier";

  @SerializedName(SERIALIZED_NAME_SUBJECT_KEY_IDENTIFIER)
  private TrfFtBytes subjectKeyIdentifier;

  public static final String SERIALIZED_NAME_DIGEST_ALGORITHM = "DigestAlgorithm";

  @SerializedName(SERIALIZED_NAME_DIGEST_ALGORITHM)
  private String digestAlgorithm;

  public static final String SERIALIZED_NAME_SIGNED_ATTRIBUTES = "SignedAttributes";

  @SerializedName(SERIALIZED_NAME_SIGNED_ATTRIBUTES)
  private List<RfidAttributeData> signedAttributes = new ArrayList<RfidAttributeData>();

  public static final String SERIALIZED_NAME_SIGNATURE_ALGORITHM = "SignatureAlgorithm";

  @SerializedName(SERIALIZED_NAME_SIGNATURE_ALGORITHM)
  private String signatureAlgorithm;

  public static final String SERIALIZED_NAME_SIGNATURE = "Signature";

  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private TrfFtBytes signature;

  public static final String SERIALIZED_NAME_PA_STATUS = "PA_Status";

  @SerializedName(SERIALIZED_NAME_PA_STATUS)
  private RFIDErrorCodes paStatus;

  public static final String SERIALIZED_NAME_CERTIFICATE_CHAIN = "CertificateChain";

  @SerializedName(SERIALIZED_NAME_CERTIFICATE_CHAIN)
  private List<RfidCertificateEx> certificateChain = new ArrayList<RfidCertificateEx>();

  public static final String SERIALIZED_NAME_DATA_TO_HASH = "DataToHash";

  @SerializedName(SERIALIZED_NAME_DATA_TO_HASH)
  private String dataToHash;

  public static final String SERIALIZED_NAME_NOTIFICATIONS = "Notifications";

  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS)
  private ParsingErrorCodes notifications;

  public RfidSignerInfoEx withVersion(BigDecimal version) {
    this.version = version;
    return this;
  }

  /**
   * Version of SignerInfo ASN.1 structure
   *
   * @return version
   */
  public BigDecimal getVersion() {
    return version;
  }

  public void setVersion(BigDecimal version) {
    this.version = version;
  }

  public RfidSignerInfoEx withIssuer(RfidDistinguishedName issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Get issuer
   *
   * @return issuer
   */
  public RfidDistinguishedName getIssuer() {
    return issuer;
  }

  public void setIssuer(RfidDistinguishedName issuer) {
    this.issuer = issuer;
  }

  public RfidSignerInfoEx withSerialNumber(TrfFtBytes serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Get serialNumber
   *
   * @return serialNumber
   */
  public TrfFtBytes getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(TrfFtBytes serialNumber) {
    this.serialNumber = serialNumber;
  }

  public RfidSignerInfoEx withSubjectKeyIdentifier(TrfFtBytes subjectKeyIdentifier) {
    this.subjectKeyIdentifier = subjectKeyIdentifier;
    return this;
  }

  /**
   * Get subjectKeyIdentifier
   *
   * @return subjectKeyIdentifier
   */
  public TrfFtBytes getSubjectKeyIdentifier() {
    return subjectKeyIdentifier;
  }

  public void setSubjectKeyIdentifier(TrfFtBytes subjectKeyIdentifier) {
    this.subjectKeyIdentifier = subjectKeyIdentifier;
  }

  public RfidSignerInfoEx withDigestAlgorithm(String digestAlgorithm) {
    this.digestAlgorithm = digestAlgorithm;
    return this;
  }

  /**
   * Hash algorithm identifier (OID) for digital signature generation
   *
   * @return digestAlgorithm
   */
  public String getDigestAlgorithm() {
    return digestAlgorithm;
  }

  public void setDigestAlgorithm(String digestAlgorithm) {
    this.digestAlgorithm = digestAlgorithm;
  }

  public RfidSignerInfoEx withSignedAttributes(List<RfidAttributeData> signedAttributes) {
    this.signedAttributes = signedAttributes;
    return this;
  }

  public RfidSignerInfoEx addSignedAttributesItem(RfidAttributeData signedAttributesItem) {
    this.signedAttributes.add(signedAttributesItem);
    return this;
  }

  /**
   * List of the signed attributes
   *
   * @return signedAttributes
   */
  public List<RfidAttributeData> getSignedAttributes() {
    return signedAttributes;
  }

  public void setSignedAttributes(List<RfidAttributeData> signedAttributes) {
    this.signedAttributes = signedAttributes;
  }

  public RfidSignerInfoEx withSignatureAlgorithm(String signatureAlgorithm) {
    this.signatureAlgorithm = signatureAlgorithm;
    return this;
  }

  /**
   * Digital signature algorithm identifier (OID)
   *
   * @return signatureAlgorithm
   */
  public String getSignatureAlgorithm() {
    return signatureAlgorithm;
  }

  public void setSignatureAlgorithm(String signatureAlgorithm) {
    this.signatureAlgorithm = signatureAlgorithm;
  }

  public RfidSignerInfoEx withSignature(TrfFtBytes signature) {
    this.signature = signature;
    return this;
  }

  /**
   * Get signature
   *
   * @return signature
   */
  public TrfFtBytes getSignature() {
    return signature;
  }

  public void setSignature(TrfFtBytes signature) {
    this.signature = signature;
  }

  public RfidSignerInfoEx withPaStatus(RFIDErrorCodes paStatus) {
    this.paStatus = paStatus;
    return this;
  }

  /**
   * Get paStatus
   *
   * @return paStatus
   */
  public RFIDErrorCodes getPaStatus() {
    return paStatus;
  }

  public void setPaStatus(RFIDErrorCodes paStatus) {
    this.paStatus = paStatus;
  }

  public RfidSignerInfoEx withCertificateChain(List<RfidCertificateEx> certificateChain) {
    this.certificateChain = certificateChain;
    return this;
  }

  public RfidSignerInfoEx addCertificateChainItem(RfidCertificateEx certificateChainItem) {
    this.certificateChain.add(certificateChainItem);
    return this;
  }

  /**
   * Certificate chain, used for the digital signature verification.
   *
   * @return certificateChain
   */
  public List<RfidCertificateEx> getCertificateChain() {
    return certificateChain;
  }

  public void setCertificateChain(List<RfidCertificateEx> certificateChain) {
    this.certificateChain = certificateChain;
  }

  public RfidSignerInfoEx withDataToHash(String dataToHash) {
    this.dataToHash = dataToHash;
    return this;
  }

  /**
   * Binary data array used to calculate the hash value for digital signature verification. Base64
   * encoded.
   *
   * @return dataToHash
   */
  public String getDataToHash() {
    return dataToHash;
  }

  public void setDataToHash(String dataToHash) {
    this.dataToHash = dataToHash;
  }

  public RfidSignerInfoEx withNotifications(ParsingErrorCodes notifications) {
    this.notifications = notifications;
    return this;
  }

  /**
   * Get notifications
   *
   * @return notifications
   */
  public ParsingErrorCodes getNotifications() {
    return notifications;
  }

  public void setNotifications(ParsingErrorCodes notifications) {
    this.notifications = notifications;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RfidSignerInfoEx rfidSignerInfoEx = (RfidSignerInfoEx) o;
    return Objects.equals(this.version, rfidSignerInfoEx.version)
        && Objects.equals(this.issuer, rfidSignerInfoEx.issuer)
        && Objects.equals(this.serialNumber, rfidSignerInfoEx.serialNumber)
        && Objects.equals(this.subjectKeyIdentifier, rfidSignerInfoEx.subjectKeyIdentifier)
        && Objects.equals(this.digestAlgorithm, rfidSignerInfoEx.digestAlgorithm)
        && Objects.equals(this.signedAttributes, rfidSignerInfoEx.signedAttributes)
        && Objects.equals(this.signatureAlgorithm, rfidSignerInfoEx.signatureAlgorithm)
        && Objects.equals(this.signature, rfidSignerInfoEx.signature)
        && Objects.equals(this.paStatus, rfidSignerInfoEx.paStatus)
        && Objects.equals(this.certificateChain, rfidSignerInfoEx.certificateChain)
        && Objects.equals(this.dataToHash, rfidSignerInfoEx.dataToHash)
        && Objects.equals(this.notifications, rfidSignerInfoEx.notifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        version,
        issuer,
        serialNumber,
        subjectKeyIdentifier,
        digestAlgorithm,
        signedAttributes,
        signatureAlgorithm,
        signature,
        paStatus,
        certificateChain,
        dataToHash,
        notifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RfidSignerInfoEx {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    subjectKeyIdentifier: ")
        .append(toIndentedString(subjectKeyIdentifier))
        .append("\n");
    sb.append("    digestAlgorithm: ").append(toIndentedString(digestAlgorithm)).append("\n");
    sb.append("    signedAttributes: ").append(toIndentedString(signedAttributes)).append("\n");
    sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    paStatus: ").append(toIndentedString(paStatus)).append("\n");
    sb.append("    certificateChain: ").append(toIndentedString(certificateChain)).append("\n");
    sb.append("    dataToHash: ").append(toIndentedString(dataToHash)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
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
