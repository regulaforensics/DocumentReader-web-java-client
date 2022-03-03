package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.model.ContainerList;
import com.regula.documentreader.webclient.model.ResultItem;
import java.util.List;

public class ContainerListRequest extends ContainerList {
  public ContainerListRequest(List<ResultItem> list) {
    super();
    setList(list);
  }
}
