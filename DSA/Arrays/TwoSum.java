package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] findTwoSum(int[] nums, int target) {
        // Map stores the number and its corresponding index
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If the complement exists in our map, we found our pair
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }

            // Otherwise, add the current number and its index to the map
            numMap.put(nums[i], i);
        }

        // Return an empty array if no solution is found (though usually guaranteed)
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = findTwoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]); // Output: 0, 1
    }
}