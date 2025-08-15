package TwoPoinerSliddingWindow;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SubArrayWithKDiffInteger {
    public static void main(String[] args) {
        int [] nums = {1,2,1,2,3};
        int k = 2;
        int num = getSubArray(nums, k) - getSubArray(nums, k-1);
        System.out.println(num);

    }

    public static int getSubArray(int [] nums, int k){
        int count =0;
        int l =0, r =0;
        Map<Integer, Integer> map = new HashMap<>();

        while(r < nums.length){
            if(map.get(nums[r]) == null){
                map.put(nums[r], 1 );
            } else {
                map.put(nums[r], map.get(nums[r]) +1);
            }
            while(map.size() >k){
                map.put(nums[l], map.get(nums[l]) -1);
                if(map.get(nums[l]) == 0){
                    map.remove(nums[l]);
                }
                l++;
            }
            count = count + (r - l + 1);
            r++;

        }
        return count;
    }
}
