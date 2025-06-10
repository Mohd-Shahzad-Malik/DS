package Recursion;

public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    private static int fact(int num) {
        if(num == 0){
            return 1;
        }
        return num * fact(num-1);
    }
}
