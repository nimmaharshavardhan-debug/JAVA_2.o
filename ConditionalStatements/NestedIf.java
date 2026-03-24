package ConditionalStatements;
import java.util.Scanner;

public class NestedIf {
    public static void main(String [] args){
        // 1. Voting with ID Check
        Scanner obj = new Scanner(System.in);
        System.out.println("Please,Enter Your Age : ");
        int age = obj.nextInt();
        boolean IdHave = true;
        if (age>=18){       // If block
            if(IdHave){// Nested if block 
                System.out.println("You Can Vote");
            }
        }
    }
    
}
