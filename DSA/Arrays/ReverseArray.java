package Arrays;

public class ReverseArray {

    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while (start < end){
            //swap the elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            //move the pointers towards the center
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr);

        System.out.println("Reversed Array: ");
        for(int num : arr) {
            System.out.println(num + " ");
        }
    }
}
