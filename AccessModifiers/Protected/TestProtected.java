package AccessModifiers.Protected;

class  Vehicle{
  //Protected: Children like ' Car' can use this, but 'Main' cannot

  protected String engineType = "V8";

  protected void startEngine(){
    System.out.println("Engine started: ");
  }
}

class Car extends Vehicle{
  public void displaySpec(){
    //Accessing protected members from the parent class
    System.out.println("This car has a " + engineType + " engine.");
    startEngine();
  }
}

public class TestProtected {
  public static void main(String[] args) {
    Car myCar = new Car();
    myCar.displaySpec();  // works because displaySpec is public

    myCar.startEngine();  // This will work only if TestProtected is in the same package
  }
}
