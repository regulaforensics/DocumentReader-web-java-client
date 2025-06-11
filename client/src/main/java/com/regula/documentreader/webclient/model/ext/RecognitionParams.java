package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.model.AuthParams;
import com.regula.documentreader.webclient.model.DocumentFormat;
import com.regula.documentreader.webclient.model.DocumentType;
import com.regula.documentreader.webclient.model.FaceApi;
import com.regula.documentreader.webclient.model.ImageQA;
import com.regula.documentreader.webclient.model.LCID;
import com.regula.documentreader.webclient.model.LogLevel;
import com.regula.documentreader.webclient.model.MRZFormat;
import com.regula.documentreader.webclient.model.MeasureSystem;
import com.regula.documentreader.webclient.model.MrzDetectModeEnum;
import com.regula.documentreader.webclient.model.PerDocumentConfig;
import com.regula.documentreader.webclient.model.ProcessParams;
import com.regula.documentreader.webclient.model.ProcessParamsRfid;
import com.regula.documentreader.webclient.model.Result;
import com.regula.documentreader.webclient.model.Scenario;
import com.regula.documentreader.webclient.model.TextFieldType;
import com.regula.documentreader.webclient.model.TextPostProcessing;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Deprecated // this class will no longer be supported / updated
public class RecognitionParams extends ProcessParams {

  public RecognitionParams withResultTypeOutput(Result... resultTypes) {
    this.setResultTypeOutput(Arrays.asList(resultTypes));
    return this;
  }

  public RecognitionParams withScenario(Scenario scenario) {
    this.setScenario(scenario);
    return this;
  }

  public RecognitionParams withLcidFilter(List<LCID> lcidFilter) {
    this.setLcidFilter(lcidFilter);
    return this;
  }

  public RecognitionParams withLcidIgnoreFilter(List<LCID> lcidIgnoreFilter) {
    this.setLcidIgnoreFilter(lcidIgnoreFilter);
    return this;
  }

  public RecognitionParams withOneShotIdentification(Boolean oneShotIdentification) {
    this.setOneShotIdentification(oneShotIdentification);
    return this;
  }

  public RecognitionParams withUseFaceApi(Boolean useFaceApi) {
    this.setUseFaceApi(useFaceApi);
    return this;
  }

  public RecognitionParams withFaceApi(FaceApi faceApi) {
    this.setFaceApi(faceApi);
    return this;
  }

  public RecognitionParams withDoDetectCan(Boolean doDetectCan) {
    this.setDoDetectCan(doDetectCan);
    return this;
  }

  public RecognitionParams withImageOutputMaxHeight(Integer imageOutputMaxHeight) {
    this.setImageOutputMaxHeight(imageOutputMaxHeight);
    return this;
  }

  public RecognitionParams withImageOutputMaxWidth(Integer imageOutputMaxWidth) {
    this.setImageOutputMaxWidth(imageOutputMaxWidth);
    return this;
  }

  public RecognitionParams withResultTypeOutput(List<Result> resultTypeOutput) {
    this.setResultTypeOutput(resultTypeOutput);
    return this;
  }

  public RecognitionParams withDoublePageSpread(Boolean doublePageSpread) {
    this.setDoublePageSpread(doublePageSpread);
    return this;
  }

  public RecognitionParams withGenerateDoublePageSpreadImage(
      Boolean generateDoublePageSpreadImage) {
    this.setGenerateDoublePageSpreadImage(generateDoublePageSpreadImage);
    return this;
  }

  public RecognitionParams withFieldTypesFilter(List<TextFieldType> fieldTypesFilter) {
    this.setFieldTypesFilter(fieldTypesFilter);
    return this;
  }

  public RecognitionParams withDateFormat(String dateFormat) {
    this.setDateFormat(dateFormat);
    return this;
  }

  public RecognitionParams withMeasureSystem(MeasureSystem measureSystem) {
    this.setMeasureSystem(measureSystem);
    return this;
  }

  public RecognitionParams withImageDpiOutMax(Integer imageDpiOutMax) {
    this.setImageDpiOutMax(imageDpiOutMax);
    return this;
  }

  public RecognitionParams withAlreadyCropped(Boolean alreadyCropped) {
    this.setAlreadyCropped(alreadyCropped);
    return this;
  }

  public RecognitionParams withCustomParams(Map<String, Object> customParams) {
    this.setCustomParams(customParams);
    return this;
  }

  public RecognitionParams withConfig(List<PerDocumentConfig> config) {
    this.setConfig(config);
    return this;
  }

  public RecognitionParams withLog(Boolean log) {
    this.setLog(log);
    return this;
  }

  public RecognitionParams withLogLevel(LogLevel logLevel) {
    this.setLogLevel(logLevel);
    return this;
  }

  public RecognitionParams withForceDocID(Integer forceDocID) {
    this.setForceDocID(forceDocID);
    return this;
  }

  public RecognitionParams withMatchTextFieldMask(Boolean matchTextFieldMask) {
    this.setMatchTextFieldMask(matchTextFieldMask);
    return this;
  }

