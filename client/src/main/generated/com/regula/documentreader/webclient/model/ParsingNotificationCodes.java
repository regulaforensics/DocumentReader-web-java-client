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

import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * The enumeration contains possible values of notification codes returned during the RFID chip
 * processing.
 */
@JsonAdapter(ParsingNotificationCodes.Adapter.class)
public enum ParsingNotificationCodes {

  /** ASN certificate: Incorrect version */
  ntfLDS_ASN_Certificate_IncorrectVersion(2415919105l),

  /** ASN certificate: Non-matching signature algorithm */
  ntfLDS_ASN_Certificate_NonMatchingSignatureAlgorithm(2415919106l),

  /** ASN certificate: Incorrect time coding */
  ntfLDS_ASN_Certificate_IncorrectTimeCoding(2415919107l),

  /** ASN certificate: Incorrect use of generalized time */
  ntfLDS_ASN_Certificate_IncorrectUseOfGeneralizedTime(2415919108l),

  /** ASN certificate: Empty issuer */
  ntfLDS_ASN_Certificate_EmptyIssuer(2415919109l),

  /** ASN certificate: Empty subject */
  ntfLDS_ASN_Certificate_EmptySubject(2415919110l),

  /** ASN certificate: Unsupported critical extension */
  ntfLDS_ASN_Certificate_UnsupportedCriticalExtension(2415919112l),

  /** ASN certificate: Forced default CSCA role */
  ntfLDS_ASN_Certificate_ForcedDefaultCSCARole(2415919118l),

  /** ASN certificate: Forced Default DS role */
  ntfLDS_ASN_Certificate_ForcedDefaultDSRole(2415919119l),

  /** ASN certificate: Incorrect issuer subject DS */
  ntfLDS_ASN_Certificate_IncorrectIssuerSubjectDS(2415919120l),

  /** ASN certificate: Duplicating extensions */
  ntfLDS_ASN_Certificate_DuplicatingExtensions(2415919127l),

  /** ICAO certificate: Version missed */
  ntfLDS_ICAO_Certificate_Version_Missed(2415919616l),

  /** ICAO certificate: Version incorrect */
  ntfLDS_ICAO_Certificate_Version_Incorrect(2415919617l),

  /** ICAO certificate: Issuer country missed */
  ntfLDS_ICAO_Certificate_Issuer_Country_Missed(2415919618l),

  /** ICAO certificate: Issuer common name missed */
  ntfLDS_ICAO_Certificate_Issuer_CommonName_Missed(2415919619l),

  /** ICAO certificate: Issuer country non-compliant */
  ntfLDS_ICAO_Certificate_Issuer_CountryNonCompliant(2415919620l),

  /** ICAO certificate: Subject country missed */
  ntfLDS_ICAO_Certificate_Subject_Country_Missed(2415919621l),

  /** ICAO certificate: Subject common name missed */
  ntfLDS_ICAO_Certificate_Subject_CommonName_Missed(2415919622l),

  /** ICAO certificate: Subject country non-compliant */
  ntfLDS_ICAO_Certificate_Subject_CountryNonCompliant(2415919623l),

  /** ICAO certificate: Using non-compliant data */
  ntfLDS_ICAO_Certificate_UsingNonCompliantData(2415919624l),

  /** ICAO certificate: Unsupported signature algorithm */
  ntfLDS_ICAO_Certificate_UnsupportedSignatureAlgorithm(2415919625l),

  /** ICAO certificate: Unsupported public key algorithm */
  ntfLDS_ICAO_Certificate_UnsupportedPublicKeyAlgorithm(2415919626l),

  /** ICAO certificate: Missed extensions */
  ntfLDS_ICAO_Certificate_MissedExtensions(2415919627l),

  /** ICAO certificate: Validity */
  ntfLDS_ICAO_Certificate_Validity(2415919628l),

  /** ICAO certificate extension: Using non-compliant data */
  ntfLDS_ICAO_Certificate_Ext_UsingNonCompliantData(2415919629l),

  /** ICAO certificate extension: Key usage missed */
  ntfLDS_ICAO_Certificate_Ext_KeyUsage_Missed(2415919630l),

  /** ICAO certificate extension: Key usage not critical */
  ntfLDS_ICAO_Certificate_Ext_KeyUsage_NotCritical(2415919631l),

