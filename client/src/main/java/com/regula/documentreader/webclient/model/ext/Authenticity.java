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
        return new SecurityFeature(this.resultByType(irB900Type));
    }

    public Ident imagePattern() {
        int imagePatternType = 4;
        return new Ident(this.resultByType(imagePatternType));
    }

    public SecurityFeature axialProtection() {
        int axialProtectionType = 8;
        return new SecurityFeature(this.resultByType(axialProtectionType));
    }

    public Fiber uvFiber() {
        int uvFiberType = 16;
        return new Fiber(this.resultByType(uvFiberType));
    }

    public Ident irVisibility() {
        int irVisibilityType = 32;
        return new Ident(this.resultByType(irVisibilityType));
    }

    public OCRSecurityTest ocrSecurityTest() {
        int ocrSecurityTestType = 64;
        return new OCRSecurityTest(this.resultByType(ocrSecurityTestType));
    }

    public ImageIdent ipi() {
        int ipiType = 128;
        return new ImageIdent(this.resultByType(ipiType));
    }

    public ImageIdent irImage() {
        int irImageType = 256;
        return new ImageIdent(this.resultByType(irImageType));
    }

    public SecurityFeature embedImage() {
        int embedImageType = 512;
        return new SecurityFeature(this.resultByType(embedImageType));
    }

    public Ident ovi() {
        int oviType = 1024;
        return new Ident(this.resultByType(oviType));
    }

    public Ident irLuminescence() {
        int irLuminescenceType = 2048;
        return new Ident(this.resultByType(irLuminescenceType));
    }

    public SecurityFeature holograms() {
        int hologramsType = 4096;
        return new SecurityFeature(this.resultByType(hologramsType));
    }

    public SecurityFeature imageArea() {
        int imageAreaType = 8192;
        return new SecurityFeature(this.resultByType(imageAreaType));
    }

    public Fiber uvBackground() {
        int uvBackgroundType = 16384;
        return new Fiber(this.resultByType(uvBackgroundType));
    }

    public Ident portraitComparison() {
        int portraitComparisonType = 32768;
        return new Ident(this.resultByType(portraitComparisonType));
    }

    public SecurityFeature barcodeFormatCheck() {
        int barcodeFormatCheckType = 65536;
        return new SecurityFeature(this.resultByType(barcodeFormatCheckType));
    }

    public Ident kinegram() {
        int kinegramType = 131072;
        return new Ident(this.resultByType(kinegramType));
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
}
