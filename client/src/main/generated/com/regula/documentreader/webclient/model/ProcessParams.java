/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 5.7.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** ProcessParams */
public class ProcessParams {
  public static final String SERIALIZED_NAME_SCENARIO = "scenario";

  @SerializedName(SERIALIZED_NAME_SCENARIO)
  private String scenario;

  public static final String SERIALIZED_NAME_RESULT_TYPE_OUTPUT = "resultTypeOutput";

  @SerializedName(SERIALIZED_NAME_RESULT_TYPE_OUTPUT)
  private List<Integer> resultTypeOutput = null;

  public static final String SERIALIZED_NAME_DOUBLE_PAGE_SPREAD = "doublePageSpread";

  @SerializedName(SERIALIZED_NAME_DOUBLE_PAGE_SPREAD)
  private Boolean doublePageSpread;

  public static final String SERIALIZED_NAME_GENERATE_DOUBLE_PAGE_SPREAD_IMAGE =
      "generateDoublePageSpreadImage";

  @SerializedName(SERIALIZED_NAME_GENERATE_DOUBLE_PAGE_SPREAD_IMAGE)
  private Boolean generateDoublePageSpreadImage;

  public static final String SERIALIZED_NAME_FIELD_TYPES_FILTER = "fieldTypesFilter";

  @SerializedName(SERIALIZED_NAME_FIELD_TYPES_FILTER)
  private List<Integer> fieldTypesFilter = null;

  public static final String SERIALIZED_NAME_DATE_FORMAT = "dateFormat";

  @SerializedName(SERIALIZED_NAME_DATE_FORMAT)
  private String dateFormat;

  public static final String SERIALIZED_NAME_MEASURE_SYSTEM = "measureSystem";

  @SerializedName(SERIALIZED_NAME_MEASURE_SYSTEM)
  private Integer measureSystem;

  public static final String SERIALIZED_NAME_IMAGE_DPI_OUT_MAX = "imageDpiOutMax";

  @SerializedName(SERIALIZED_NAME_IMAGE_DPI_OUT_MAX)
  private Integer imageDpiOutMax;

  public static final String SERIALIZED_NAME_ALREADY_CROPPED = "alreadyCropped";

  @SerializedName(SERIALIZED_NAME_ALREADY_CROPPED)
  private Boolean alreadyCropped;

  public static final String SERIALIZED_NAME_CUSTOM_PARAMS = "customParams";

  @SerializedName(SERIALIZED_NAME_CUSTOM_PARAMS)
  private Map<String, Object> customParams = null;

  public static final String SERIALIZED_NAME_CONFIG = "config";

  @SerializedName(SERIALIZED_NAME_CONFIG)
  private List<PerDocumentConfig> config = null;

  public static final String SERIALIZED_NAME_LOG = "log";

  @SerializedName(SERIALIZED_NAME_LOG)
  private Boolean log;

  public static final String SERIALIZED_NAME_LOG_LEVEL = "logLevel";

  @SerializedName(SERIALIZED_NAME_LOG_LEVEL)
  private String logLevel;

  public static final String SERIALIZED_NAME_FORCE_DOC_I_D = "forceDocID";

  @SerializedName(SERIALIZED_NAME_FORCE_DOC_I_D)
  private Integer forceDocID;

  public static final String SERIALIZED_NAME_MATCH_TEXT_FIELD_MASK = "matchTextFieldMask";

  @SerializedName(SERIALIZED_NAME_MATCH_TEXT_FIELD_MASK)
  private Boolean matchTextFieldMask;

  public static final String SERIALIZED_NAME_FAST_DOC_DETECT = "fastDocDetect";

  @SerializedName(SERIALIZED_NAME_FAST_DOC_DETECT)
  private Boolean fastDocDetect;

  public static final String SERIALIZED_NAME_UPDATE_O_C_R_VALIDITY_BY_GLARE =
      "updateOCRValidityByGlare";

  @SerializedName(SERIALIZED_NAME_UPDATE_O_C_R_VALIDITY_BY_GLARE)
  private Boolean updateOCRValidityByGlare;

