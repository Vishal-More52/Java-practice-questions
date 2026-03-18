package OPPS.Inheritance;

public class Vehicle2 {
    String brand;

    Vehicle2(String b)
    {
        brand = b;
    }

    void showBrand(){
        System.out.println("Brand is :"+brand);
        System.out.println("------------");
    }
}
class Car extends Vehicle2{

    String model;
    Car(String b,String m)
    {
        super(b);
        model = m;
    }

    void showCar(){
        System.out.println("Brand :"+brand);
        System.out.println("Model :"+model);
    }


    public static void main(String[] args) {
        Car c = new Car("Mahindra","Thar");
        c.showBrand();
        c.showCar();
    }
}