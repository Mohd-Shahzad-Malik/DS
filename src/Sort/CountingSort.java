package Sort;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int [] arr = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        System.out.println("shahzad \"malik");

        int [] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]-1]++;
        }

        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            int n = temp[i];
            while(n > 0) {
                arr[c++] = i+1;
                n--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
