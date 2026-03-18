package OPPS.Inheritance;

public class Shape {

    void draw(){
        System.out.println("Drawing a shap");

    }
}
class Circle extends Shape{
    
    void draw(){
        System.out.println("Drawing circle");
    }

    public static void main(String[] args) {
        
        Shape s = new Shape();
        s.draw();
        Circle c = new Circle();
        c.draw();
    }

}
