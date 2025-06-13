package ArraysPkg;

import java.util.Arrays;

public class CountInversionInArray {
    public static void main(String[] args) {
        int [] arr = {40,25,19, 12, 9, 6 , 2};
        int cnt = mergeSort(arr, 0,arr.length);

        System.out.println(Arrays.toString(arr));
        System.out.println("Count of inversions: " + cnt);
    }

    private static int mergeSort(int[] arr, int start, int end) {
        int cnt = 0;
        if(end - start < 2) return cnt;

        int mid = (start + end) / 2;

        cnt += mergeSort(arr, start, mid);
        cnt += mergeSort(arr, mid, end);
        cnt += merge(arr, start, mid, end, cnt);
        return cnt;
    }

    private static int merge(int[] arr, int start, int mid, int end, int count) {
        if (arr[mid - 1] < arr[mid]) return count;
        int i = start;
        int j = mid;
        int idx = 0;
        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            if(arr[i] < arr[j]) {
                temp[idx++] = arr[i++];
            } else {
                temp[idx++] = arr[j];
                if(arr[i] > 2 *arr[j]) {
                    count = count + (mid - i); // Count inversions
                }
                j++;

            }
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
        return count;

    }
}
