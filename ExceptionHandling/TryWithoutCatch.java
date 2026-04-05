package ExceptionHandling;

public class TryWithoutCatch {
  
  public static void main(String[] args) {
    try{
      int result = 10 / 0;  // this will throw an ArithmeticException
      System.out.println("Result: " + result);

    }finally{
      System.out.println("This block will always execute, even if an exception occurs.");
    }
  }
}
