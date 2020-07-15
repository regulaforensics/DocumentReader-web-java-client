package com.regulaforensics.docreader.client.model.ext;

import javax.annotation.Nullable;

public class Text extends com.regulaforensics.docreader.client.model.Text {

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
    TextField field = getField(fieldType);
    if (field != null) {
      return field.getValue();
    }
    return null;
  }
}