  /** ICAO certificate extension: Key usage incorrect data */
  ntfLDS_ICAO_Certificate_Ext_KeyUsage_IncorrectData(2415919632l),

  /** ICAO certificate extension: Basic constraints missed */
  ntfLDS_ICAO_Certificate_Ext_BasicC_Missed(2415919633l),

  /** ICAO certificate extension: Basic constraints incorrect usage 1 */
  ntfLDS_ICAO_Certificate_Ext_BasicC_IncorrectUsage1(2415919634l),

  /** ICAO certificate extension: Basic constraints incorrect usage 2 */
  ntfLDS_ICAO_Certificate_Ext_BasicC_IncorrectUsage2(2415919635l),

  /** ICAO certificate extension: Basic constraints not critical */
  ntfLDS_ICAO_Certificate_Ext_BasicC_NotCritical(2415919636l),

  /** ICAO certificate extension: Basic constraints incorrect data */
  ntfLDS_ICAO_Certificate_Ext_BasicC_IncorrectData(2415919637l),

  /** ICAO certificate extension: Basic constraints path LenC missed */
  ntfLDS_ICAO_Certificate_Ext_BasicC_PathLenC_Missed(2415919638l),

  /** ICAO certificate extension: Basic constraints path LenC incorrect */
  ntfLDS_ICAO_Certificate_Ext_BasicC_PathLenC_Incorrect(2415919639l),

  /** ICAO certificate extension: Ext key usage not critical */
  ntfLDS_ICAO_Certificate_Ext_ExtKeyUsage_NotCritical(2415919640l),

  /** ICAO certificate extension: Ext key usage incorrect usage */
  ntfLDS_ICAO_Certificate_Ext_ExtKeyUsage_IncorrectUsage(2415919641l),

  /** ICAO certificate extension: Ext key usage incorrect data */
  ntfLDS_ICAO_Certificate_Ext_ExtKeyUsage_IncorrectData(2415919642l),

  /** ICAO certificate extension Auth key: ID missed */
  ntfLDS_ICAO_Certificate_Ext_AuthKeyID_Missed(2415919643l),

  /** ICAO certificate extension Auth key: Incorrect data */
  ntfLDS_ICAO_Certificate_Ext_AuthKeyID_IncorrectData(2415919644l),

  /** ICAO certificate extension Auth key: Key ID missed */
  ntfLDS_ICAO_Certificate_Ext_AuthKeyID_KeyID_Missed(2415919645l),

  /** ICAO certificate extension: Subject key ID missed */
  ntfLDS_ICAO_Certificate_Ext_SubjectKeyID_Missed(2415919646l),

  /** ICAO certificate extension: Subject key ID incorrect data */
  ntfLDS_ICAO_Certificate_Ext_SubjectKeyID_IncorrectData(2415919647l),

  /** ICAO certificate extension: Private key UP missed */
  ntfLDS_ICAO_Certificate_Ext_PrivateKeyUP_Missed(2415919648l),

  /** ICAO certificate extension: Private key UP incorrect data */
  ntfLDS_ICAO_Certificate_Ext_PrivateKeyUP_IncorrectData(2415919649l),

  /** ICAO certificate extension: Private key UP empty */
  ntfLDS_ICAO_Certificate_Ext_PrivateKeyUP_Empty(2415919650l),

  /** ICAO certificate extension: Subject alt name missed */
  ntfLDS_ICAO_Certificate_Ext_SubjectAltName_Missed(2415919651l),

  /** ICAO certificate extension: Subject alt name incorrect data */
  ntfLDS_ICAO_Certificate_Ext_SubjectAltName_IncorrectData(2415919652l),

  /** ICAO certificate extension: Subject alt name empty */
  ntfLDS_ICAO_Certificate_Ext_SubjectAltName_Empty(2415919653l),

  /** ICAO certificate extension: Subject alt name non-compliant */
  ntfLDS_ICAO_Certificate_Ext_SubjectAltName_NonCompliant(2415919654l),

  /** ICAO certificate extension: Subject alt name critical */
  ntfLDS_ICAO_Certificate_Ext_SubjectAltName_Critical(2415919656l),

