package com.learning.designpatterns.prototypeandregistry.usingcloneableinterface;

public class Address implements Cloneable {
    String city;
    String state;
    int pinCode;

    public Address(String city, String state, int pinCode) {
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getPinCode() {
        return pinCode;
    }

    @Override
    public Address clone() throws CloneNotSupportedException {
        //copy mutable state here, so the clone can 't change the internals of the original
        return (Address) super.clone();

    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
