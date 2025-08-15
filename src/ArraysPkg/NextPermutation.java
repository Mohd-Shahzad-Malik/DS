package ArraysPkg;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 4,3,0 ,0};
        int idx = -1;
        int n = nums.length;
        for (int i = n-2; i>=0; i--) {
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            // If no such index found, reverse the entire array
            int start = 0;
            int end = n - 1;
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
            System.out.println(Arrays.toString(nums));
            return;
        }

        for (int i = n-1; i > idx ; i--) {
            if(nums[i] > nums[idx]){
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }

        int start = idx + 1;
        int end = n - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
