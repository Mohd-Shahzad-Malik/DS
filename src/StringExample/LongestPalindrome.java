package StringExample;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "aacabdkacaa";
        int l = 0;
        Map<Character, Integer> map = new HashMap<>();
        String ss = "";
        int start = 0;
        int end = 0;
        while( end < s.length()){
            if(map.get(s.charAt(end)) == null){
                map.put(s.charAt(end), end);
            } else {
                int n = map.get(s.charAt(end));
                if(end - n >l) {
                    ss = s.substring(n, end + 1);
                    l = end -n;
                }
            }
            end++;
        }

        System.out.println(ss == "" ? map.keySet().stream().findFirst().get() : ss);
    }
}
