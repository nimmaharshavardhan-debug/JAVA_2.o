package Arrays;
import java.util.Scanner;

public class Demo_3DArray {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the no rows : ");
        int No_rows = obj.nextInt();
        System.out.print("Enter the No Columns : ");
        int No_columns = obj.nextInt();
        System.out.print("Enter the no values : ");
        int No_values = obj.nextInt();
        int Three_D [][][] = new int[No_rows][No_columns][No_values];

         for (int i=0;i<Three_D.length;i++){
            for (int j =0;j<Three_D[i].length;j++){
                for (int k =0;k<Three_D[i][j].length;k++){
                    Three_D[i][j][k] = (int )(Math.random()*10);
                }
            }
        }

        for (int i=0;i<Three_D.length;i++){
            for (int j =0;j<Three_D[i].length;j++){
                for (int k =0;k<Three_D[i][j].length;k++){
                    System.out.print(Three_D[i][j][k]+" ");
                }
                System.out.print(" ");
            }System.out.println();
        }

    }
    
}
