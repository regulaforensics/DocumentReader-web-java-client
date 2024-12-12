package com.regula.documentreader.webclient.model.ext.authenticity;

import com.regula.documentreader.webclient.model.AuthenticityCheckResult;
import com.regula.documentreader.webclient.model.PhotoIdentResult;

import java.util.List;

public class ImageIdentChecks extends AuthenticityResult<PhotoIdentResult> {

  public ImageIdentChecks(AuthenticityCheckResult authenticityCheckResult) {
    super(authenticityCheckResult);
  }

  @Override
  public AuthenticityCheckResult payload() {
    return super.payload();
  }

  @Override
  public List<PhotoIdentResult> items() {
    return super.items();
  }
}
