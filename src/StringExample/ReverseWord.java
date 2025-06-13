package StringExample;

import java.util.Arrays;

public class ReverseWord {
    public static void main(String[] args) {
        char [] str = {'w','e','l','c','o','m','e',' ','t','o',' ','g','f','g'};

        int start = 0;

        for (int end = 0; end < str.length; end++) {
            if(str[end] == ' '){
                reverse(start, end-1, str);
                start = end +1;
            }
        }

        reverse(start, str.length-1, str);
        reverse(0, str.length-1,str);

        System.out.println(Arrays.toString(str));
    }

    private static void reverse(int start,int end, char [] str){
        while(start < end){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }

}
