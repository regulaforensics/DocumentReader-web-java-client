/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 6.7.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

public class DocumentType {

  public static final int NOT_DEFINED = 0;

  public static final int PASSPORT = 11;

  public static final int IDENTITY_CARD = 12;

  public static final int DIPLOMATIC_PASSPORT = 13;

  public static final int SERVICE_PASSPORT = 14;

  public static final int SEAMANS_IDENTITY_DOCUMENT = 15;

  public static final int IDENTITY_CARD_FOR_RESIDENCE = 16;

  public static final int TRAVEL_DOCUMENT = 17;

  public static final int OTHER = 99;

  public static final int VISA_ID2 = 29;

  public static final int VISA_ID3 = 30;

  public static final int NATIONAL_IDENTITY_CARD = 20;

  public static final int SOCIAL_IDENTITY_CARD = 21;

  public static final int ALIENS_IDENTITY_CARD = 22;

  public static final int PRIVILEGED_IDENTITY_CARD = 23;

  public static final int RESIDENCE_PERMIT_IDENTITY_CARD = 24;

  public static final int ORIGIN_CARD = 25;

  public static final int EMERGENCY_PASSPORT = 26;

  public static final int ALIENS_PASSPORT = 27;

  public static final int ALTERNATIVE_IDENTITY_CARD = 28;

  public static final int AUTHORIZATION_CARD = 32;

  public static final int BEGINNER_PERMIT = 33;

  public static final int BORDER_CROSSING_CARD = 34;

  public static final int CHAUFFEUR_LICENSE = 35;

  public static final int CHAUFFEUR_LICENSE_UNDER_18 = 36;

  public static final int CHAUFFEUR_LICENSE_UNDER_21 = 37;

  public static final int COMMERCIAL_DRIVING_LICENSE = 38;

  public static final int COMMERCIAL_DRIVING_LICENSE_INSTRUCTIONAL_PERMIT = 39;

  public static final int COMMERCIAL_DRIVING_LICENSE_UNDER_18 = 40;

  public static final int COMMERCIAL_DRIVING_LICENSE_UNDER_21 = 41;

  public static final int COMMERCIAL_INSTRUCTION_PERMIT = 42;

  public static final int COMMERCIAL_NEW_PERMIT = 43;

  public static final int CONCEALED_CARRY_LICENSE = 44;

  public static final int CONCEALED_FIREARM_PERMIT = 45;

  public static final int CONDITIONAL_DRIVING_LICENSE = 46;

  public static final int DEPARTMENT_OF_VETERANS_AFFAIRS_IDENTITY_CARD = 47;

  public static final int DIPLOMATIC_DRIVING_LICENSE = 48;

  public static final int DRIVING_LICENSE = 49;

  public static final int DRIVING_LICENSE_INSTRUCTIONAL_PERMIT = 50;

  public static final int DRIVING_LICENSE_INSTRUCTIONAL_PERMIT_UNDER_18 = 51;

  public static final int DRIVING_LICENSE_INSTRUCTIONAL_PERMIT_UNDER_21 = 52;

  public static final int DRIVING_LICENSE_LEARNERS_PERMIT = 53;

  public static final int DRIVING_LICENSE_LEARNERS_PERMIT_UNDER_18 = 54;

  public static final int DRIVING_LICENSE_LEARNERS_PERMIT_UNDER_21 = 55;

  public static final int DRIVING_LICENSE_NOVICE = 56;

  public static final int DRIVING_LICENSE_NOVICE_UNDER_18 = 57;

  public static final int DRIVING_LICENSE_NOVICE_UNDER_21 = 58;

  public static final int DRIVING_LICENSE_REGISTERED_OFFENDER = 59;

  public static final int DRIVING_LICENSE_RESTRICTED_UNDER_18 = 60;

  public static final int DRIVING_LICENSE_RESTRICTED_UNDER_21 = 61;

  public static final int DRIVING_LICENSE_TEMPORARY_VISITOR = 62;

  public static final int DRIVING_LICENSE_TEMPORARY_VISITOR_UNDER_18 = 63;

  public static final int DRIVING_LICENSE_TEMPORARY_VISITOR_UNDER_21 = 64;

  public static final int DRIVING_LICENSE_UNDER_18 = 65;

