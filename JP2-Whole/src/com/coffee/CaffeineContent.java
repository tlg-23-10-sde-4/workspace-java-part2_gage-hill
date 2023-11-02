package com.coffee;

// represented in 'milligrams'
public enum CaffeineContent {
    DECAF(0), LOW(50), MEDIUM(100), HIGH(150), EXTRA_HIGH(200), EXTREME(300);

    private final int value;

    private CaffeineContent(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}