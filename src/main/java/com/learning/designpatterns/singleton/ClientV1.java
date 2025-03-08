package com.learning.designpatterns.singleton;

public class ClientV1 {

    public static void main(String[] args) {

        // Step 0:
        // We want to restrict the Object creation of SingletonV1 to 1
        // but here we are able to create more than 1 object

//        SingletonV1 s1 = new SingletonV1("Akshay");
//        SingletonV1 s2 = new SingletonV1("Rahul");
//
//        System.out.println(s1.getName());
//        System.out.println(s2.getName());

        //*****************************--------------------********************************

        // Step 1:
        // 1. Make the constructor private
        // 2. Make static method to get the object

        // So let's create the one static method which creates the object using private constructor
//        SingletonV2 s1 = SingletonV2.getInstance("Akshay");
//        SingletonV2 s2 = SingletonV2.getInstance("Rahul");
//
//        System.out.println(s1.getName());
//        System.out.println(s2.getName());

        // Still it create the 2 object :(

        //*****************************--------------------********************************

        // Step 2:
        // 1. Make one static data member which hold class instance
        // 2. Make the constructor private
        // 3. Make static method to get the object Add Null check

//        SingletonV2 s1 = SingletonV2.getInstance("Akshay");
//        SingletonV2 s2 = SingletonV2.getInstance("Rahul");
//
//        System.out.println(s1.getName());
//        System.out.println(s2.getName());

        // Now problem is solved!
        // Really? How this will behave in multi threaded application? Let's Test it

        //*****************************--------------------********************************

        // Step 4: Proof that this is not thread safe
//        System.out.println("Try to run this multiple time you will see different values");
//        System.out.println("NOTE: If you see same value then Singleton was reused else Booooooooooooo!!!!");
//        Thread t1 = new Thread(new ThreadBar());
//        Thread t2 = new Thread(new ThreadFoo());
//        t1.start();
//        t2.start();

        //*****************************--------------------********************************

        // Step 5: Early Initialization
//        SingletonV3 s1 = SingletonV3.getInstance();
//        System.out.println(s1.getName());

        //*****************************--------------------********************************

        // Step 6: Lazy Initialization
        SingletonV4 s1 = SingletonV4.getInstance("Akshay");
        SingletonV4 s2 = SingletonV4.getInstance("Tom");

        System.out.println(s1.getName());
        System.out.println(s2.getName());

    }
}
