package com.regula.documentreader.webclient.model.ext.authenticity;

import com.regula.documentreader.webclient.model.AuthenticityCheckResult;
import com.regula.documentreader.webclient.model.PhotoIdentResult;

public class ImageIdent extends AuthenticityResult<PhotoIdentResult> {

  public ImageIdent(AuthenticityCheckResult authenticityCheckResult) {
    super(authenticityCheckResult);
  }
}
