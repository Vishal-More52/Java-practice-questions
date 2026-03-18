package OPPS.Classes_Objects;


public class Car {
        String Brand;
        String Color;
        String Speed;

        Car(String b,String c , String s)
        {
            this.Brand = b;
            this.Color = c;
            this.Speed =s;

            System.out.println();
        }

        public void display(){
            System.out.println("Brand :"+Brand);
            System.out.println("Color :"+Color);
            System.out.println("Speed :"+Speed);
        }

        public static void main(String[] args) {
            Car c = new Car("BMW", "red", "200/km");
            c.display();
            Car c1 = new Car("Mahindra", "black", "160/km");
            c1.display();
            Car c2 = new Car("Ertiga", "White", "180/km");
            c2.display();

        }
}
