package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        boolean found = false;

        for(int i =0 ; i<=array.length;i++){
            if(target == i)
            {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("Item found");
        else System.out.println("Item not found");
    }
}