  public static final String SERIALIZED_NAME_CHECK_REQUIRED_TEXT_FIELDS = "checkRequiredTextFields";

  @SerializedName(SERIALIZED_NAME_CHECK_REQUIRED_TEXT_FIELDS)
  private Boolean checkRequiredTextFields;

  public static final String SERIALIZED_NAME_RETURN_CROPPED_BARCODE = "returnCroppedBarcode";

  @SerializedName(SERIALIZED_NAME_RETURN_CROPPED_BARCODE)
  private Boolean returnCroppedBarcode;

  public static final String SERIALIZED_NAME_IMAGE_Q_A = "imageQA";

  @SerializedName(SERIALIZED_NAME_IMAGE_Q_A)
  private ImageQA imageQA;

  public static final String SERIALIZED_NAME_FORCE_DOC_FORMAT = "forceDocFormat";

  @SerializedName(SERIALIZED_NAME_FORCE_DOC_FORMAT)
  private Integer forceDocFormat;

  public static final String SERIALIZED_NAME_NO_GRAPHICS = "noGraphics";

  @SerializedName(SERIALIZED_NAME_NO_GRAPHICS)
  private Boolean noGraphics;

  public static final String SERIALIZED_NAME_DOCUMENT_AREA_MIN = "documentAreaMin";

  @SerializedName(SERIALIZED_NAME_DOCUMENT_AREA_MIN)
  private Float documentAreaMin;

  public static final String SERIALIZED_NAME_DEPERSONALIZE_LOG = "depersonalizeLog";

  @SerializedName(SERIALIZED_NAME_DEPERSONALIZE_LOG)
  private Boolean depersonalizeLog;

  public static final String SERIALIZED_NAME_MULTI_DOC_ON_IMAGE = "multiDocOnImage";

  @SerializedName(SERIALIZED_NAME_MULTI_DOC_ON_IMAGE)
  private Boolean multiDocOnImage;

  public static final String SERIALIZED_NAME_SHIFT_EXPIRY_DATE = "shiftExpiryDate";

  @SerializedName(SERIALIZED_NAME_SHIFT_EXPIRY_DATE)
  private Integer shiftExpiryDate;

  public static final String SERIALIZED_NAME_MINIMAL_HOLDER_AGE = "minimalHolderAge";

  @SerializedName(SERIALIZED_NAME_MINIMAL_HOLDER_AGE)
  private Integer minimalHolderAge;

  public static final String SERIALIZED_NAME_RETURN_UNCROPPED_IMAGE = "returnUncroppedImage";

  @SerializedName(SERIALIZED_NAME_RETURN_UNCROPPED_IMAGE)
  private Boolean returnUncroppedImage;

  public static final String SERIALIZED_NAME_MRZ_FORMATS_FILTER = "mrzFormatsFilter";

  @SerializedName(SERIALIZED_NAME_MRZ_FORMATS_FILTER)
  private List<String> mrzFormatsFilter = null;

  public static final String SERIALIZED_NAME_FORCE_READ_MRZ_BEFORE_LOCATE =
      "forceReadMrzBeforeLocate";

  @SerializedName(SERIALIZED_NAME_FORCE_READ_MRZ_BEFORE_LOCATE)
  private Boolean forceReadMrzBeforeLocate;

  public static final String SERIALIZED_NAME_PARSE_BARCODES = "parseBarcodes";

  @SerializedName(SERIALIZED_NAME_PARSE_BARCODES)
  private Boolean parseBarcodes;

  public ProcessParams withScenario(String scenario) {
    this.scenario = scenario;
    return this;
  }

  /**
   * Get scenario
   *
   * @return scenario
   */
  public String getScenario() {
    return scenario;
  }

  public void setScenario(String scenario) {
    this.scenario = scenario;
  }

  public ProcessParams withResultTypeOutput(List<Integer> resultTypeOutput) {
    this.resultTypeOutput = resultTypeOutput;
    return this;
  }

