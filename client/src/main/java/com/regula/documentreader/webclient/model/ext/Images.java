package com.regula.documentreader.webclient.model.ext;

import java.util.ArrayList;
import java.util.List;
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

  public List<ImagesField> getFields(int fieldType) {
    List<ImagesField> fields = new ArrayList<>();
    for (ImagesField field : getFieldList()) {
      if (field.getFieldType() == fieldType) {
        fields.add(field);
      }
    }
    return fields;
  }
}
