package Variables;

public class SwapTwoNumbers {
    public static void main(String [] args){
        // Swap Two Numbers (Using Third Variable)
        int a = 20;
        int b = 32;
        System.out.println("Before Swapping ");
        System.out.println("a = "+a+"  b = "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swaping ");
        System.out.println("a = "+a+"  b = "+b);

    }
    
}
