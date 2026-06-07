package OOPS;
import java.util.Scanner;

// Createing Class Employee 
class Employee{
    private String empId;
    private String empName;
    private double salary;

    // Constructor 

    public Employee(String empId , String empName, double salary){
        this.empId=empId;
        this.empName=empName;
        this.salary= salary;
    }

    // Creating Setter Methods 

    public void setEmpId(String empId){
        this.empId=empId;
    }

    public void setEmpName(String empName){
        this.empName=empName;
    }

   public void setSalary(double salary){
    if(salary > 0){
        this.salary = salary;
    }
}

    //creating getter methods

    public String getEmpId(){
        return empId;

    }

    public String getEmpName(){
        return empName;
    }

    public double getSalary(){
        return salary;
    }




}
public class EmployeeManagement {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number employee to enter : ");
        int n = obj.nextInt();
        obj.nextLine();
        // Employe array object creation
        Employee employee[] = new Employee[n];



        for (int i = 0; i < employee.length; i++) {

            System.out.print("Enter Employee ID: ");
            String empId = obj.nextLine();
            System.out.print("Enter Employee Name: ");
            String empName = obj.nextLine();
            System.out.print("Enter Salary: ");
            double salary = obj.nextDouble();
            obj.nextLine();

            employee[i] = new Employee(empId, empName, salary);
        }

        obj.close();

        // Accessing  the data from the looping statements
        for (int i = 0; i < employee.length; i++) {

            System.out.println("\nEmployee " + (i + 1));

            System.out.println("Employee ID : " +
                    employee[i].getEmpId());

            System.out.println("Employee Name : " +
                    employee[i].getEmpName());

            System.out.println("Salary : " +
                    employee[i].getSalary());
        }

        

       



    }
    
}
