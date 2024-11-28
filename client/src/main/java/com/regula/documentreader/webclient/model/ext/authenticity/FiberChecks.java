package com.regula.documentreader.webclient.model.ext.authenticity;

import com.regula.documentreader.webclient.model.AuthenticityCheckResult;
import com.regula.documentreader.webclient.model.FiberResult;

import java.util.List;

public class FiberChecks extends AuthenticityResult<FiberResult> {

  public FiberChecks(AuthenticityCheckResult authenticityCheckResult) {
    super(authenticityCheckResult);
  }

  @Override
  public AuthenticityCheckResult payload() {
    return super.payload();
  }

  @Override
  public List<FiberResult> items() {
    return super.items();
  }
}
