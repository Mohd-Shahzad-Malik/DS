package ArraysPkg;

import java.util.ArrayList;
import java.util.List;

public class UnionTwoSOrtedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 3, 4, 4, 6};
        int[] arr2 = {2, 3, 3, 4, 4, 6, 6, 7};

//        List<Integer> unionList = new ArrayList<>();
//
//        int i = 0, j = 0;
//        while (i < arr1.length && j < arr2.length) {
//            if (arr1[i] <= arr2[j]) {
//                if((unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr1[i])) {
//                    unionList.add(arr1[i++]);
//                }
//                i++;
//            } else if(arr1[i] >= arr2[j] ){
//                if((unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr2[j])) {
//                    unionList.add(arr2[j++]);
//                }
//                j++;
//            }
//
//       }
//        while (i < arr1.length && (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr1[i])) {
//            unionList.add(arr1[i++]);
//        }
//
//        while (j < arr2.length ){
//            if(unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr2[j])
//                unionList.add(arr2[j++]);
//            else
//                j++;
//        }
//
//        System.out.println("Union of two sorted arrays: " + unionList);

        int i = 0;
        int j = 0;

        List<Integer> unionList = new ArrayList<>();

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]) i++;
            else if(arr1[i] == arr2[j]){
                unionList.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i] > arr2[j]){
                j++;
            }
        }
        System.out.println("Union of two sorted arrays: " + unionList);
    }
}
