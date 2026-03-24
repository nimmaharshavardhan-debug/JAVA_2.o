package ConditionalStatements;
import java.util.Scanner;
public class IfElseIfStatement {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your salary : ");
        double salary = obj.nextDouble();

        // if else if ladder 
        if (salary>=100000){
            System.out.println("High Tax");
        }
        else if (salary>=50000 && salary<100000){   
            System.out.println("Medium Tax");
        }
        else{
            System.out.println("Low Tax");
        }
    }
}
