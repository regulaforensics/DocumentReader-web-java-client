package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.model.AuthenticityCheckResult;
import com.regula.documentreader.webclient.model.IdentResult;

import javax.annotation.Nullable;

public class Ident extends AuthenticityResult<IdentResult> {

    public Ident(AuthenticityCheckResult authenticityCheckResult) {
        super(authenticityCheckResult);
    }

    @Nullable
    public IdentResult resultByElementType(int elementType) {
        for (IdentResult result : this.results()) {
            if (result.getElementType() == elementType) {
                return result;
            }
        }
        return null;
    }
}
