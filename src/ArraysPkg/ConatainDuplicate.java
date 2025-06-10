package ArraysPkg;

public class ConatainDuplicate {
    public static void main(String[] args) {
        int [] nums = {-1,-1};
        System.out.println(containsNearbyDuplicate(nums, 1));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int j = nums.length-1;
        int i = nums.length-2;

        while(j >0){
            if(i >= 0 && nums[j] == nums[i] && j-i <= k){
                return true;
            } else if (i >= 0 && nums[j] != nums[i]){
                i--;
            } else {
                j--;
                i = j-1;
            }
        }

        return false;
    }
}
