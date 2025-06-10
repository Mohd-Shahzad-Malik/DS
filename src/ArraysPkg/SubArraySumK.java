package ArraysPkg;

import Sort.InsertionSort;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SubArraySumK {
    public static void main(String[] args) {
        int [] arr = {1,2,3,-3,1,1,1,4,2,-3};
        int k = 3;
        int count =0;
        int l=0,r =0;
        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum = 0;
//            for (int j = i; j < arr.length; j++) {
//                sum = sum +arr[j];
//                if(sum == k){
//                    count++;
//                }
//            }
//        }
        Map<Integer, Integer> map= new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            int remove = sum -k;
            count = count + map.getOrDefault(remove, 0);
            map.put(sum,map.getOrDefault(sum, 0)+1);
        }



        System.out.println(count);
    }
}
