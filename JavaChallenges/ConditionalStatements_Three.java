package JavaChallenges;
import java.util.Scanner;

public class ConditionalStatements_Three {
    public static void main(String [] args){
        // Login Page Programm

        Scanner obj = new Scanner(System.in);
        String name = "Harsha Vardhan N";
        String password = "Harsha@1922";

        System.out.println("Enter user name : ");
        String UserName = obj.nextLine();
        System.out.println("Enter user password : ");
        String UserPassword = obj.nextLine();

        if (UserName==name && UserPassword==password){
            System.out.println("Login SuccessFull");
        }
        else{
            System.out.println("Invalid Credintials");
        }

    }
    
}
