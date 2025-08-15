package BinarySearch;

import java.util.Arrays;

public class MinimumDaysBucket {
    public static void main(String[] args) {

        int [] bloomDay = {7,7,7,7,12,7,7};
        int m =2;
        int k = 3;
        if(m*k > bloomDay.length){
            System.out.println(-1);
            return;
        }
        int [] a = findMinAndMax(bloomDay);

        int start = a[0];
        int end = a[1];
        while(start <= end){
            int mid = start + (end - start)/2;
            if(createBloom(bloomDay, m, k, mid)){
                end = mid - 1;
            } else {
                start = mid+1;
            }
        }
        System.out.println(start);
    }

    private static boolean createBloom(int [] arr, int m, int k, int mid){
        int numberOfBloom = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= mid){
                count++;
            } else {
                numberOfBloom += count/k;
                count = 0;
            }
        }
        numberOfBloom += count/k;
        System.out.println(numberOfBloom + " numberOfBloom" + " count " +  count + " m " +m);
        return numberOfBloom >= m;
    }

    public static int[] findMinAndMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is null or empty.");
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        return new int[]{min, max}; // return as array [min, max]
    }


}
