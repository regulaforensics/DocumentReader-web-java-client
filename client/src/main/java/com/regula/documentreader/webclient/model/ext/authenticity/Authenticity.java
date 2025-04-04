package com.regula.documentreader.webclient.model.ext.authenticity;

import com.regula.documentreader.webclient.model.AuthenticityCheckList;
import com.regula.documentreader.webclient.model.AuthenticityCheckResult;
import com.regula.documentreader.webclient.model.AuthenticityResultType;
import java.util.List;
import javax.annotation.Nullable;
import org.springframework.beans.BeanUtils;

public class Authenticity extends com.regula.documentreader.webclient.model.AuthenticityCheckList {

  public Authenticity(com.regula.documentreader.webclient.model.AuthenticityCheckList list) {
    BeanUtils.copyProperties(list, this);
  }

  public AuthenticityCheckList withCount(Integer count) {
    this.setCount(count);
    return this;
  }

  @Nullable
  @Override
  public Integer getCount() {
    return super.getCount();
  }

  @Override
  public void setCount(Integer count) {
    super.setCount(count);
  }

  public AuthenticityCheckList withList(List<AuthenticityCheckResult> list) {
    this.setList(list);
    return this;
  }

  @Override
  public AuthenticityCheckList addListItem(AuthenticityCheckResult listItem) {
    return super.addListItem(listItem);
  }

  @Override
  public List<AuthenticityCheckResult> getList() {
    return super.getList();
  }

  @Override
  public void setList(List<AuthenticityCheckResult> list) {
    super.setList(list);
  }

  @Nullable
  public SecurityFeatureChecks uvLuminescenceChecks() {
    return this.securityFeatureOrNull(AuthenticityResultType.UV_LUMINESCENCE);
  }

  @Nullable
  public SecurityFeatureChecks irB900Checks() {
    return this.securityFeatureOrNull(AuthenticityResultType.IR_B900);
  }

  @Nullable
  public IdentChecks imagePatternChecks() {
    return this.identOrNull(AuthenticityResultType.IMAGE_PATTERN);
  }

  @Nullable
  public SecurityFeatureChecks axialProtectionChecks() {
    return this.securityFeatureOrNull(AuthenticityResultType.AXIAL_PROTECTION);
  }

  @Nullable
  public FiberChecks uvFiberChecks() {
    return this.fiberOrNull(AuthenticityResultType.UV_FIBERS);
  }

  @Nullable
  public IdentChecks irVisibilityChecks() {
    return this.identOrNull(AuthenticityResultType.IR_VISIBILITY);
  }

  @Nullable
  public OCRSecurityTextChecks ocrSecurityTextChecks() {
    return this.ocrSecurityTextOrNull(AuthenticityResultType.OCR_SECURITY_TEXT);
  }

  @Nullable
  public ImageIdentChecks ipiChecks() {
    return this.imageIdentOrNull(AuthenticityResultType.IPI);
  }

  @Nullable
  public SecurityFeatureChecks embedImageChecks() {
    return this.securityFeatureOrNull(AuthenticityResultType.PHOTO_EMBED_TYPE);
  }

  @Nullable
  public SecurityFeatureChecks hologramsChecks() {
    return this.securityFeatureOrNull(AuthenticityResultType.HOLOGRAMS);
  }

  @Nullable
  public SecurityFeatureChecks imageAreaChecks() {
    return this.securityFeatureOrNull(AuthenticityResultType.PHOTO_AREA);
  }

  @Nullable
  public IdentChecks portraitComparisonChecks() {
    return this.identOrNull(AuthenticityResultType.PORTRAIT_COMPARISON);
  }

  @Nullable
  public SecurityFeatureChecks barcodeFormatCheckChecks() {
    return this.securityFeatureOrNull(AuthenticityResultType.BARCODE_FORMAT_CHECK);
  }

  @Nullable
  public IdentChecks kinegramChecks() {
    return this.identOrNull(AuthenticityResultType.KINEGRAM);
  }

  @Nullable
  public IdentChecks letterScreenChecks() {
    return this.identOrNull(AuthenticityResultType.LETTER_SCREEN);
  }

  @Nullable
  private AuthenticityCheckResult resultByType(AuthenticityResultType type) {
    for (AuthenticityCheckResult checkResult : this.getList()) {
      if (checkResult.getType() == type) {
        return checkResult;
      }
    }
    return null;
  }

  private FiberChecks fiberOrNull(AuthenticityResultType type) {
    AuthenticityCheckResult result = this.resultByType(type);
    if (result != null) {
      return new FiberChecks(result);
    }
    return null;
  }

  private IdentChecks identOrNull(AuthenticityResultType type) {
    AuthenticityCheckResult result = this.resultByType(type);
    if (result != null) {
      return new IdentChecks(result);
    }
    return null;
  }

  private ImageIdentChecks imageIdentOrNull(AuthenticityResultType type) {
    AuthenticityCheckResult result = this.resultByType(type);
    if (result != null) {
      return new ImageIdentChecks(result);
    }
    return null;
  }

  private OCRSecurityTextChecks ocrSecurityTextOrNull(AuthenticityResultType type) {
    AuthenticityCheckResult result = this.resultByType(type);
    if (result != null) {
      return new OCRSecurityTextChecks(result);
    }
    return null;
  }

  private SecurityFeatureChecks securityFeatureOrNull(AuthenticityResultType type) {
    AuthenticityCheckResult result = this.resultByType(type);
    if (result != null) {
      return new SecurityFeatureChecks(result);
    }
    return null;
  }
}
