package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.model.AuthenticityCheckResult;
import com.regula.documentreader.webclient.model.FiberResult;

public class Fiber extends AuthenticityResult<FiberResult> {

    public Fiber(AuthenticityCheckResult authenticityCheckResult) {
        super(authenticityCheckResult);
    }
}
