package com.regula.documentreader.webclient.model.ext.authenticity;

import com.regula.documentreader.webclient.model.AuthenticityCheckResult;
import com.regula.documentreader.webclient.model.OCRSecurityTextResult;

public class OCRSecurityText extends AuthenticityResult<OCRSecurityTextResult> {

  public OCRSecurityText(AuthenticityCheckResult authenticityCheckResult) {
    super(authenticityCheckResult);
  }
}
