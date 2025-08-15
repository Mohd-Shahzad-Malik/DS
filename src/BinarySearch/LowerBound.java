package BinarySearch;

public class LowerBound {
    public static void main(String[] args) {
        int [] nums = {1,2,4,7};


        int target = 2;
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = (end+start)/2;

            if(nums[mid] == target){
                System.out.println(mid);
                return;
            } else if(nums[mid] < target){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        System.out.println( start);
    }
}
