package Sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(arr, 0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if(start >= end) return;

        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {

        int i = start;
        int j = mid+1;
        int idx = 0;
        int[] temp = new int[end - start +1];

        while (i <= mid && j <= end) {
            temp[idx++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        while(i <= mid) {
            temp[idx++] = arr[i++];
        }
        
        while(j <= end) {
            temp[idx++] = arr[j++];
        }

        for (int k = 0; k < temp.length; k++) {
            arr[k +start] = temp[k];
        }

    }
}
