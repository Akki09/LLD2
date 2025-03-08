package com.learning.designpatterns.singleton;

public class SingletonV2 {

    private String name;
    private static SingletonV2 instance = null;

    private SingletonV2(String name) {
        this.name = name;
    }

    public static SingletonV2 getInstance(String name) {
        if(instance == null) {
            instance = new SingletonV2(name);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
