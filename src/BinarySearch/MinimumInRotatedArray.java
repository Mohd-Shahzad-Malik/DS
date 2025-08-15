package BinarySearch;

public class MinimumInRotatedArray {
    public static void main(String[] args) {
        int [] nums = {2,2,2,0,1};

        int start = 0;
        int end  = nums.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid] < nums[start]){
                if(mid > 0 && nums[mid] <= nums[mid-1]){
                    System.out.println(nums[mid]);
                    return;
                } else {
                    end = mid -1;
                }
            } else {
                if(nums[mid] >= nums[mid +1]){
                    System.out.println(nums[mid+1]);
                    return;
                } else{
                    start = mid +1;
                }
            }
        }
    }
}
