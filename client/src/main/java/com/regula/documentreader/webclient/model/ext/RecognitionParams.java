package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.model.AuthParams;
import com.regula.documentreader.webclient.model.FaceApi;
import com.regula.documentreader.webclient.model.ImageQA;
import com.regula.documentreader.webclient.model.MrzDetectModeEnum;
import com.regula.documentreader.webclient.model.PerDocumentConfig;
import com.regula.documentreader.webclient.model.ProcessParams;
import com.regula.documentreader.webclient.model.ProcessParamsRfid;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;

public class RecognitionParams extends ProcessParams {

  public RecognitionParams withResultTypeOutput(Integer... resultTypes) {
    this.setResultTypeOutput(Arrays.asList(resultTypes));
    return this;
  }

  @Override
  public RecognitionParams withScenario(String scenario) {
    super.withScenario(scenario);
    return this;
  }

  @Override
  public ProcessParams withLcidFilter(List<Integer> lcidFilter) {
    return super.withLcidFilter(lcidFilter);
  }

  @Override
  public ProcessParams addLcidFilterItem(Integer lcidFilterItem) {
    return super.addLcidFilterItem(lcidFilterItem);
  }

  @Nullable
  @Override
  public List<Integer> getLcidFilter() {
    return super.getLcidFilter();
  }

  @Override
  public void setLcidFilter(List<Integer> lcidFilter) {
    super.setLcidFilter(lcidFilter);
  }

  @Override
  public ProcessParams withLcidIgnoreFilter(List<Integer> lcidIgnoreFilter) {
    return super.withLcidIgnoreFilter(lcidIgnoreFilter);
  }

  @Override
  public ProcessParams addLcidIgnoreFilterItem(Integer lcidIgnoreFilterItem) {
    return super.addLcidIgnoreFilterItem(lcidIgnoreFilterItem);
  }

  @Nullable
  @Override
  public List<Integer> getLcidIgnoreFilter() {
    return super.getLcidIgnoreFilter();
  }

  @Override
  public void setLcidIgnoreFilter(List<Integer> lcidIgnoreFilter) {
    super.setLcidIgnoreFilter(lcidIgnoreFilter);
  }

  @Override
  public ProcessParams withOneShotIdentification(Boolean oneShotIdentification) {
    return super.withOneShotIdentification(oneShotIdentification);
  }

  @Nullable
  @Override
  public Boolean getOneShotIdentification() {
    return super.getOneShotIdentification();
  }

  @Override
  public void setOneShotIdentification(Boolean oneShotIdentification) {
    super.setOneShotIdentification(oneShotIdentification);
  }

  @Override
  public ProcessParams withUseFaceApi(Boolean useFaceApi) {
    return super.withUseFaceApi(useFaceApi);
  }

  @Nullable
  @Override
  public Boolean getUseFaceApi() {
    return super.getUseFaceApi();
  }

  @Override
  public void setUseFaceApi(Boolean useFaceApi) {
    super.setUseFaceApi(useFaceApi);
  }

  @Override
  public ProcessParams withFaceApi(FaceApi faceApi) {
    return super.withFaceApi(faceApi);
  }

  @Nullable
  @Override
  public FaceApi getFaceApi() {
    return super.getFaceApi();
  }

  @Override
  public void setFaceApi(FaceApi faceApi) {
    super.setFaceApi(faceApi);
  }

  @Override
  public ProcessParams withDoDetectCan(Boolean doDetectCan) {
    return super.withDoDetectCan(doDetectCan);
  }

  @Nullable
  @Override
  public Boolean getDoDetectCan() {
    return super.getDoDetectCan();
  }

  @Override
  public void setDoDetectCan(Boolean doDetectCan) {
    super.setDoDetectCan(doDetectCan);
  }

  @Override
  public ProcessParams withImageOutputMaxHeight(Integer imageOutputMaxHeight) {
    return super.withImageOutputMaxHeight(imageOutputMaxHeight);
  }

  @Nullable
  @Override
  public Integer getImageOutputMaxHeight() {
    return super.getImageOutputMaxHeight();
  }

  @Override
  public void setImageOutputMaxHeight(Integer imageOutputMaxHeight) {
    super.setImageOutputMaxHeight(imageOutputMaxHeight);
  }