  /** ICAO certificate extension: Subject alt name DN empty */
  ntfLDS_ICAO_Certificate_Ext_SubjectAltName_DN_Empty(2415919657l),

  /** ICAO certificate extension: Subject alt name DN incorrect */
  ntfLDS_ICAO_Certificate_Ext_SubjectAltName_DN_Incorrect(2415919658l),

  /** ICAO certificate extension: Subject alt name DN non-compliant */
  ntfLDS_ICAO_Certificate_Ext_SubjectAltName_DN_NonCompliant(2415919659l),

  /** ICAO certificate extension: Issuer alt name missed */
  ntfLDS_ICAO_Certificate_Ext_IssuerAltName_Missed(2415919660l),

  /** ICAO certificate extension: Issuer alt name incorrect data */
  ntfLDS_ICAO_Certificate_Ext_IssuerAltName_IncorrectData(2415919661l),

  /** ICAO certificate extension: Issuer alt name empty */
  ntfLDS_ICAO_Certificate_Ext_IssuerAltName_Empty(2415919662l),

  /** ICAO certificate extension: Issuer alt name non-compliant */
  ntfLDS_ICAO_Certificate_Ext_IssuerAltName_NonCompliant(2415919663l),

  /** ICAO certificate extension: Issuer alt name critical */
  ntfLDS_ICAO_Certificate_Ext_IssuerAltName_Critical(2415919665l),

  /** ICAO certificate extension: Issuer alt name DN empty */
  ntfLDS_ICAO_Certificate_Ext_IssuerAltName_DN_Empty(2415919666l),

  /** ICAO certificate extension: Issuer alt name DN incorrect */
  ntfLDS_ICAO_Certificate_Ext_IssuerAltName_DN_Incorrect(2415919667l),

  /** ICAO certificate extension: Issuer alt name DN non-compliant */
  ntfLDS_ICAO_Certificate_Ext_IssuerAltName_DN_NonCompliant(2415919668l),

  /** ICAO certificate extension Doc type list: Missed */
  ntfLDS_ICAO_Certificate_Ext_DocTypeList_Missed(2415919669l),

  /** ICAO certificate extension Doc type list: Incorrect data */
  ntfLDS_ICAO_Certificate_Ext_DocTypeList_IncorrectData(2415919670l),

  /** ICAO certificate extension Doc type list: Version */
  ntfLDS_ICAO_Certificate_Ext_DocTypeList_Version(2415919671l),

  /** ICAO certificate extension Doc type list: Doc types */
  ntfLDS_ICAO_Certificate_Ext_DocTypeList_DocTypes(2415919672l),

  /** ICAO certificate extension Doc type list: Doc types empty */
  ntfLDS_ICAO_Certificate_Ext_DocTypeList_DocTypes_Empty(2415919673l),

  /** ICAO certificate extension: Dert policies incorrect data */
  ntfLDS_ICAO_Certificate_Ext_CertPolicies_IncorrectData(2415919674l),

  /** ICAO certificate extension: Cert policies empty */
  ntfLDS_ICAO_Certificate_Ext_CertPolicies_Empty(2415919675l),

  /** ICAO certificate extension: Cert policies policy ID missed */
  ntfLDS_ICAO_Certificate_Ext_CertPolicies_PolicyID_Missed(2415919676l),

  /** ICAO certificate extension: CRL dist point missed */
  ntfLDS_ICAO_Certificate_Ext_CRLDistPoint_Missed(2415919677l),

  /** ICAO certificate extension: CRL dist point incorrect data */
  ntfLDS_ICAO_Certificate_Ext_CRLDistPoint_IncorrectData(2415919678l),

  /** ICAO certificate extension: CRL dist point empty */
  ntfLDS_ICAO_Certificate_Ext_CRLDistPoint_Empty(2415919679l),

  /** ICAO certificate extension: CRL dist point point missed */
  ntfLDS_ICAO_Certificate_Ext_CRLDistPoint_PointMissed(2415919680l),

  /** ICAO certificate: SN non-compliant */
  ntfLDS_ICAO_Certificate_SN_NonCompliant(2415919681l),

  /** ICAO certificate: Issuer SN non-compliant */
  ntfLDS_ICAO_Certificate_Issuer_SN_NonCompliant(2415919682l),

