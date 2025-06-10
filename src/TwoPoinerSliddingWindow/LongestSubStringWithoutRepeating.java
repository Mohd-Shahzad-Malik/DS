package TwoPoinerSliddingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeating {
    public static void main(String[] args) {
        String  s = "tmmzuxt";
//        int n = s.length();
//        int[] index = new int[128]; // ASCII character set
//        int maxLength = 0;
//        int start = 0;
//
//        for (int end = 0; end < n; end++) {
//            char currentChar = s.charAt(end);
//            start = Math.max(index[currentChar], start);
//            maxLength = Math.max(maxLength, end - start + 1);
//            index[currentChar] = end + 1; // Update the last seen index
//        }
//
//        System.out.println( "Length of the longest substring without repeating characters: " + maxLength);
//
//        int [] lastSeenIndex = new int[256];
//        int maxLength2 = 0;
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i; j < s.length(); j++) {
//                if(lastSeenIndex[s.charAt(j)] == 1) {lastSeenIndex[s.charAt(j)] = 0; break ;}
//                int length = j -i+1;
//                maxLength2 = Math.max(maxLength2, length);
//                lastSeenIndex[s.charAt(j)] = 1;
//            }
//        }
//        System.out.println("Length of the longest substring without repeating characters using brute force: " + maxLength2);

         Map<Character, Integer> lastSeenIndex = new HashMap<>();
         int i = 0, j = 0, maxLength = 0;
          while(j < s.length()){

              if(lastSeenIndex.get(s.charAt(j)) == null || lastSeenIndex.get(s.charAt(j)) < i) {
                    // If the character has not been seen or is not in the current window
                  int length = j - i + 1;
                    maxLength = Math.max(maxLength, length);
                    lastSeenIndex.put(s.charAt(j), j); // Store the last seen index of the character
                    j++;
              }  else  {
                  int indexOfFirstItr = lastSeenIndex.get(s.charAt(j));
                  lastSeenIndex.put(s.charAt(j), j); // Update the last seen index of the character
                  i = indexOfFirstItr + 1; // Move the start pointer to the right of the last seen index
                  j++;
              }

          }
        System.out.println("Length of the longest substring without repeating characters using sliding window: " + maxLength);
    }
}
