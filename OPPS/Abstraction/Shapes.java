
abstract class Shape {

        abstract void calculateArea();


    
}

class Circle extends Shape{
    double radius;
    Circle(double r){
        radius = r;
        
    }

    public void calculateArea(){
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle is :"+area);
    }
}

class Rectangle extends Shape{
    double length;
    double width;
    
    Rectangle(double l, double w){
        length = l;
        width = w;
    }

    public void calculateArea(){
        double area = length * width;
        System.out.println("Area of Rectangle is :"+area);
    }
}

public class Shapes {

    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.calculateArea();
        Rectangle r = new Rectangle(4, 6);
        r.calculateArea();
    }
}
