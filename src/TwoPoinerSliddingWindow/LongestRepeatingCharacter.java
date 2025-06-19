package TwoPoinerSliddingWindow;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestRepeatingCharacter {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 2;


        int maxL = 0;
//        for (int i = 0; i < s.length(); i++) {
//            int [] arr = new int[26];
//            int maxFreq = 0;
//            for (int j = i; j < s.length(); j++) {
//                arr[s.charAt(j) - 'A']++;
//                maxFreq = Math.max(maxFreq, arr[s.charAt(j) - 'A']);
//                int change = (j-i+1) - maxFreq;
//
//                if(change <=k){
//                    maxL = Math.max(maxL, (j-i+1));
//                } else break;
//
//            }
//        }
//        System.out.println(maxL);

        Map<Character, Integer> map = new LinkedHashMap<>();
        int l =0, r = 0;
        int maxFreq = 0;
        while(r < s.length()){
            if(map.get(s.charAt(r)) == null){
                map.put(s.charAt(r), 1);
            } else {
                map.put(s.charAt(r), map.get(s.charAt(r)) +1);
            }
            maxFreq = Math.max(maxFreq, map.get(s.charAt(r)));

            int change = (r- l +1) - maxFreq;

            if(change <= k){
                maxL = Math.max(maxL, (r-l+1));
            } else{
                map.put(s.charAt(l) , map.get(s.charAt(l)) -1);
                maxFreq = map.entrySet().stream().max((I, J) -> I.getValue()).get().getValue();
                l++;
            }
            r++;

        }

        System.out.println(maxL);
    }
}
