package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.model.ImagesFieldValue;
import com.regula.documentreader.webclient.model.Source;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.util.List;
import javax.annotation.Nullable;

public class ImagesField extends com.regula.documentreader.webclient.model.ImagesField {

  @Nullable
  public byte[] getValue(String source, boolean original) {
    String result;
    for (ImagesFieldValue value : getValueList()) {
      if (value.getSource().equals(source)) {
        if (original) {
          result = value.getOriginalValue();
        }
        else {
          result = value.getValue();
        }
        return Base64.decode(result);

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
    return  Base64.decode(bestValue.getValue());
  }
}
