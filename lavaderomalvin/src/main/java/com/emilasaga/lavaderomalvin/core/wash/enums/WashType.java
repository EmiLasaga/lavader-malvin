package com.emilasaga.lavaderomalvin.core.wash.enums;

public enum WashType {
    COMMON_WASH("LAVADO_COMUN"),
    COMPLEX_WASH("LAVADO_COMPLEJO"),
    MIXED_WASH("LAVADO_MIXTO"),
    DRY_CLEANER("TINTORERIA"),
    SEWING("COSTURA");

    private final String spanishValue;

    WashType(String spanishValue) {
        this.spanishValue = spanishValue;
    }

    public String toSpanish() {
        return spanishValue;
    }
}