  @Override
  public ProcessParams withImageOutputMaxWidth(Integer imageOutputMaxWidth) {
    return super.withImageOutputMaxWidth(imageOutputMaxWidth);
  }

  @Nullable
  @Override
  public Integer getImageOutputMaxWidth() {
    return super.getImageOutputMaxWidth();
  }

  @Override
  public void setImageOutputMaxWidth(Integer imageOutputMaxWidth) {
    super.setImageOutputMaxWidth(imageOutputMaxWidth);
  }

  @Override
  public String getScenario() {
    return super.getScenario();
  }

  @Override
  public void setScenario(String scenario) {
    super.setScenario(scenario);
  }

  @Override
  public ProcessParams withResultTypeOutput(List<Integer> resultTypeOutput) {
    return super.withResultTypeOutput(resultTypeOutput);
  }

  @Override
  public ProcessParams addResultTypeOutputItem(Integer resultTypeOutputItem) {
    return super.addResultTypeOutputItem(resultTypeOutputItem);
  }

  @Nullable
  @Override
  public List<Integer> getResultTypeOutput() {
    return super.getResultTypeOutput();
  }

  @Override
  public void setResultTypeOutput(List<Integer> resultTypeOutput) {
    super.setResultTypeOutput(resultTypeOutput);
  }

  @Override
  public ProcessParams withDoublePageSpread(Boolean doublePageSpread) {
    return super.withDoublePageSpread(doublePageSpread);
  }

  @Nullable
  @Override
  public Boolean getDoublePageSpread() {
    return super.getDoublePageSpread();
  }

  @Override
  public void setDoublePageSpread(Boolean doublePageSpread) {
    super.setDoublePageSpread(doublePageSpread);
  }

  @Override
  public ProcessParams withGenerateDoublePageSpreadImage(Boolean generateDoublePageSpreadImage) {
    return super.withGenerateDoublePageSpreadImage(generateDoublePageSpreadImage);
  }

  @Nullable
  @Override
  public Boolean getGenerateDoublePageSpreadImage() {
    return super.getGenerateDoublePageSpreadImage();
  }

  @Override
  public void setGenerateDoublePageSpreadImage(Boolean generateDoublePageSpreadImage) {
    super.setGenerateDoublePageSpreadImage(generateDoublePageSpreadImage);
  }

  @Override
  public ProcessParams withFieldTypesFilter(List<Integer> fieldTypesFilter) {
    return super.withFieldTypesFilter(fieldTypesFilter);
  }

  @Override
  public ProcessParams addFieldTypesFilterItem(Integer fieldTypesFilterItem) {
    return super.addFieldTypesFilterItem(fieldTypesFilterItem);
  }

  @Nullable
  @Override
  public List<Integer> getFieldTypesFilter() {
    return super.getFieldTypesFilter();
  }

  @Override
  public void setFieldTypesFilter(List<Integer> fieldTypesFilter) {
    super.setFieldTypesFilter(fieldTypesFilter);
  }

  @Override
  public ProcessParams withDateFormat(String dateFormat) {
    return super.withDateFormat(dateFormat);
  }

  @Nullable
  @Override
  public String getDateFormat() {
    return super.getDateFormat();
  }

  @Override
  public void setDateFormat(String dateFormat) {
    super.setDateFormat(dateFormat);
  }

  @Override
  public ProcessParams withMeasureSystem(Integer measureSystem) {
    return super.withMeasureSystem(measureSystem);
  }

  @Nullable
  @Override
  public Integer getMeasureSystem() {
    return super.getMeasureSystem();
  }

  @Override
  public void setMeasureSystem(Integer measureSystem) {
    super.setMeasureSystem(measureSystem);
  }

  @Override
  public ProcessParams withImageDpiOutMax(Integer imageDpiOutMax) {
    return super.withImageDpiOutMax(imageDpiOutMax);
  }

  @Nullable
  @Override
  public Integer getImageDpiOutMax() {
    return super.getImageDpiOutMax();
  }

  @Override
  public void setImageDpiOutMax(Integer imageDpiOutMax) {
    super.setImageDpiOutMax(imageDpiOutMax);
  }

