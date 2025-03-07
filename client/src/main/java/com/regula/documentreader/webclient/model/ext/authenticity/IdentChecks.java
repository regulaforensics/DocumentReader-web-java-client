package com.regula.documentreader.webclient.model.ext.authenticity;

import com.regula.documentreader.webclient.model.IdentResult;
import com.regula.documentreader.webclient.model.SecurityFeatureType;
import com.regula.documentreader.webclient.model.AuthenticityCheckResult;
import java.util.List;
import javax.annotation.Nullable;

public class IdentChecks extends AuthenticityResult<IdentResult> {

  public IdentChecks(AuthenticityCheckResult authenticityCheckResult) {
    super(authenticityCheckResult);
  }

  @Override
  public AuthenticityCheckResult payload() {
    return super.payload();
  }

  @Override
  public List<IdentResult> items() {
    return super.items();
  }

  @Nullable
  public IdentResult checksByElement(SecurityFeatureType elementType) {
    for (IdentResult result : this.items()) {
      if (result.getElementType() == elementType) {
        return result;
      }
    }
    return null;
  }
}
