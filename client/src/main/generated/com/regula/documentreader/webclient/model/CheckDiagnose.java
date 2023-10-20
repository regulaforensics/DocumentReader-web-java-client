/*
 * Regula Document Reader Web
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 6.9.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

public class CheckDiagnose {

  public static final int UNKNOWN = 0;

  public static final int PASS = 1;

  public static final int INVALID_INPUT_DATA = 2;

  public static final int INTERNAL_ERROR = 3;

  public static final int EXCEPTION_IN_MODULE = 4;

  public static final int UNCERTAIN_VERIFICATION = 5;

  public static final int NECESSARY_IMAGE_NOT_FOUND = 7;

  public static final int PHOTO_SIDES_NOT_FOUND = 8;

  public static final int INVALID_CHECKSUM = 10;

  public static final int SYNTAX_ERROR = 11;

  public static final int LOGIC_ERROR = 12;

  public static final int SOURCES_COMPARISON_ERROR = 13;

  public static final int FIELDS_COMPARISON_LOGIC_ERROR = 14;

  public static final int INVALID_FIELD_FORMAT = 15;

  public static final int TRUE_LUMINESCENCE_ERROR = 20;

  public static final int FALSE_LUMINESCENCE_ERROR = 21;

  public static final int FIXED_PATTERN_ERROR = 22;

  public static final int LOW_CONTRAST_IN_IR_LIGHT = 23;

  public static final int INCORRECT_BACKGROUND_LIGHT = 24;

  public static final int BACKGROUND_COMPARISON_ERROR = 25;

  public static final int INCORRECT_TEXT_COLOR = 26;

  public static final int PHOTO_FALSE_LUMINESCENCE = 27;

  public static final int TOO_MUCH_SHIFT = 28;

  public static final int FIBERS_NOT_FOUND = 30;

  public static final int TOO_MANY_OBJECTS = 31;

  public static final int SPECKS_IN_UV = 33;

  public static final int TOO_LOW_RESOLUTION = 34;

  public static final int INVISIBLE_ELEMENT_PRESENT = 40;

  public static final int VISIBLE_ELEMENT_ABSENT = 41;

  public static final int ELEMENT_SHOULD_BE_COLORED = 42;

  public static final int ELEMENT_SHOULD_BE_GRAYSCALE = 43;

  public static final int PHOTO_WHITE_IR_DONT_MATCH = 44;

  public static final int UV_DULL_PAPER_MRZ = 50;

  public static final int FALSE_LUMINESCENCE_IN_MRZ = 51;

  public static final int UV_DULL_PAPER_PHOTO = 52;

  public static final int UV_DULL_PAPER_BLANK = 53;

  public static final int UV_DULL_PAPER_ERROR = 54;

  public static final int FALSE_LUMINESCENCE_IN_BLANK = 55;

  public static final int BAD_AREA_IN_AXIAL = 60;

  public static final int FALSE_IP_PARAMETERS = 65;

  public static final int FIELD_POS_CORRECTOR_HIGHLIGHT_IR = 80;

  public static final int FIELD_POS_CORRECTOR_GLARES_IN_PHOTO_AREA = 81;

  public static final int FIELD_POS_CORRECTOR_PHOTO_REPLACED = 82;

  public static final int FIELD_POS_CORRECTOR_LANDMARKS_CHECK_ERROR = 83;

  public static final int FIELD_POS_CORRECTOR_FACE_PRESENCE_CHECK_ERROR = 84;

  public static final int FIELD_POS_CORRECTOR_FACE_ABSENCE_CHECK_ERROR = 85;

  public static final int OVI_IR_INVISIBLE = 90;

  public static final int OVI_INSUFFICIENT_AREA = 91;

  public static final int OVI_COLOR_INVARIABLE = 92;

  public static final int OVI_BAD_COLOR_FRONT = 93;

  public static final int OVI_BAD_COLOR_SIDE = 94;

  public static final int OVI_WIDE_COLOR_SPREAD = 95;

  public static final int OVI_BAD_COLOR_PERCENT = 96;

  public static final int HOLOGRAM_ELEMENT_ABSENT = 100;

  public static final int HOLOGRAM_SIDE_TOP_IMAGES_ABSENT = 101;

  public static final int HOLOGRAM_ELEMENT_PRESENT = 102;

  public static final int HOLOGRAM_FRAMES_IS_ABSENT = 103;

  public static final int HOLOGRAM_HOLO_FIELD_IS_ABSENT = 104;

  public static final int PHOTO_PATTERN_INTERRUPTED = 110;

  public static final int PHOTO_PATTERN_SHIFTED = 111;

  public static final int PHOTO_PATTERN_DIFFERENT_COLORS = 112;

  public static final int PHOTO_PATTERN_IR_VISIBLE = 113;

  public static final int PHOTO_PATTERN_NOT_INTERSECT = 114;

  public static final int PHOTO_SIZE_IS_WRONG = 115;

  public static final int PHOTO_PATTERN_INVALID_COLOR = 116;

  public static final int PHOTO_PATTERN_SHIFTED_VERT = 117;

  public static final int PHOTO_PATTERN_PATTERN_NOT_FOUND = 118;

  public static final int PHOTO_PATTERN_DIFFERENT_LINES_THICKNESS = 119;

  public static final int PHOTO_IS_NOT_RECTANGLE = 120;

  public static final int PHOTO_CORNERS_IS_WRONG = 121;

  public static final int DOCUMENT_IS_CANCELLING = 122;

  public static final int TEXT_COLOR_SHOULD_BE_BLUE = 130;

  public static final int TEXT_COLOR_SHOULD_BE_GREEN = 131;

  public static final int TEXT_COLOR_SHOULD_BE_RED = 132;

  public static final int TEXT_SHOULD_BE_BLACK = 133;

  public static final int BARCODE_WAS_READ_WITH_ERRORS = 140;

  public static final int BARCODE_DATA_FORMAT_ERROR = 141;

  public static final int BARCODE_SIZE_PARAMS_ERROR = 142;

  public static final int NOT_ALL_BARCODES_READ = 143;

  public static final int GLARES_IN_BARCODE_AREA = 144;

  public static final int PORTRAIT_COMPARISON_PORTRAITS_DIFFER = 150;

  public static final int PORTRAIT_COMPARISON_NO_SERVICE_REPLY = 151;

  public static final int PORTRAIT_COMPARISON_SERVICE_ERROR = 152;

  public static final int PORTRAIT_COMPARISON_NOT_ENOUGH_IMAGES = 153;

  public static final int PORTRAIT_COMPARISON_NO_LIVE_PHOTO = 154;

  public static final int PORTRAIT_COMPARISON_NO_SERVICE_LICENSE = 155;

  public static final int PORTRAIT_COMPARISON_NO_PORTRAIT_DETECTED = 156;

  public static final int MOBILE_IMAGES_UNSUITABLE_LIGHT_CONDITIONS = 160;

  public static final int MOBILE_IMAGES_WHITE_UV_NO_DIFFERENCE = 161;

  public static final int FINGERPRINTS_COMPARISON_MISMATCH = 170;

  public static final int HOLO_PHOTO_FACE_NOT_DETECTED = 180;

  public static final int HOLO_PHOTO_FACE_COMPARISON_FAILED = 181;

  public static final int HOLO_PHOTO_GLARE_IN_CENTER_ABSENT = 182;

  public static final int HOLO_PHOTO_HOLO_ELEMENT_SHAPE_ERROR = 183;

  public static final int HOLO_PHOTO_ALGORITHMS_STEPS_ERROR = 184;

  public static final int HOLO_PHOTO_HOLO_AREAS_NOT_LOADED = 185;

  public static final int HOLO_PHOTO_FINISHED_BY_TIMEOUT = 186;

  public static final int HOLO_PHOTO_DOCUMENT_OUTSIDE_FRAME = 187;

  public static final int LIVENESS_DEPTH_CHECK_FAILED = 190;

  public static final int MRZ_QUALITY_WRONG_SYMBOL_POSITION = 200;

  public static final int MRZ_QUALITY_WRONG_BACKGROUND = 201;

  public static final int MRZ_QUALITY_WRONG_MRZ_WIDTH = 202;

  public static final int MRZ_QUALITY_WRONG_MRZ_HEIGHT = 203;

  public static final int MRZ_QUALITY_WRONG_LINE_POSITION = 204;

  public static final int MRZ_QUALITY_WRONG_FONT_TYPE = 205;

  public static final int OCR_QUALITY_TEXT_POSITION = 220;

  public static final int OCR_QUALITY_INVALID_FONT = 221;

  public static final int OCR_QUALITY_INVALID_BACKGROUND = 222;

  public static final int LASINK_INVALID_LINES_FREQUENCY = 230;

  public static final int DOC_LIVENESS_ELECTRONIC_DEVICE_DETECTED = 240;

  public static final int DOC_LIVENESS_INVALID_BARCODE_BACKGROUND = 241;

  public static final int LAST_DIAGNOSE_VALUE = 250;
}
