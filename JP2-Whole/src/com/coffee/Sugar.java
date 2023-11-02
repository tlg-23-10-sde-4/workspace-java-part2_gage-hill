package com.coffee;

public enum Sugar {
    NONE(0), LIGHT(5), MEDIUM(10), HEAVY(20), EXTRA(20);

    private final int value;

    private Sugar(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}