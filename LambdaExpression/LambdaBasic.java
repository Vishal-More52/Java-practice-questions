package LambdaExpression;

public class LambdaBasic {
  public static void main(String[] args) {
    
    //Traditional way (Anonymous class)
    SayHello sayHello = new SayHello() {

      @Override
      public void speak() {
        System.out.println("Hello the old way!");
      }
      
    };

    //Lambda expression way
    SayHello labdaWay = () -> System.out.println("Hello with lambda expression!");
    sayHello.speak();
    labdaWay.speak();
  }
}

interface SayHello{
  void speak();
}