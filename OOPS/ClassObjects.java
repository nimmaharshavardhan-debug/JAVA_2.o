package OOPS;
class Student{
    int id;
    String name;
    String branch;
    String college_name;
    float CGPA;

    public Student(int id,String name,String branch,String college_name,float CGPA){
        this.id = id;
        this.name=name;
        this.branch=branch;
        this.college_name=college_name;
        this.CGPA=CGPA;
        
    }
}
public class ClassObjects {
    public static void main(String [] args){
        Student student = new Student(566,"Harsha Vardhan N","CSE","MTIET",7.56F);
        System.out.println(student.id);
        System.out.println(student.name);
        System.out.println(student.branch);
        System.out.println(student.college_name);
        System.out.println(student.CGPA);


    }

    
}