  public RecognitionParams withFastDocDetect(Boolean fastDocDetect) {
    this.setFastDocDetect(fastDocDetect);
    return this;
  }

  public RecognitionParams withUpdateOCRValidityByGlare(Boolean updateOCRValidityByGlare) {
    this.setUpdateOCRValidityByGlare(updateOCRValidityByGlare);
    return this;
  }

  public RecognitionParams withCheckRequiredTextFields(Boolean checkRequiredTextFields) {
    this.setCheckRequiredTextFields(checkRequiredTextFields);
    return this;
  }

  public RecognitionParams withReturnCroppedBarcode(Boolean returnCroppedBarcode) {
    this.setReturnCroppedBarcode(returnCroppedBarcode);
    return this;
  }

  public RecognitionParams withImageQa(ImageQA imageQa) {
    this.setImageQa(imageQa);
    return this;
  }

  public RecognitionParams withRespectImageQuality(Boolean respectImageQuality) {
    this.setRespectImageQuality(respectImageQuality);
    return this;
  }

  public RecognitionParams withForceDocFormat(DocumentFormat forceDocFormat) {
    this.setForceDocFormat(forceDocFormat);
    return this;
  }

  public RecognitionParams withNoGraphics(Boolean noGraphics) {
    this.setNoGraphics(noGraphics);
    return this;
  }

  public RecognitionParams withDepersonalizeLog(Boolean depersonalizeLog) {
    this.setDepersonalizeLog(depersonalizeLog);
    return this;
  }

  public RecognitionParams withMultiDocOnImage(Boolean multiDocOnImage) {
    this.setMultiDocOnImage(multiDocOnImage);
    return this;
  }

  public RecognitionParams withShiftExpiryDate(Integer shiftExpiryDate) {
    this.setShiftExpiryDate(shiftExpiryDate);
    return this;
  }

  public RecognitionParams withMinimalHolderAge(Integer minimalHolderAge) {
    this.setMinimalHolderAge(minimalHolderAge);
    return this;
  }

  public RecognitionParams withReturnUncroppedImage(Boolean returnUncroppedImage) {
    this.setReturnUncroppedImage(returnUncroppedImage);
    return this;
  }

  public RecognitionParams withMrzFormatsFilter(List<MRZFormat> mrzFormatsFilter) {
    this.setMrzFormatsFilter(mrzFormatsFilter);
    return this;
  }

  public RecognitionParams withForceReadMrzBeforeLocate(Boolean forceReadMrzBeforeLocate) {
    this.setForceReadMrzBeforeLocate(forceReadMrzBeforeLocate);
    return this;
  }

  public RecognitionParams withParseBarcodes(Boolean parseBarcodes) {
    this.setParseBarcodes(parseBarcodes);
    return this;
  }

  public RecognitionParams withConvertCase(TextPostProcessing convertCase) {
    this.setConvertCase(convertCase);
    return this;
  }

  public RecognitionParams withSplitNames(Boolean splitNames) {
    this.setSplitNames(splitNames);
    return this;
  }

  public RecognitionParams withDisablePerforationOCR(Boolean disablePerforationOCR) {
    this.disablePerforationOCR(disablePerforationOCR);
    return this;
  }

  public RecognitionParams withDocumentGroupFilter(List<DocumentType> documentGroupFilter) {
    this.setDocumentGroupFilter(documentGroupFilter);
    return this;
  }

  public RecognitionParams withProcessAuth(Long processAuth) {
    this.setProcessAuth(processAuth);
    return this;
  }

  public RecognitionParams withDeviceId(Integer deviceId) {
    this.setDeviceId(deviceId);
    return this;
  }

  public RecognitionParams withDeviceType(Integer deviceType) {
    this.setDeviceType(deviceType);
    return this;
  }

  public RecognitionParams withDeviceTypeHex(String deviceTypeHex) {
    this.setDeviceTypeHex(deviceTypeHex);
    return this;
  }

  public RecognitionParams withIgnoreDeviceIdFromImage(Boolean ignoreDeviceIdFromImage) {
    this.setIgnoreDeviceIdFromImage(ignoreDeviceIdFromImage);
    return this;
  }

  public RecognitionParams withDocumentIdList(List<Integer> documentIdList) {
    this.setDocumentIdList(documentIdList);
    return this;
  }

  public RecognitionParams withRfid(ProcessParamsRfid rfid) {
    this.setRfid(rfid);
    return this;
  }

  public RecognitionParams withCheckAuth(Boolean checkAuth) {
    this.setCheckAuth(checkAuth);
    return this;
  }

  public RecognitionParams withAuthParams(AuthParams authParams) {
    this.setAuthParams(authParams);
    return this;
  }

  public RecognitionParams withMrzDetectMode(MrzDetectModeEnum mrzDetectMode) {
    this.setMrzDetectMode(mrzDetectMode);
    return this;
  }

  public RecognitionParams withGenerateNumericCodes(Boolean generateNumericCodes) {
    this.setGenerateNumericCodes(generateNumericCodes);
    return this;
  }
}
