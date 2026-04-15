package Interface.Shapes;

public class Circle implements Shape {

  private double radius;

  //constructor
  public Circle(double radius){
    this.radius = radius;

  }

  @Override
  public double getArea() {
   return Math.PI * radius * radius;
  }
  
}