  public static final int DRIVING_LICENSE_UNDER_21 = 66;

  public static final int EMPLOYMENT_DRIVING_PERMIT = 67;

  public static final int ENHANCED_CHAUFFEUR_LICENSE = 68;

  public static final int ENHANCED_CHAUFFEUR_LICENSE_UNDER_18 = 69;

  public static final int ENHANCED_CHAUFFEUR_LICENSE_UNDER_21 = 70;

  public static final int ENHANCED_COMMERCIAL_DRIVING_LICENSE = 71;

  public static final int ENHANCED_DRIVING_LICENSE = 72;

  public static final int ENHANCED_DRIVING_LICENSE_UNDER_18 = 73;

  public static final int ENHANCED_DRIVING_LICENSE_UNDER_21 = 74;

  public static final int ENHANCED_IDENTITY_CARD = 75;

  public static final int ENHANCED_IDENTITY_CARD_UNDER_18 = 76;

  public static final int ENHANCED_IDENTITY_CARD_UNDER_21 = 77;

  public static final int ENHANCED_OPERATORS_LICENSE = 78;

  public static final int FIREARMS_PERMIT = 79;

  public static final int FULL_PROVISIONAL_LICENSE = 80;

  public static final int FULL_PROVISIONAL_LICENSE_UNDER_18 = 81;

  public static final int FULL_PROVISIONAL_LICENSE_UNDER_21 = 82;

  public static final int GENEVA_CONVENTIONS_IDENTITY_CARD = 83;

  public static final int GRADUATED_DRIVING_LICENSE_UNDER_18 = 84;

  public static final int GRADUATED_DRIVING_LICENSE_UNDER_21 = 85;

  public static final int GRADUATED_INSTRUCTION_PERMIT_UNDER_18 = 86;

  public static final int GRADUATED_INSTRUCTION_PERMIT_UNDER_21 = 87;

  public static final int GRADUATED_LICENSE_UNDER_18 = 88;

  public static final int GRADUATED_LICENSE_UNDER_21 = 89;

  public static final int HANDGUN_CARRY_PERMIT = 90;

  public static final int IDENTITY_AND_PRIVILEGE_CARD = 91;

  public static final int IDENTITY_CARD_MOBILITY_IMPAIRED = 92;

  public static final int IDENTITY_CARD_REGISTERED_OFFENDER = 93;

  public static final int IDENTITY_CARD_TEMPORARY_VISITOR = 94;

  public static final int IDENTITY_CARD_TEMPORARY_VISITOR_UNDER_18 = 95;

  public static final int IDENTITY_CARD_TEMPORARY_VISITOR_UNDER_21 = 96;

  public static final int IDENTITY_CARD_UNDER_18 = 97;

  public static final int IDENTITY_CARD_UNDER_21 = 98;

  public static final int IGNITION_INTERLOCK_PERMIT = 100;

  public static final int IMMIGRANT_VISA = 101;

  public static final int INSTRUCTION_PERMIT = 102;

  public static final int INSTRUCTION_PERMIT_UNDER_18 = 103;

  public static final int INSTRUCTION_PERMIT_UNDER_21 = 104;

  public static final int INTERIM_DRIVING_LICENSE = 105;

  public static final int INTERIM_IDENTITY_CARD = 106;

  public static final int INTERMEDIATE_DRIVING_LICENSE = 107;

  public static final int INTERMEDIATE_DRIVING_LICENSE_UNDER_18 = 108;

  public static final int INTERMEDIATE_DRIVING_LICENSE_UNDER_21 = 109;

  public static final int JUNIOR_DRIVING_LICENSE = 110;

  public static final int LEARNER_INSTRUCTIONAL_PERMIT = 111;

  public static final int LEARNER_LICENSE = 112;

  public static final int LEARNER_LICENSE_UNDER_18 = 113;

  public static final int LEARNER_LICENSE_UNDER_21 = 114;

  public static final int LEARNER_PERMIT = 115;

  public static final int LEARNER_PERMIT_UNDER_18 = 116;

  public static final int LEARNER_PERMIT_UNDER_21 = 117;

  public static final int LIMITED_LICENSE = 118;

  public static final int LIMITED_PERMIT = 119;

  public static final int LIMITED_TERM_DRIVING_LICENSE = 120;

