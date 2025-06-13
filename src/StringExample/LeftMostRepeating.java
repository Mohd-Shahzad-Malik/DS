package StringExample;

import java.util.Arrays;

public class LeftMostRepeating {
    public static void main(String[] args) {
        String str = "abbccd";

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j))
                    System.out.println(i);
            }
        }
        System.out.println("NO");


        int [] arr = new int[256];
        Arrays.fill(arr, -1);
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); i++) {
            int idx = arr[str.charAt(i)];
            if(arr[str.charAt(i)] == -1){
                arr[str.charAt(i)] = i;
            } else {
                max= Math.min(max, idx );
            }

        }

        System.out.println(max);
    }
}
