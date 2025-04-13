package com.learning.designpatterns.builder;

public class Client {
    public static void main(String[] args) {

        // Issue 1: Create Object with diff fields as per requirement
        // Requirement 1: I want to create an object of Student Class with name and age
        Student s1 = new Student("Shubham", 31);
        System.out.println(s1.toString());

        // Requirement 2: I want to create an object of Student Class with name and gender
        Student s2 = new Student("Shubham", 'm');
        System.out.println(s2.toString());

        // Requirement 3: I want to create an object of Student Class with name, age, gender, email. phone number
        Student s3 = new Student("Shubham", 31,'m', "shubh19@gmail.com", "8112345678");
        System.out.println(s3.toString());

        // Requirement 4: I want to create an object of Student Class with all attributes
        Student s4 = new Student("Shubham", 31,'m', "shubh19@gmail.com", "8112345678", "053", 88.0, "130363131015");
        System.out.println(s4.toString());

        // Issue is constructor telescoping, and if we define only one constructor with all attributes and use whatever is require then we may miss the ordering and create issue(Error Prone)


        // Issue 2: Create Object of Student if higherClassPercentage is above 50

        // Requirement 5
        // Here constructor telescoping is done and in that we are validating the things
        // If we create with default constructor then validate in setter then object is created that we don't want it
//        Student s5 = new Student("Akshay", 49.00);
//        System.out.println(s5.toString());




        // Now we are solving the both requirement with Builder

        Student2 build = Student2.getBuilder().setName("Akshay").setAge(30).setGender('M').build();
        System.out.println(build.toString());

        Student2 build2 = Student2.getBuilder().setName("Nirav").build();
        System.out.println(build2.toString());


    }
}
