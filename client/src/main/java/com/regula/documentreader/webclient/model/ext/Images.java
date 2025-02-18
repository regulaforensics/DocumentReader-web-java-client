package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.model.GraphicFieldType;
import com.regula.documentreader.webclient.model.ImagesAvailableSource;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

public class Images extends com.regula.documentreader.webclient.model.Images {

  public Images withAvailableSourceList(List<ImagesAvailableSource> availableSourceList) {
    this.setAvailableSourceList(availableSourceList);
    return this;
  }

  @Override
  public Images addAvailableSourceListItem(ImagesAvailableSource availableSourceListItem) {
    com.regula.documentreader.webclient.model.Images images =
        super.addAvailableSourceListItem(availableSourceListItem);
    return (Images) images;
  }

  @Override
  public List<ImagesAvailableSource> getAvailableSourceList() {
    return super.getAvailableSourceList();
  }

  @Override
  public void setAvailableSourceList(List<ImagesAvailableSource> availableSourceList) {
    super.setAvailableSourceList(availableSourceList);
  }

  public Images withFieldList(List<ImagesField> fieldList) {
    List<com.regula.documentreader.webclient.model.ImagesField> fields = new ArrayList<>();
    for (ImagesField field : fieldList){
      fields.add(field);
    }
    super.setFieldList(fields);
    return this;
  }


  @Nullable
  public ImagesField getField(GraphicFieldType fieldType) {
    for (com.regula.documentreader.webclient.model.ImagesField field : getFieldList()) {
      if (field.getFieldType() == fieldType) {
        return (ImagesField) field;
      }
    }
    return null;
  }

  public List<ImagesField> getFields(int fieldType) {
    List<ImagesField> fields = new ArrayList<>();
    for (com.regula.documentreader.webclient.model.ImagesField field : getFieldList()) {
      if (field.getFieldType().getValue() == fieldType) {
        fields.add((ImagesField) field);
      }
    }
    return fields;
  }
}
