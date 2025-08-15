package BinarySearch;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int [] nums = {1,1,2,2,3,3,4,5,5,6,6,7,7};
        int start = 0;
        int end = nums.length-1;

        if(nums.length == 1){
            System.out.println(nums[start]);
            return;
        }

        if(nums[start] != nums[start+1]){
            System.out.println(nums[start]);
            return;
        }

        if (nums[end-1] != nums[end]){
            System.out.println(nums[end]);
            return;
        }

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] != nums[mid -1] && nums[mid] != nums[mid +1]){
                System.out.println(nums[mid]);
                return;
            }
            else if(nums[mid] == nums[mid-1] && (mid%2!=0)
            || nums[mid] == nums[mid+1] && mid%2==0){
                start = mid+1;
            } else {
                end = mid -1;
            }
        }


    }
}
