package MutableStrings;

public class PalindromeChecker {
    public static void main(String args []){
        String str = "101";
        String rev="";
        int n = str.length();
        for (int i=n-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
    
}