  /** ICAO certificate: Subject SN non-compliant */
  ntfLDS_ICAO_Certificate_Subject_SN_NonCompliant(2415919683l),

  /** ICAO certificate: Issuer attribute non-compliant */
  ntfLDS_ICAO_Certificate_Issuer_AttributeNonCompliant(2415919684l),

  /** ICAO certificate: Subject attribute non-compliant */
  ntfLDS_ICAO_Certificate_Subject_AttributeNonCompliant(2415919685l),

  /** ICAO certificate: Issuer subject country non-matching */
  ntfLDS_ICAO_Certificate_IssuerSubject_Country_NonMatching(2415919686l),

  /** ICAO certificate extension: CSCA alt names non-matching */
  ntfLDS_ICAO_Certificate_Ext_CSCA_AltNames_NonMatching(2415919687l),

  /** ICAO certificate extension: Name change incorrect data */
  ntfLDS_ICAO_Certificate_Ext_NameChange_IncorrectData(2415919688l),

  /** ICAO certificate extension: Name change non-compliant */
  ntfLDS_ICAO_Certificate_Ext_NameChange_NonCompliant(2415919689l),

  /** ICAO certificate extension: Name change critical */
  ntfLDS_ICAO_Certificate_Ext_NameChange_Critical(2415919690l),

  /** ICAO certificate extension Doc type list: non-compliant */
  ntfLDS_ICAO_Certificate_Ext_DocTypeList_NonCompliant(2415919691l),

  /** ICAO certificate extension Doc type list: Critical */
  ntfLDS_ICAO_Certificate_Ext_DocTypeList_Critical(2415919692l),

  /** ICAO certificate extension: Optional critical */
  ntfLDS_ICAO_Certificate_Ext_Optional_Critical(2415919693l),

  /** ICAO certificate: Subject non-compliant */
  ntfLDS_ICAO_Certificate_Subject_NonCompliant(2415919694l),

  /** ICAO certificate: Subject common name non-compliant */
  ntfLDS_ICAO_Certificate_Subject_CommonNameNonCompliant(2415919695l),

  /** ICAO COM: LDS version incorrect */
  ntfLDS_ICAO_COM_LDS_Version_Incorrect(2415919136l),

  /** ICAO COM: LDS version missing */
  ntfLDS_ICAO_COM_LDS_Version_Missing(2415919137l),

  /** ICAO COM: Unicode version incorrect */
  ntfLDS_ICAO_COM_Unicode_Version_Incorrect(2415919138l),

  /** ICAO COM: Unicode version missing */
  ntfLDS_ICAO_COM_Unicode_Version_Missing(2415919139l),

  /** ICAO COM: DGPM incorrect */
  ntfLDS_ICAO_COM_DGPM_Incorrect(2415919140l),

  /** ICAO COM: DGPM missing */
  ntfLDS_ICAO_COM_DGPM_Missing(2415919141l),

  /** ICAO COM: DGPM unexpected */
  ntfLDS_ICAO_COM_DGPM_Unexpected(2415919142l),

  /** ICAO application: LDS version unsupported */
  ntfLDS_ICAO_Application_LDSVersion_Unsupported(2415919152l),

  /** ICAO application: Unicode version unsupported */
  ntfLDS_ICAO_Application_UnicodeVersion_Unsupported(2415919153l),

  /** ICAO application: LDS version inconsistent */
  ntfLDS_ICAO_Application_LDSVersion_Inconsistent(2415919154l),

  /** ICAO application: Unicode version inconsistent */
  ntfLDS_ICAO_Application_UnicodeVersion_Inconsistent(2415919155l),

  /** ASN signed data: OID incorrect */
  ntfLDS_ASN_SignedData_OID_Incorrect(2415919360l),

  /** ASN signed data: Version incorrect */
  ntfLDS_ASN_SignedData_Version_Incorrect(2415919520l),

  /** ASN signed data: Content OID incorrect */
  ntfLDS_ASN_SignedData_ContentOID_Incorrect(2415919521l),

  /** ICAO signed data: Version incorrect */
  ntfLDS_ICAO_SignedData_Version_Incorrect(2415919361l),

  /** ICAO signed data: Digest algorithms empty */
  ntfLDS_ICAO_SignedData_DigestAlgorithms_Empty(2415919362l),

