package Interface.Shapes;

public class Main {
  
  public static void main(String[] args) {
    
    //obeject of rectangle
    Rectangle rectangle = new Rectangle(10, 12);

    //object of circle
    Circle circle = new Circle(3);

    //object of triangle
    Triangle triangle = new Triangle(4 ,6);

    //print area of rectangle
    System.out.println("Area of Rectangle: " + rectangle.getArea());

    //print area of circle
    System.out.println("Are of circle: " + circle.getArea());

    //print area of triangle
    System.out.println("Area of triangle: " + triangle.getArea());


    //in above code we getting long decimal value of area of cicle so we can limit it using 2 simple ways.

    //1. using String format
    System.out.println("Area of circle: " + String.format("%.2f", circle.getArea()));

    //2. using printf
    System.out.printf("Area of circle: %.2f%n",circle.getArea() );

    

  }
}
