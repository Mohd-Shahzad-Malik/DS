package StringExample;

public class PatternSearching  {
    public static void main(String[] args) {
        String str = "ABABABCD";
        String pat = "ABAB";

        for (int i = 0; i < str.length(); i++) {
            int j;
            for (j = 0; j < pat.length(); j++) {
                if(pat.charAt(j) != str.charAt(i+j) ){
                    break;
                }
            }
            if(j == pat.length()) System.out.println(i);
        }

        int start = 0;

    }
}