  /** ICAO signed data: Digest algorithms unsupported */
  ntfLDS_ICAO_SignedData_DigestAlgorithms_Unsupported(2415919363l),

  /** ICAO signed data: Signer infos multiple entries */
  ntfLDS_ICAO_SignedData_SignerInfos_MultipleEntries(2415919369l),

  /** ICAO signed data: Certificates missed */
  ntfLDS_ICAO_SignedData_Certificates_Missed(2415919536l),

  /** ICAO signed data: Certificates empty */
  ntfLDS_ICAO_SignedData_Certificates_Empty(2415919537l),

  /** ICAO signed data: CRLs incorrect usage */
  ntfLDS_ICAO_SignedData_CRLs_IncorrectUsage(2415919538l),

  /** ICAO LDS object: Incorrect content OID */
  ntfLDS_ICAO_LDSObject_IncorrectContentOID(2415919364l),

  /** ICAO LDS object: DG number incorrect */
  ntfLDS_ICAO_LDSObject_DGNumber_Incorrect(2415919365l),

  /** ICAO LDS object: DG hash missing */
  ntfLDS_ICAO_LDSObject_DGHash_Missing(2415919366l),

  /** ICAO LDS object: DG hash extra */
  ntfLDS_ICAO_LDSObject_DGHash_Extra(2415919367l),

  /** ICAO LDS object: Version incorrect */
  ntfLDS_ICAO_LDSObject_Version_Incorrect(2415919368l),

  /** ICAO master list: Version incorrect */
  ntfLDS_ICAO_MasterList_Version_Incorrect(2415919552l),

  /** ICAO Deviation list: Version incorrect */
  ntfLDS_ICAO_DeviationList_Version_Incorrect(2415919560l),

  /** BSI: Defect list version incorrect */
  ntfLDS_BSI_DefectList_Version_Incorrect(2415919568l),

  /** BSI: Black list version incorrect */
  ntfLDS_BSI_BlackList_Version_Incorrect(2415919576l),

  /** ASN signer info: Version incorrect */
  ntfLDS_ASN_SignerInfo_Version_Incorrect(2415919370l),

  /** ASN signer info: SID incorrect choice */
  ntfLDS_ASN_SignerInfo_SID_IncorrectChoice(2415919371l),

  /** ASN signer info: SID digest algorithm not listed */
  ntfLDS_ASN_SignerInfo_SID_DigestAlgorithmNotListed(2415919372l),

  /** ASN signer info: Message digest attr missing */
  ntfLDS_ASN_SignerInfo_MessageDigestAttr_Missing(2415919373l),

  /** ASN signer info: Message digest attr data */
  ntfLDS_ASN_SignerInfo_MessageDigestAttr_Data(2415919374l),

  /** ASN signer info: Message digest attr value */
  ntfLDS_ASN_SignerInfo_MessageDigestAttr_Value(2415919375l),

  /** ASN signer info: Content type attr missing */
  ntfLDS_ASN_SignerInfo_ContentTypeAttr_Missing(2415919376l),

  /** ASN signer info: Content type attr data */
  ntfLDS_ASN_SignerInfo_ContentTypeAttr_Data(2415919377l),

  /** ASN signer info: Content type attr value */
  ntfLDS_ASN_SignerInfo_ContentTypeAttr_Value(2415919378l),

  /** ASN signer info: Signing time attr missing */
  ntfLDS_ASN_SignerInfo_SigningTimeAttr_Missing(2415919387l),

  /** ASN signer info: Signing time attr data */
  ntfLDS_ASN_SignerInfo_SigningTimeAttr_Data(2415919388l),

  /** ASN signer info: Signing time attr value */
  ntfLDS_ASN_SignerInfo_SigningTimeAttr_Value(2415919389l),

  /** ASN signer info: List content description attr missing */
  ntfLDS_ASN_SignerInfo_ListContentDescriptionAttr_Missing(2415919390l),

  /** ASN signer info: List content description attr data */
  ntfLDS_ASN_SignerInfo_ListContentDescriptionAttr_Data(2415919391l),

  /** Auth signer info: Certificate validity */
  ntfLDS_Auth_SignerInfo_Certificate_Validity(2415919381l),

  /** Auth signer info: Certificate root is not trusted */
  ntfLDS_Auth_SignerInfo_Certificate_RootIsNotTrusted(2415919382l),

