package Problem_Solving_Challenge;

import java.util.Scanner;



public class Student_Information {
    public static void main(String [] args){
        // Scanner class to intlize the values at run time 
        Scanner obj = new Scanner(System.in);

        // declaring the varibles 
        System.out.println("Enter Student  Name : ");
        String stdName = obj.nextLine();
        System.out.println("Enter Student Age : ");
        int age = obj.nextInt();
        System.out.println("Enter CGPA : ");
        double cgpa = obj.nextDouble();
        obj.close();

        // using the print function to display the student iformation 

       System.out.printf("Student Name  : %s%n", stdName);
       System.out.printf("Age : %d%n", age);
       System.out.printf("CGPA : %.2f%n", cgpa);
        
    }
    
}