  public ProcessParams addResultTypeOutputItem(Integer resultTypeOutputItem) {
    if (this.resultTypeOutput == null) {
      this.resultTypeOutput = new ArrayList<Integer>();
    }
    this.resultTypeOutput.add(resultTypeOutputItem);
    return this;
  }

  /**
   * Types of results to return in response. See &#39;Result&#39; enum for available options
   *
   * @return resultTypeOutput
   */
  @javax.annotation.Nullable
  public List<Integer> getResultTypeOutput() {
    return resultTypeOutput;
  }

  public void setResultTypeOutput(List<Integer> resultTypeOutput) {
    this.resultTypeOutput = resultTypeOutput;
  }

  public ProcessParams withDoublePageSpread(Boolean doublePageSpread) {
    this.doublePageSpread = doublePageSpread;
    return this;
  }

  /**
   * This option can be set to true if the image you provide contains double page spread of the
   * passport and you want to process both pages in one go. It makes sense to use it for documents
   * that have meaningful information on both pages, like Russian domestic passport, or some others.
   * By default is set to false.
   *
   * @return doublePageSpread
   */
  @javax.annotation.Nullable
  public Boolean getDoublePageSpread() {
    return doublePageSpread;
  }

  public void setDoublePageSpread(Boolean doublePageSpread) {
    this.doublePageSpread = doublePageSpread;
  }

  public ProcessParams withGenerateDoublePageSpreadImage(Boolean generateDoublePageSpreadImage) {
    this.generateDoublePageSpreadImage = generateDoublePageSpreadImage;
    return this;
  }

  /**
   * When enabled together with \&quot;doublePageSpread\&quot; and there is a passport with two
   * pages spread in the image, pages will be cropped, straightened and aligned together, as if the
   * document was captured on a flatbed scanner.
   *
   * @return generateDoublePageSpreadImage
   */
  @javax.annotation.Nullable
  public Boolean getGenerateDoublePageSpreadImage() {
    return generateDoublePageSpreadImage;
  }

  public void setGenerateDoublePageSpreadImage(Boolean generateDoublePageSpreadImage) {
    this.generateDoublePageSpreadImage = generateDoublePageSpreadImage;
  }

  public ProcessParams withFieldTypesFilter(List<Integer> fieldTypesFilter) {
    this.fieldTypesFilter = fieldTypesFilter;
    return this;
  }

  public ProcessParams addFieldTypesFilterItem(Integer fieldTypesFilterItem) {
    if (this.fieldTypesFilter == null) {
      this.fieldTypesFilter = new ArrayList<Integer>();
    }
    this.fieldTypesFilter.add(fieldTypesFilterItem);
    return this;
  }

  /**
   * List of text field types to extract. If empty, all text fields from template will be extracted.
   * Narrowing the list can shorten processing time. By default is empty.
   *
   * @return fieldTypesFilter
   */
  @javax.annotation.Nullable
  public List<Integer> getFieldTypesFilter() {
    return fieldTypesFilter;
  }

  public void setFieldTypesFilter(List<Integer> fieldTypesFilter) {
    this.fieldTypesFilter = fieldTypesFilter;
  }

  public ProcessParams withDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

