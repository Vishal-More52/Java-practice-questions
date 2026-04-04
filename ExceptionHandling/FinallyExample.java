package ExceptionHandling;

public class FinallyExample {
  public static void main(String[] args) {
    try {
      System.out.println("Opening the file ...");
      //Code that might fail
     
    } catch (Exception e) {
      System.out.println("Handling error ...");
      // TODO: handle exception
    }finally{
      System.out.println("Closing the file ... (This will always execute)");
    }
  }
}
