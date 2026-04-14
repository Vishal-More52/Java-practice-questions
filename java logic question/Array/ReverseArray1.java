package Array;

public class ReverseArray1 {

  static void reverse(int[] arr) {
    int i = 0;
    int j = arr.length - 1;

    while (i < j) {
      int t = arr[i];
      arr[i] = arr[j];
      arr[j] = t;
      i++;
      j--;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };

    System.out.println("Before Traversing :  ");
    printArray(arr);
    reverse(arr);

    System.out.println("After Traversing : ");
    printArray(arr);
  }

  static void printArray(int[] arr) {

    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }
}
