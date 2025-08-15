package BinarySearch;

public class SearchEleInRotatedSortedArray {
    public static void main(String[] args) {
        int [] nums = {1,0,1,1,1};

        int left = 0;
        int right = nums.length-1;
        int target = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                System.out.println("true");
                return;
            }

            if(nums[left] == nums[mid] && nums[mid]== nums[right]){
                left ++;
                right--;
                continue;
            }

            // Determine which side is sorted
            if (nums[left] <= nums[mid]) { // Left side is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // Target is in the left sorted part
                } else {
                    left = mid + 1; // Target is in the right part
                }
            } else { // Right side is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // Target is in the right sorted part
                } else {
                    right = mid - 1; // Target is in the left part
                }
            }
        }
        System.out.println("false");
    }
}
