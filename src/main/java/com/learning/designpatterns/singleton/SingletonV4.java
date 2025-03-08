package com.learning.designpatterns.singleton;

import java.util.concurrent.locks.ReentrantLock;

public class SingletonV4 {

    private String name;
    private static SingletonV4 instance;
    private static ReentrantLock lock = new ReentrantLock();

    private SingletonV4(String name) {
        this.name = name;
    }

    public static SingletonV4 getInstance(String name) {
        if(instance == null) {
            // double check using the lock
            lock.lock();
            if(instance == null) {
                instance = new SingletonV4(name);
            }
            lock.unlock();
        }
        return instance;
    }

    public static SingletonV4 getInstance2(String name) {
        if(instance != null) {
            return instance;
        }
        // double check just using the synchronized block
        synchronized (SingletonV4.class) {
            if(instance == null) {
                instance = new SingletonV4(name);
            }
            return  instance;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
