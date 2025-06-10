package Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {20, 35, -15, 7, 55, 1,-22};
        for (int i = arr.length-1; i > 0 ; i--) {
            int index = 0;
            for (int j = 1; j <= i; j++) {
                if(arr[j] > arr[index]) {
                    index = j;
                }
            }
            swap(arr, index, i);
        }
        System.out.println("after sorting");
        System.out.println(Arrays.toString(arr));

    }

    private static void swap(int [] arr, int start,int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }
}
