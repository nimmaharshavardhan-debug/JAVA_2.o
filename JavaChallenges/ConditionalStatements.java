package JavaChallenges;
import java.util.Scanner;
public class ConditionalStatements {
    public static void main(String [] args){
        Scanner obj = new  Scanner(System.in);
        //Positive / Negative / Zero

        // Take a number
        // Print whether it is positive, negative, or zero
        System.out.println("Enter a number : ");
        int num = obj.nextInt();
        if (num > 0){
            System.out.println("Positive");
        }
        else if (num<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }




    }
    
}
