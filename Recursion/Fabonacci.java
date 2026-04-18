package Recursion;

public class Fabonacci {
  public static void main(String[] args) {
    
    System.out.println(checkFabonacci(10));

  }

  public static int checkFabonacci(int n){

    if(n<=1){
      return n;

    }

    return  checkFabonacci(n - 1) + checkFabonacci(n - 2);
  }
}
