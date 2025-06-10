package TwoPoinerSliddingWindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {2, 6, 5, 8, 11};
        Map<Integer, Integer> map = new HashMap<>();
        int target = 14;
        for (int i = 0; i < arr.length; i++) {
            int num = target - arr[i];
            if(map.containsKey(num)){
                System.out.println("Pair found at indices: " + map.get(num) + " and " + i);
            }
            else {
                map.put(arr[i], i);
            }
        }

        Arrays.sort(arr);

        int left = 0 , right = 1;

        while(right < arr.length){
            if(arr[left] + arr[right] == target){
                System.out.println("Pair found: " + arr[left] + " and " + arr[right]);
                return;
            } else {
                right++;
                left++;
            }
        }
        System.out.println("NO pair found");
    }
}
