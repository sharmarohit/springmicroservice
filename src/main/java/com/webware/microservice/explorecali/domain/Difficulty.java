package com.webware.microservice.explorecali.domain;

public enum Difficulty {
    Easy("Easy"), Medium("Medium"), Difficult("Difficult");

    private String level;

    private Difficulty(String level) {
        this.level = level;
    }
    public static Difficulty findByLevel(String bylevel) {
        for (Difficulty d: Difficulty.values()) {
            if(d.level.equalsIgnoreCase(bylevel))
                return d;
        }

        return null;
    }
}
