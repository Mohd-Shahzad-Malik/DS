package ArraysPkg;

import java.util.Arrays;

public class RotateTwoDarrayO {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = i+1; j < matrix.length; j++) {
                swap(matrix, i, j);
            }
        }

        System.out.println(Arrays.deepToString(matrix));

        for (int i = 0; i < matrix.length; i++) {
            int l = 0, r = matrix.length - 1;
            while(l < r){
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++;
                r--;
            }
        }

        System.out.println(Arrays.deepToString(matrix));

    }

    private static void swap(int[][] arr, int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
}