  @Override
  public ProcessParams withAlreadyCropped(Boolean alreadyCropped) {
    return super.withAlreadyCropped(alreadyCropped);
  }

  @Nullable
  @Override
  public Boolean getAlreadyCropped() {
    return super.getAlreadyCropped();
  }

  @Override
  public void setAlreadyCropped(Boolean alreadyCropped) {
    super.setAlreadyCropped(alreadyCropped);
  }

  @Override
  public ProcessParams withCustomParams(Map<String, Object> customParams) {
    return super.withCustomParams(customParams);
  }

  @Override
  public ProcessParams putCustomParamsItem(String key, Object customParamsItem) {
    return super.putCustomParamsItem(key, customParamsItem);
  }

  @Nullable
  @Override
  public Map<String, Object> getCustomParams() {
    return super.getCustomParams();
  }

  @Override
  public void setCustomParams(Map<String, Object> customParams) {
    super.setCustomParams(customParams);
  }

  @Override
  public ProcessParams withConfig(List<PerDocumentConfig> config) {
    return super.withConfig(config);
  }

  @Override
  public ProcessParams addConfigItem(PerDocumentConfig configItem) {
    return super.addConfigItem(configItem);
  }

  @Nullable
  @Override
  public List<PerDocumentConfig> getConfig() {
    return super.getConfig();
  }

  @Override
  public void setConfig(List<PerDocumentConfig> config) {
    super.setConfig(config);
  }

  @Override
  public ProcessParams withLog(Boolean log) {
    return super.withLog(log);
  }

  @Nullable
  @Override
  public Boolean getLog() {
    return super.getLog();
  }

  @Override
  public void setLog(Boolean log) {
    super.setLog(log);
  }

  @Override
  public ProcessParams withLogLevel(String logLevel) {
    return super.withLogLevel(logLevel);
  }

  @Nullable
  @Override
  public String getLogLevel() {
    return super.getLogLevel();
  }

  @Override
  public void setLogLevel(String logLevel) {
    super.setLogLevel(logLevel);
  }

  @Override
  public ProcessParams withForceDocID(Integer forceDocID) {
    return super.withForceDocID(forceDocID);
  }

  @Nullable
  @Override
  public Integer getForceDocID() {
    return super.getForceDocID();
  }

  @Override
  public void setForceDocID(Integer forceDocID) {
    super.setForceDocID(forceDocID);
  }

  @Override
  public ProcessParams withMatchTextFieldMask(Boolean matchTextFieldMask) {
    return super.withMatchTextFieldMask(matchTextFieldMask);
  }

  @Nullable
  @Override
  public Boolean getMatchTextFieldMask() {
    return super.getMatchTextFieldMask();
  }

  @Override
  public void setMatchTextFieldMask(Boolean matchTextFieldMask) {
    super.setMatchTextFieldMask(matchTextFieldMask);
  }

  @Override
  public ProcessParams withFastDocDetect(Boolean fastDocDetect) {
    return super.withFastDocDetect(fastDocDetect);
  }

  @Nullable
  @Override
  public Boolean getFastDocDetect() {
    return super.getFastDocDetect();
  }

  @Override
  public void setFastDocDetect(Boolean fastDocDetect) {
    super.setFastDocDetect(fastDocDetect);
  }

  @Override
  public ProcessParams withUpdateOCRValidityByGlare(Boolean updateOCRValidityByGlare) {
    return super.withUpdateOCRValidityByGlare(updateOCRValidityByGlare);
  }

  @Nullable
  @Override
  public Boolean getUpdateOCRValidityByGlare() {
    return super.getUpdateOCRValidityByGlare();
  }

  @Override
  public void setUpdateOCRValidityByGlare(Boolean updateOCRValidityByGlare) {
    super.setUpdateOCRValidityByGlare(updateOCRValidityByGlare);
  }

  @Override
  public ProcessParams withCheckRequiredTextFields(Boolean checkRequiredTextFields) {
    return super.withCheckRequiredTextFields(checkRequiredTextFields);
  }

  @Nullable
  @Override
  public Boolean getCheckRequiredTextFields() {
    return super.getCheckRequiredTextFields();
  }

