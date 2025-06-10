package TwoPoinerSliddingWindow;

import java.util.Arrays;
import java.util.Map;

public class SubStringContainingAll {
    public static void main(String[] args) {
        String str = "bbacba";
        int count = 0;

//        for (int i = 0; i < str.length(); i++) {
//            int[] freq = new int[3];
//            for (int j = i; j < str.length(); j++) {
//                freq[str.charAt(j) - 'a'] = 1;
//                if(freq[0] + freq[1] + freq[2] >= 3) {
//                    count = count + str.length()-j ;   // count++   not break;
//                    break;
//                }
//                System.out.println(Arrays.toString(freq));
//            }
//        }
        int [] arr = {-1,-1, -1};

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a'] = i;

            if(arr[0] != -1 && arr[1] != -1 && arr[2] != -1){
                int max = Math.min(arr[0], arr[1]);
                System.out.println(max);
                count = count + (1 + Math.min(max,  arr[2]));
            }
        }

        System.out.println("Count of substrings containing all characters: " + count);
    }
}
