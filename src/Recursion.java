public class Recursion {
    public static void main(String[] args) {
        int num =5;

        System.out.println(fact(num));
    }

    private static int fact(int num) {
        if(num == 0){
            return 1;
        }

        return num * fact(num -1);
    }
}
