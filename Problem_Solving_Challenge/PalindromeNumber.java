package Problem_Solving_Challenge;
import java.util.Scanner;

public class PalindromeNumber {
   public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String rev ="";
        for (int i = str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
            if (str.equals(rev)){
                return true;
            }
        }
        return false;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        PalindromeNumber obj = new PalindromeNumber();
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        boolean reverse = obj.isPalindrome(x);
        System.out.println(reverse);
    
    }
}


        
    


    

