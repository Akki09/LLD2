Requirement:
1. Given a Object of a class
2. We want to create copy of the object

Discussion Way 1:
    Student s1 = new Student();
    Student s2 = s1;
-Issue:
    Here the only reference are copied not actual new m/m is allocated

Discussion Way 2:
    Student s1 = new Student("Dymmy", "28", .....);
    Student s2 = new Studnet();
    s2.name = s1.name
    s2.age = s1.age
    .
    .
-Issue:
    - Not reusable
    - will not able to access the private m/m
    - getter and setter are not available for everything
    - client will need to know all details of class

Discussion Way 3:
    Create an Object s2 in same way like s1 one was created
-Issue:
    - In s1 it might be possible that object creation was heavy(LIKE db call, API call)


Discussion Way 4:
    Copy Constructor
    Student s1 = ........
    Student s2 = new Student(s1);
    // Now assume Student is parent of IntelligentStudent
    IN student constructor we can pass IntelligentStudent(Child Class) as well
    public Student(Student s) {
        Student temp = new Student();
        temp.id = s.id;
        temp.name = s.name;
        temp.age = s.age;
    }
-Issue
    Specific fields related to child class will be not copied we don;t know which came in Student reference
-Arguments
    we can put the instance of in constructor to check which object we need to create
-Issue
    OCP broke
    SRP broke(I should only focus of my copy object not on others)

Discussion Way 5(Final):
    We mark our class Cloneable and override the clone method from the Object class
    All the subclass will do same and take care of particular class copy
    Do copy shallow or deep is depending on class.

USE:
    - UI Button creation
    - PubG
    - Where user have heavy API/DB call in involved

Registry Discussion:
Create sample prototype and store it this is called Registry
Eg: Book 10rs, 20rs, 30rs
Baliji: Waffer(tomato,masala,cream and onion)
        This can be changed once we get object of waffer we can do small adjustment and get our new original object


