package ExceptionHandling;

public class ExceptionPropagation {
  
  void method3(){
    int[] arr = new int[3];
    arr[5] = 10;   //ArrayIndexOutOfBoundsException
  }

  void method2(){
    method3();  //propagates method 3
  }

  void method1(){
    method2();    //propagates method 2
  }

  public static void main(String[] args) {
    ExceptionPropagation ep = new ExceptionPropagation();
    try {
        ep.method1();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception caught in main: " + e.getMessage());
    }
  }
}
