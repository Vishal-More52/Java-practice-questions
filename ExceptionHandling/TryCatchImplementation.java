package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;


// Question:
// The Scenario: Write a program that asks the user to enter two integers and performs division.

// The Task: Wrap the division logic in a try block.

// The Challenge: Use a catch block to handle a potential ArithmeticException (division by zero) and an InputMismatchException (if the user enters text instead of a number).

// Goal: Ensure the program doesn't crash and prints a user-friendly error message.

public class TryCatchImplementation {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    try {
      System.out.println("Enter the first integer: ");
      int num1 =sc.nextInt();

      System.out.println("Enter the second Integer :");
      int num2 = sc.nextInt();

      int result = num1 / num2;
      System.out.println("Result is : " + result);
    } catch (ArithmeticException e) {
     System.out.println("Error: Cannot divide by zero. Please provide a non-zero divisor.");
    }catch(InputMismatchException e){
      System.out.println("Error: Invalid input. Please enter valid integers.");
    }catch(Exception e){
      System.out.println("An unexpected error occurred: " + e.getMessage());
    }
    finally{
      sc.close();
    }
    
  }
}
