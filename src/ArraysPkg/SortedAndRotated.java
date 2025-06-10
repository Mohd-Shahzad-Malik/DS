package ArraysPkg;

import java.util.Arrays;

public class SortedAndRotated {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        int k = 2;
        rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {
        if(nums.length == 0 || k <= 0) {
            return;
        }

        // Normalize k to avoid unnecessary full rotations
        k = k % nums.length;
        if(k == 0) {
            return; // No rotation needed
        }

        // Reverse the entire array
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        System.out.println("After reversing remaining " + (nums.length - k) + " elements: " + Arrays.toString(nums));

    }

    public static void reverse(int [] arr, int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
