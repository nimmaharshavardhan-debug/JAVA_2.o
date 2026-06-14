package Problem_Solving_Challenge;

import java.util.Scanner;

public class Area_Rectangle {
    public static void main(String []args){
        // Scanner class to intilize the values at run time 
        Scanner obj = new Scanner(System.in);

        // Decalration of the required variables for the area of rectangle 
        System.out.println("Enter length of the rectangle : ");
        double l = obj.nextDouble();
        System.out.println("Enter breadth of the rectangle : ");
        double b = obj.nextDouble();
        
        // Formula for thearea of the rectangle 
        double rectArea = l*b;

        // Formula for perimeter 
        double periMeter = 2*l+b;


        System.out.println("Area of Rectangle : "+rectArea);
        System.out.println("Perimter : "+periMeter);
    }
    
}
