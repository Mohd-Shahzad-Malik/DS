package ArraysPkg;

import java.util.Arrays;

public class LongestConsecutiveSeqBetter {
    public static void main(String[] args) {
         int [] arr = {9,1,4,7,3,-1,0,5,8,-1,6};

        Arrays.sort(arr);
        int largest = 1;
        int num  = arr[0];
        int idx = 1;
        int c = 1;
        System.out.println(Arrays.toString(arr));
        while(idx < arr.length){
            if(arr[idx] == num){
                idx++;
            } else if (arr[idx] == num +1){
                c++;
                num = num+1;
                idx++;
                largest = Math.max(c, largest);
            } else {
                c = 1;
                num = arr[idx];
            }
        }

        System.out.println(largest);

    }
}
