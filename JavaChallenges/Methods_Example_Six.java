package JavaChallenges;
import java.util.Scanner;

public class Methods_Example_Six {
    public static void TablesGenerartor(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a table : ");
        int num = obj.nextInt();
        for (int i=0;i<=10;i++){
           System.out.println(num + " X " + i + " = " + (num * i));
        }
        obj.close();
    }
    public static void main(String [] args){

            TablesGenerartor();

    }
    
}
