package ArraysPkg;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSeqBest {
    public static void main(String[] args) {
        int[] arr = {9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6};
        int largest = 1;
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }

        for (int num : set) {
            int count = 1;
            if(set.contains(num-1)){

            } else if(set.contains(num+1)) {
                int x = num;
                while(set.contains(x+1)){
                    x = x+1;
                    count++;
                }
            } else {
                count =1;
            }
            largest = Math.max(largest, count);
        }
        System.out.println(largest);

    }
}
