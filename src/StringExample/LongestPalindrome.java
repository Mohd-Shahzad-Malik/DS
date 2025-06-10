package StringExample;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "abb";
        String result = longestPalindrome(s);
        System.out.println("Longest Palindrome: " + result);

    }

    public static String longestPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        if (s == null || s.length() < 1) {
            return "";
        }


        if (s.length() == 2 && s.charAt(0) == s.charAt(1)) {
            return s;
        }
        if (s.length() == 2) {
            char c = s.charAt(0);
            return String.valueOf(c);
        }

        while(start < end){
            if(s.charAt(start) == s.charAt(end)){
                s = s.substring(start, end+1);
                System.out.println("Current Palindrome: " + s + " Start: " + start + " End: " + end);
                start++;
                end--;

            } else {
                System.out.println("Not a Palindrome: " + s + " Start: " + start + " End: " + end);
                start++;
                end--;

            }
        }
        return s;
    }
}
