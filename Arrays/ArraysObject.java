package Arrays;

class Student {

    String name;
    int id;
    double marks;

    // Constructor
    Student(String name, int id, double marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    // Method to display student details
    void display() {
        System.out.println(
            "Name : " + name +
            " | ID : " + id +
            " | Marks : " + marks
        );
    }
}

public class ArraysObject {

    public static void main(String[] args) {

        // Creating objects using constructor
        Student s1 = new Student("Harsha Vardhan N", 66, 7.46);
        Student s2 = new Student("Sneha", 26, 7.46);
        Student s3 = new Student("Thoufiq", 16, 7.46);
        Student s4 = new Student("Navya", 46, 7.46);

        // Array of objects
        Student[] students = {s1, s2, s3, s4};

        // Enhanced for loop
        for (Student s : students) {
            s.display();
        }
    }
}