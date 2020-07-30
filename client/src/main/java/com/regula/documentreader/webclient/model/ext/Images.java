package com.regula.documentreader.webclient.model.ext;

import javax.annotation.Nullable;

public class Images extends com.regula.documentreader.webclient.model.Images {

  @Nullable
  public ImagesField getField(int fieldType) {
    for (ImagesField field : getFieldList()) {
      if (field.getFieldType() == fieldType) {
        return field;
      }
    }
    return null;
  }
}
