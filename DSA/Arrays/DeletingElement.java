package Arrays;

public class DeletingElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int indexToDelete = 2 ;//30

        for(int i = indexToDelete; i < arr.length-1;i ++){
            arr[i] = arr[i + 1];

        }

        for (int i = 0; i < arr.length - 1; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
