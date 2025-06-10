package ArraysPkg;

import java.util.Arrays;

public class RotateTwoDarray {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };


        int [][] arr2 = new int[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            int num = ((arr.length -1)-i);
            for (int j = 0; j < arr.length; j++) {
                arr2[j][num] = arr[i][j];
            }
        }

        System.out.println(Arrays.deepToString(arr2));
    }
}
