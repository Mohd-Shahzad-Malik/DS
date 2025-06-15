package StringExample;

public class StringSubSequence {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String subStr = "Hold";

       int i = 0;
       int j = 0;
         while (i < str.length() && j < subStr.length()) {
              if (str.charAt(i) == subStr.charAt(j)) {
                j++;
                i++;
              } else {
                  i++;
              }
         }

         if(j == subStr.length()) {
             System.out.println("The string \"" + subStr + "\" is a subsequence of \"" + str + "\".");
         } else {
             System.out.println("The string \"" + subStr + "\" is NOT a subsequence of \"" + str + "\".");

         }
    }
}
