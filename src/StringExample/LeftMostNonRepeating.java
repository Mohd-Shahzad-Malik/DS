package StringExample;

public class LeftMostNonRepeating {
    public static void main(String[] args) {
        String str = "abcbac";

        int [] arr = new int[26];
        int res = -1;
        for (int i = str.length()-1; i >= 0; i--) {
            arr[str.charAt(i) -'a']++;

            if(arr[str.charAt(i) -'a'] == 1){
                res = str.charAt(i) -'a';
            }
        }


        System.out.println(res);



    }
}
