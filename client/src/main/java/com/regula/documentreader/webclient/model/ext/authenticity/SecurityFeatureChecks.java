package com.regula.documentreader.webclient.model.ext.authenticity;

import com.regula.documentreader.webclient.model.AuthenticityCheckResult;
import com.regula.documentreader.webclient.model.SecurityFeatureResult;

import java.util.List;

import javax.annotation.Nullable;

public class SecurityFeatureChecks extends AuthenticityResult<SecurityFeatureResult> {

  public SecurityFeatureChecks(AuthenticityCheckResult authenticityCheckResult) {
    super(authenticityCheckResult);
  }

  @Override
  public AuthenticityCheckResult payload() {
    return super.payload();
  }

  @Override
  public List<SecurityFeatureResult> items() {
    return super.items();
  }

  @Nullable
  public SecurityFeatureResult checksByElement(int elementType) {
    for (SecurityFeatureResult result : this.items()) {
      if (result.getElementType() == elementType) {
        return result;
      }
    }
    return null;
  }
}
