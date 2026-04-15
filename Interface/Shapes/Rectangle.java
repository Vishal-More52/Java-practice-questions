package Interface.Shapes;

public class Rectangle implements Shape {

  private double length;
  private double width;

  // constructor
  public Rectangle(double length, double width){
    this.length = length;
    this.width = width;
  }

  @Override
  public double getArea() {
   return length * width;
  }
  
}
