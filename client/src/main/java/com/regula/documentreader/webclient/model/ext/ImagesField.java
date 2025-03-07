package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.Base64;
import com.regula.documentreader.webclient.model.GraphicFieldType;
import com.regula.documentreader.webclient.model.ImagesFieldValue;
import com.regula.documentreader.webclient.model.Source;
import java.util.List;
import javax.annotation.Nullable;
import org.springframework.beans.BeanUtils;

public class ImagesField extends com.regula.documentreader.webclient.model.ImagesField {

  public ImagesField(com.regula.documentreader.webclient.model.ImagesField field) {
    BeanUtils.copyProperties(field, this);
  }

  public ImagesField withFieldName(String fieldName) {
    this.setFieldName(fieldName);
    return this;
  }

  public ImagesField withFieldType(GraphicFieldType fieldType) {
    this.setFieldType(fieldType);
    return this;
  }

  public ImagesField withValueList(List<ImagesFieldValue> valueList) {
    this.setValueList(valueList);
    return this;
  }

  @Override
  public ImagesField addValueListItem(ImagesFieldValue valueListItem) {
    com.regula.documentreader.webclient.model.ImagesField field =
        super.addValueListItem(valueListItem);
    return new ImagesField(field);
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
  public byte[] getValue(Source source, boolean original) {
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
  public byte[] getValue(Source source) {
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