  @Override
  public void setCheckRequiredTextFields(Boolean checkRequiredTextFields) {
    super.setCheckRequiredTextFields(checkRequiredTextFields);
  }

  @Override
  public ProcessParams withReturnCroppedBarcode(Boolean returnCroppedBarcode) {
    return super.withReturnCroppedBarcode(returnCroppedBarcode);
  }

  @Nullable
  @Override
  public Boolean getReturnCroppedBarcode() {
    return super.getReturnCroppedBarcode();
  }

  @Override
  public void setReturnCroppedBarcode(Boolean returnCroppedBarcode) {
    super.setReturnCroppedBarcode(returnCroppedBarcode);
  }

  @Override
  public ProcessParams withImageQa(ImageQA imageQa) {
    return super.withImageQa(imageQa);
  }

  @Nullable
  @Override
  public ImageQA getImageQa() {
    return super.getImageQa();
  }

  @Override
  public void setImageQa(ImageQA imageQa) {
    super.setImageQa(imageQa);
  }

  @Override
  public ProcessParams withRespectImageQuality(Boolean respectImageQuality) {
    return super.withRespectImageQuality(respectImageQuality);
  }

  @Nullable
  @Override
  public Boolean getRespectImageQuality() {
    return super.getRespectImageQuality();
  }

  @Override
  public void setRespectImageQuality(Boolean respectImageQuality) {
    super.setRespectImageQuality(respectImageQuality);
  }

  @Override
  public ProcessParams withForceDocFormat(Integer forceDocFormat) {
    return super.withForceDocFormat(forceDocFormat);
  }

  @Nullable
  @Override
  public Integer getForceDocFormat() {
    return super.getForceDocFormat();
  }

  @Override
  public void setForceDocFormat(Integer forceDocFormat) {
    super.setForceDocFormat(forceDocFormat);
  }

  @Override
  public ProcessParams withNoGraphics(Boolean noGraphics) {
    return super.withNoGraphics(noGraphics);
  }

  @Nullable
  @Override
  public Boolean getNoGraphics() {
    return super.getNoGraphics();
  }

  @Override
  public void setNoGraphics(Boolean noGraphics) {
    super.setNoGraphics(noGraphics);
  }

  @Override
  public ProcessParams withDepersonalizeLog(Boolean depersonalizeLog) {
    return super.withDepersonalizeLog(depersonalizeLog);
  }

  @Nullable
  @Override
  public Boolean getDepersonalizeLog() {
    return super.getDepersonalizeLog();
  }

  @Override
  public void setDepersonalizeLog(Boolean depersonalizeLog) {
    super.setDepersonalizeLog(depersonalizeLog);
  }

  @Override
  public ProcessParams withMultiDocOnImage(Boolean multiDocOnImage) {
    return super.withMultiDocOnImage(multiDocOnImage);
  }

  @Nullable
  @Override
  public Boolean getMultiDocOnImage() {
    return super.getMultiDocOnImage();
  }

  @Override
  public void setMultiDocOnImage(Boolean multiDocOnImage) {
    super.setMultiDocOnImage(multiDocOnImage);
  }

  @Override
  public ProcessParams withShiftExpiryDate(Integer shiftExpiryDate) {
    return super.withShiftExpiryDate(shiftExpiryDate);
  }

  @Nullable
  @Override
  public Integer getShiftExpiryDate() {
    return super.getShiftExpiryDate();
  }

  @Override
  public void setShiftExpiryDate(Integer shiftExpiryDate) {
    super.setShiftExpiryDate(shiftExpiryDate);
  }

  @Override
  public ProcessParams withMinimalHolderAge(Integer minimalHolderAge) {
    return super.withMinimalHolderAge(minimalHolderAge);
  }

  @Nullable
  @Override
  public Integer getMinimalHolderAge() {
    return super.getMinimalHolderAge();
  }

  @Override
  public void setMinimalHolderAge(Integer minimalHolderAge) {
    super.setMinimalHolderAge(minimalHolderAge);
  }

  @Override
  public ProcessParams withReturnUncroppedImage(Boolean returnUncroppedImage) {
    return super.withReturnUncroppedImage(returnUncroppedImage);
  }

