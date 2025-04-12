package com.learning.designpatterns.builder;

public class Student2 {

    private String name;
    private int age;
    private char gender;
    private String email;
    private String phoneNumber;
    private String collegeId;
    private double higherClassPercentage;
    private String rollNumber;

    private Student2(StudentBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.collegeId = builder.collegeId;
        this.higherClassPercentage = builder.higherClassPercentage;
        this.rollNumber = builder.rollNumber;
    }

    public static StudentBuilder getBuilder() {
        return new StudentBuilder();
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", collegeId='" + collegeId + '\'' +
                ", higherClassPercentage=" + higherClassPercentage +
                ", rollNumber='" + rollNumber + '\'' +
                '}';
    }

    static class StudentBuilder {
        String name;
        private int age;
        private char gender;
        private String email;
        private String phoneNumber;
        private String collegeId;
        private double higherClassPercentage;
        private String rollNumber;

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setGender(char gender) {
            this.gender = gender;
            return this;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public StudentBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public StudentBuilder setCollegeId(String collegeId) {
            this.collegeId = collegeId;
            return this;
        }

        public StudentBuilder setHigherClassPercentage(double higherClassPercentage) {
            this.higherClassPercentage = higherClassPercentage;
            return this;
        }

        public StudentBuilder setRollNumber(String rollNumber) {
            this.rollNumber = rollNumber;
            return this;
        }

        public Student2 build() {
            return new Student2(this);
        }
    }
}
