import java.util.Scanner;
public class Input {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Please,Enter Your Name : ");
        String name = obj.nextLine();
        System.out.println("Name : "+name);
    }
}
