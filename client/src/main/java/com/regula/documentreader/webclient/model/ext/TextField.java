package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.model.CheckResult;
import com.regula.documentreader.webclient.model.CrossSourceValueComparison;
import com.regula.documentreader.webclient.model.SourceValidity;
import com.regula.documentreader.webclient.model.TextFieldValue;

import java.util.List;

import javax.annotation.Nullable;

public class TextField extends com.regula.documentreader.webclient.model.TextField {

  @Override
  public TextField withFieldType(Integer fieldType) {
    com.regula.documentreader.webclient.model.TextField textField = super.withFieldType(fieldType);
    return (TextField) textField;
  }

  @Override
  public Integer getFieldType() {
    return super.getFieldType();
  }

  @Override
  public void setFieldType(Integer fieldType) {
    super.setFieldType(fieldType);
  }

  @Override
  public TextField withFieldName(String fieldName) {
    com.regula.documentreader.webclient.model.TextField textField = super.withFieldName(fieldName);
    return (TextField) textField;
  }

  @Override
  public String getFieldName() {
    return super.getFieldName();
  }

  @Override
  public void setFieldName(String fieldName) {
    super.setFieldName(fieldName);
  }

  @Override
  public TextField withLcid(Integer lcid) {
    com.regula.documentreader.webclient.model.TextField textField = super.withLcid(lcid);
    return (TextField) textField;
  }

  @Nullable
  @Override
  public Integer getLcid() {
    return super.getLcid();
  }

  @Override
  public void setLcid(Integer lcid) {
    super.setLcid(lcid);
  }

  @Override
  public TextField withStatus(Integer status) {
    com.regula.documentreader.webclient.model.TextField textField = super.withStatus(status);
    return (TextField) textField;
  }

  @Override
  public Integer getStatus() {
    return super.getStatus();
  }

  @Override
  public void setStatus(Integer status) {
    super.setStatus(status);
  }

  @Override
  public TextField withValidityStatus(Integer validityStatus) {
    com.regula.documentreader.webclient.model.TextField textField = super.withValidityStatus(validityStatus);
    return (TextField) textField;
  }

  @Override
  public Integer getValidityStatus() {
    return super.getValidityStatus();
  }

  @Override
  public void setValidityStatus(Integer validityStatus) {
    super.setValidityStatus(validityStatus);
  }

  @Override
  public com.regula.documentreader.webclient.model.TextField withComparisonStatus(Integer comparisonStatus) {
    return super.withComparisonStatus(comparisonStatus);
  }

  @Override
  public Integer getComparisonStatus() {
    return super.getComparisonStatus();
  }

  @Override
  public void setComparisonStatus(Integer comparisonStatus) {
    super.setComparisonStatus(comparisonStatus);
  }

  @Override
  public TextField withValue(String value) {
    com.regula.documentreader.webclient.model.TextField textField = super.withValue(value);
    return (TextField) textField;
  }

  @Override
  public String getValue() {
    return super.getValue();
  }

  @Override
  public void setValue(String value) {
    super.setValue(value);
  }

  @Override
  public TextField withValueList(List<TextFieldValue> valueList) {
    com.regula.documentreader.webclient.model.TextField textField = super.withValueList(valueList);
    return (TextField) textField;
  }

  @Override
  public TextField addValueListItem(TextFieldValue valueListItem) {
    com.regula.documentreader.webclient.model.TextField textField = super.addValueListItem(valueListItem);
    return (TextField) textField;
  }

  @Override
  public List<TextFieldValue> getValueList() {
    return super.getValueList();
  }

  @Override
  public void setValueList(List<TextFieldValue> valueList) {
    super.setValueList(valueList);
  }

  @Override
  public TextField withValidityList(List<SourceValidity> validityList) {
    com.regula.documentreader.webclient.model.TextField textField = super.withValidityList(validityList);
    return (TextField) textField;
  }

  @Override
  public TextField addValidityListItem(SourceValidity validityListItem) {
    com.regula.documentreader.webclient.model.TextField textField = super.addValidityListItem(validityListItem);
    return (TextField) textField;
  }

  @Override
  public List<SourceValidity> getValidityList() {
    return super.getValidityList();
  }

  @Override
  public void setValidityList(List<SourceValidity> validityList) {
    super.setValidityList(validityList);
  }

  @Override
  public TextField withComparisonList(List<CrossSourceValueComparison> comparisonList) {
    com.regula.documentreader.webclient.model.TextField textField = super.withComparisonList(comparisonList);
    return (TextField) textField;
  }

  @Override
  public com.regula.documentreader.webclient.model.TextField addComparisonListItem(CrossSourceValueComparison comparisonListItem) {
    com.regula.documentreader.webclient.model.TextField textField = super.addComparisonListItem(comparisonListItem);
    return textField;
  }

  @Override
  public List<CrossSourceValueComparison> getComparisonList() {
    return super.getComparisonList();
  }

  @Override
  public void setComparisonList(List<CrossSourceValueComparison> comparisonList) {
    super.setComparisonList(comparisonList);
  }

  @Nullable
  public String getValue(String source, boolean original) {
    for (TextFieldValue value : getValueList()) {
      if (value.getSource().equals(source)) {
        if (original) {
          return value.getOriginalValue();
        } else {
          return value.getValue();
        }
      }
    }
    return null;
  }

  @Nullable
  public String getValue(String source) {
    return getValue(source, false);
  }

  public int sourceValidity(String source) {
    for (SourceValidity sourceValidity : this.getValidityList()) {
      if (sourceValidity.getSource().equals(source)) {
        return sourceValidity.getStatus();
      }
    }
    return CheckResult.WAS_NOT_DONE;
  }

  public int crossSourceComparison(String one, String other) {
    for (CrossSourceValueComparison comparison : this.getComparisonList()) {
      boolean a =
          comparison.getSourceLeft().equals(one) && comparison.getSourceRight().equals(other);
      boolean b =
          comparison.getSourceRight().equals(one) && comparison.getSourceLeft().equals(other);
      if (a || b) {
        return comparison.getStatus();
      }
    }
    return CheckResult.WAS_NOT_DONE;
  }
}
