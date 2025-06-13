package ArraysPkg;

import java.util.*;

public class Revision {
    public static void main(String[] args) {
        int [] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        int i =0;
        int j=0;
        int maxLength = 0;
        int count = 0;
        while(j< arr.length){
            if(arr[j] == 0) count++;

            if(count <=k){
                maxLength = Math.max(maxLength, j-i+1);
                j++;
            } else if(arr[i] == 0){
                i++;
                count--;
                j++;
            }else {
                j++;
                i++;
            }
        }

        System.out.println(maxLength);
    }
}
