package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class CheckedUnchecked {

  // Checked Exception - must be declared or handled
  public void readFile() throws IOException {
    FileReader fr = new FileReader("File.txt"); // IOException (checked)
  }

  // Unchecked Exception - no need to declare 

  public  void divide(int a,int b){
    System.out.println(a / b);    //ArithmeticException (unchecked)

  }

  public static void main(String[] args) {

    System.out.println("Code is Starting...");

    CheckedUnchecked cu = new CheckedUnchecked();

    //Handling Checked Exception
    try {
      cu.readFile();
    } catch (IOException e) {
      System.out.println("IOException: " + e.getMessage());

    }

    //Unchecked Exception  - no forced handling

    cu.divide(10, 0); // This will throw ArithmeticException at runtime


    System.out.println("Code is Ending...");
  }
}
