package OOPS;

interface Vehicle {
    void wheels();
    void color();
    void fuelCapacity();
}

// Abstract parent class
abstract class Implementations implements Vehicle {
    private String Model;

    // Setter method
    public void setModel(String Model) {
        this.Model = Model;
    }

    // Getter Method
    public String getModel() {
        return Model;
    }

    // Concrete implementation (already implemented)
    public void fuelCapacity() {
        System.out.println("Fuel Capacity : 20 Liters");
    }

    // Abstract methods (must be implemented by child)
    public abstract void color();
    public abstract void wheels();
}

// Child class (NOT public - so it can be in same file)
class BMW extends Implementations {
    
    // Must implement abstract methods with public access
    @Override
    public void color() {
        System.out.println("Color : Black");
    }

    @Override
    public void wheels() {
        System.out.println("Wheels : Stainless Steel Wheels");
    }
}

// Main class (only ONE public class)
public class AbstractClass {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        
        // Set the model first
        bmw.setModel("BMW X5");
        
        // Now call all methods
        System.out.println("Model: " + bmw.getModel());
        bmw.color();
        bmw.fuelCapacity();
        bmw.wheels();
    }
}