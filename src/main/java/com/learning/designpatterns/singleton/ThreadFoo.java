package com.learning.designpatterns.singleton;

public class ThreadFoo implements Runnable{

    @Override
    public void run(){
        SingletonV2 v1 = SingletonV2.getInstance("Akshay From Foo");
        System.out.println(v1.getName());
    }
}
