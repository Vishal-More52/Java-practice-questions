package OPPS.Inheritance;

public class Vehicle {
    String brand;

    void start() {
        System.out.println("Car is starting...");
    }

    Vehicle(String b) {
        brand = b;
    }

}

class Bike extends Vehicle {
    Bike(String b) {
        super(b);
        
    }

    void wheelie() {
        System.out.println("Bike is doing wheelie....");
    }

    public static void main(String[] args) {
        Bike b1 = new Bike("Splender");
        b1.start();
        b1.wheelie();
    }
}
