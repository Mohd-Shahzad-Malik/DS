package TwoPoinerSliddingWindow;

import java.util.Arrays;

public class NumberOfSubString {
    public static void main(String[] args) {
        String str = "bbacba";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            int [] arr = new int[3];
            for (int j = i; j < str.length(); j++) {
                arr[str.charAt(j) - 'a'] = 1;
                if(arr[0] + arr[1] + arr[2] == 3){
                    count++;
                }
            }
        }

        System.out.println(count);

//        int count = 0;
//        int [] arr = {-1,-1, -1};
//        for (int i = 0; i < str.length(); i++) {
//            arr[str.charAt(i) - 'a'] = i;
//            if(arr[0] != -1 &&  arr[1] != -1 && arr[2] != -1){
//                count = count + 1 + Math.min(arr[0], Math.min(arr[1], arr[2]) );
//            }
//        }
    }
}
