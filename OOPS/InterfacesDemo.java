package OOPS;

// Interface
interface MobilePhone {

    void camera();

    void battery();

    void processor();

    default void security() {
        System.out.println("Android Security Enabled");
    }

    default void GPS(){
        System.out.println("Track Location is upgraded...");
    }
}

// Parent Class
class Mobile {

    private String os;
    private String model;

    // Constructor
    public Mobile(String os, String model) {
        this.os = os;
        this.model = model;
    }

    // Getters
    public String getOs() {
        return os;
    }

    public String getModel() {
        return model;
    }

    public void displayInfo() {
        System.out.println("OS : " + os);
        System.out.println("MODEL : " + model);
    }
}

// Child Class
class OPPO extends Mobile implements MobilePhone {

    // Constructor
    public OPPO(String os, String model) {
        super(os, model);
    }

    @Override
    public void camera() {
        System.out.println("50MP AI Camera");
    }

    @Override
    public void battery() {
        System.out.println("5000 mAh Battery");
    }

    @Override
    public void processor() {
        System.out.println("Snapdragon Processor");
    }

    @Override
    public void security() {
        MobilePhone.super.security();
        System.out.println("OPPO Security Layer");
    }

    public void GPS(){
        super.GPS();
        System.out.println("OPPO Tracking system is upgraded...");
    }
}

public class InterfacesDemo {

    public static void main(String[] args) {

        // Polymorphism
        MobilePhone phone = new OPPO("Android", "OPPO A38");

        // Downcasting for parent methods
        OPPO oppo = (OPPO) phone;

        oppo.displayInfo();

        phone.camera();
        phone.battery();
        phone.processor();
        phone.security();
        phone.GPS();
    }
}