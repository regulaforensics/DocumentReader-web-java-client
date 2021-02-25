package com.regula.documentreader.webclient.model.ext.authenticity;

import com.regula.documentreader.webclient.model.AuthenticityCheckResult;
import com.regula.documentreader.webclient.model.PhotoIdentResult;

public class ImageIdentChecks extends AuthenticityResult<PhotoIdentResult> {

  public ImageIdentChecks(AuthenticityCheckResult authenticityCheckResult) {
    super(authenticityCheckResult);
  }
}
