package OOPS;

class Demo{
     public void add(int a, int b){
        System.out.println(a+b);
    }

    public void sub(int a, int b){
        System.out.println(a-b);
    }

}

    class Demo1 extends Demo{
        public void MultipleOperations(int a , int b){
        System.out.println(a*b);
        System.out.println(a/b);
    }
}

public class Inheritance{
    public static void main(String [] args){
        Demo obj = new Demo();
        obj.add(1, 0);
        obj.sub(2, 0);

        Demo1 obj1 = new Demo1();
        obj1.MultipleOperations(22, 20);
        obj1.add(22, 30);
        obj1.sub(22, 10);
        
    }

    
}
