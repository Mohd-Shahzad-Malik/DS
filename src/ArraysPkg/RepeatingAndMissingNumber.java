package ArraysPkg;

import java.util.List;

public class RepeatingAndMissingNumber {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 5, 6};
        int n = 6;

        int [] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[arr[i]-1]++;
        }

        List<Integer> repeating = new java.util.ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(result[i] == 2){
                repeating.add(i + 1);
            } else if(result[i] == 0) {
                repeating.add(i + 1);
            }
        }

        System.out.println("Repeating number: " + repeating);
    }
}
