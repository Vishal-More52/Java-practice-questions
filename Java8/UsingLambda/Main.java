package Java8.UsingLambda;

public class Main {
  public static void main(String[] args) {
    
    Myinter i = () ->{
      System.out.println("Say Hello from method 1");
    };
    Myinter i2 = () ->{
      System.out.println("Say hello from methid 2");
    };


    i.sayHello();
    i2.sayHello();
  }

}
