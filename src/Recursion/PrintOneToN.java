package Recursion;

public class PrintOneToN {
    public static void main(String[] args) {
        print(10);
    }

    private static void print(int num) {
        if (num==0) {
            return;
        }
         print(num-1);
        System.out.println(num);
    }
}
