package ExceptionHandling;

public class HandlingException {
  public static void main(String[] args) {
    
    System.out.println("Handling the Arithmatic Exception");

  
    try {
      int result = 10 / 0;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("Cannot Divide By Zero");
      System.out.println("Exception is handled");
      System.out.println(e.getMessage());
    }
  }
}
