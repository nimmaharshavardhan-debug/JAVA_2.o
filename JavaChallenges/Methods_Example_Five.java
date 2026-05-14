package JavaChallenges;

public class Methods_Example_Five {

    public static String EvenOddchecker(int num){
        if (num%2==0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }

    public static void main(String [] args){
        String evenoddchecker = EvenOddchecker(20);
        System.out.println(evenoddchecker);
    }
    
}
