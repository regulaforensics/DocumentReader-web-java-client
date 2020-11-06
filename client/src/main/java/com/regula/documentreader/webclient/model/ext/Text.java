package com.regula.documentreader.webclient.model.ext;

import javax.annotation.Nullable;

public class Text extends com.regula.documentreader.webclient.model.Text {

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
  public TextField getField(int fieldType) {
    return getField(fieldType, 0);
  }

  @Nullable
  public String getFieldValue(int fieldType, int lcid) {
    TextField field = getField(fieldType, lcid);
    if (field != null) {
      return field.getValue();
    }
    return null;
  }

  @Nullable
  public String getFieldValue(int fieldType) {
    return getFieldValue(fieldType, 0);
  }

  @Nullable
  public TextField getFieldByName(String fieldName, int lcid) {
    for (TextField field : getFieldList()) {
      if (field.getFieldName().equals(fieldName) && field.getLcid() == lcid) {
        return field;
      }
    }
    return null;
  }

  @Nullable
  public TextField getFieldByName(String fieldName) {
    return getFieldByName(fieldName, 0);
  }

  @Nullable
  public String getFieldValueByName(String fieldName, int lcid) {
    TextField field = getFieldByName(fieldName, lcid);
    if (field != null) {
      return field.getValue();
    }
    return null;
  }

  @Nullable
  public String getFieldValueByName(String fieldName) {
    return getFieldValueByName(fieldName, 0);
  }
}