  /** Auth signer info: Certificate cannot find CSCA */
  ntfLDS_Auth_SignerInfo_Certificate_CantFindCSCA(2415919383l),

  /** Auth signer info: Certificate revoked */
  ntfLDS_Auth_SignerInfo_Certificate_Revoked(2415919384l),

  /** Auth signer info: Certificate signature invalid */
  ntfLDS_Auth_SignerInfo_Certificate_SignatureInvalid(2415919385l),

  /** Notification: Unsupported image format */
  ntfLDS_UnsupportedImageFormat(2415919386l),

  /** MRZ: Document type unknown */
  ntfLDS_MRZ_DocumentType_Unknown(139272l),

  /** MRZ: Issuing state syntax error */
  ntfLDS_MRZ_IssuingState_SyntaxError(139273l),

  /** MRZ: Name is void */
  ntfLDS_MRZ_Name_IsVoid(139274l),

  /** MRZ: Number incorrect checksum */
  ntfLDS_MRZ_Number_IncorrectChecksum(139277l),

  /** MRZ: Nationality syntax error */
  ntfLDS_MRZ_Nationality_SyntaxError(139278l),

  /** MRZ: DOB syntax error */
  ntfLDS_MRZ_DOB_SyntaxError(139279l),

  /** MRZ: DOB error */
  ntfLDS_MRZ_DOB_Error(139280l),

  /** MRZ: DOB incorrect checksum */
  ntfLDS_MRZ_DOB_IncorrectChecksum(139281l),

  /** MRZ: Sex incorrect */
  ntfLDS_MRZ_Sex_Incorrect(139282l),

  /** MRZ: DOE syntax error */
  ntfLDS_MRZ_DOE_SyntaxError(139283l),

  /** MRZ: DOE error */
  ntfLDS_MRZ_DOE_Error(139284l),

  /** MRZ: DOE incorrect checksum */
  ntfLDS_MRZ_DOE_IncorrectChecksum(139285l),

  /** MRZ: Optional data incorrect checksum */
  ntfLDS_MRZ_OptionalData_IncorrectChecksum(139286l),

  /** MRZ: Incorrect checksum */
  ntfLDS_MRZ_IncorrectChecksum(139287l),

  /** MRZ: Incorrect */
  ntfLDS_MRZ_Incorrect(139288l),

  /** Biometrics: Format owner missing */
  ntfLDS_Biometrics_FormatOwner_Missing(2415984640l),

  /** Biometrics: Format owner incorrect */
  ntfLDS_Biometrics_FormatOwner_Incorrect(2416050176l),

  /** Biometrics: Format type missing */
  ntfLDS_Biometrics_FormatType_Missing(2416115712l),

  /** Biometrics: Format type incorrect */
  ntfLDS_Biometrics_FormatType_Incorrect(2416181248l),

  /** Biometrics: Type incorrect */
  ntfLDS_Biometrics_Type_Incorrect(2416246784l),

  /** Biometrics: Subtype missing */
  ntfLDS_Biometrics_SubType_Missing(2416312320l),

  /** Biometrics: Subtype incorrect */
  ntfLDS_Biometrics_SubType_Incorrect(2416377856l),

  /** Biometrics: BDB image missing */
  ntfLDS_Biometrics_BDB_Image_Missing(2416443392l),

  /** Biometrics: BDB format ID incorrect */
  ntfLDS_Biometrics_BDB_FormatID_Incorrect(2416508928l),

  /** Biometrics: BDB version incorrect */
  ntfLDS_Biometrics_BDB_Version_Incorrect(2416574464l),

  /** Biometrics: BDB data length incorrect */
  ntfLDS_Biometrics_BDB_DataLength_Incorrect(2416640000l),

  /** Biometrics: BDB Data Gender */
  ntfLDS_Biometrics_BDB_Data_Gender(2416967680l),

  /** Biometrics: BDB Data Eye Color */
  ntfLDS_Biometrics_BDB_Data_EyeColor(2417033216l),

  /** Biometrics: BDB Data Hair Color */
  ntfLDS_Biometrics_BDB_Data_HairColor(2417098752l),

