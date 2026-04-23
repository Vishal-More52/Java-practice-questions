
import java.util.Arrays;



/* Input:
  nums = [1,0,2,3,0,4,5,0]
  output = [1,2,3,4,5,0,0,0]
*/

class MoveZeroToEnd{
  public static void main(String[] args) {
    int[] arr = {1,0,2,3,0,4,5,0};

    removeZeros(arr);

    System.out.println(Arrays.toString(arr));
  }

  private static void removeZeros(int[] arr){
    int k = 0;

    for(int i = 0; i < arr.length; i++){
      if(arr[i] != 0){
        arr[k++] = arr[i];
      }
    }

    while(k < arr.length){
      arr[k++] = 0;
    }
  }
}