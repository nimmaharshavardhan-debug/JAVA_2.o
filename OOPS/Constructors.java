package OOPS;

class Student {

    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Unknown";
        age = 0;

        System.out.println("Default Constructor");
    }

    // Parameterized Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println("Parameterized Constructor");
    }

    // Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;

        System.out.println("Copy Constructor");
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println();
    }
}

// Class with Private Constructor
class MyMath {

    private MyMath() {
        System.out.println("Private Constructor Called");
    }

    // Static method to create object internally
    static MyMath createObject() {
        return new MyMath();
    }

    static int add(int a, int b) {
        return a + b;
    }
}

public class Constructors {

    public static void main(String[] args) {

        // Default Constructor
        Student s1 = new Student();

        // Parameterized Constructor
        Student s2 = new Student("Harsha", 20);

        // Copy Constructor
        Student s3 = new Student(s2);

        System.out.println("\nStudent Details:");
        s1.display();
        s2.display();
        s3.display();

        // Using static method
        System.out.println("Addition = " + MyMath.add(10, 20));

        // Creating object through method because constructor is private
        MyMath obj = MyMath.createObject();
    }
}