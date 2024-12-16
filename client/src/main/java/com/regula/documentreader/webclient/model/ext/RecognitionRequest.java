package com.regula.documentreader.webclient.model.ext;

import com.google.gson.Gson;
import com.regula.documentreader.webclient.model.ContainerList;
import com.regula.documentreader.webclient.model.ProcessParams;
import com.regula.documentreader.webclient.model.ProcessRequest;
import com.regula.documentreader.webclient.model.ProcessSystemInfo;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;

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

  @Override
  public ProcessRequest withProcessParam(ProcessParams processParam) {
    return super.withProcessParam(processParam);
  }

  @Override
  public ProcessParams getProcessParam() {
    return super.getProcessParam();
  }

  @Override
  public void setProcessParam(ProcessParams processParam) {
    super.setProcessParam(processParam);
  }

  @Override
  public ProcessRequest withList(List<com.regula.documentreader.webclient.model.ProcessRequestImage> list) {
    return super.withList(list);
  }

  @Override
  public ProcessRequest addListItem(com.regula.documentreader.webclient.model.ProcessRequestImage listItem) {
    return super.addListItem(listItem);
  }

  @Nullable
  @Override
  public List<com.regula.documentreader.webclient.model.ProcessRequestImage> getList() {
    return super.getList();
  }

  @Override
  public void setList(List<com.regula.documentreader.webclient.model.ProcessRequestImage> list) {
    super.setList(list);
  }

  @Override
  public ProcessRequest withTag(String tag) {
    return super.withTag(tag);
  }

  @Nullable
  @Override
  public String getTag() {
    return super.getTag();
  }

  @Override
  public void setTag(String tag) {
    super.setTag(tag);
  }

  @Override
  public ProcessRequest withTenant(String tenant) {
    return super.withTenant(tenant);
  }

  @Nullable
  @Override
  public String getTenant() {
    return super.getTenant();
  }

  @Override
  public void setTenant(String tenant) {
    super.setTenant(tenant);
  }

  @Override
  public ProcessRequest withEnv(String env) {
    return super.withEnv(env);
  }

  @Nullable
  @Override
  public String getEnv() {
    return super.getEnv();
  }

  @Override
  public void setEnv(String env) {
    super.setEnv(env);
  }

  @Override
  public ProcessRequest withLivePortrait(String livePortrait) {
    return super.withLivePortrait(livePortrait);
  }

  @Nullable
  @Override
  public String getLivePortrait() {
    return super.getLivePortrait();
  }

  @Override
  public void setLivePortrait(String livePortrait) {
    super.setLivePortrait(livePortrait);
  }

  @Override
  public ProcessRequest withExtPortrait(String extPortrait) {
    return super.withExtPortrait(extPortrait);
  }

  @Nullable
  @Override
  public String getExtPortrait() {
    return super.getExtPortrait();
  }

  @Override
  public void setExtPortrait(String extPortrait) {
    super.setExtPortrait(extPortrait);
  }

  @Override
  public ProcessRequest withContainerList(ContainerList containerList) {
    return super.withContainerList(containerList);
  }

  @Nullable
  @Override
  public ContainerList getContainerList() {
    return super.getContainerList();
  }

  @Override
  public void setContainerList(ContainerList containerList) {
    super.setContainerList(containerList);
  }

  @Override
  public ProcessRequest withSystemInfo(ProcessSystemInfo systemInfo) {
    return super.withSystemInfo(systemInfo);
  }

  @Nullable
  @Override
  public ProcessSystemInfo getSystemInfo() {
    return super.getSystemInfo();
  }

  @Override
  public void setSystemInfo(ProcessSystemInfo systemInfo) {
    super.setSystemInfo(systemInfo);
  }

  @Override
  public ProcessRequest withPassBackObject(Map<String, Object> passBackObject) {
    return super.withPassBackObject(passBackObject);
  }

  @Override
  public ProcessRequest putPassBackObjectItem(String key, Object passBackObjectItem) {
    return super.putPassBackObjectItem(key, passBackObjectItem);
  }

  @Nullable
  @Override
  public Map<String, Object> getPassBackObject() {
    return super.getPassBackObject();
  }

  @Override
  public void setPassBackObject(Map<String, Object> passBackObject) {
    super.setPassBackObject(passBackObject);
  }

  public String json() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
