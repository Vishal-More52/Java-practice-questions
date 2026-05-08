package Array;

public class MergeSortedArrays {
    public static void merge(int[] nums1, int m , int[] nums2,int n){
        int i = m - 1;  //last element in nums1's data
        int j = n - 1;  //last element in nums2
        int k = m + n - 1;  //last position in nums1 total capacity

        while (j >= 0){
            if (i >= 0 && nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 4, 0, 0, 0};  //m = 3
        int[] nums2 = {2, 4, 5};

        merge(nums1, 3, nums2, 3);
    }
}
