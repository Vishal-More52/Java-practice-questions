package Java8;


interface MyInterface{
  //default method
  default void defaultMethod(){
    System.out.println("This is the default method");
  }

  static void staticMethod(){
    System.out.println("This is static method");
  }
}
public class DefaultStaticMethodExample {
  public static void main(String[] args) {
    MyInterface.staticMethod();    //static method called on interface

    MyInterface obj = new MyInterface() { };  //Anonymous class
    obj.defaultMethod();
  }
}
