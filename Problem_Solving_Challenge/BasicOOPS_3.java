package Problem_Solving_Challenge;

class Car {
    // instance variables
    String brand;
    String model;
    long price;

    // constructor
    Car(String brand, String model, long price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // method to display car details
    void display() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }

    // method to compare prices
    void compare(Car other) {
        if (this.price > other.price) {
            System.out.println(this.brand + " is more expensive than " + other.brand);
        } else if (this.price < other.price) {
            System.out.println(this.brand + " is cheaper than " + other.brand);
        } else {
            System.out.println(this.brand + " and " + other.brand + " have the same price");
        }
    }
}

public class BasicOOPS_3 {
    public static void main(String[] args) {
        // object creation
        Car Tesla = new Car("Tesla", "2025", 2100000);
        Car Toyoto = new Car("Toyoto", "2024", 2300000);
        Car MG = new Car("MG", "2023", 2500000);

        // display details
        Tesla.display();
        Toyoto.display();
        MG.display();

        // compare cars
        Tesla.compare(Toyoto);
        Toyoto.compare(MG);
        MG.compare(Tesla);
    }
}




