package JavaChallenges;

public class Methods_Example_Three {


    public static int findLargestNumbers(int a , int b){
        if (a>b)
            return a;
        else
            return b;
    }
    public static void main(String [] args){
        int largest = findLargestNumbers(15, 12);
        System.out.println(largest);

    }
    
}
