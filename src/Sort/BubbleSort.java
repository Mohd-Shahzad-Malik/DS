package Sort;

import java.sql.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {20, 35, -15, 7, 55, 1,-22};

        for (int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]){
                    swap(arr,j, j+1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int start, int end) {
        int t= arr[start];
        arr[start] = arr[end];
        arr[end] = t;
    }
}