  public static final int LIMITED_TERM_IDENTITY_CARD = 121;

  public static final int LIQUOR_IDENTITY_CARD = 122;

  public static final int NEW_PERMIT = 123;

  public static final int NEW_PERMIT_UNDER_18 = 124;

  public static final int NEW_PERMIT_UNDER_21 = 125;

  public static final int NON_US_CITIZEN_DRIVING_LICENSE = 126;

  public static final int OCCUPATIONAL_DRIVING_LICENSE = 127;

  public static final int ONEIDA_TRIBE_OF_INDIANS_IDENTITY_CARD = 128;

  public static final int OPERATOR_LICENSE = 129;

  public static final int OPERATOR_LICENSE_UNDER_18 = 130;

  public static final int OPERATOR_LICENSE_UNDER_21 = 131;

  public static final int PERMANENT_DRIVING_LICENSE = 132;

  public static final int PERMIT_TO_REENTER = 133;

  public static final int PROBATIONARY_AUTO_LICENSE = 134;

  public static final int PROBATIONARY_DRIVING_LICENSE_UNDER_18 = 135;

  public static final int PROBATIONARY_DRIVING_LICENSE_UNDER_21 = 136;

  public static final int PROBATIONARY_VEHICLE_SALES_PERSON_LICENSE = 137;

  public static final int PROVISIONAL_DRIVING_LICENSE = 138;

  public static final int PROVISIONAL_DRIVING_LICENSE_UNDER_18 = 139;

  public static final int PROVISIONAL_DRIVING_LICENSE_UNDER_21 = 140;

  public static final int PROVISIONAL_LICENSE = 141;

  public static final int PROVISIONAL_LICENSE_UNDER_18 = 142;

  public static final int PROVISIONAL_LICENSE_UNDER_21 = 143;

  public static final int PUBLIC_PASSENGER_CHAUFFEUR_LICENSE = 144;

  public static final int RACING_AND_GAMING_COMISSION_CARD = 145;

  public static final int REFUGEE_TRAVEL_DOCUMENT = 146;

  public static final int RENEWAL_PERMIT = 147;

  public static final int RESTRICTED_COMMERCIAL_DRIVER_LICENSE = 148;

  public static final int RESTRICTED_DRIVER_LICENSE = 149;

  public static final int RESTRICTED_PERMIT = 150;

  public static final int SEASONAL_PERMIT = 151;

  public static final int SEASONAL_RESIDENT_IDENTITY_CARD = 152;

  public static final int SEASONAL_CITIZEN_IDENTITY_CARD = 153;

  public static final int SEX_OFFENDER = 154;

  public static final int SOCIAL_SECURITY_CARD = 155;

  public static final int TEMPORARY_DRIVING_LICENSE = 156;

  public static final int TEMPORARY_DRIVING_LICENSE_UNDER_18 = 157;

  public static final int TEMPORARY_DRIVING_LICENSE_UNDER_21 = 158;

  public static final int TEMPORARY_IDENTITY_CARD = 159;

  public static final int TEMPORARY_INSTRUCTION_PERMIT_IDENTITY_CARD = 160;

  public static final int TEMPORARY_INSTRUCTION_PERMIT_IDENTITY_CARD_UNDER_18 = 161;

  public static final int TEMPORARY_INSTRUCTION_PERMIT_IDENTITY_CARD_UNDER_21 = 162;

  public static final int TEMPORARY_VISITOR_DRIVING_LICENSE = 163;

  public static final int TEMPORARY_VISITOR_DRIVING_LICENSE_UNDER_18 = 164;

  public static final int TEMPORARY_VISITOR_DRIVING_LICENSE_UNDER_21 = 165;

  public static final int UNIFORMED_SERVICES_IDENTITY_CARD = 166;

  public static final int VEHICLE_SALES_PERSON_LICENSE = 167;

  public static final int WORKER_IDENTIFICATION_CREDENTIAL = 168;

  public static final int COMMERCIAL_DRIVING_LICENSE_NOVICE = 169;

  public static final int COMMERCIAL_DRIVING_LICENSE_NOVICE_UNDER_18 = 170;

  public static final int COMMERCIAL_DRIVING_LICENSE_NOVICE_UNDER_21 = 171;

  public static final int PASSPORT_CARD = 172;

