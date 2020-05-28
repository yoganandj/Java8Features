package com.java.sample.java8feaures.streams;

public enum Type {
    FISH ("prawns"),
        OTHER ("french fries"),
        MEAT ("beef");

    private final String value;

    Type(String value) {
        this.value = value;
    }
}
