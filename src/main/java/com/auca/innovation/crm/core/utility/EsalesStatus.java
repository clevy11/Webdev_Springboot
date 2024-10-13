package com.auca.innovation.crm.core.utility;

public enum EsalesStatus {

    INITIATED("Initiated"),
    PROCESSED("Processed"),
    PAID("Paid"),
    RETURNED("Returned");
    private final String description;

    EsalesStatus(String description) {
        this.description = description;
    }

}
