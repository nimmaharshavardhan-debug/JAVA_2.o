package Problem_Solving_Challenge;
import java.util.Scanner;

// class employee creation 
class Employee{

    // Instance variables 

    String employeeId;
    String employeeName;
    String branch;

    // Methods creation to display

    void display(){
        System.out.println(" Employe Id   : "+employeeId);
        System.out.println(" Employe Name : "+employeeName);
        System.out.println(" Branch       : "+branch);
        System.out.println();
    }

}

public class BasicOOPS_2 {
    public static void main(String [] args){
        // Scanner class obj creation to intilize the values at run time

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number Employees you want to enter : ");
        int emp = sc.nextInt();
        sc.nextLine();

        // Array creation of the class employee 
        Employee employee[] = new Employee[emp];

        // for loop block to perform multiple employee detials intilization

        for (int i = 0; i < emp; i++){
            // Array object creation 

            employee[i]  = new Employee();

            System.out.print("Enter Employe Id : ");
            employee[i].employeeId= sc.nextLine();

            System.out.print("Enter Employe Name : ");
            employee[i].employeeName = sc.nextLine();

            System.out.print("Enter Employe Branch : ");
            employee[i].branch = sc.nextLine();
            
            

        }
        sc.close();

        // for Loop block access the employe data 
        for (int i = 0; i < emp ; i++){
            System.out.println(" Employee "+(i+1));
            employee[i].display();
        }


    }
    
}
