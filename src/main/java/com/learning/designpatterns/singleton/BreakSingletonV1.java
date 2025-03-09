package com.learning.designpatterns.singleton;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BreakSingletonV1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        SerializeSingletonV5 instance1 = SerializeSingletonV5.getInstance("Akshay");

        ObjectOutput out = new ObjectOutputStream(Files.newOutputStream(Paths.get("inputFile.ser")));
        out.writeObject(instance1);
        out.close();

        ObjectInput in = new ObjectInputStream(Files.newInputStream(Paths.get("inputFile.ser")));

        SerializeSingletonV5 instance2 = (SerializeSingletonV5) in.readObject();
        in.close();

        // Here the Singleton is broke
        System.out.println("Instance 1 Hashcode: " + instance1.hashCode());
        System.out.println("Instance 1 Hashcode: " + instance1.getName());
        System.out.println("Instance 2 Hashcode: " + instance2.hashCode());
        System.out.println("Instance 2 Hashcode: " + instance2.getName());
    }
}
