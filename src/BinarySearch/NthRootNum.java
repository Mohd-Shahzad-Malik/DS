package BinarySearch;

public class NthRootNum {
    public static void main(String[] args) {
        int x = 27;
        int y =3;

        int start = 1;
        int end =  x;
        int ans = -1;
        while(start <= end){
            int mid  = start + (end -  start)/2;

            if(getNum(y, mid, x)  == 1 ){
                System.out.println(mid);
                return;
            } else if(getNum(y, mid, x) ==2){
                end = mid -1;
            } else {
                start = start +1;
            }
        }
        System.out.println(ans);
    }

    private static int getNum(int y, int mid, int m) {
        int sum = 1;
        for (int i = 0; i < y; i++) {
            sum = sum  * mid;
            if(sum > m) {
                return 2;
            }
        }
        if(sum == m){
            return 1;
        } else {
            return 0;
        }
    }
}
