package ArraysPkg;

import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int [][] arr = {
                {1, 1, 1, 1},
                {1, 0, 0, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 1}
        };
        int row =3, col = 3;

        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                if(arr[i][j] == 0){
                    row(arr, i, col);
                    col(arr, j, row);
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

    private static void col(int [][] arr, int j, int row) {
        for (int i = 0; i <= row; i++) {
            if(arr[j][i]  == 1){
                arr[j][i] = -1;
            }
        }
    }

    private static void row(int[][] arr, int j, int col) {
        for (int i = 0; i <= col; i++) {
            if(arr[i][j] == 1){
                arr[i][j] = -1;
            }
        }
    }
}
