package Arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        //'i' points to the index of the last unique element found
        int i =0;

        //'j' iterates through the array
        for(int j = 1; j < nums.length ; j++){
            //if we found a new unique element
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];  //update the value of the unique pointer
            }
        }
        //return the count of unique elements ( index + 1)
        return  i + 1;

    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,2,2,3,3,4};

        System.out.println("Before Removing duplicates");
        for(int num : nums) {
            System.out.print(num + " ");
        }
        int length = removeDuplicates(nums);

        System.out.println("\nArray after removing duplicates");
        for(int k =0 ; k < length ; k++){
            System.out.println(nums[k] + " ");
        }

    }
}
