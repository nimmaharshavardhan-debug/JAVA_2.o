package JavaChallenges;

class Demo{
    int add(int a, int b){
        return a+b;
    }

    int add(int a  , int b , int c){
        return a + b + c;
    }
}
public class MethodOverloading_Example {
    public static void main(String [] args){
       Demo obj = new Demo();
       int Add =  obj.add(12,13,25) ;
       System.out.println(Add);
    }

}
