package JavaChallenges;

public class SumOfTheArray {
    public static void main(String [] args){
        int arr[] ={10,23,45,67,67};
        int sum =0;
        for(int num : arr){
            sum+=num;

        }
        System.out.println("Average = "+sum/arr.length);
        
    }
    
}
