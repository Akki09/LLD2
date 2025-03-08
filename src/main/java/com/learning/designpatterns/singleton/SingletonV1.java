package com.learning.designpatterns.singleton;

public class SingletonV1 {

    private String name;

    public SingletonV1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
