package com.regula.documentreader.webclient.model.ext.authenticity;

import com.regula.documentreader.webclient.model.AuthenticityCheckResult;
import com.regula.documentreader.webclient.model.SecurityFeatureResult;
import javax.annotation.Nullable;

public class SecurityFeatureChecks extends AuthenticityResult<SecurityFeatureResult> {

  public SecurityFeatureChecks(AuthenticityCheckResult authenticityCheckResult) {
    super(authenticityCheckResult);
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
