package ArraysPkg;

import java.util.Arrays;

public class SetMatrixZeroBtter {
    public static void main(String[] args) {
        int [][] matrix = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        int row = 3;
        int col = 3;
        int [] arrR =  new int[row];
        int [] arrC =  new int[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(matrix[i][j] == 0){
                    arrR[i] = 1;
                    arrC[j] = 1;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(arrR[i] ==1 || arrC[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
