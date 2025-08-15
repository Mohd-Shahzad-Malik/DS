package TwoPoinerSliddingWindow;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Revision {
    public static void main(String[] args) {
        String str = "cadbzabcd";
        int max = Integer.MIN_VALUE;
        int l =0, r = 0;
        Map<Character, Integer> map = new HashMap<>();
        while(r < str.length()){
            if(map.get(str.charAt(r)) ==null || l > map.get(str.charAt(r))){
                max = Math.max(max,  r-l +1);
                map.put(str.charAt(r),r);
            } else {
                l = map.get(str.charAt(r)) +1;
                map.put(str.charAt(r), r);
            }
            r++;
        }
        System.out.println(max);
    }
}
