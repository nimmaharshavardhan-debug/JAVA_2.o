package JavaChallenges;
import java.util.Scanner;

public class ConditionalStatments_Two {
    public static void main(String [] args){
        // Leap Year Checker 
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int year = obj.nextInt();
        if (year > 0){
            if ((year%4==0 && year%100!=0 ) || (year%400==0)){
                System.out.println(year+" Leap Year");
            }
            else{
                System.out.println(year+" Not A Leap Year");
            }
        }
        else{
            System.out.println("Please Enter Valid Year");
        }

    }
    
}
