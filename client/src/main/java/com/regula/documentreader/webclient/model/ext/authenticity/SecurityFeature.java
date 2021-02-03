package com.regula.documentreader.webclient.model.ext.authenticity;

import com.regula.documentreader.webclient.model.AuthenticityCheckResult;
import com.regula.documentreader.webclient.model.SecurityFeatureResult;
import javax.annotation.Nullable;

public class SecurityFeature extends AuthenticityResult<SecurityFeatureResult> {

  public SecurityFeature(AuthenticityCheckResult authenticityCheckResult) {
    super(authenticityCheckResult);
  }

  @Nullable
  public SecurityFeatureResult itemByElementType(int elementType) {
    for (SecurityFeatureResult result : this.items()) {
      if (result.getElementType() == elementType) {
        return result;
      }
    }
    return null;
  }
}
