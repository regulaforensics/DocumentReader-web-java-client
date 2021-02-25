package com.regula.documentreader.webclient.model.ext.authenticity;

import com.regula.documentreader.webclient.model.AuthenticityCheckResult;
import com.regula.documentreader.webclient.model.OCRSecurityTextResult;

public class OCRSecurityTextChecks extends AuthenticityResult<OCRSecurityTextResult> {

  public OCRSecurityTextChecks(AuthenticityCheckResult authenticityCheckResult) {
    super(authenticityCheckResult);
  }
}
