package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.model.AuthenticityCheckResult;

import javax.annotation.Nullable;

public class Authenticity extends com.regula.documentreader.webclient.model.AuthenticityCheckList {

    public SecurityFeature uvLuminescence() {
        int uvLuminescenceType = 1;
        return new SecurityFeature(this.resultByType(uvLuminescenceType));
    }

    public SecurityFeature irB900() {
        int irB900Type = 2;
        return this.securityFeatureOrNull(irB900Type);
    }

    public Ident imagePattern() {
        int imagePatternType = 4;
        return this.identOrNull(imagePatternType);
    }

    public SecurityFeature axialProtection() {
        int axialProtectionType = 8;
        return this.securityFeatureOrNull(axialProtectionType);
    }

    public Fiber uvFiber() {
        int uvFiberType = 16;
        return this.fiberOrNull(uvFiberType);
    }

    public Ident irVisibility() {
        int irVisibilityType = 32;
        return this.identOrNull(irVisibilityType);
    }

    public OCRSecurityText ocrSecurityText() {
        int ocrSecurityTextType = 64;
        return this.ocrSecurityTextOrNull(ocrSecurityTextType);
    }

    public ImageIdent ipi() {
        int ipiType = 128;
        return this.imageIdentOrNull(ipiType);
    }

    public ImageIdent irImage() {
        int irImageType = 256;
        return this.imageIdentOrNull(irImageType);
    }

    public SecurityFeature embedImage() {
        int embedImageType = 512;
        return this.securityFeatureOrNull(embedImageType);
    }

    public Ident ovi() {
        int oviType = 1024;
        return this.identOrNull(oviType);
    }

    public Ident irLuminescence() {
        int irLuminescenceType = 2048;
        return this.identOrNull(irLuminescenceType);
    }

    public SecurityFeature holograms() {
        int hologramsType = 4096;
        return this.securityFeatureOrNull(hologramsType);
    }

    public SecurityFeature imageArea() {
        int imageAreaType = 8192;
        return this.securityFeatureOrNull(imageAreaType);
    }

    public Fiber uvBackground() {
        int uvBackgroundType = 16384;
        return this.fiberOrNull(uvBackgroundType);
    }

    public Ident portraitComparison() {
        int portraitComparisonType = 32768;
        return this.identOrNull(portraitComparisonType);
    }

    public SecurityFeature barcodeFormatCheck() {
        int barcodeFormatCheckType = 65536;
        return this.securityFeatureOrNull(barcodeFormatCheckType);
    }

    public Ident kinegram() {
        int kinegramType = 131072;
        return this.identOrNull(kinegramType);
    }

    public Ident letterScreen() {
        int letterScreenType = 262144;
        return this.identOrNull(letterScreenType);
    }

    public Ident hologramsDetection() {
        int hologramsDetectionType = 524288;
        return this.identOrNull(hologramsDetectionType);
    }

    public Ident fingerprintComparison() {
        int fingerprintComparisonType = 1048576;
        return this.identOrNull(fingerprintComparisonType);
    }

    @Nullable
    public AuthenticityCheckResult resultByType(int type) {
        for (AuthenticityCheckResult checkResult : this.getList()) {
            if (checkResult.getType() == type) {
                return checkResult;
            }
        }
        return null;
    }

    private Fiber fiberOrNull(int type) {
        AuthenticityCheckResult result = this.resultByType(type);
        if (result != null) {
            return new Fiber(result);
        }
        return null;
    }

    private Ident identOrNull(int type) {
        AuthenticityCheckResult result = this.resultByType(type);
        if (result != null) {
            return new Ident(result);
        }
        return null;
    }

    private ImageIdent imageIdentOrNull(int type) {
        AuthenticityCheckResult result = this.resultByType(type);
        if (result != null) {
            return new ImageIdent(result);
        }
        return null;
    }

    private OCRSecurityText ocrSecurityTextOrNull(int type) {
        AuthenticityCheckResult result = this.resultByType(type);
        if (result != null) {
            return new OCRSecurityText(result);
        }
        return null;
    }

    private SecurityFeature securityFeatureOrNull(int type) {
        AuthenticityCheckResult result = this.resultByType(type);
        if (result != null) {
            return new SecurityFeature(result);
        }
        return null;
    }
}
