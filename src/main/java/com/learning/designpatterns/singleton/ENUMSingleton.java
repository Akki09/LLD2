package com.learning.designpatterns.singleton;

public enum ENUMSingleton {
    instance("Akshay");

    private final String name;

    ENUMSingleton(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
