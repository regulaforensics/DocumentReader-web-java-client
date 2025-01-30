package com.regula.documentreader.webclient.model.ext.authenticity;

import com.regula.documentreader.webclient.model.AuthenticityCheckList;
import com.regula.documentreader.webclient.model.AuthenticityCheckResult;
import com.regula.documentreader.webclient.model.AuthenticityResultType;
import java.util.List;
import javax.annotation.Nullable;

public class Authenticity extends com.regula.documentreader.webclient.model.AuthenticityCheckList {

  @Override
  public AuthenticityCheckList withCount(Integer count) {
    return super.withCount(count);
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

  @Override
  public AuthenticityCheckList withList(List<AuthenticityCheckResult> list) {
    return super.withList(list);
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
  private AuthenticityCheckResult resultByType(int type) {
    for (AuthenticityCheckResult checkResult : this.getList()) {
      if (checkResult.getType() == type) {
        return checkResult;
      }
    }
    return null;
  }

  private FiberChecks fiberOrNull(int type) {
    AuthenticityCheckResult result = this.resultByType(type);
    if (result != null) {
      return new FiberChecks(result);
    }
    return null;
  }

  private IdentChecks identOrNull(int type) {
    AuthenticityCheckResult result = this.resultByType(type);
    if (result != null) {
      return new IdentChecks(result);
    }
    return null;
  }

  private ImageIdentChecks imageIdentOrNull(int type) {
    AuthenticityCheckResult result = this.resultByType(type);
    if (result != null) {
      return new ImageIdentChecks(result);
    }
    return null;
  }

  private OCRSecurityTextChecks ocrSecurityTextOrNull(int type) {
    AuthenticityCheckResult result = this.resultByType(type);
    if (result != null) {
      return new OCRSecurityTextChecks(result);
    }
    return null;
  }

  private SecurityFeatureChecks securityFeatureOrNull(int type) {
    AuthenticityCheckResult result = this.resultByType(type);
    if (result != null) {
      return new SecurityFeatureChecks(result);
    }
    return null;
  }
}
