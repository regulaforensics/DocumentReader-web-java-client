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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** DocumentPosition */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class DocumentPosition {
  public static final String SERIALIZED_NAME_DOC_FORMAT = "docFormat";

  @SerializedName(SERIALIZED_NAME_DOC_FORMAT)
  @javax.annotation.Nonnull
  private DocumentFormat docFormat;

  public static final String SERIALIZED_NAME_ANGLE = "Angle";

  @SerializedName(SERIALIZED_NAME_ANGLE)
  @javax.annotation.Nonnull
  private BigDecimal angle;

  public static final String SERIALIZED_NAME_WIDTH = "Width";

  @SerializedName(SERIALIZED_NAME_WIDTH)
  @javax.annotation.Nonnull
  private Integer width;

  public static final String SERIALIZED_NAME_HEIGHT = "Height";

  @SerializedName(SERIALIZED_NAME_HEIGHT)
  @javax.annotation.Nonnull
  private Integer height;

  public static final String SERIALIZED_NAME_CENTER = "Center";

  @SerializedName(SERIALIZED_NAME_CENTER)
  @javax.annotation.Nonnull
  private Point center;

  public static final String SERIALIZED_NAME_LEFT_BOTTOM = "LeftBottom";

  @SerializedName(SERIALIZED_NAME_LEFT_BOTTOM)
  @javax.annotation.Nonnull
  private Point leftBottom;

  public static final String SERIALIZED_NAME_LEFT_TOP = "LeftTop";

  @SerializedName(SERIALIZED_NAME_LEFT_TOP)
  @javax.annotation.Nonnull
  private Point leftTop;

  public static final String SERIALIZED_NAME_RIGHT_BOTTOM = "RightBottom";

  @SerializedName(SERIALIZED_NAME_RIGHT_BOTTOM)
  @javax.annotation.Nonnull
  private Point rightBottom;

  public static final String SERIALIZED_NAME_RIGHT_TOP = "RightTop";

  @SerializedName(SERIALIZED_NAME_RIGHT_TOP)
  @javax.annotation.Nonnull
  private Point rightTop;

  public static final String SERIALIZED_NAME_DPI = "Dpi";

  @SerializedName(SERIALIZED_NAME_DPI)
  @javax.annotation.Nonnull
  private Integer dpi;

  public static final String SERIALIZED_NAME_INVERSE = "Inverse";

  @SerializedName(SERIALIZED_NAME_INVERSE)
  @javax.annotation.Nullable
  private Integer inverse;

  public static final String SERIALIZED_NAME_OBJ_AREA = "ObjArea";

  @SerializedName(SERIALIZED_NAME_OBJ_AREA)
  @javax.annotation.Nullable
  private Integer objArea;

  public static final String SERIALIZED_NAME_OBJ_INT_ANGLE_DEV = "ObjIntAngleDev";

  @SerializedName(SERIALIZED_NAME_OBJ_INT_ANGLE_DEV)
  @javax.annotation.Nullable
  private Integer objIntAngleDev;

  public static final String SERIALIZED_NAME_PERSPECTIVE_TR = "PerspectiveTr";

  @SerializedName(SERIALIZED_NAME_PERSPECTIVE_TR)
  @javax.annotation.Nullable
  private Integer perspectiveTr;

  public static final String SERIALIZED_NAME_RESULT_STATUS = "ResultStatus";

  @SerializedName(SERIALIZED_NAME_RESULT_STATUS)
  @javax.annotation.Nullable
  private Integer resultStatus;

  public DocumentPosition() {}

  public DocumentPosition docFormat(@javax.annotation.Nonnull DocumentFormat docFormat) {
    this.docFormat = docFormat;
    return this;
  }

  /**
   * Get docFormat
   *
   * @return docFormat
   */
  @javax.annotation.Nonnull
  public DocumentFormat getDocFormat() {
    return docFormat;
  }

  public void setDocFormat(@javax.annotation.Nonnull DocumentFormat docFormat) {
    this.docFormat = docFormat;
  }

  public DocumentPosition angle(@javax.annotation.Nonnull BigDecimal angle) {
    this.angle = angle;
    return this;
  }

  /**
   * Document rotation angle
   *
   * @return angle
   */
  @javax.annotation.Nonnull
  public BigDecimal getAngle() {
    return angle;
  }

  public void setAngle(@javax.annotation.Nonnull BigDecimal angle) {
    this.angle = angle;
  }

  public DocumentPosition width(@javax.annotation.Nonnull Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Document width
   *
   * @return width
   */
  @javax.annotation.Nonnull
  public Integer getWidth() {
    return width;
  }

  public void setWidth(@javax.annotation.Nonnull Integer width) {
    this.width = width;
  }

  public DocumentPosition height(@javax.annotation.Nonnull Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Document height
   *
   * @return height
   */
  @javax.annotation.Nonnull
  public Integer getHeight() {
    return height;
  }

  public void setHeight(@javax.annotation.Nonnull Integer height) {
    this.height = height;
  }

  public DocumentPosition center(@javax.annotation.Nonnull Point center) {
    this.center = center;
    return this;
  }

  /**
   * Get center
   *
   * @return center
   */
  @javax.annotation.Nonnull
  public Point getCenter() {
    return center;
  }

  public void setCenter(@javax.annotation.Nonnull Point center) {
    this.center = center;
  }

  public DocumentPosition leftBottom(@javax.annotation.Nonnull Point leftBottom) {
    this.leftBottom = leftBottom;
    return this;
  }

  /**
   * Get leftBottom
   *
   * @return leftBottom
   */
  @javax.annotation.Nonnull
  public Point getLeftBottom() {
    return leftBottom;
  }

  public void setLeftBottom(@javax.annotation.Nonnull Point leftBottom) {
    this.leftBottom = leftBottom;
  }

  public DocumentPosition leftTop(@javax.annotation.Nonnull Point leftTop) {
    this.leftTop = leftTop;
    return this;
  }

  /**
   * Get leftTop
   *
   * @return leftTop
   */
  @javax.annotation.Nonnull
  public Point getLeftTop() {
    return leftTop;
  }

  public void setLeftTop(@javax.annotation.Nonnull Point leftTop) {
    this.leftTop = leftTop;
  }

  public DocumentPosition rightBottom(@javax.annotation.Nonnull Point rightBottom) {
    this.rightBottom = rightBottom;
    return this;
  }

  /**
   * Get rightBottom
   *
   * @return rightBottom
   */
  @javax.annotation.Nonnull
  public Point getRightBottom() {
    return rightBottom;
  }

  public void setRightBottom(@javax.annotation.Nonnull Point rightBottom) {
    this.rightBottom = rightBottom;
  }

  public DocumentPosition rightTop(@javax.annotation.Nonnull Point rightTop) {
    this.rightTop = rightTop;
    return this;
  }

  /**
   * Get rightTop
   *
   * @return rightTop
   */
  @javax.annotation.Nonnull
  public Point getRightTop() {
    return rightTop;
  }

  public void setRightTop(@javax.annotation.Nonnull Point rightTop) {
    this.rightTop = rightTop;
  }

  public DocumentPosition dpi(@javax.annotation.Nonnull Integer dpi) {
    this.dpi = dpi;
    return this;
  }

  /**
   * Get dpi
   *
   * @return dpi
   */
  @javax.annotation.Nonnull
  public Integer getDpi() {
    return dpi;
  }

  public void setDpi(@javax.annotation.Nonnull Integer dpi) {
    this.dpi = dpi;
  }

  public DocumentPosition inverse(@javax.annotation.Nullable Integer inverse) {
    this.inverse = inverse;
    return this;
  }

  /**
   * Get inverse
   *
   * @return inverse
   */
  @javax.annotation.Nullable
  public Integer getInverse() {
    return inverse;
  }

  public void setInverse(@javax.annotation.Nullable Integer inverse) {
    this.inverse = inverse;
  }

  public DocumentPosition objArea(@javax.annotation.Nullable Integer objArea) {
    this.objArea = objArea;
    return this;
  }

  /**
   * Get objArea
   *
   * @return objArea
   */
  @javax.annotation.Nullable
  public Integer getObjArea() {
    return objArea;
  }

  public void setObjArea(@javax.annotation.Nullable Integer objArea) {
    this.objArea = objArea;
  }

  public DocumentPosition objIntAngleDev(@javax.annotation.Nullable Integer objIntAngleDev) {
    this.objIntAngleDev = objIntAngleDev;
    return this;
  }

  /**
   * Get objIntAngleDev
   *
   * @return objIntAngleDev
   */
  @javax.annotation.Nullable
  public Integer getObjIntAngleDev() {
    return objIntAngleDev;
  }

  public void setObjIntAngleDev(@javax.annotation.Nullable Integer objIntAngleDev) {
    this.objIntAngleDev = objIntAngleDev;
  }

  public DocumentPosition perspectiveTr(@javax.annotation.Nullable Integer perspectiveTr) {
    this.perspectiveTr = perspectiveTr;
    return this;
  }

  /**
   * Get perspectiveTr
   *
   * @return perspectiveTr
   */
  @javax.annotation.Nullable
  public Integer getPerspectiveTr() {
    return perspectiveTr;
  }

  public void setPerspectiveTr(@javax.annotation.Nullable Integer perspectiveTr) {
    this.perspectiveTr = perspectiveTr;
  }

  public DocumentPosition resultStatus(@javax.annotation.Nullable Integer resultStatus) {
    this.resultStatus = resultStatus;
    return this;
  }

  /**
   * Get resultStatus
   *
   * @return resultStatus
   */
  @javax.annotation.Nullable
  public Integer getResultStatus() {
    return resultStatus;
  }

  public void setResultStatus(@javax.annotation.Nullable Integer resultStatus) {
    this.resultStatus = resultStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentPosition documentPosition = (DocumentPosition) o;
    return Objects.equals(this.docFormat, documentPosition.docFormat)
        && Objects.equals(this.angle, documentPosition.angle)
        && Objects.equals(this.width, documentPosition.width)
        && Objects.equals(this.height, documentPosition.height)
        && Objects.equals(this.center, documentPosition.center)
        && Objects.equals(this.leftBottom, documentPosition.leftBottom)
        && Objects.equals(this.leftTop, documentPosition.leftTop)
        && Objects.equals(this.rightBottom, documentPosition.rightBottom)
        && Objects.equals(this.rightTop, documentPosition.rightTop)
        && Objects.equals(this.dpi, documentPosition.dpi)
        && Objects.equals(this.inverse, documentPosition.inverse)
        && Objects.equals(this.objArea, documentPosition.objArea)
        && Objects.equals(this.objIntAngleDev, documentPosition.objIntAngleDev)
        && Objects.equals(this.perspectiveTr, documentPosition.perspectiveTr)
        && Objects.equals(this.resultStatus, documentPosition.resultStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        docFormat,
        angle,
        width,
        height,
        center,
        leftBottom,
        leftTop,
        rightBottom,
        rightTop,
        dpi,
        inverse,
        objArea,
        objIntAngleDev,
        perspectiveTr,
        resultStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentPosition {\n");
    sb.append("    docFormat: ").append(toIndentedString(docFormat)).append("\n");
    sb.append("    angle: ").append(toIndentedString(angle)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    center: ").append(toIndentedString(center)).append("\n");
    sb.append("    leftBottom: ").append(toIndentedString(leftBottom)).append("\n");
    sb.append("    leftTop: ").append(toIndentedString(leftTop)).append("\n");
    sb.append("    rightBottom: ").append(toIndentedString(rightBottom)).append("\n");
    sb.append("    rightTop: ").append(toIndentedString(rightTop)).append("\n");
    sb.append("    dpi: ").append(toIndentedString(dpi)).append("\n");
    sb.append("    inverse: ").append(toIndentedString(inverse)).append("\n");
    sb.append("    objArea: ").append(toIndentedString(objArea)).append("\n");
    sb.append("    objIntAngleDev: ").append(toIndentedString(objIntAngleDev)).append("\n");
    sb.append("    perspectiveTr: ").append(toIndentedString(perspectiveTr)).append("\n");
    sb.append("    resultStatus: ").append(toIndentedString(resultStatus)).append("\n");
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
    openapiFields.add("docFormat");
    openapiFields.add("Angle");
    openapiFields.add("Width");
    openapiFields.add("Height");
    openapiFields.add("Center");
    openapiFields.add("LeftBottom");
    openapiFields.add("LeftTop");
    openapiFields.add("RightBottom");
    openapiFields.add("RightTop");
    openapiFields.add("Dpi");
    openapiFields.add("Inverse");
    openapiFields.add("ObjArea");
    openapiFields.add("ObjIntAngleDev");
    openapiFields.add("PerspectiveTr");
    openapiFields.add("ResultStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("docFormat");
    openapiRequiredFields.add("Angle");
    openapiRequiredFields.add("Width");
    openapiRequiredFields.add("Height");
    openapiRequiredFields.add("Center");
    openapiRequiredFields.add("LeftBottom");
    openapiRequiredFields.add("LeftTop");
    openapiRequiredFields.add("RightBottom");
    openapiRequiredFields.add("RightTop");
    openapiRequiredFields.add("Dpi");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocumentPosition
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!DocumentPosition.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in DocumentPosition is not found in the empty JSON string",
                DocumentPosition.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!DocumentPosition.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `DocumentPosition` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : DocumentPosition.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the required field `docFormat`
    DocumentFormat.validateJsonElement(jsonObj.get("docFormat"));
    // validate the required field `Center`
    Point.validateJsonElement(jsonObj.get("Center"));
    // validate the required field `LeftBottom`
    Point.validateJsonElement(jsonObj.get("LeftBottom"));
    // validate the required field `LeftTop`
    Point.validateJsonElement(jsonObj.get("LeftTop"));
    // validate the required field `RightBottom`
    Point.validateJsonElement(jsonObj.get("RightBottom"));
    // validate the required field `RightTop`
    Point.validateJsonElement(jsonObj.get("RightTop"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!DocumentPosition.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'DocumentPosition' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<DocumentPosition> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(DocumentPosition.class));

      return (TypeAdapter<T>)
          new TypeAdapter<DocumentPosition>() {
            @Override
            public void write(JsonWriter out, DocumentPosition value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public DocumentPosition read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of DocumentPosition given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentPosition
   * @throws IOException if the JSON string is invalid with respect to DocumentPosition
   */
  public static DocumentPosition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentPosition.class);
  }

  /**
   * Convert an instance of DocumentPosition to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
