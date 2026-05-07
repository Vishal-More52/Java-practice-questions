package Array;

public class SecondHighest {
    public static int findSecondHighest(int[] nums){
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for(int i : nums){
            if (i > highest) {
                secondHighest = highest;
                highest = i;

            } else if (i > secondHighest && i != highest) {

                secondHighest = i;
            }
        }
        return secondHighest;
    }

    public static void main(String[] args) {
        int[] arr = { 12,35,1,20,34,1};
        System.out.println("Second Highest: " + findSecondHighest(arr));
    }
}
