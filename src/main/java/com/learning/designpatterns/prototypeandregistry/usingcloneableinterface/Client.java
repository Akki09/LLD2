package com.learning.designpatterns.prototypeandregistry.usingcloneableinterface;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        // cloneable interface need to be implemented in each class along with clone method of Object class to get object cloned
        // by default super.clone(); does the shallow copy
        // We need  copy mutable state manually, so the clone can't change the internals of the original eg. Student clone()
        Address address1 = new Address("Pune", "Maharashtra", 411000);
        Student student1 = new Student(1, "Akshay", 28, "Akshay@gmail.com", address1);

        Student student2 = student1.clone();
        student2.address.city = "Nagpur";

        System.out.println(student1);
        System.out.println(student2);
    }
}
