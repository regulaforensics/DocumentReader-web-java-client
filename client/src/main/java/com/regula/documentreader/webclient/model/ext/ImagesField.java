package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.Base64;
import com.regula.documentreader.webclient.model.ImagesFieldValue;
import com.regula.documentreader.webclient.model.Source;
import java.util.List;
import javax.annotation.Nullable;

public class ImagesField extends com.regula.documentreader.webclient.model.ImagesField {

  @Override
  public ImagesField withFieldName(String fieldName) {
    com.regula.documentreader.webclient.model.ImagesField field = super.withFieldName(fieldName);
    return (ImagesField) field;
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
  public ImagesField withFieldType(Integer fieldType) {
    com.regula.documentreader.webclient.model.ImagesField field = super.withFieldType(fieldType);
    return (ImagesField) field;
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
  public ImagesField withValueList(List<ImagesFieldValue> valueList) {
    com.regula.documentreader.webclient.model.ImagesField field = super.withValueList(valueList);
    return (ImagesField) field;
  }

  @Override
  public ImagesField addValueListItem(ImagesFieldValue valueListItem) {
    com.regula.documentreader.webclient.model.ImagesField field = super.addValueListItem(valueListItem);
    return (ImagesField) field;
  }

  @Override
  public List<ImagesFieldValue> getValueList() {
    return super.getValueList();
  }

  @Override
  public void setValueList(List<ImagesFieldValue> valueList) {
    super.setValueList(valueList);
  }

  @Nullable
  public byte[] getValue(String source, boolean original) {
    String result;
    for (ImagesFieldValue value : getValueList()) {
      if (value.getSource().equals(source)) {
        if (original) {
          result = value.getOriginalValue();
        } else {
          result = value.getValue();
        }
        return result != null ? Base64.decode(result) : null;
      }
    }
    return null;
  }

  @Nullable
  public byte[] getValue(String source) {
    return getValue(source, false);
  }

  @Nullable
  public byte[] getValue() {
    List<ImagesFieldValue> values = getValueList();
    if (values == null || values.isEmpty()) {
      return null;
    }
    ImagesFieldValue bestValue = values.get(0);
    for (ImagesFieldValue value : values) {
      if (bestValue.getSource() == Source.BARCODE && value.getSource() == Source.VISUAL)
        bestValue = value;
      if (bestValue.getSource() == Source.BARCODE && value.getSource() == Source.RFID)
        bestValue = value;
      if (bestValue.getSource() == Source.VISUAL && value.getSource() == Source.RFID)
        bestValue = value;
    }
    return Base64.decode(bestValue.getValue());
  }
}
