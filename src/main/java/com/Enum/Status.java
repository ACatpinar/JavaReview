package com.Enum;

public enum Status {

    OPEN("OPEN"),IN_PROGRESS("IN PROGRESS"),
    UAT_TEST("UAT TESTING"),COMPLETED("Completed");
    
    private final String value;

    Status (String value){
        this.value = value;
    }

}

