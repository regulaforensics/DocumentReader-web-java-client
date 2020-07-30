package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.model.CheckResult;
import com.regula.documentreader.webclient.model.CrossSourceValueComparison;
import com.regula.documentreader.webclient.model.SourceValidity;
import com.regula.documentreader.webclient.model.TextFieldValue;
import javax.annotation.Nullable;

public class TextField extends com.regula.documentreader.webclient.model.TextField {

  @Nullable
  public String getValue(String source, boolean original) {
    for (TextFieldValue value : getValueList()) {
      if (value.getSource().equals(source)) {
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
  public String getValue(String source) {
    return getValue(source, false);
  }

  public int sourceValidity(String source) {
    for (SourceValidity sourceValidity : this.getValidityList()) {
      if (sourceValidity.getSource().equals(source)) {
        return sourceValidity.getStatus();
      }
    }
    return CheckResult.WAS_NOT_DONE;
  }

  public int crossSourceComparison(String one, String other) {
    for (CrossSourceValueComparison comparison : this.getComparisonList()) {
      boolean a =
          comparison.getSourceLeft().equals(one) && comparison.getSourceRight().equals(other);
      boolean b =
          comparison.getSourceRight().equals(one) && comparison.getSourceLeft().equals(other);
      if (a || b) {
        return comparison.getStatus();
      }
    }
    return CheckResult.WAS_NOT_DONE;
  }
}
