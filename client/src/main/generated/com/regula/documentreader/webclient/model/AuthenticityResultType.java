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

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;


public class AuthenticityResultType {

        /**
        * No authenticity control procedure
        */
    public static final   int   NONE = 0;

        /**
        * Document luminescence check in UV light
        */
    public static final   int   UV_LUMINESCENCE = 1;

        /**
        * B900 ink MRZ contrast check in IR light
        */
    public static final   int   IR_B900 = 2;

        /**
        * Image patterns presence/absence check (position, shape, color)
        */
    public static final   int   IMAGE_PATTERN = 4;

        /**
        * Confirm laminate integrity check in axial light
        */
    public static final   int   AXIAL_PROTECTION = 8;

        /**
        * Protection fibers presence check (color, density) in UV light
        */
    public static final   int   UV_FIBERS = 16;

        /**
        * Document elements visibility check in IR light
        */
    public static final   int   IR_VISIBILITY = 32;

        /**
        * OCR for the text field in UV light comparison with other text sources check
        */
    public static final   int   OCR_SECURITY_TEXT = 64;

        /**
        * Invisible Personal Information (IPI) visualization
        */
    public static final   int   IPI = 128;

        /**
        * Document photo check in IR light
        */
    public static final   int   IR_PHOTO = 256;

        /**
        * Owner&#39;s photo embedding check (is photo printed or sticked)
        */
    public static final   int   PHOTO_EMBED_TYPE = 512;

        /**
        * OVI check. Deprecated, use Document liveness check instead
        */
    public static final   int   OVI = 1024;

        /**
        * IR luminescence check
        */
    public static final   int   IR_LUMINESCENCE = 2048;

        /**
        * Hologram presence check. Deprecated
        */
    public static final   int   HOLOGRAMS = 4096;

        /**
        * Owner&#39;s photo area advanced check (photo shape, size, position, etc.)
        */
    public static final   int   PHOTO_AREA = 8192;

        /**
        * UV background check
        */
    public static final   int   UV_BACKGROUND = 16384;

        /**
        * Portrait comparison check (document printed vs chip vs live)
        */
    public static final   int   PORTRAIT_COMPARISON = 32768;

        /**
        * Barcode format check (code metadata, data format, contents format, etc.)
        */
    public static final   int   BARCODE_FORMAT_CHECK = 65536;

        /**
        * Kinegram check
        */
    public static final   int   KINEGRAM = 131072;

        /**
        * LetterScreen check
        */
    public static final   int   LETTER_SCREEN = 262144;

        /**
        * Hologram detection and validation check
        */
    public static final   int   HOLOGRAM_DETECTION = 524288;

        /**
        * Fingerprint comparison check
        */
    public static final   int   FINGERPRINT_COMPARISON = 1048576;

        /**
        * Document liveness check
        */
    public static final   int   LIVENESS = 2097152;

        /**
        * Extended OCR Check
        */
    public static final   int   EXTENDED_OCR_CHECK = 4194304;

        /**
        * Extended MRZ check
        */
    public static final   int   EXTENDED_MRZ_CHECK = 8388608;

        /**
        * Encrypted IPI
        */
    public static final   int   ENCRYPTED_IPI = 16777216;

        /**
        * Flag for status-only authenticity
        */
    public static final   int   STATUS_ONLY = 2147483648;

}

