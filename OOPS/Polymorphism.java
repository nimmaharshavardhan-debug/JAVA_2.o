package OOPS;
class Overloading{
    // Method overloading

    void printer(int age){
        System.out.println("Num : "+age);
    }

    void printer(String name){
        System.out.println("Name : "+name);
    }
    
    void printer(){
        System.out.println("Greeting From Vs code");
    }
}

class Overriding extends Overloading{
    // override

    @Override
    void printer(){
        System.out.println("overrided!...");
    }

}



public class Polymorphism {

    public static void main(String [] args){
       Overriding obj = new Overriding();
       obj.printer();
       obj.printer("Harsha");
       obj.printer(20);
        
    }
    


}
