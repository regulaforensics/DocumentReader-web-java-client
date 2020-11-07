package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.model.LCID;
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
}
