package ConditionalStatements;
import java.util.Scanner;

public class SwitchCaseStatements {
    public static void main(String [] args){
        // Traffic Signals 
        java.util.Scanner obj = new Scanner(System.in);
        System.out.println("Enter Light : ");
        String light = obj.nextLine();
        obj.close();

        // Switch cases 

        switch (light){
            case "Red":
                System.out.println("Dont Move");
                break;
            case "Yellow":
                System.out.println("Wait For a Second");
                break;
            case "Green":
                System.out.println("You can move");
                break;
            default:
                System.out.println("Somiting went wrong please enter valid color");
        }
    }
    
}
