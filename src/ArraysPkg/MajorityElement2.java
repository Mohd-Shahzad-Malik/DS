package ArraysPkg;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    public static void main(String[] args) {
        int [] nums = {74, 2, 1,1 };

        int cont1 = 0; 
        int cont2 = 0;
        int candidate1 = 0;
        int candidate2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if(cont1 ==0 && nums[i] != candidate2){
                candidate1 = nums[i];
                cont1 = 1;
            } else if (cont2 ==0 && nums[i] !=  candidate1) {
                candidate2 = nums[i];
                cont2 = 1;
            } else if (nums[i] == candidate1) {
                cont1++;
            } else if (nums[i] == candidate2) {
                cont2++;
            } else {
                cont1--;
                cont2--;
            }
        }
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == candidate1) {
                count1++;
            } else if (nums[i] == candidate2) {
                count2++;
            }
        }

        List<Integer> result = new ArrayList<>();

        if(count1 >= nums.length / 3) {
            result.add(candidate1);
        }
        if(count2 > nums.length / 3) {
            result.add(candidate2);
        }
        System.out.println(result);
    }
}
