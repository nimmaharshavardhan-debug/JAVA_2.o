package Operators;

public class ArithmeticOperators {

    public static void main(String[] args) {

        // Declaring variables
        int num1 = 10;
        int num2 = 20;

        // Arithmetic operations
        int sum = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        double div = (double) num1 / num2; // type casting for accurate division
        int modulus = num1 % num2;

        // Displaying results
        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mult);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + modulus);
    }
}