  @Nullable
  @Override
  public Boolean getReturnUncroppedImage() {
    return super.getReturnUncroppedImage();
  }

  @Override
  public void setReturnUncroppedImage(Boolean returnUncroppedImage) {
    super.setReturnUncroppedImage(returnUncroppedImage);
  }

  @Override
  public ProcessParams withMrzFormatsFilter(List<String> mrzFormatsFilter) {
    return super.withMrzFormatsFilter(mrzFormatsFilter);
  }

  @Override
  public ProcessParams addMrzFormatsFilterItem(String mrzFormatsFilterItem) {
    return super.addMrzFormatsFilterItem(mrzFormatsFilterItem);
  }

  @Nullable
  @Override
  public List<String> getMrzFormatsFilter() {
    return super.getMrzFormatsFilter();
  }

  @Override
  public void setMrzFormatsFilter(List<String> mrzFormatsFilter) {
    super.setMrzFormatsFilter(mrzFormatsFilter);
  }

  @Override
  public ProcessParams withForceReadMrzBeforeLocate(Boolean forceReadMrzBeforeLocate) {
    return super.withForceReadMrzBeforeLocate(forceReadMrzBeforeLocate);
  }

  @Nullable
  @Override
  public Boolean getForceReadMrzBeforeLocate() {
    return super.getForceReadMrzBeforeLocate();
  }

  @Override
  public void setForceReadMrzBeforeLocate(Boolean forceReadMrzBeforeLocate) {
    super.setForceReadMrzBeforeLocate(forceReadMrzBeforeLocate);
  }

  @Override
  public ProcessParams withParseBarcodes(Boolean parseBarcodes) {
    return super.withParseBarcodes(parseBarcodes);
  }

  @Nullable
  @Override
  public Boolean getParseBarcodes() {
    return super.getParseBarcodes();
  }

  @Override
  public void setParseBarcodes(Boolean parseBarcodes) {
    super.setParseBarcodes(parseBarcodes);
  }

  @Override
  public ProcessParams withConvertCase(Integer convertCase) {
    return super.withConvertCase(convertCase);
  }

  @Nullable
  @Override
  public Integer getConvertCase() {
    return super.getConvertCase();
  }

  @Override
  public void setConvertCase(Integer convertCase) {
    super.setConvertCase(convertCase);
  }

  @Override
  public ProcessParams withSplitNames(Boolean splitNames) {
    return super.withSplitNames(splitNames);
  }

  @Nullable
  @Override
  public Boolean getSplitNames() {
    return super.getSplitNames();
  }

  @Override
  public void setSplitNames(Boolean splitNames) {
    super.setSplitNames(splitNames);
  }

  @Override
  public ProcessParams withDisablePerforationOCR(Boolean disablePerforationOCR) {
    return super.withDisablePerforationOCR(disablePerforationOCR);
  }

  @Nullable
  @Override
  public Boolean getDisablePerforationOCR() {
    return super.getDisablePerforationOCR();
  }

  @Override
  public void setDisablePerforationOCR(Boolean disablePerforationOCR) {
    super.setDisablePerforationOCR(disablePerforationOCR);
  }

  @Override
  public ProcessParams withDocumentGroupFilter(List<Integer> documentGroupFilter) {
    return super.withDocumentGroupFilter(documentGroupFilter);
  }

  @Override
  public ProcessParams addDocumentGroupFilterItem(Integer documentGroupFilterItem) {
    return super.addDocumentGroupFilterItem(documentGroupFilterItem);
  }

  @Nullable
  @Override
  public List<Integer> getDocumentGroupFilter() {
    return super.getDocumentGroupFilter();
  }

  @Override
  public void setDocumentGroupFilter(List<Integer> documentGroupFilter) {
    super.setDocumentGroupFilter(documentGroupFilter);
  }

  @Override
  public ProcessParams withProcessAuth(Long processAuth) {
    return super.withProcessAuth(processAuth);
  }

  @Nullable
  @Override
  public Long getProcessAuth() {
    return super.getProcessAuth();
  }

  @Override
  public void setProcessAuth(Long processAuth) {
    super.setProcessAuth(processAuth);
  }

  @Override
  public ProcessParams withDeviceId(Integer deviceId) {
    return super.withDeviceId(deviceId);
  }

