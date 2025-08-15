package TwoPoinerSliddingWindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWIndowSubstringBetter {
    public static void main(String[] args) {

        String s = "cabwefgewcwaefgcf";
        String t = "cae";
        int l = t.length();
        Map<Character, Integer> map = new HashMap<>();

        for (int k = 0; k < t.length(); k++) {
            if(map.get(t.charAt(k)) == null){
                map.put(t.charAt(k), 1);
            } else {
                map.put(t.charAt(k), map.get(t.charAt(k)) +1);
            }
        }
        int x =0,r =0;
        int length = Integer.MAX_VALUE;
        int startIndex = -1;
        int count = 0;
        while(r < s.length()){
            if(map.get(s.charAt(r)) ==null){
                map.put(s.charAt(r) , -1);
            } else  if(map.get(s.charAt(r)) > 0){
                count++;
                map.put(s.charAt(r) , map.get(s.charAt(r)) -1);
            } else {
                map.put(s.charAt(r) , map.get(s.charAt(r)) -1);
            }
            while(count == l){
                System.out.println(map);
                length = Math.min(length, r -x +1);
                startIndex = x;
                System.out.println(startIndex);
                map.put(s.charAt(x), map.get(s.charAt(x)) +1);
                if(map.get(s.charAt(x)) > 0) count --;
                x++;
            }
            r++;
        }

        System.out.println(startIndex == -1 ? "" : s.substring(startIndex, startIndex + length));
    }
}
