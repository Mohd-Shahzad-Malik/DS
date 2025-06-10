package ArraysPkg;

import java.util.LinkedList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;


        System.out.println(pas1(n));
        }


    public static int pas(int n, int c){
        int res = 1;
        for (int i = 0; i <= c; i++) {
            res = res * (n-i);
            res = res/(i+1);
        }
        return res;
    }

    public static List<Integer> pas1(int n){
        List<Integer> list = new LinkedList<>();
        list.add(1);
        int res = 1;
        for (int i = 1; i < n; i++) {
            res = res * (n-i);
            res = res/(i);
            list.add(res);
        }
       return list;
    }
}
