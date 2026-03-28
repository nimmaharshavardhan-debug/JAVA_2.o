package JavaChallenges;
import java.util.Scanner;
public class PrintEvenNum {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a num : ");
        int num = obj.nextInt();
        for (int i=0;i<=num;i++){
            if (i%2==0){
                System.out.println(i+" Even ");
            }
            else{
                System.out.println(i+" Odd ");
            }
        }
    }
    
}
