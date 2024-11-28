package com.regula.documentreader.webclient.model.ext.authenticity;

import com.regula.documentreader.webclient.model.AuthenticityCheckResult;
import com.regula.documentreader.webclient.model.OCRSecurityTextResult;

import java.util.List;

public class OCRSecurityTextChecks extends AuthenticityResult<OCRSecurityTextResult> {

  public OCRSecurityTextChecks(AuthenticityCheckResult authenticityCheckResult) {
    super(authenticityCheckResult);
  }

  @Override
  public AuthenticityCheckResult payload() {
    return super.payload();
  }

  @Override
  public List<OCRSecurityTextResult> items() {
    return super.items();
  }
}
