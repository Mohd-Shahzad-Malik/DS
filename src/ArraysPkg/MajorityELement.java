package ArraysPkg;

import java.util.*;

public class MajorityELement {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int[] nums = {7, 7, 5,7,1,5,7,5,5,5,5,5,5,5,5,5,5,5,5,7,7,7,7,7,7,7, 7 ,7, 7 ,7 ,7 ,7};
//        for (int i = 0; i < nums.length; i++) {
//            if(map.get(nums[i]) == null) {
//                map.put(nums[i], 1);
//            } else {
//                map.put(nums[i], map.get(nums[i]) + 1);
//            }
//        }
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            int key = entry.getKey();
//            int value = entry.getValue();
//            if(value > nums.length / 3) {
//                list.add(key);
//            }
//        }
//
//        System.out.println(list);
        int count = 1;
        int candidate = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if(count == 0){
                candidate = nums[i];
            }
        }
        System.out.println("Candidate: " + candidate);

    }
}