  /** Biometrics: BDB Data Pose Angle Yaw */
  ntfLDS_Biometrics_BDB_Data_PoseAngle_Yaw(2417164288l),

  /** Biometrics: BDB Data Pose Angle Pitch */
  ntfLDS_Biometrics_BDB_Data_PoseAngle_Pitch(2417229824l),

  /** Biometrics: BDB Data Pose Angle Roll */
  ntfLDS_Biometrics_BDB_Data_PoseAngle_Roll(2417295360l),

  /** Biometrics: BDB Data Pose Angle U Yaw */
  ntfLDS_Biometrics_BDB_Data_PoseAngleU_Yaw(2417360896l),

  /** Biometrics: BDB Data Pose Angle U Pitch */
  ntfLDS_Biometrics_BDB_Data_PoseAngleU_Pitch(2417426432l),

  /** Biometrics: BDB Data Pose Angle U Roll */
  ntfLDS_Biometrics_BDB_Data_PoseAngleU_Roll(2417491968l),

  /** Biometrics: BDB Data Face Image Type */
  ntfLDS_Biometrics_BDB_Data_FaceImageType(2417557504l),

  /** Biometrics: BDB Data Image Data Type */
  ntfLDS_Biometrics_BDB_Data_ImageDataType(2417623040l),

  /** SI: PACE Info Unsupported Std Parameters */
  ntfLDS_SI_PACE_Info_UnsupportedStdParameters(2432696320l),

  /** SI: PACE Info Deprecated Version */
  ntfLDS_SI_PACE_Info_DeprecatedVersion(2432696321l),

  /** SI: PACE Domain Params Using Std Ref */
  ntfLDS_SI_PACE_DomainParams_UsingStdRef(2432696322l),

  /** SI: PACE Domain Params Unsupported Algorithm */
  ntfLDS_SI_PACE_DomainParams_UnsupportedAlgorithm(2432696323l),

  /** SI: CA Info Incorrect Version */
  ntfLDS_SI_CA_Info_IncorrectVersion(2432696324l),

  /** SI: CA PublicKey Unsupported Algorithm */
  ntfLDS_SI_CA_PublicKey_UnsupportedAlgorithm(2432696325l),

  /** SI: CA Domain Params Unsupported Algorithm */
  ntfLDS_SI_CA_DomainParams_UnsupportedAlgorithm(2432696326l),

  /** SI: TA Info Incorrect Version */
  ntfLDS_SI_TA_Info_IncorrectVersion(2432696327l),

  /** SI: TA Info File ID For Version 2 */
  ntfLDS_SI_TA_Info_FileIDForVersion2(2432696328l),

  /** SI: eID Security Unsupported Digest Algorithm */
  ntfLDS_SI_eIDSecurity_UnsupportedDigestAlgorithm(2432696329l),

  /** SI: RI info incorrect version */
  ntfLDS_SI_RI_Info_IncorrectVersion(2432696330l),

  /** SI: RI domain params unsupported algorithm */
  ntfLDS_SI_RI_DomainParams_UnsupportedAlgorithm(2432696331l),

  /** SI: AA info incorrect version */
  ntfLDS_SI_AA_Info_IncorrectVersion(2432696332l),

  /** SI: AA info unsupported algorithm */
  ntfLDS_SI_AA_Info_UnsupportedAlgorithm(2432696333l),

  /** SI: AA info inconsistent algorithm reference */
  ntfLDS_SI_AA_Info_InconsistentAlgorithmReference(2432696334l),

  /** SI: PACE Info Not Available */
  ntfLDS_SI_Storage_PACE_Info_NotAvailable(2432696576l),

  /** SI: PACE Info No Std Parameters */
  ntfLDS_SI_Storage_PACE_Info_NoStdParameters(2432696577l),

  /** SI: PACE Info No Matching Domain Params */
  ntfLDS_SI_Storage_PACE_Info_NoMatchingDomainParams(2432696578l),

  /** SI: CA Info Not Available */
  ntfLDS_SI_Storage_CA_Info_NotAvailable(2432696579l),

  /** SI: CA Domain Params No Required Option */
  ntfLDS_SI_Storage_CA_DomainParams_NoRequiredOption(2432696580l),

  /** SI: CA Domain Params Not Available */
  ntfLDS_SI_Storage_CA_DomainParams_NotAvailable(2432696581l),

