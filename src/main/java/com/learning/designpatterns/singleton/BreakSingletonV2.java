package com.learning.designpatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingletonV2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<SingletonV4> privateConstructorSingletonV4 = SingletonV4.class.getDeclaredConstructor(String.class);
        privateConstructorSingletonV4.setAccessible(true);

        SingletonV4 instance1  = privateConstructorSingletonV4.newInstance("Akshay");
        SingletonV4 instance2 = privateConstructorSingletonV4.newInstance("Rahul");

        // Here Singleton is break via ReflectionAPIs
        System.out.println(instance1.getName());
        System.out.println(instance2.getName());

    }
}
