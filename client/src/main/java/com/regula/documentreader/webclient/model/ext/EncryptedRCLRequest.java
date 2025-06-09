package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.model.EncryptedRCLResult;
import com.regula.documentreader.webclient.model.Result;

public class EncryptedRCLRequest extends EncryptedRCLResult {

  public EncryptedRCLRequest(byte[] encryptedRCL, int light, int list_idx, int page_idx) {
    super();
    setEncryptedRCL(encryptedRCL);
    setLight(light);
    setListIdx(list_idx);
    setPageIdx(page_idx);
    setBufLength(encryptedRCL.length);
    setResultType(Result.ENCRYPTED_RCL);
  }

  public EncryptedRCLResult withEncryptedRCL(byte[] encryptedRCL) {
    this.setEncryptedRCL(encryptedRCL);
    return this;
  }
}
