package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.model.AuthenticityCheckResult;
import com.regula.documentreader.webclient.model.OCRSecurityTextResult;

public class OCRSecurityTest extends AuthenticityResult<OCRSecurityTextResult> {

    public OCRSecurityTest(AuthenticityCheckResult authenticityCheckResult) {
        super(authenticityCheckResult);
    }
}
