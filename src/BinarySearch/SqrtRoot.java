package BinarySearch;

public class SqrtRoot {
    public static void main(String[] args) {
        int x = 8;

        int start = 1;
        int end =  x;
        int ans = 0;
        while(start <= end){
            int mid  = start + (end -  start)/2;

            if(mid  <= x /mid){
                ans = mid;
                start = mid +1;
            } else {
                end = mid -1;
            }
        }
        System.out.println(ans);
    }
}
