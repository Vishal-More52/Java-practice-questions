package Recursion;

public class Factorial {

  public static void main(String[] args) {
    System.out.println(checkFactorial(5));
  }

  public static int checkFactorial(int n){
    if(n == 1){
      return 1;
    }
    return  n * checkFactorial( n - 1);
  }
  
}