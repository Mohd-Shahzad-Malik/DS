package TwoPoinerSliddingWindow;

import java.util.Map;

public class LongestSubString {
    public static void main(String[] args) {
        String s = "aaabbccd";
        int k =2;
        int maxLength = 0;
        Map<Character, Integer> map = new java.util.HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            int count = 0;
//            for (int j = i; j < s.length(); j++) {
//                charCountMap.put(s.charAt(j), count++);
//                if(charCountMap.size() > k) {
//                    break;
//                } else {
//                    maxLength = Math.max(maxLength, j - i + 1);
//                }
//            }
//        }
//        System.out.println("Max Length of Substring with " + k + " distinct characters: " + maxLength);

        int l = 0, r =0;
        while(r < s.length()){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            if(map.size() <= k){
                maxLength = Math.max(maxLength, r - l + 1);
                r++;
            } else {
                int n = l;
                l = l + map.get(s.charAt(l));
                map.remove(s.charAt(n));
            }
        }
        System.out.println(maxLength);
    }
}
