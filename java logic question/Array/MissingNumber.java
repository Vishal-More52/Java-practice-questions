package Array;

public class MissingNumber {
    public static int findMissing(int[] nums, int n){
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for(int num : nums){
            actualSum += num;

        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        System.out.println("Missing number is : " + findMissing(arr,6));
    }
}
