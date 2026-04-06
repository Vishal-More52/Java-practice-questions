package ExceptionHandling;

public class SingleCatchForMultiException {
  
  public static void main(String[] args) {
    System.out.println("Start the Program");
    try {
      String s = null;
      s.length();
    } catch (NullPointerException | NumberFormatException e) {
      System.out.println("Caught: " + e.getMessage());
      
    }
      System.out.println("End of the Program");
  }
}
