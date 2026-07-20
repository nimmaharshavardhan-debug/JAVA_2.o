package Problem_Solving_Challenge;
import java.util.Scanner;

// class properties and methods 
public class Pen {
    String color;
    String type;

    // Method declaration 
    void display(){
        System.out.println("Eloks Better for better future");
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // object creation 
        Pen obj = new Pen();
        obj.color = sc.nextLine();
        obj.type = sc.nextLine();
        System.out.println(obj.color);
        System.out.println(obj.type);
        obj.display();


    }
    
}