  @Nullable
  @Override
  public Integer getDeviceId() {
    return super.getDeviceId();
  }

  @Override
  public void setDeviceId(Integer deviceId) {
    super.setDeviceId(deviceId);
  }

  @Override
  public ProcessParams withDeviceType(Integer deviceType) {
    return super.withDeviceType(deviceType);
  }

  @Nullable
  @Override
  public Integer getDeviceType() {
    return super.getDeviceType();
  }

  @Override
  public void setDeviceType(Integer deviceType) {
    super.setDeviceType(deviceType);
  }

  @Override
  public ProcessParams withDeviceTypeHex(String deviceTypeHex) {
    return super.withDeviceTypeHex(deviceTypeHex);
  }

  @Nullable
  @Override
  public String getDeviceTypeHex() {
    return super.getDeviceTypeHex();
  }

  @Override
  public void setDeviceTypeHex(String deviceTypeHex) {
    super.setDeviceTypeHex(deviceTypeHex);
  }

  @Override
  public ProcessParams withIgnoreDeviceIdFromImage(Boolean ignoreDeviceIdFromImage) {
    return super.withIgnoreDeviceIdFromImage(ignoreDeviceIdFromImage);
  }

  @Nullable
  @Override
  public Boolean getIgnoreDeviceIdFromImage() {
    return super.getIgnoreDeviceIdFromImage();
  }

  @Override
  public void setIgnoreDeviceIdFromImage(Boolean ignoreDeviceIdFromImage) {
    super.setIgnoreDeviceIdFromImage(ignoreDeviceIdFromImage);
  }

  @Override
  public ProcessParams withDocumentIdList(List<Integer> documentIdList) {
    return super.withDocumentIdList(documentIdList);
  }

  @Override
  public ProcessParams addDocumentIdListItem(Integer documentIdListItem) {
    return super.addDocumentIdListItem(documentIdListItem);
  }

  @Nullable
  @Override
  public List<Integer> getDocumentIdList() {
    return super.getDocumentIdList();
  }

  @Override
  public void setDocumentIdList(List<Integer> documentIdList) {
    super.setDocumentIdList(documentIdList);
  }

  @Override
  public ProcessParams withRfid(ProcessParamsRfid rfid) {
    return super.withRfid(rfid);
  }

  @Nullable
  @Override
  public ProcessParamsRfid getRfid() {
    return super.getRfid();
  }

  @Override
  public void setRfid(ProcessParamsRfid rfid) {
    super.setRfid(rfid);
  }

  @Override
  public ProcessParams withCheckAuth(Boolean checkAuth) {
    return super.withCheckAuth(checkAuth);
  }

  @Nullable
  @Override
  public Boolean getCheckAuth() {
    return super.getCheckAuth();
  }

  @Override
  public void setCheckAuth(Boolean checkAuth) {
    super.setCheckAuth(checkAuth);
  }

  @Override
  public ProcessParams withAuthParams(AuthParams authParams) {
    return super.withAuthParams(authParams);
  }

  @Nullable
  @Override
  public AuthParams getAuthParams() {
    return super.getAuthParams();
  }

  @Override
  public void setAuthParams(AuthParams authParams) {
    super.setAuthParams(authParams);
  }

  @Override
  public ProcessParams withMrzDetectMode(MrzDetectModeEnum mrzDetectMode) {
    return super.withMrzDetectMode(mrzDetectMode);
  }

  @Nullable
  @Override
  public MrzDetectModeEnum getMrzDetectMode() {
    return super.getMrzDetectMode();
  }

  @Override
  public void setMrzDetectMode(MrzDetectModeEnum mrzDetectMode) {
    super.setMrzDetectMode(mrzDetectMode);
  }

  @Override
  public ProcessParams withGenerateNumericCodes(Boolean generateNumericCodes) {
    return super.withGenerateNumericCodes(generateNumericCodes);
  }

  @Nullable
  @Override
  public Boolean getGenerateNumericCodes() {
    return super.getGenerateNumericCodes();
  }

  @Override
  public void setGenerateNumericCodes(Boolean generateNumericCodes) {
    super.setGenerateNumericCodes(generateNumericCodes);
  }
}
