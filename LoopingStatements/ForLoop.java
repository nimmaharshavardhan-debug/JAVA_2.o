package LoopingStatements;
import java.util.Scanner;

public class ForLoop {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);   

        System.out.println("Enter a number : ");
        int num = obj.nextInt();
        for (int i=0;i<=num;i++){   // for loop block 
            System.out.println(i);      // Executed block 
        }
    }

    
}
