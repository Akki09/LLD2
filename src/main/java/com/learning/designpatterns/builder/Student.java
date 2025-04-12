package com.learning.designpatterns.builder;

public class Student {
    private String name;
    private int age;
    private char gender;
    private String email;
    private String phoneNumber;
    private String collegeId;
    private double higherClassPercentage;
    private String rollNumber;

    //Requirement 1
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Requirement 2
    public Student(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    //Requirement 3
    public Student(String name, int age, char gender, String email, String phoneNumber) {
        this(name, gender);
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //Requirement 4
    public Student(String name, int age, char gender, String email, String phoneNumber, String collegeId, double higherClassPercentage, String rollNumber) {
        this(name, age, gender, email, phoneNumber);
        this.collegeId = collegeId;
        this.higherClassPercentage = higherClassPercentage;
        this.rollNumber = rollNumber;
    }

    // Requirement 5
    public Student(String name, double higherClassPercentage) {
        this.name = name;
        if(higherClassPercentage < 50) {
            throw new RuntimeException("Object can't created as Higher Class Percentage is less than 50");
        }
        this.higherClassPercentage = higherClassPercentage;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCollegeId() {
        return collegeId;
    }

    public double getHigherClassPercentage() {
        return higherClassPercentage;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", collegeId='" + collegeId + '\'' +
                ", higherClassPercentage=" + higherClassPercentage +
                ", rollNumber=" + rollNumber +
                '}';
    }
}
