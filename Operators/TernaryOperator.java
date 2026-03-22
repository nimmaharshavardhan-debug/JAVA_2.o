package Operators;

public class TernaryOperator {
    public static void main(String [] args){

        // Intilizing the value 

        int a = 15;
        // Ternary operator 
        String res = (a > 10) ? (a % 2 == 0 ? "Even" : "Odd") : "Small";

        //Display the result 
        System.out.println(res);
    }
    
}
