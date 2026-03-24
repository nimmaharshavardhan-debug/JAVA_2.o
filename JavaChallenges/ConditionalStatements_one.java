package JavaChallenges;
import java.util.Scanner;
public class ConditionalStatements_one {
    public static void main(String [] args){
        // Even or Odd
        // Take a number
        //Print even or odd
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = obj.nextInt();
        if (num>0){
            if(num%2==0){
                System.out.println(num+" Even ");

            }
            else{
                System.out.println(num+" Odd ");
            }
        }
        else{
            System.out.println("Number value must be greater than Zero");
        }

        
    }
    
}