  /** SI: CA Anonymous Infos */
  ntfLDS_SI_Storage_CA_AnonymousInfos(2432696582l),

  /** SI: CA Info No Matching Domain Params */
  ntfLDS_SI_Storage_CA_Info_NoMatchingDomainParams(2432696583l),

  /** SI: CA Info No Matching Public Key */
  ntfLDS_SI_Storage_CA_Info_NoMatchingPublicKey(2432696584l),

  /** SI: CA Incorrect Infos Quantity */
  ntfLDS_SI_Storage_CA_IncorrectInfosQuantity(2432696585l),

  /** SI: TA Info Not Available */
  ntfLDS_SI_Storage_TA_Info_NotAvailable(2432696586l),

  /** SI: Card Info Locator Multiple Entries */
  ntfLDS_SI_Storage_CardInfoLocator_MultipleEntries(2432696587l),

  /** SI: eID Security Info Multiple Entries */
  ntfLDS_SI_Storage_eIDSecurityInfo_MultipleEntries(2432696588l),

  /** SI: Privileged TI Multiple Entries */
  ntfLDS_SI_Storage_PrivilegedTI_MultipleEntries(2432696589l),

  /** SI: Privileged TI Incorrect Usage */
  ntfLDS_SI_Storage_PrivilegedTI_IncorrectUsage(2432696590l),

  /** SI: RI domain params multiple entries */
  ntfLDS_SI_Storage_RI_DomainParams_MultipleEntries(2432696591l),

  /** SI: Storage PACE Info Non Consistant */
  ntfLDS_SI_Storage_PACEInfos_NonConsistant(2432696592l),

  /** CV Certificate: Profile incorrect version */
  ntfLDS_CVCertificate_Profile_IncorrectVersion(2432696833l),

  /** CV Certificate: Validity */
  ntfLDS_CVCertificate_Validity(2432696834l),

  /** CV Certificate: Non CVCA domain parameters */
  ntfLDS_CVCertificate_NonCVCADomainParameters(2432696835l),

  /** CV Certificate: Private key incorrect version */
  ntfLDS_CV_Certificate_PrivateKey_IncorrectVersion(2432696836l),

  /** TA: PACE static binding used */
  ntfLDS_TA_PACEStaticBindingUsed(2432697088l),

  /** Auth ML signer info: Certificate validity */
  ntfLDS_Auth_MLSignerInfo_Certificate_Validity(2449473813l),

  /** Auth ML signer info: Certificate root is not trusted */
  ntfLDS_Auth_MLSignerInfo_Certificate_RootIsNotTrusted(2449473814l),

  /** Auth ML signer info: Certificate cannot find CSCA */
  ntfLDS_Auth_MLSignerInfo_Certificate_CantFindCSCA(2449473815l),

  /** Auth ML signer info: Certificate revoked */
  ntfLDS_Auth_MLSignerInfo_Certificate_Revoked(2449473816l),

  /** Auth ML signer info: Certificate signature invalid */
  ntfLDS_Auth_MLSignerInfo_Certificate_SignatureInvalid(2449473817l),

  /** Country Codes from certificate chain don&#39;t match */
  ntfLDS_ICAO_Certificate_Chain_Country_NonMatching(2415919696l),

  /** Country Codes from certificate and visual MRZ don&#39;t match */
  ntfLDS_ICAO_Certificate_VisualMrz_Country_NonMatching(2415919697l),

  /** Incorrect MRZ, country code doesn&#39;t match codes from Visual MRZ */
  ntfLDS_MRZ_CountryCode_VisualMrz_NonMatching(139289l),

  /** Country Codes from certificate and DG1 MRZ don&#39;t match */
  ntfLDS_ICAO_Certificate_MRZ_Country_NonMatching(2415919698l);

  private Long value;

  ParsingNotificationCodes(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ParsingNotificationCodes fromValue(Long value) {
    for (ParsingNotificationCodes b : ParsingNotificationCodes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ParsingNotificationCodes> {
    @Override
    public void write(final JsonWriter jsonWriter, final ParsingNotificationCodes enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ParsingNotificationCodes read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return ParsingNotificationCodes.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Long value = jsonElement.getAsLong();
    ParsingNotificationCodes.fromValue(value);
  }
}
