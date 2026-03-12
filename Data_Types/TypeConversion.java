package Data_Types;

public class TypeConversion {
    public static void main(String [] args){
        // Write a program to convert an integer value into a double automatically and print both values.
        int price = 12345;
        double isPrice = price;
        System.out.println("Price : "+price);
        System.out.println("Isprice : "+isPrice);

        //Write a program to assign a byte value to an int variable using type conversion and display the result.
        byte range = 127;
        int is = range;
        System.out.println(range);
        System.out.println(is);

        //Write a program that takes an integer value and stores it in a long variable using automatic conversion.
        int value = 12341234;
        long isValue = value;
        System.out.println("Value = "+value);
        System.out.println("isValue = "+isValue);

        //Write a program to store a float value into a double variable using implicit conversion.
        float Price = 123.32f;
        double IsPrice = Price;
        System.out.println("Price ="+Price);
        System.out.println("IsPrice = "+IsPrice);

        //Write a program to demonstrate automatic conversion from int to float and print the result.
        int balance = 120000;
        float currentBalance = balance;
        System.out.println("Balance : "+balance);
        System.out.println("Current Balance : "+currentBalance);

    }
    
}

