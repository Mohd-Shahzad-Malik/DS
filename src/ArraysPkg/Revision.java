package ArraysPkg;

import java.util.*;

public class Revision {
    public static void main(String[] args) {

        int maxLength = 0;
        int [] arr = {2,0,0,3};
        int k = 3;
        int i =0, j=0;
        int sum = arr[j];
       while(j < arr.length){
           if(i <= j && sum > k ){
               sum = sum - arr[i];
               i++;
           }
           if(sum == k){
               maxLength = Math.max(maxLength,j-i+1);
               j++;
           }
           j++;
           if(j < arr.length){
               sum  = sum + arr[j];
           }

       }
        System.out.println(maxLength);

    }
}
