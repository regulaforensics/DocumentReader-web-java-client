package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.model.ContainerList;
import com.regula.documentreader.webclient.model.ResultItem;
import java.util.List;

import javax.annotation.Nullable;

public class ContainerListRequest extends ContainerList {

  @Override
  public ContainerList list(List<ResultItem> list) {
    return super.list(list);
  }

  @Override
  public <T> ContainerList addListItem(ResultItem listItem) {
    return super.addListItem(listItem);
  }

  @Nullable
  @Override
  public List<ResultItem> getList() {
    return super.getList();
  }

  @Override
  public void setList(List<ResultItem> list) {
    super.setList(list);
  }

  public ContainerListRequest(List<ResultItem> list) {
    super();
    setList(list);
  }
}
