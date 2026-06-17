package Problem_Solving_Challenge;
import java.util.Scanner;
// class student creation 
class Student{

    // instance variables 
    String name;
    String rollNumber;
    String branch;

    // method to display the data 
    void display(){
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Branch     : " + branch);
        System.out.println();
    }
   

}

public class BasicOOPS_1 {
    public static void main(String [] args){
       // Scanner class creation (intilize the variables at run time ) 
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number student you want to enter : ");
        int n = obj.nextInt();
        obj.nextLine();

        // Student class array creation 
        Student student[] = new Student[n];
    
  
       // looping condition to intilize the data 
        for (int i=0;i<n;i++){

            student[i] = new Student();
            System.out.println("Student "+(i+1));

            System.out.println("Eneter Student Name : ");
            student[i].name = obj.nextLine();
            
            System.out.println("Enter roll number : ");
            student[i].rollNumber = obj.nextLine();

            System.out.println("Enter Branch : ");
            student[i].branch = obj.nextLine();
            }
          obj.close(); 

          // looping statements to get the data 

        for (int i = 0;i<n ;i++){
            System.out.println("Student "+(i+1));
            student[i].display();
        }
    }

    
}
