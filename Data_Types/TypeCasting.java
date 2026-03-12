package Data_Types;

public class TypeCasting {
    public static void main(String [] args){

        //Write a program to convert a double value into an integer using type casting and display the result.
        double Isprice = 123456;
        int price = (int)Isprice;
        System.out.println(Isprice);
        System.out.println(price);

        //Write a program to convert a float value into an integer using type casting.
        float balance = 1231.45f;
        int isbalance = (int)balance;
        System.out.println(balance);
        System.out.println(isbalance);

        //Write a program to convert a long value into an int using explicit casting.

        long Amount = 12345612321345l;
        int isCurrent = (int)Amount;
        System.out.println("Amount : "+Amount);
        System.out.println("Iscurrent : "+isCurrent);

        //Write a program to convert a double temperature value into an integer temperature using type casting.

        double temp = 37.422;
        int Temp = (int)temp;
        System.out.println(temp);
        System.out.println(Temp);

        //Write a program to convert a large integer into a byte using type casting and print the result.
        int large = 1233;
        byte small = (byte)large;
        System.out.println(large);
        System.out.println(small);

    }
    
}
