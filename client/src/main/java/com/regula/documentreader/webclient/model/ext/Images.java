package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.model.ImagesAvailableSource;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class Images extends com.regula.documentreader.webclient.model.Images {

  @Override
  public Images withAvailableSourceList(List<ImagesAvailableSource> availableSourceList) {
    com.regula.documentreader.webclient.model.Images images = super.withAvailableSourceList(availableSourceList);
    return (Images) images;
  }

  @Override
  public Images addAvailableSourceListItem(ImagesAvailableSource availableSourceListItem) {
    com.regula.documentreader.webclient.model.Images images = super.addAvailableSourceListItem(availableSourceListItem);
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

  @Override
  public Images withFieldList(List<ImagesField> fieldList) {
    com.regula.documentreader.webclient.model.Images images = super.withFieldList(fieldList);
    return (Images) images;
  }

  @Override
  public Images addFieldListItem(ImagesField fieldListItem) {
    com.regula.documentreader.webclient.model.Images images = super.addFieldListItem(fieldListItem);
    return (Images) images;
  }

  @Override
  public List<ImagesField> getFieldList() {
    return super.getFieldList();
  }

  @Override
  public void setFieldList(List<ImagesField> fieldList) {
    super.setFieldList(fieldList);
  }

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
