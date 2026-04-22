package Java8.AnonymouClass;

import Java8.FunctionalInterface.WithoutLambda.MyInter;

public class Main {
  public static void main(String[] args) {
    MyInter i1 = new MyInter() {
      @Override
      public void sayHello() {
        System.out.println("Saying hello from method 1");
        
      }
    };

    i1.sayHello();

    MyInter i2 = new MyInter() {
        @Override
        public void sayHello() {
          System.out.println("Saying hello from method 2");
        }
      
    };
    i2.sayHello();

  }
}
