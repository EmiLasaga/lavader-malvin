package com.emilasaga.lavaderomalvin.core.wash.enums;

public enum WashStatus {
    CREATED("CREADO"),
    IN_PROGRESS("EN_PROGRESO"),
    COMPLETED("COMPLETADO"),
    FINISHED("FINALIZADO");

    private final String spanishValue;

    WashStatus(String spanishValue) {
        this.spanishValue = spanishValue;
    }

    public String toSpanish() {
        return spanishValue;
    }

}
