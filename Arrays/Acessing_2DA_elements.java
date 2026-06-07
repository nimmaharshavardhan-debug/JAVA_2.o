package Arrays;

public class Acessing_2DA_elements {
    public static void main(String []args ){
        int arr[][] = {{10,23,12},{13,12,11},{12,45,34}};   
        for (int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    
}
