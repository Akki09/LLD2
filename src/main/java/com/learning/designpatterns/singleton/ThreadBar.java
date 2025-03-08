package com.learning.designpatterns.singleton;

public class ThreadBar implements Runnable{
    @Override
    public void run() {
        SingletonV2 v2 = SingletonV2.getInstance("Akshay from Bar");
        System.out.println(v2.getName());
    }
}
