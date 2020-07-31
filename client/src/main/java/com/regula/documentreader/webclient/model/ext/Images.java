package com.regula.documentreader.webclient.model.ext;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class Images extends com.regula.documentreader.webclient.model.Images {

  private List<byte[]> normalizedInputImages = Collections.emptyList();

  @Nullable
  public ImagesField getField(int fieldType) {
    for (ImagesField field : getFieldList()) {
      if (field.getFieldType() == fieldType) {
        return field;
      }
    }
    return null;
  }

  @Nullable
  public byte[] normalizedInputImage() {
    if (normalizedInputImages.size() >= 1) {
      return normalizedInputImages.get(0);
    }
    return null;
  }

  public List<byte[]> getNormalizedInputImages() {
    return normalizedInputImages;
  }

  public Images withNormalizedInputImages(@Nonnull List<byte[]> normalizedInputImages) {
    this.normalizedInputImages = normalizedInputImages;
    return this;
  }
}
