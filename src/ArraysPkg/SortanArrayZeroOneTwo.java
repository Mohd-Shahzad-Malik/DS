package ArraysPkg;

import java.util.Arrays;

public class SortanArrayZeroOneTwo {
    public static void main(String[] args) {
        int [] arr = {0,1,2,0,1,2,1,2,0,0,0,1};
        int low =0, mid =0;
        int high = arr.length-1;
        while(mid <= high) {
            if(arr[mid] ==0){
                int num =arr[low];
                arr[low] = arr[mid];
                arr[mid] = num;
                low++;
                mid++;
            } else if(arr[mid] == 1){
                mid++;
            } else {
                int num =arr[high];
                arr[high] = arr[mid];
                arr[mid] = num;
                high--;

            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
