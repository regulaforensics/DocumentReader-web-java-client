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
import com.google.gson.annotations.SerializedName;


public class BarCodeModuleType {

        /**
        * Module contains text data
        */
    public static final   int   TEXT = 0;

        /**
        * Module contains byte data
        */
    public static final   int   BYTE = 1;

        /**
        * Module contains numeric data
        */
    public static final   int   NUM = 2;

        /**
        * Shifts in byte compaction mode (for PDF417)
        */
    public static final   int   SHIFT = 3;

        /**
        * Module contains any data
        */
    public static final   int   ALL = 4;

}

