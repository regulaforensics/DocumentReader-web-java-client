package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.model.CheckResult;
import com.regula.documentreader.webclient.model.LCID;
import com.regula.documentreader.webclient.model.TextAvailableSource;
import com.regula.documentreader.webclient.model.TextFieldType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class Text extends com.regula.documentreader.webclient.model.Text {

  @Nullable
  public TextField getField(TextFieldType fieldType) {
    TextField result = null;
    for (com.regula.documentreader.webclient.model.TextField field : getFieldList()) {
      if (field.getFieldType() == fieldType && field.getLcid() == LCID.LATIN) {
        return (TextField) field;
      }
      if (result == null && field.getFieldType() == fieldType) {
        result = (TextField) field;
      }
    }
    return result;
  }

  @Nullable
  public TextField getField(TextFieldType fieldType, LCID lcid) {
    for (com.regula.documentreader.webclient.model.TextField field : getFieldList()) {
      if (field.getFieldType() == fieldType && field.getLcid() == lcid) {
        return (TextField) field;
      }
    }
    return null;
  }

  @Nullable
  public TextField getField(String fieldName) {
    TextField result = null;
    for (com.regula.documentreader.webclient.model.TextField field : getFieldList()) {
      if (Objects.equals(field.getFieldName(), fieldName) && field.getLcid() == LCID.LATIN) {
        return (TextField) field;
      }
      if (result == null && Objects.equals(field.getFieldName(), fieldName)) {
        result = (TextField) field;
      }
    }
    return result;
  }

  @Nullable
  public TextField getField(String fieldName, LCID lcid) {
    for (com.regula.documentreader.webclient.model.TextField field : getFieldList()) {
      if (Objects.equals(field.getFieldName(), fieldName)
              && field.getLcid() == lcid) {
        return (TextField) field;
      }
    }
    return null;
  }

  @Nullable
  public String getFieldValue(TextFieldType fieldType) {
    TextField field = getField(fieldType);
    if (field != null) return field.getValue();
    return null;
  }

  @Nullable
  public String getFieldValue(TextFieldType fieldType, LCID lcid) {
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
  public String getFieldValue(String fieldName, LCID lcid) {
    TextField field = getField(fieldName, lcid);
    if (field != null) return field.getValue();
    return null;
  }

  public Text withStatus(CheckResult status) {
    this.setStatus(status);
    return this;
  }

  public Text withValidityStatus(CheckResult validityStatus) {
    this.setValidityStatus(validityStatus);
    return this;
  }

  public Text withComparisonStatus(CheckResult comparisonStatus) {
    this.setComparisonStatus(comparisonStatus);
    return this;
  }

  public Text withFieldList(List<TextField> fieldList) {
    List<com.regula.documentreader.webclient.model.TextField> convertedList = new ArrayList<>(fieldList);
    this.setFieldList(convertedList);
    return this;
  }

  public Text withAvailableSourceList(List<TextAvailableSource> availableSourceList) {
    this.setAvailableSourceList(availableSourceList);
    return this;
  }

}
