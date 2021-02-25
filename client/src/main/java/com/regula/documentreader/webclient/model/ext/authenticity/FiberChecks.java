package com.regula.documentreader.webclient.model.ext.authenticity;

import com.regula.documentreader.webclient.model.AuthenticityCheckResult;
import com.regula.documentreader.webclient.model.FiberResult;

public class FiberChecks extends AuthenticityResult<FiberResult> {

  public FiberChecks(AuthenticityCheckResult authenticityCheckResult) {
    super(authenticityCheckResult);
  }
}
