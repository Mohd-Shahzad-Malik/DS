package Sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(arr, 0,arr.length);

        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if(end - start < 2) return;

        int mid = (start + end) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        if (arr[mid - 1] < arr[mid]) return;

        int i = start;
        int j = mid;
        int idx = 0;
        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            temp[idx++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
        }

        while(i < mid) {
            temp[idx++] = arr[i++];
        }
        
        while(j < end) {
            temp[idx++] = arr[j++];
        }

        for (int k = 0; k < temp.length; k++) {
            arr[k +start] = temp[k];
        }

    }
}
