package com.regula.documentreader.webclient.model.ext.authenticity;

import com.regula.documentreader.webclient.model.AuthenticityCheckResult;
import com.regula.documentreader.webclient.model.IdentResult;
import javax.annotation.Nullable;

public class Ident extends AuthenticityResult<IdentResult> {

  public Ident(AuthenticityCheckResult authenticityCheckResult) {
    super(authenticityCheckResult);
  }

  @Nullable
  public IdentResult itemByElementType(int elementType) {
    for (IdentResult result : this.items()) {
      if (result.getElementType() == elementType) {
        return result;
      }
    }
    return null;
  }
}
