package com.regulaforensics.docreader.client.model.ext;

import com.regulaforensics.docreader.client.model.ProcessParams;
import java.util.Arrays;

public class RecognitionParams extends ProcessParams {

  public RecognitionParams withResultTypeOutput(Integer... resultTypes) {
    this.setResultTypeOutput(Arrays.asList(resultTypes));
    return this;
  }

  @Override
  public RecognitionParams withScenario(String scenario) {
    super.withScenario(scenario);
    return this;
  }
}
