package OOPS;
class User{
    // instance variables
    String name;
    long phoneNumber;

    // Constructors
    User(String name,long phoneNumber){
        this.name = name;
        this.phoneNumber=phoneNumber;
    }

    // methods 
    void displayUserInfo(){
        System.out.println("Name : "+name);
        System.out.println("Phone Number : "+phoneNumber);
    }
}

// interfaces 
interface GPS{
    void trackLocation();

}

class DeliveryPartner extends User implements GPS{

    String vehicleNumber;

    DeliveryPartner(String name, long phoneNumber, String vehicleNumber){
        super(name,phoneNumber);
        this.vehicleNumber=vehicleNumber;

    }

    @Override
    public void displayUserInfo(){
        super.displayUserInfo();
        System.out.println("Vehicle Number : "+vehicleNumber);
    }

    public void trackLocation(){
        System.out.println("Delivery partner location tracking started ");
    }

    


}

public class Online_Food_Delivery_System {
    public static void main(String [] args){
        DeliveryPartner obj = new DeliveryPartner("Harsha",7995427809l, "AP 123 GH 1902");
        obj.displayUserInfo();
        obj.trackLocation();
    }
}
