package ConditionalStatements;

import java.util.Scanner;


public class IfElseStatement {
    public static void main(String [] args){
        //  Pass or Fail
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter marks : ");
        int marks = obj.nextInt();
        if(marks>=35){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
    
}
