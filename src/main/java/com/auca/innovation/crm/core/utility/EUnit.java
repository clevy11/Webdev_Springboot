package com.auca.innovation.crm.core.utility;

public enum EUnit {
    KG("KG"),
    G("g"),
    L("l"),
    M("m"),
    PIECE("piece");
    private final String description;

    EUnit(String description) {
        this.description = description;
    }
}
