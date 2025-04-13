package com.learning.designpatterns.prototypeandregistry.withoutcloneableinterfaceandregistry;

public class Client {
    public static void main(String[] args) {
        User user1 = new User(1, "testuser1", "test1@example.com", "Test User3", 25, UserType.ADMIN);
        User user2 = new User(2, "testuser2", "test2@example.com", "Test User3", 24, UserType.WRITER);
        User user3 = new User(3, "testuser3", "test3@example.com", "Test User3", 23, UserType.READER);

        UserPrototypeRegistry registry =  new UserPrototypeRegistryImpl();
        registry.addPrototype(user1);
        registry.addPrototype(user2);
        registry.addPrototype(user3);


        System.out.println("here object hashcode will be different as both object are cloned properly");
        User writer = registry.clone(UserType.WRITER);
        System.out.println("Writer Hashcode         : " + user2.hashCode());
        System.out.println("Writer Cloned Hashcode  : " + writer.hashCode());

        System.out.println("-------------------------------------------------------");

        System.out.println("here object hashcode will be same as both object are actually same only not cloned");
        User admin = registry.getPrototype(UserType.ADMIN);
        System.out.println("Admin Hashcode         : " + user1.hashCode());
        System.out.println("Admin Cloned Hashcode  : " + admin.hashCode());

    }
}
