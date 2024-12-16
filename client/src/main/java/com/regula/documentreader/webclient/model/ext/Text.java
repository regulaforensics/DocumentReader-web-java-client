package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.model.LCID;
import com.regula.documentreader.webclient.model.TextAvailableSource;

import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class Text extends com.regula.documentreader.webclient.model.Text {

  @Nullable
  public TextField getField(int fieldType) {
    TextField result = null;
    for (TextField field : getFieldList()) {
      if (field.getFieldType() == fieldType && field.getLcid() == LCID.LATIN) {
        return field;
      }
      if (result == null && field.getFieldType() == fieldType) {
        result = field;
      }
    }
    return result;
  }

  @Nullable
  public TextField getField(int fieldType, int lcid) {
    for (TextField field : getFieldList()) {
      if (field.getFieldType() == fieldType && field.getLcid() == lcid) {
        return field;
      }
    }
    return null;
  }

  @Nullable
  public TextField getField(String fieldName) {
    TextField result = null;
    for (TextField field : getFieldList()) {
      if (Objects.equals(field.getFieldName(), fieldName) && field.getLcid() == LCID.LATIN) {
        return field;
      }
      if (result == null && Objects.equals(field.getFieldName(), fieldName)) {
        result = field;
      }
    }
    return result;
  }

  @Nullable
  public TextField getField(String fieldName, int lcid) {
    for (TextField field : getFieldList()) {
      if (Objects.equals(field.getFieldName(), fieldName) && field.getLcid() == lcid) {
        return field;
      }
    }
    return null;
  }

  @Nullable
  public String getFieldValue(int fieldType) {
    TextField field = getField(fieldType);
    if (field != null) return field.getValue();
    return null;
  }

  @Nullable
  public String getFieldValue(int fieldType, int lcid) {
    TextField field = getField(fieldType, lcid);
    if (field != null) return field.getValue();
    return null;
  }

  @Nullable
  public String getFieldValue(String fieldName) {
    TextField field = getField(fieldName);
    if (field != null) return field.getValue();
    return null;
  }

  @Nullable
  public String getFieldValue(String fieldName, int lcid) {
    TextField field = getField(fieldName, lcid);
    if (field != null) return field.getValue();
    return null;
  }

  @Override
  public Text withStatus(Integer status) {
    com.regula.documentreader.webclient.model.Text text = super.withStatus(status);
    return (Text) text;
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
  public Text withValidityStatus(Integer validityStatus) {
    com.regula.documentreader.webclient.model.Text text = super.withValidityStatus(validityStatus);
    return (Text) text;
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
  public Text withComparisonStatus(Integer comparisonStatus) {
    com.regula.documentreader.webclient.model.Text text = super.withComparisonStatus(comparisonStatus);
    return (Text) text;
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
  public Text withFieldList(List<TextField> fieldList) {
    com.regula.documentreader.webclient.model.Text text = super.withFieldList(fieldList);
    return (Text) text;
  }

  @Override
  public Text addFieldListItem(TextField fieldListItem) {
    com.regula.documentreader.webclient.model.Text text = super.addFieldListItem(fieldListItem);
    return (Text) text;
  }

  @Override
  public List<TextField> getFieldList() {
    return super.getFieldList();
  }

  @Override
  public void setFieldList(List<TextField> fieldList) {
    super.setFieldList(fieldList);
  }

  @Override
  public Text withAvailableSourceList(List<TextAvailableSource> availableSourceList) {
    com.regula.documentreader.webclient.model.Text text = super.withAvailableSourceList(availableSourceList);
    return (Text) text;
  }

  @Override
  public Text addAvailableSourceListItem(TextAvailableSource availableSourceListItem) {
    com.regula.documentreader.webclient.model.Text text = super.addAvailableSourceListItem(availableSourceListItem);
    return (Text) text;
  }

  @Override
  public List<TextAvailableSource> getAvailableSourceList() {
    return super.getAvailableSourceList();
  }

  @Override
  public void setAvailableSourceList(List<TextAvailableSource> availableSourceList) {
    super.setAvailableSourceList(availableSourceList);
  }
}
