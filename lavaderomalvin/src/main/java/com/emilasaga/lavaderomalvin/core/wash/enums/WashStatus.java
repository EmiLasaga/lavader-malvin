package com.emilasaga.lavaderomalvin.core.wash.enums;

public enum WashStatus {
    CREATED("CREADO",1),
    IN_PROGRESS("EN_PROGRESO",2),
    COMPLETED("COMPLETADO", 3),
    FINISHED("ENTREGADO", 4);

    private final String spanishValue;
    private final int position;

    WashStatus(String spanishValue, int position) {
        this.spanishValue = spanishValue;
        this.position = position;
    }

    public String toSpanish() {
        return spanishValue;
    }
    public int getPosition() { return position; }

}
