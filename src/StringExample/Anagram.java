package StringExample;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int sum = 0 ;
            for (int i = 0; i < str1.length(); i++) {
                if(str1.charAt(i) == ch) {
                    sum++;
                }
                if (str2.charAt(i) == ch) {
                    sum--;
                }
            }

            if(sum != 0) {
                System.out.println("Not an Anagram");
                return;
            }
        }
    }
}
