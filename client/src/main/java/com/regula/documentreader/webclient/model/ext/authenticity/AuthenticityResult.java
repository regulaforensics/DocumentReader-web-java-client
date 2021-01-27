package com.regula.documentreader.webclient.model.ext.authenticity;

import com.regula.documentreader.webclient.model.AuthenticityCheckResult;

import java.util.List;

public abstract class AuthenticityResult<T> {
    private final AuthenticityCheckResult authenticityCheckResult;

    public AuthenticityResult(AuthenticityCheckResult authenticityCheckResult) {
        this.authenticityCheckResult = authenticityCheckResult;
    }

    public AuthenticityCheckResult payload() {
        return this.authenticityCheckResult;
    }

    public List<T> items() {
        return (List<T>) this.authenticityCheckResult.getList();
    }
}