  /**
   * This option allows you to set dates format so that solution will return dates in this format.
   * For example, if you supply &#39;MM/dd/yyyy&#39;, and document have printed date &#39;09 JUL
   * 2020&#39; for the date os issue, you will get &#39;07/09/2020&#39; as a result. By default it
   * is set to system locale default (where the service is running).
   *
   * @return dateFormat
   */
  @javax.annotation.Nullable
  public String getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }

  public ProcessParams withMeasureSystem(Integer measureSystem) {
    this.measureSystem = measureSystem;
    return this;
  }

  /**
   * Get measureSystem
   *
   * @return measureSystem
   */
  @javax.annotation.Nullable
  public Integer getMeasureSystem() {
    return measureSystem;
  }

  public void setMeasureSystem(Integer measureSystem) {
    this.measureSystem = measureSystem;
  }

  public ProcessParams withImageDpiOutMax(Integer imageDpiOutMax) {
    this.imageDpiOutMax = imageDpiOutMax;
    return this;
  }

  /**
   * This option controls maximum resolution in dpi of output images. Resolution will remain
   * original in case 0 is supplied. By default is set to return images in response with resolution
   * not greater than 300 dpi.
   *
   * @return imageDpiOutMax
   */
  @javax.annotation.Nullable
  public Integer getImageDpiOutMax() {
    return imageDpiOutMax;
  }

  public void setImageDpiOutMax(Integer imageDpiOutMax) {
    this.imageDpiOutMax = imageDpiOutMax;
  }

  public ProcessParams withAlreadyCropped(Boolean alreadyCropped) {
    this.alreadyCropped = alreadyCropped;
    return this;
  }

  /**
   * This option can be set to true if you know for sure that the image you provide contains already
   * cropped document by its edges. This was designed to process on the server side images captured
   * and cropped on mobile. By default is set to false.
   *
   * @return alreadyCropped
   */
  @javax.annotation.Nullable
  public Boolean getAlreadyCropped() {
    return alreadyCropped;
  }

  public void setAlreadyCropped(Boolean alreadyCropped) {
    this.alreadyCropped = alreadyCropped;
  }

  public ProcessParams withCustomParams(Map<String, Object> customParams) {
    this.customParams = customParams;
    return this;
  }

  public ProcessParams putCustomParamsItem(String key, Object customParamsItem) {
    if (this.customParams == null) {
      this.customParams = new HashMap<String, Object>();
    }
    this.customParams.put(key, customParamsItem);
    return this;
  }

  /**
   * This option allows to pass custom processing parameters that can be implemented in future
   * without changing API.
   *
   * @return customParams
   */
  @javax.annotation.Nullable
  public Map<String, Object> getCustomParams() {
    return customParams;
  }

  public void setCustomParams(Map<String, Object> customParams) {
    this.customParams = customParams;
  }

  public ProcessParams withConfig(List<PerDocumentConfig> config) {
    this.config = config;
    return this;
  }

  public ProcessParams addConfigItem(PerDocumentConfig configItem) {
    if (this.config == null) {
      this.config = new ArrayList<PerDocumentConfig>();
    }
    this.config.add(configItem);
    return this;
  }

  /**
   * This option allows to set additional custom configuration per document type. If recognized
   * document has id specified in config, processing adjusts according to designated configuration.
   *
   * @return config
   */
  @javax.annotation.Nullable
  public List<PerDocumentConfig> getConfig() {
    return config;
  }

  public void setConfig(List<PerDocumentConfig> config) {
    this.config = config;
  }

  public ProcessParams withLog(Boolean log) {
    this.log = log;
    return this;
  }

  /**
   * This option can be set to true if you need to get base64 string of transaction processing log.
   *
   * @return log
   */
  @javax.annotation.Nullable
  public Boolean getLog() {
    return log;
  }

  public void setLog(Boolean log) {
    this.log = log;
  }

  public ProcessParams withLogLevel(String logLevel) {
    this.logLevel = logLevel;
    return this;
  }

  /**
   * Get logLevel
   *
   * @return logLevel
   */
  @javax.annotation.Nullable
  public String getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(String logLevel) {
    this.logLevel = logLevel;
  }

  public ProcessParams withForceDocID(Integer forceDocID) {
    this.forceDocID = forceDocID;
    return this;
  }

  /**
   * Force use of specific template ID and skip document type identification step.
   *
   * @return forceDocID
   */
  @javax.annotation.Nullable
  public Integer getForceDocID() {
    return forceDocID;
  }

  public void setForceDocID(Integer forceDocID) {
    this.forceDocID = forceDocID;
  }

  public ProcessParams withMatchTextFieldMask(Boolean matchTextFieldMask) {
    this.matchTextFieldMask = matchTextFieldMask;
    return this;
  }

  /**
   * When disabled, text field OCR will be done as is and then the recognized value will be matched
   * to the field mask for validity. If enabled, we are trying to read a field value with maximum
   * efforts to match the mask and provide a correctly formatted value, making assumptions based on
   * the provided field mask in the template.
   *
   * @return matchTextFieldMask
   */
  @javax.annotation.Nullable
  public Boolean getMatchTextFieldMask() {
    return matchTextFieldMask;
  }

  public void setMatchTextFieldMask(Boolean matchTextFieldMask) {
    this.matchTextFieldMask = matchTextFieldMask;
  }

  public ProcessParams withFastDocDetect(Boolean fastDocDetect) {
    this.fastDocDetect = fastDocDetect;
    return this;
  }

  /**
   * When enabled, shorten the list of candidates to process during document detection in a single
   * image process mode. Reduces processing time for specific backgrounds.
   *
   * @return fastDocDetect
   */
  @javax.annotation.Nullable
  public Boolean getFastDocDetect() {
    return fastDocDetect;
  }

  public void setFastDocDetect(Boolean fastDocDetect) {
    this.fastDocDetect = fastDocDetect;
  }

  public ProcessParams withUpdateOCRValidityByGlare(Boolean updateOCRValidityByGlare) {
    this.updateOCRValidityByGlare = updateOCRValidityByGlare;
    return this;
  }

  /**
   * When enabled, fail OCR field validity, if there is a glare over the text field on the image.
   *
   * @return updateOCRValidityByGlare
   */
  @javax.annotation.Nullable
  public Boolean getUpdateOCRValidityByGlare() {
    return updateOCRValidityByGlare;
  }

  public void setUpdateOCRValidityByGlare(Boolean updateOCRValidityByGlare) {
    this.updateOCRValidityByGlare = updateOCRValidityByGlare;
  }

  public ProcessParams withCheckRequiredTextFields(Boolean checkRequiredTextFields) {
    this.checkRequiredTextFields = checkRequiredTextFields;
    return this;
  }

  /**
   * When enabled, each field in template will be checked for value presence and if the field is
   * marked as required, but has no value, it will have \&quot;error\&quot; in validity status.
   *
   * @return checkRequiredTextFields
   */
  @javax.annotation.Nullable
  public Boolean getCheckRequiredTextFields() {
    return checkRequiredTextFields;
  }

  public void setCheckRequiredTextFields(Boolean checkRequiredTextFields) {
    this.checkRequiredTextFields = checkRequiredTextFields;
  }

  public ProcessParams withReturnCroppedBarcode(Boolean returnCroppedBarcode) {
    this.returnCroppedBarcode = returnCroppedBarcode;
    return this;
  }

  /**
   * When enabled, returns cropped barcode images for unknown documents
   *
   * @return returnCroppedBarcode
   */
  @javax.annotation.Nullable
  public Boolean getReturnCroppedBarcode() {
    return returnCroppedBarcode;
  }

  public void setReturnCroppedBarcode(Boolean returnCroppedBarcode) {
    this.returnCroppedBarcode = returnCroppedBarcode;
  }

  public ProcessParams withImageQA(ImageQA imageQA) {
    this.imageQA = imageQA;
    return this;
  }

  /**
   * Get imageQA
   *
   * @return imageQA
   */
  @javax.annotation.Nullable
  public ImageQA getImageQA() {
    return imageQA;
  }

  public void setImageQA(ImageQA imageQA) {
    this.imageQA = imageQA;
  }

  public ProcessParams withForceDocFormat(Integer forceDocFormat) {
    this.forceDocFormat = forceDocFormat;
    return this;
  }

  /**
   * Get forceDocFormat
   *
   * @return forceDocFormat
   */
  @javax.annotation.Nullable
  public Integer getForceDocFormat() {
    return forceDocFormat;
  }

  public void setForceDocFormat(Integer forceDocFormat) {
    this.forceDocFormat = forceDocFormat;
  }

  public ProcessParams withNoGraphics(Boolean noGraphics) {
    this.noGraphics = noGraphics;
    return this;
  }

  /**
   * When enabled no graphic fields will be cropped from document image.
   *
   * @return noGraphics
   */
  @javax.annotation.Nullable
  public Boolean getNoGraphics() {
    return noGraphics;
  }

  public void setNoGraphics(Boolean noGraphics) {
    this.noGraphics = noGraphics;
  }

  public ProcessParams withDocumentAreaMin(Float documentAreaMin) {
    this.documentAreaMin = documentAreaMin;
    return this;
  }

  /**
   * Specifies minimal area of the image that document should cover to be treated as candidate when
   * locating. Value should be in range from 0 to 1, where 1 is when document should fully cover the
   * image.
   *
   * @return documentAreaMin
   */
  @javax.annotation.Nullable
  public Float getDocumentAreaMin() {
    return documentAreaMin;
  }

  public void setDocumentAreaMin(Float documentAreaMin) {
    this.documentAreaMin = documentAreaMin;
  }

  public ProcessParams withDepersonalizeLog(Boolean depersonalizeLog) {
    this.depersonalizeLog = depersonalizeLog;
    return this;
  }

  /**
   * When enabled all personal data will be forcibly removed from the logs.
   *
   * @return depersonalizeLog
   */
  @javax.annotation.Nullable
  public Boolean getDepersonalizeLog() {
    return depersonalizeLog;
  }

  public void setDepersonalizeLog(Boolean depersonalizeLog) {
    this.depersonalizeLog = depersonalizeLog;
  }

  public ProcessParams withMultiDocOnImage(Boolean multiDocOnImage) {
    this.multiDocOnImage = multiDocOnImage;
    return this;
  }

  /**
   * This option allows locating and cropping multiple documents from one image if enabled.
   *
   * @return multiDocOnImage
   */
  @javax.annotation.Nullable
  public Boolean getMultiDocOnImage() {
    return multiDocOnImage;
  }

  public void setMultiDocOnImage(Boolean multiDocOnImage) {
    this.multiDocOnImage = multiDocOnImage;
  }

  public ProcessParams withShiftExpiryDate(Integer shiftExpiryDate) {
    this.shiftExpiryDate = shiftExpiryDate;
    return this;
  }

  /**
   * This option allows shifting the date of expiry into the future or past for number of months
   * specified. This is useful, for example, in some cases when document might be still valid for
   * some period after original expiration date to prevent negative validity status for such
   * documents. Or by shifting the date to the past will set negative validity for the documents
   * that is about to expire in a specified number of months.
   *
   * @return shiftExpiryDate
   */
  @javax.annotation.Nullable
  public Integer getShiftExpiryDate() {
    return shiftExpiryDate;
  }

  public void setShiftExpiryDate(Integer shiftExpiryDate) {
    this.shiftExpiryDate = shiftExpiryDate;
  }

  public ProcessParams withMinimalHolderAge(Integer minimalHolderAge) {
    this.minimalHolderAge = minimalHolderAge;
    return this;
  }

  /**
   * This options allows specifying the minimal age in years of the document holder for the document
   * to be considered valid.
   *
   * @return minimalHolderAge
   */
  @javax.annotation.Nullable
  public Integer getMinimalHolderAge() {
    return minimalHolderAge;
  }

  public void setMinimalHolderAge(Integer minimalHolderAge) {
    this.minimalHolderAge = minimalHolderAge;
  }

  public ProcessParams withReturnUncroppedImage(Boolean returnUncroppedImage) {
    this.returnUncroppedImage = returnUncroppedImage;
    return this;
  }

  /**
   * This option allows returning input images in output if enabled.
   *
   * @return returnUncroppedImage
   */
  @javax.annotation.Nullable
  public Boolean getReturnUncroppedImage() {
    return returnUncroppedImage;
  }

  public void setReturnUncroppedImage(Boolean returnUncroppedImage) {
    this.returnUncroppedImage = returnUncroppedImage;
  }

  public ProcessParams withMrzFormatsFilter(List<String> mrzFormatsFilter) {
    this.mrzFormatsFilter = mrzFormatsFilter;
    return this;
  }

  public ProcessParams addMrzFormatsFilterItem(String mrzFormatsFilterItem) {
    if (this.mrzFormatsFilter == null) {
      this.mrzFormatsFilter = new ArrayList<String>();
    }
    this.mrzFormatsFilter.add(mrzFormatsFilterItem);
    return this;
  }

  /**
   * This option allows limiting MRZ formats to be recognized by specifying them in array.
   *
   * @return mrzFormatsFilter
   */
  @javax.annotation.Nullable
  public List<String> getMrzFormatsFilter() {
    return mrzFormatsFilter;
  }

  public void setMrzFormatsFilter(List<String> mrzFormatsFilter) {
    this.mrzFormatsFilter = mrzFormatsFilter;
  }

  public ProcessParams withForceReadMrzBeforeLocate(Boolean forceReadMrzBeforeLocate) {
    this.forceReadMrzBeforeLocate = forceReadMrzBeforeLocate;
    return this;
  }

  /**
   * This option can be set to true to make sure that in series processing MRZ is located fully
   * inside the result document image, if present on the document. Enabling this option may add
   * extra processing time, by disabling optimizations, but allows more stability in output image
   * quality.
   *
   * @return forceReadMrzBeforeLocate
   */
  @javax.annotation.Nullable
  public Boolean getForceReadMrzBeforeLocate() {
    return forceReadMrzBeforeLocate;
  }

  public void setForceReadMrzBeforeLocate(Boolean forceReadMrzBeforeLocate) {
    this.forceReadMrzBeforeLocate = forceReadMrzBeforeLocate;
  }

  public ProcessParams withParseBarcodes(Boolean parseBarcodes) {
    this.parseBarcodes = parseBarcodes;
    return this;
  }

  /**
   * This option can be set to false to stop parsing after barcode is read.
   *
   * @return parseBarcodes
   */
  @javax.annotation.Nullable
  public Boolean getParseBarcodes() {
    return parseBarcodes;
  }

  public void setParseBarcodes(Boolean parseBarcodes) {
    this.parseBarcodes = parseBarcodes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessParams processParams = (ProcessParams) o;
    return Objects.equals(this.scenario, processParams.scenario)
        && Objects.equals(this.resultTypeOutput, processParams.resultTypeOutput)
        && Objects.equals(this.doublePageSpread, processParams.doublePageSpread)
        && Objects.equals(
            this.generateDoublePageSpreadImage, processParams.generateDoublePageSpreadImage)
        && Objects.equals(this.fieldTypesFilter, processParams.fieldTypesFilter)
        && Objects.equals(this.dateFormat, processParams.dateFormat)
        && Objects.equals(this.measureSystem, processParams.measureSystem)
        && Objects.equals(this.imageDpiOutMax, processParams.imageDpiOutMax)
        && Objects.equals(this.alreadyCropped, processParams.alreadyCropped)
        && Objects.equals(this.customParams, processParams.customParams)
        && Objects.equals(this.config, processParams.config)
        && Objects.equals(this.log, processParams.log)
        && Objects.equals(this.logLevel, processParams.logLevel)
        && Objects.equals(this.forceDocID, processParams.forceDocID)
        && Objects.equals(this.matchTextFieldMask, processParams.matchTextFieldMask)
        && Objects.equals(this.fastDocDetect, processParams.fastDocDetect)
        && Objects.equals(this.updateOCRValidityByGlare, processParams.updateOCRValidityByGlare)
        && Objects.equals(this.checkRequiredTextFields, processParams.checkRequiredTextFields)
        && Objects.equals(this.returnCroppedBarcode, processParams.returnCroppedBarcode)
        && Objects.equals(this.imageQA, processParams.imageQA)
        && Objects.equals(this.forceDocFormat, processParams.forceDocFormat)
        && Objects.equals(this.noGraphics, processParams.noGraphics)
        && Objects.equals(this.documentAreaMin, processParams.documentAreaMin)
        && Objects.equals(this.depersonalizeLog, processParams.depersonalizeLog)
        && Objects.equals(this.multiDocOnImage, processParams.multiDocOnImage)
        && Objects.equals(this.shiftExpiryDate, processParams.shiftExpiryDate)
        && Objects.equals(this.minimalHolderAge, processParams.minimalHolderAge)
        && Objects.equals(this.returnUncroppedImage, processParams.returnUncroppedImage)
        && Objects.equals(this.mrzFormatsFilter, processParams.mrzFormatsFilter)
        && Objects.equals(this.forceReadMrzBeforeLocate, processParams.forceReadMrzBeforeLocate)
        && Objects.equals(this.parseBarcodes, processParams.parseBarcodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        scenario,
        resultTypeOutput,
        doublePageSpread,
        generateDoublePageSpreadImage,
        fieldTypesFilter,
        dateFormat,
        measureSystem,
        imageDpiOutMax,
        alreadyCropped,
        customParams,
        config,
        log,
        logLevel,
        forceDocID,
        matchTextFieldMask,
        fastDocDetect,
        updateOCRValidityByGlare,
        checkRequiredTextFields,
        returnCroppedBarcode,
        imageQA,
        forceDocFormat,
        noGraphics,
        documentAreaMin,
        depersonalizeLog,
        multiDocOnImage,
        shiftExpiryDate,
        minimalHolderAge,
        returnUncroppedImage,
        mrzFormatsFilter,
        forceReadMrzBeforeLocate,
        parseBarcodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessParams {\n");
    sb.append("    scenario: ").append(toIndentedString(scenario)).append("\n");
    sb.append("    resultTypeOutput: ").append(toIndentedString(resultTypeOutput)).append("\n");
    sb.append("    doublePageSpread: ").append(toIndentedString(doublePageSpread)).append("\n");
    sb.append("    generateDoublePageSpreadImage: ")
        .append(toIndentedString(generateDoublePageSpreadImage))
        .append("\n");
    sb.append("    fieldTypesFilter: ").append(toIndentedString(fieldTypesFilter)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    measureSystem: ").append(toIndentedString(measureSystem)).append("\n");
    sb.append("    imageDpiOutMax: ").append(toIndentedString(imageDpiOutMax)).append("\n");
    sb.append("    alreadyCropped: ").append(toIndentedString(alreadyCropped)).append("\n");
    sb.append("    customParams: ").append(toIndentedString(customParams)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
    sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
    sb.append("    forceDocID: ").append(toIndentedString(forceDocID)).append("\n");
    sb.append("    matchTextFieldMask: ").append(toIndentedString(matchTextFieldMask)).append("\n");
    sb.append("    fastDocDetect: ").append(toIndentedString(fastDocDetect)).append("\n");
    sb.append("    updateOCRValidityByGlare: ")
        .append(toIndentedString(updateOCRValidityByGlare))
        .append("\n");
    sb.append("    checkRequiredTextFields: ")
        .append(toIndentedString(checkRequiredTextFields))
        .append("\n");
    sb.append("    returnCroppedBarcode: ")
        .append(toIndentedString(returnCroppedBarcode))
        .append("\n");
    sb.append("    imageQA: ").append(toIndentedString(imageQA)).append("\n");
    sb.append("    forceDocFormat: ").append(toIndentedString(forceDocFormat)).append("\n");
    sb.append("    noGraphics: ").append(toIndentedString(noGraphics)).append("\n");
    sb.append("    documentAreaMin: ").append(toIndentedString(documentAreaMin)).append("\n");
    sb.append("    depersonalizeLog: ").append(toIndentedString(depersonalizeLog)).append("\n");
    sb.append("    multiDocOnImage: ").append(toIndentedString(multiDocOnImage)).append("\n");
    sb.append("    shiftExpiryDate: ").append(toIndentedString(shiftExpiryDate)).append("\n");
    sb.append("    minimalHolderAge: ").append(toIndentedString(minimalHolderAge)).append("\n");
    sb.append("    returnUncroppedImage: ")
        .append(toIndentedString(returnUncroppedImage))
        .append("\n");
    sb.append("    mrzFormatsFilter: ").append(toIndentedString(mrzFormatsFilter)).append("\n");
    sb.append("    forceReadMrzBeforeLocate: ")
        .append(toIndentedString(forceReadMrzBeforeLocate))
        .append("\n");
    sb.append("    parseBarcodes: ").append(toIndentedString(parseBarcodes)).append("\n");
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
