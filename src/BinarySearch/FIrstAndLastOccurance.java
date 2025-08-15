package BinarySearch;

public class FIrstAndLastOccurance {
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,8,8,11,13};
        int t = 11;
        int a = binarySearch(arr, t , true);
        int b = binarySearch(arr, t , false);

        System.out.println(a + " " +b);

    }

    private static int binarySearch(int [] arr, int k,boolean found){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] < k){
                start = mid +1;
            } else if(arr[mid] > k){
                end  = mid -1;
            } else {
                ans = mid;
                if(found){
                    end = mid -1;
                }else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
