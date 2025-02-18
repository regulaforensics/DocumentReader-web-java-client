package com.regula.documentreader.webclient.model.ext;

import com.google.gson.Gson;
import com.regula.documentreader.webclient.model.ContainerList;
import com.regula.documentreader.webclient.model.ProcessParams;
import com.regula.documentreader.webclient.model.ProcessRequest;
import com.regula.documentreader.webclient.model.ProcessSystemInfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class RecognitionRequest extends ProcessRequest {

  public RecognitionRequest() {
    this(null, Collections.<ProcessRequestImage>emptyList());
  }

  public RecognitionRequest(ProcessParams params, ProcessRequestImage image) {
    this(params, Collections.singletonList(image));
  }

  public RecognitionRequest(ProcessParams params, byte[] image) {
    this(params, new ProcessRequestImage(image));
  }

  public RecognitionRequest(ProcessParams params, List<ProcessRequestImage> images) {
    withProcessParam(params);
    for (ProcessRequestImage image : images) {
      addListItem(image);
    }
    withSystemInfo(new ProcessSystemInfo());
  }

  public RecognitionRequest(ProcessParams params, ContainerList containerList) {
    withProcessParam(params);
    withContainerList(containerList);
    withSystemInfo(new ProcessSystemInfo());
  }

  public ProcessRequest withProcessParam(ProcessParams processParam) {
    this.setProcessParam(processParam);
    return this;
  }

  public ProcessRequest withList(List<ProcessRequestImage> list) {
      List<com.regula.documentreader.webclient.model.ProcessRequestImage> convertedList = new ArrayList<>(list);
    this.setList(convertedList);
    return this;
  }

  @Override
  public ProcessRequest addListItem(
      com.regula.documentreader.webclient.model.ProcessRequestImage listItem) {
    return super.addListItem(listItem);
  }

  public ProcessRequest withTag(String tag) {
    this.setTag(tag);
    return this;
  }

  public ProcessRequest withTenant(String tenant) {
    this.setTenant(tenant);
    return this;
  }

  public ProcessRequest withEnv(String env) {
    this.setEnv(env);
    return this;
  }

  public ProcessRequest withLivePortrait(String livePortrait) {
    this.setLivePortrait(livePortrait);
    return this;
  }

  public ProcessRequest withExtPortrait(String extPortrait) {
    this.setExtPortrait(extPortrait);
    return this;
  }

  public ProcessRequest withContainerList(ContainerList containerList) {
    this.setContainerList(containerList);
    return this;
  }

  public ProcessRequest withSystemInfo(ProcessSystemInfo systemInfo) {
    this.setSystemInfo(systemInfo);
    return this;
  }

  public ProcessRequest withPassBackObject(Map<String, Object> passBackObject) {
    this.setPassBackObject(passBackObject);
    return this;
  }

  public String json() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
