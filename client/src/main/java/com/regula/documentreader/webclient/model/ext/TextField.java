package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.model.CheckResult;
import com.regula.documentreader.webclient.model.CrossSourceValueComparison;
import com.regula.documentreader.webclient.model.LCID;
import com.regula.documentreader.webclient.model.Source;
import com.regula.documentreader.webclient.model.SourceValidity;
import com.regula.documentreader.webclient.model.TextFieldType;
import com.regula.documentreader.webclient.model.TextFieldValue;
import java.util.List;
import javax.annotation.Nullable;
import org.springframework.beans.BeanUtils;

public class TextField extends com.regula.documentreader.webclient.model.TextField {

  public TextField(com.regula.documentreader.webclient.model.TextField field) {
    BeanUtils.copyProperties(field, this);
  }

  public TextField withFieldType(TextFieldType fieldType) {
    this.setFieldType(fieldType);
    return this;
  }

  public TextField withFieldName(String fieldName) {
    this.setFieldName(fieldName);
    return this;
  }

  public TextField withLcid(LCID lcid) {
    this.setLcid(lcid);
    return this;
  }

  public TextField withStatus(CheckResult status) {
    this.setStatus(status);
    return this;
  }

  public TextField withValidityStatus(CheckResult validityStatus) {
    this.setValidityStatus(validityStatus);
    return this;
  }

  public TextField withComparisonStatus(CheckResult comparisonStatus) {
    this.setComparisonStatus(comparisonStatus);
    return this;
  }

  public TextField withValue(String value) {
    this.setValue(value);
    return this;
  }

  public TextField withValueList(List<TextFieldValue> valueList) {
    this.setValueList(valueList);
    return this;
  }

  public TextField withValidityList(List<SourceValidity> validityList) {
    this.setValidityList(validityList);
    return this;
  }

  public TextField withComparisonList(List<CrossSourceValueComparison> comparisonList) {
    this.setComparisonList(comparisonList);
    return this;
  }

  @Nullable
  public String getValue(Source source, boolean original) {
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
  public String getValue(Source source) {
    return getValue(source, false);
  }

  public CheckResult sourceValidity(Source source) {
    for (SourceValidity sourceValidity : this.getValidityList()) {
      if (sourceValidity.getSource().equals(source)) {
        return sourceValidity.getStatus();
      }
    }
    return CheckResult.WAS_NOT_DONE;
  }

  public CheckResult crossSourceComparison(Source one, Source other) {
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
