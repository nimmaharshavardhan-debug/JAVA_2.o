package Arrays;
import java.util.Scanner;

public class Intilizing_2DA_elements {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter Number of Rows : ");
        int No_rows = obj.nextInt();

        System.out.print("Enter Number of Coumns : ");
        int No_columns = obj.nextInt();

        int arr[][] = new int[No_rows][No_columns];
        for (int i=0;i<No_rows;i++){
            for (int j=0;j<No_columns;j++){
                arr[i][j] = (int)(Math.random() * 10);

            }
        }

        for (int i=0;i<No_rows;i++){
            for (int j=0;j<No_columns;j++){
                    System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }

        for (int row[] : arr){
            for(int Elements : row){
                System.out.print(Elements+" ");
            }
            System.out.println();
        }
    }
    
}
