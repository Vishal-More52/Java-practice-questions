package Recursion;

public class SumOfN {
  public static void main(String[] args) {
    System.out.println(checkSumOfN(5));
  }

  public static int checkSumOfN(int n){
    if(n==1){
      return 1;
    }
    return  n + checkSumOfN(n -1);
  }
}
