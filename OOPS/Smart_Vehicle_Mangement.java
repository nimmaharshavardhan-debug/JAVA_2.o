package OOPS;

// Parent Class
class Vehicle {

    String brand;
    String model;

    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayVehicleInfo() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
    }
}

// Interface
interface GPSVehicle {

    void navigate();
}

// Child Class
class ElectricCar extends Vehicle
                  implements GPSVehicle {

    String batteryCapacity;

    ElectricCar(String brand,
                String model,
                String batteryCapacity) {

        super(brand, model);

        this.batteryCapacity = batteryCapacity;
    }

    public void display() {

        super.displayVehicleInfo();

        System.out.println(
            "Battery Capacity : "
            + batteryCapacity);
    }

    @Override
    public void navigate() {
        System.out.println(
            "Started Navigating...");
    }
}

// Main Class
public class Smart_Vehicle_Mangement {

    public static void main(String[] args) {

        ElectricCar obj1 =
            new ElectricCar(
                "Tesla",
                "Model Y",
                "75 kWh"
            );

        obj1.display();
        obj1.navigate();
    }
}