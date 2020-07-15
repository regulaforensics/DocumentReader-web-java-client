package com.regulaforensics.docreader.client.model.ext;

import com.regulaforensics.docreader.client.model.TextFieldValue;
import javax.annotation.Nullable;

public class TextField extends com.regulaforensics.docreader.client.model.TextField {

  public String getValue() {
    return "todo";
  }

  @Nullable
  public String getValue(int source, boolean original) {
    for (TextFieldValue value : getValueList()) {
      if (value.getSource() == source) {
        if (original) {
          return value.getOriginalValue();
        } else {
          return value.getValue();
        }
      }
    }
    return null;
  }

  @Nullable
  public String getValue(int source) {
    return getValue(source, false);
  }
}
