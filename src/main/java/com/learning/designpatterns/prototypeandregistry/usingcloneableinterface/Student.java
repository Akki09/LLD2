package com.learning.designpatterns.prototypeandregistry.usingcloneableinterface;

// to clone object implements cloneable marker interface and override the clone method from Object class
public class Student implements Cloneable {

    int id;
    String name;
    int age;
    String email;
    Address address;

    public Student(int id, String name, int age, String email, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student cloneStudent = (Student) super.clone();
        // copy mutable state here, so the clone can't change the internals of the original
        cloneStudent.address = this.getAddress().clone();
        return  cloneStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }
}
