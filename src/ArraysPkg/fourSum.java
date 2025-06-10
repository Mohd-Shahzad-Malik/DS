package ArraysPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum {
    public static void main(String[] args) {
        int [] nums = {1,0,-1,0,-2,2};
        int target = 0;

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i - 1] == nums[i]) {
                continue; // Skip duplicates for the first element
            }

            for (int j = i + 1; j < nums.length ; j++) {
                int r = nums.length - 1;
                if (j > i+1 && nums[j - 1] == nums[j]) continue;
                int l = j + 1;

                while (l < nums.length && l < r) {

                    int sum = nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));

                        while (l < r && (nums[l] == nums[l - 1] || nums[r] == nums[r - 1])) {
                            l++;
                            r--;
                        }
                        j++;
                        r--;
                    } else if (sum < target) l++;
                    else r--;
                }
            }

        }
        System.out.println("Quadruplets with sum " + target + ": " + result);

    }
}
