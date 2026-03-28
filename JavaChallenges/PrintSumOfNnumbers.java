package JavaChallenges;
import java.util.Scanner;

public class PrintSumOfNnumbers {
    public static void main(String [] args){
        // Print sum of first N numbers
        Scanner obj = new Scanner(System.in);       // Scanner [Take values at run time]  User input
        System.out.print("Enter a value : ");     
        int num = obj.nextInt();
        int sum =0;
        for (int i=0;i<=num;i++){
            sum += i;
        }
        System.out.println("Sum = "+sum);


    }

    
}
