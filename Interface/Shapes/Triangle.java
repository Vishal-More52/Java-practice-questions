package Interface.Shapes;

public class Triangle implements Shape {

  private double base;
  private double height;

  //constructor

  public Triangle(double base, double height){
    this.base = base;
    this.height = height;
  }

  @Override
  public double getArea() {
   return 0.5 * base * height;
  }
  
}
