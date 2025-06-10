package ArraysPkg;

import java.util.Arrays;

public class RemveDuplica {
    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,3};
        System.out.print("Array after removing duplicates: " + Arrays.toString((nums)));

    }

    public static int removeDuplicates(int[] nums) {
        int index = 1;
        int count =1;
        for(int i=1 ;i< nums.length;i++){
            if(nums[i] == nums[i-1] && count < 2){
                nums[index++] = nums[i];
                count++;
            } else if(nums[i] == nums[i-1] && count >= 2){
                count++;
            } else{
                nums[index++] = nums[i];
                count = 1;
            }
        }



        return index;
    }
}
