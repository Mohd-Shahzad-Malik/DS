package ArraysPkg;

import java.util.LinkedList;
import java.util.List;

public class SprialTravsel {
    public static void main(String[] args) {
        int [][] matrix = {
                {1, 2, 3, 4, 5}
        };

        List<Integer> list = new LinkedList<>();


        int top = 0, bottom = matrix.length-1;
        int left = 0, right = matrix[0].length-1;

        while(left <= right && top <= bottom){
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        System.out.println(list);
    }
}
