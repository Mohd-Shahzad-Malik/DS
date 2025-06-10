package ArraysPkg;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RearrangeElementBySign {
    public static void main(String[] args) {
        int arr [] = {-1, 2,3,4, -3, 1};
        List<Integer> first = new LinkedList<>();
        List<Integer> second = new LinkedList<>();
        int firstIndex = 0, secondIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                first.add(arr[i]);
            } else {
                second.add(arr[i]);
            }
        }
        System.out.println("first " +  first);
        System.out.println("second " +  second);
        int index = 0;
        int secIndex = 0;
        int i;
        for (i =0; i < Math.max(first.size(), second.size()); i++) {
                if (i % 2 == 0 && firstIndex < first.size()) {
                    arr[i] = first.get(index++);
                } else if (i % 2 != 0 && secIndex < second.size()) {
                    arr[i] = second.get(secIndex++);
                } else break;
        }
        int size = second.size();
        while (i < arr.length){

            arr[i++] = first.get(size++);
        }

        System.out.println(Arrays.toString(arr));
//        int [] arr1 = new int[arr.length];
//        int positiveCount = 0;
//        int negativeCount = 1;
//        int l;
//        for (l = 0; l < arr.length; l++) {
//            if(arr[l] > 0 && positiveCount < arr.length) {
//                arr1[positiveCount] = arr[l];
//                positiveCount = positiveCount+2;
//            } else if (arr[l] < 0 && negativeCount < arr.length) {
//                arr1[negativeCount] = arr[l];
//                negativeCount = negativeCount+2;
//            } else break;;
//
//        }
//
//        while(arr[l] > 0 && positiveCount < arr.length) {
//            arr1[positiveCount++] = arr[l++];
//        }
//
//        while (arr[l] < 0 && negativeCount < arr.length) {
//            arr1[negativeCount++] = arr[l++];
////        }
//        System.out.println(Arrays.toString(arr1));
    }
}