  public static final int PASSPORT_RESIDENT_CARD = 173;

  public static final int PERSONAL_IDENTIFICATION_VERIFICATION = 174;

  public static final int TEMPORARY_OPERATOR_LICENSE = 175;

  public static final int DRIVING_LICENSE_UNDER_19 = 176;

  public static final int IDENTITY_CARD_UNDER_19 = 177;

  public static final int VISA = 178;

  public static final int TEMPORARY_PASSPORT = 179;

  public static final int VOTING_CARD = 180;

  public static final int HEALTH_CARD = 181;

  public static final int CERTIFICATE_OF_CITIZENSHIP = 182;

  public static final int ADDRESS_CARD = 183;

  public static final int AIRPORT_IMMIGRATION_CARD = 184;

  public static final int ALIEN_REGISTRATION_CARD = 185;

  public static final int APEH_CARD = 186;

  public static final int COUPON_TO_DRIVING_LICENSE = 187;

  public static final int CREW_MEMBER_CERTIFICATE = 188;

  public static final int DOCUMENT_FOR_RETURN = 189;

  public static final int E_CARD = 190;

  public static final int EMPLOYMENT_CARD = 191;

  public static final int HKSAR_IMMIGRATION_FORM = 192;

  public static final int IMMIGRANT_CARD = 193;

  public static final int LABOUR_CARD = 194;

  public static final int LAISSEZ_PASSER = 195;

  public static final int LAWYER_IDENTITY_CERTIFICATE = 196;

  public static final int LICENSE_CARD = 197;

  public static final int PASSPORT_STATELESS = 198;

  public static final int PASSPORT_CHILD = 199;

  public static final int PASSPORT_CONSULAR = 200;

  public static final int PASSPORT_DIPLOMATIC_SERVICE = 201;

  public static final int PASSPORT_OFFICIAL = 202;

  public static final int PASSPORT_PROVISIONAL = 203;

  public static final int PASSPORT_SPECIAL = 204;

  public static final int PERMISSION_TO_THE_LOCAL_BORDER_TRAFFIC = 205;

  public static final int REGISTRATION_CERTIFICATE = 206;

  public static final int SEDESOL_CARD = 207;

  public static final int SOCIAL_CARD = 208;

  public static final int TB_CARD = 209;

  public static final int VEHICLE_PASSPORT = 210;

  public static final int W_DOCUMENT = 211;

  public static final int DIPLOMATIC_IDENTITY_CARD = 212;

  public static final int CONSULAR_IDENTITY_CARD = 213;

  public static final int INCOME_TAX_CARD = 214;

  public static final int RESIDENCE_PERMIT = 215;

  public static final int DOCUMENT_OF_IDENTITY = 216;

  public static final int BORDER_CROSSING_PERMIT = 217;

  public static final int PASSPORT_LIMITED_VALIDITY = 218;

  public static final int SIM_CARD = 219;

  public static final int TAX_CARD = 220;

  public static final int COMPANY_CARD = 221;

  public static final int DOMESTIC_PASSPORT = 222;

  public static final int IDENTITY_CERTIFICATE = 223;

  public static final int RESIDENT_ID_CARD = 224;

  public static final int ARMED_FORCES_IDENTITY_CARD = 225;

  public static final int PROFESSIONAL_CARD = 226;

  public static final int REGISTRATION_STAMP = 227;

  public static final int DRIVER_CARD = 228;

  public static final int DRIVER_TRAINING_CERTIFICATE = 229;

  public static final int QUALIFICATION_DRIVING_LICENSE = 230;

  public static final int MEMBERSHIP_CARD = 231;

  public static final int PUBLIC_VEHICLE_DRIVER_AUTHORITY_CARD = 232;

  public static final int MARINE_LICENSE = 233;

  public static final int TEMPORARY_LEARNER_LICENSE = 234;

  public static final int TEMPORARY_COMMERCIAL_DRIVING_LICENSE = 235;

  public static final int INTERIM_INSTRUCTIONAL_PERMIT = 236;

  public static final int CERTIFICATE_OF_COMPETENCY = 237;

  public static final int CERTIFICATE_OF_PROFICIENCY = 238;

  public static final int TRADE_LICENSE = 239;

  public static final int PASSPORT_PAGE = 240;
}
