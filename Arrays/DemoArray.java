package Arrays;

public class DemoArray {
    public static void main(String [] args){
        int num [] = {12,23,54,67,86,79};   // Array elements with known values
        System.out.println(num[1]);
        System.out.println(num[5]);

        int arr[] = new int[4];     // This is the 2 types of array intilization by the size
        arr[0]  = 12;       // Intilizing the elements
        arr[1]  = 13;
        arr[2]  = 14;
        arr[3]  = 12;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);

    }
    
}
