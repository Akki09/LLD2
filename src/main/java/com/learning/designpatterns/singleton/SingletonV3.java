package com.learning.designpatterns.singleton;

public class SingletonV3 {

    private String name;
    private static SingletonV3 instance = new SingletonV3("Pre-Define Value");

    private SingletonV3(String name) {
        this.name = name;
    }

    public static SingletonV3 getInstance() {
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
