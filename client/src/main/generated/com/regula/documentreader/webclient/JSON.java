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

package com.regula.documentreader.webclient;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.gsonfire.GsonFireBuilder;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Map;
import okio.ByteString;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
  private static Gson gson;
  private static boolean isLenientOnJson = false;
  private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
  private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
  private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter =
      new OffsetDateTimeTypeAdapter();
  private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
  private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

  @SuppressWarnings("unchecked")
  public static GsonBuilder createGson() {
    GsonFireBuilder fireBuilder = new GsonFireBuilder();
    GsonBuilder builder = fireBuilder.createGsonBuilder();
    return builder;
  }

  private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
    JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
    if (null == element) {
      throw new IllegalArgumentException(
          "missing discriminator field: <" + discriminatorField + ">");
    }
    return element.getAsString();
  }

  /**
   * Returns the Java class that implements the OpenAPI schema for the specified discriminator
   * value.
   *
   * @param classByDiscriminatorValue The map of discriminator values to Java classes.
   * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
   * @return The Java class that implements the OpenAPI schema
   */
  private static Class getClassByDiscriminator(
      Map classByDiscriminatorValue, String discriminatorValue) {
    Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
    if (null == clazz) {
      throw new IllegalArgumentException(
          "cannot determine model class of name: <" + discriminatorValue + ">");
    }
    return clazz;
  }

  static {
    GsonBuilder gsonBuilder = createGson();
    gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
    gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
    gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
    gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
    gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.AreaArray.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.AreaContainer.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.AuthParams.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.AuthenticityCheckList
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.AuthenticityCheckResult
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.AuthenticityCheckResultListInner
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.AuthenticityResult
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.BcPDF417INFO.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.BcROIDETECT.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.BinaryData.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.ByteArrayResult.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.ChosenDocumentType
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.ChosenDocumentTypeResult
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.ContainerList.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.ContainerListListInner
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.CrossSourceValueComparison
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.DataModule.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.DetailsOptical.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.DetailsRFID.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.DeviceInfo.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.DocBarCodeInfo.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.DocBarCodeInfoFieldsList
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.DocVisualExtendedFieldRect
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.DocVisualExtendedFieldRfid
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.DocVisualExtendedInfo
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.DocVisualExtendedInfoPArrayFieldsInner
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.DocumentBinaryInfoResult
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.DocumentImage.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.DocumentImageResult
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.DocumentPosition.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.DocumentPositionResult
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.DocumentTypesCandidates
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.DocumentTypesCandidatesList
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.DocumentTypesCandidatesResult
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.EncryptedRCLResult
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.FDSIDList.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.FaceApi.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.FaceApiSearch.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.FiberResult.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.GetTransactionsByTagResponse
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.GraphicFieldRect.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.GraphicFieldRfid.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.GraphicFieldsList.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.GraphicFieldsListPArrayFieldsInner
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.GraphicsResult.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.Healthcheck.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.HealthcheckDocumentsDatabase
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.IdentResult.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.ImageData.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.ImageQA.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.ImageQualityCheck.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.ImageQualityCheckList
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.ImageQualityResult
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.Images.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.ImagesAvailableSource
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.ImagesField.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.ImagesFieldValue.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.ImagesResult.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.InData.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.InDataTransactionImagesFieldValue
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.InDataVideo.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.LexicalAnalysisResult
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.LicenseResult.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.ListTransactionsByTagResponse
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.ListVerifiedFields
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.LivenessParams.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.OCRSecurityTextResult
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.OneCandidate.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.OriginalSymbol.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.OutData.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.OutDataTransactionImagesFieldValue
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.PArrayField.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.PerDocumentConfig.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.PhotoIdentResult.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.Point.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.PointArray.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.PointsContainer.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.ProcessParams.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.ProcessParamsRfid.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.ProcessRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.ProcessRequestImage
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.ProcessResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.ProcessSystemInfo.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.RawImageContainerList
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.RectangleCoordinates
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.RfidAccessControlInfo
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.RfidAccessKey.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.RfidApplication.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.RfidAttributeData.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.RfidAttributeName.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.RfidCardPropertiesExt
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.RfidCertificateEx.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.RfidDG1.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.RfidDataFile.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.RfidDistinguishedName
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.RfidOrigin.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.RfidPkiExtension.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.RfidSecurityObject
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.RfidSessionData.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.RfidSignerInfoEx.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.RfidTerminal.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.RfidValidity.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.SecurityFeatureResult
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.SourceValidity.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.Status.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.StatusResult.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.StringRecognitionResult
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.SymbolCandidate.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.SymbolRecognitionResult
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.TDocBinaryInfo.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.Text.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.TextAvailableSource
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.TextDataResult.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.TextField.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.TextFieldValue.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.TextResult.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.TransactionImage.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.TransactionInfo.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.TransactionInfoDocumentsDatabase
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.TransactionProcessGetResponse
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.TransactionProcessRequest
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.TransactionProcessResponse
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.TransactionProcessResult
            .CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.TrfFtBytes.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.TrfFtBytesType.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.TrfFtString.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.TrfFtStringStatus.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.TrfFtStringType.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.regula.documentreader.webclient.model.VerifiedFieldMap.CustomTypeAdapterFactory());
    gson = gsonBuilder.create();
  }

  /**
   * Get Gson.
   *
   * @return Gson
   */
  public static Gson getGson() {
    return gson;
  }

  /**
   * Set Gson.
   *
   * @param gson Gson
   */
  public static void setGson(Gson gson) {
    JSON.gson = gson;
  }

  public static void setLenientOnJson(boolean lenientOnJson) {
    isLenientOnJson = lenientOnJson;
  }

  /**
   * Serialize the given Java object into JSON string.
   *
   * @param obj Object
   * @return String representation of the JSON
   */
  public static String serialize(Object obj) {
    return gson.toJson(obj);
  }

  /**
   * Deserialize the given JSON string to Java object.
   *
   * @param <T> Type
   * @param body The JSON string
   * @param returnType The type to deserialize into
   * @return The deserialized Java object
   */
  @SuppressWarnings("unchecked")
  public static <T> T deserialize(String body, Type returnType) {
    try {
      if (isLenientOnJson) {
        JsonReader jsonReader = new JsonReader(new StringReader(body));
        // see
        // https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
        jsonReader.setLenient(true);
        return gson.fromJson(jsonReader, returnType);
      } else {
        return gson.fromJson(body, returnType);
      }
    } catch (JsonParseException e) {
      // Fallback processing when failed to parse JSON form response body:
      // return the response body string directly for the String return type;
      if (returnType.equals(String.class)) {
        return (T) body;
      } else {
        throw (e);
      }
    }
  }

  /** Gson TypeAdapter for Byte Array type */
  public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

    @Override
    public void write(JsonWriter out, byte[] value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        out.value(ByteString.of(value).base64());
      }
    }

    @Override
    public byte[] read(JsonReader in) throws IOException {
      switch (in.peek()) {
        case NULL:
          in.nextNull();
          return null;
        default:
          String bytesAsBase64 = in.nextString();
          ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
          return byteString.toByteArray();
      }
    }
  }

  /** Gson TypeAdapter for JSR310 OffsetDateTime type */
  public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

    private DateTimeFormatter formatter;

    public OffsetDateTimeTypeAdapter() {
      this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }

    public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
      this.formatter = formatter;
    }

    public void setFormat(DateTimeFormatter dateFormat) {
      this.formatter = dateFormat;
    }

    @Override
    public void write(JsonWriter out, OffsetDateTime date) throws IOException {
      if (date == null) {
        out.nullValue();
      } else {
        out.value(formatter.format(date));
      }
    }

    @Override
    public OffsetDateTime read(JsonReader in) throws IOException {
      switch (in.peek()) {
        case NULL:
          in.nextNull();
          return null;
        default:
          String date = in.nextString();
          if (date.endsWith("+0000")) {
            date = date.substring(0, date.length() - 5) + "Z";
          }
          return OffsetDateTime.parse(date, formatter);
      }
    }
  }

  /** Gson TypeAdapter for JSR310 LocalDate type */
  public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

    private DateTimeFormatter formatter;

    public LocalDateTypeAdapter() {
      this(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public LocalDateTypeAdapter(DateTimeFormatter formatter) {
      this.formatter = formatter;
    }

    public void setFormat(DateTimeFormatter dateFormat) {
      this.formatter = dateFormat;
    }

    @Override
    public void write(JsonWriter out, LocalDate date) throws IOException {
      if (date == null) {
        out.nullValue();
      } else {
        out.value(formatter.format(date));
      }
    }

    @Override
    public LocalDate read(JsonReader in) throws IOException {
      switch (in.peek()) {
        case NULL:
          in.nextNull();
          return null;
        default:
          String date = in.nextString();
          return LocalDate.parse(date, formatter);
      }
    }
  }

  public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
    offsetDateTimeTypeAdapter.setFormat(dateFormat);
  }

  public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
    localDateTypeAdapter.setFormat(dateFormat);
  }

  /**
   * Gson TypeAdapter for java.sql.Date type If the dateFormat is null, a simple "yyyy-MM-dd" format
   * will be used (more efficient than SimpleDateFormat).
   */
  public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

    private DateFormat dateFormat;

    public SqlDateTypeAdapter() {}

    public SqlDateTypeAdapter(DateFormat dateFormat) {
      this.dateFormat = dateFormat;
    }

    public void setFormat(DateFormat dateFormat) {
      this.dateFormat = dateFormat;
    }

    @Override
    public void write(JsonWriter out, java.sql.Date date) throws IOException {
      if (date == null) {
        out.nullValue();
      } else {
        String value;
        if (dateFormat != null) {
          value = dateFormat.format(date);
        } else {
          value = date.toString();
        }
        out.value(value);
      }
    }

    @Override
    public java.sql.Date read(JsonReader in) throws IOException {
      switch (in.peek()) {
        case NULL:
          in.nextNull();
          return null;
        default:
          String date = in.nextString();
          try {
            if (dateFormat != null) {
              return new java.sql.Date(dateFormat.parse(date).getTime());
            }
            return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
          } catch (ParseException e) {
            throw new JsonParseException(e);
          }
      }
    }
  }

  /**
   * Gson TypeAdapter for java.util.Date type If the dateFormat is null, ISO8601Utils will be used.
   */
  public static class DateTypeAdapter extends TypeAdapter<Date> {

    private DateFormat dateFormat;

    public DateTypeAdapter() {}

    public DateTypeAdapter(DateFormat dateFormat) {
      this.dateFormat = dateFormat;
    }

    public void setFormat(DateFormat dateFormat) {
      this.dateFormat = dateFormat;
    }

    @Override
    public void write(JsonWriter out, Date date) throws IOException {
      if (date == null) {
        out.nullValue();
      } else {
        String value;
        if (dateFormat != null) {
          value = dateFormat.format(date);
        } else {
          value = ISO8601Utils.format(date, true);
        }
        out.value(value);
      }
    }

    @Override
    public Date read(JsonReader in) throws IOException {
      try {
        switch (in.peek()) {
          case NULL:
            in.nextNull();
            return null;
          default:
            String date = in.nextString();
            try {
              if (dateFormat != null) {
                return dateFormat.parse(date);
              }
              return ISO8601Utils.parse(date, new ParsePosition(0));
            } catch (ParseException e) {
              throw new JsonParseException(e);
            }
        }
      } catch (IllegalArgumentException e) {
        throw new JsonParseException(e);
      }
    }
  }

  public static void setDateFormat(DateFormat dateFormat) {
    dateTypeAdapter.setFormat(dateFormat);
  }

  public static void setSqlDateFormat(DateFormat dateFormat) {
    sqlDateTypeAdapter.setFormat(dateFormat);
  }
}
