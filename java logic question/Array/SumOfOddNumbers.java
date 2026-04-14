package Array;

public class SumOfOddNumbers {
  
  static void checkSumOfOdd(int[] arr){
    int sum = 0;

    for(int num : arr){
      if(num % 2 != 0){
         sum += num;
      }
    }
    System.out.println("Sum of Odd numbers is : " + sum);
  }

  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9};
    checkSumOfOdd(arr);
  }
}
