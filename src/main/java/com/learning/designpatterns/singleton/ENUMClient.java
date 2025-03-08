package com.learning.designpatterns.singleton;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ENUMClient {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ENUMSingleton obj1 = ENUMSingleton.instance;
        System.out.println(obj1.getName());
        System.out.println(obj1.hashCode());

        ObjectOutput out = new ObjectOutputStream(Files.newOutputStream(Paths.get("enumInputFile.ser")));
        out.writeObject(obj1);
        out.close();

        ObjectInput in = new ObjectInputStream(Files.newInputStream(Paths.get("enumInputFile.ser")));

        ENUMSingleton obj2 = (ENUMSingleton) in.readObject();
        System.out.println(obj2.getName());
        System.out.println(obj2.hashCode());


    }
}
