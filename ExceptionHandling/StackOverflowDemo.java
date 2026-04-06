package ExceptionHandling;

public class StackOverflowDemo {
  
  public static void recurse(){
    recurse();  //calls itself indefinitely , Infinite recursion

  }
  public static void main(String[] args) {
    try {
      recurse();
    } catch (StackOverflowError e) {
      System.out.println("StackOverflowError caught ! " + e.getMessage());
    }
  }
}
