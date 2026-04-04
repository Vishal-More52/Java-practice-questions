package ExceptionHandling;

public class FirstExample {

  
  public static void main(String[] args) {
  
    System.out.println("Creating the Arithmatic Exception");
    int a  = 10;

    int result = a / 0; // this will throw an exception because we cannot divide a number by zero

    System.out.println(result);
    
  }
}
