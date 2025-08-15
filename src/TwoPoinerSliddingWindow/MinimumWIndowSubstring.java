package TwoPoinerSliddingWindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWIndowSubstring {
    public static void main(String[] args) {

        String s = "a";
        String t = "b";
        int l = t.length();
        Map<Character, Integer> map = new HashMap<>();

        int length = Integer.MAX_VALUE;
        int startIndex = -1;
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = i; j < s.length(); j++) {
                for (int k = 0; k < t.length(); k++) {
                    if(map.get(t.charAt(k)) == null){
                        map.put(t.charAt(k), 1);
                    } else {
                        map.put(t.charAt(k), map.get(t.charAt(k)) +1);
                    }
                }
                if(map.get(s.charAt(j)) ==null){
                    map.put(s.charAt(j) , -1);
                } else  if(map.get(s.charAt(j)) > 0){
                    count++;
                    map.put(s.charAt(j) , map.get(s.charAt(j)) -1);
                } else {
                    map.put(s.charAt(j) , map.get(s.charAt(j)) -1);
                }
                if(count == l){
                    length = Math.min(length, j -i +1);
                    startIndex = i;
                    break;
                }
            }
        }
        System.out.println(s.substring(startIndex, startIndex + length));
    }
}
