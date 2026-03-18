package OPPS.Constructors;

public class Rectangle {
    double length;
    double width;

    Rectangle(double l, double w) {
        length = l;
        width = w;

    }

    void calculateArea() {
        double area;
        area = length * width;
        System.out.println("Area of rectangle is :" + area);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 6);
        r1.calculateArea();

        Rectangle r2 = new Rectangle(5, 7);
        r2.calculateArea();
    }
}
