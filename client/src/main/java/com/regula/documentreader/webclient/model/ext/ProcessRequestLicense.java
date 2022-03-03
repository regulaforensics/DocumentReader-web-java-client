package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.model.LicenseResult;
import com.regula.documentreader.webclient.model.Result;

public class ProcessRequestLicense extends LicenseResult {
  public ProcessRequestLicense(byte[] license, int light, int list_idx, int page_idx) {
    super();
    setLicense(license);
    setLight(light);
    setListIdx(list_idx);
    setPageIdx(page_idx);
    setBufLength(license.length);
    setResultType(Result.LICENSE);
  }
}
