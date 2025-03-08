package com.learning.designpatterns.singleton;

import java.io.Serializable;
import java.util.concurrent.locks.ReentrantLock;

public class SerializeSingletonV5 implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private static SerializeSingletonV5 instance;
    private static ReentrantLock lock = new ReentrantLock();

    private SerializeSingletonV5(String name) {
        this.name = name;
    }

    public static SerializeSingletonV5 getInstance(String name) {
        if(instance == null) {
            // double check using the lock
            lock.lock();
            if(instance == null) {
                instance = new SerializeSingletonV5(name);
            }
            lock.unlock();
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
