package JavaChallenges;
import java.util.Scanner;
public class PrintMultplicationTable{
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Table : ");
        int Table = obj.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(Table+" X "+i+" = "+Table*i);
        }
    }
}
