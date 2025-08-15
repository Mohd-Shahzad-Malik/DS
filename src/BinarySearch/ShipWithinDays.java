package BinarySearch;

public class ShipWithinDays {
    public static void main(String[] args) {
        int [] weights = {1,2,3,1,1};
        int days = 4;
        int start = findMax(weights);
        int end = findSum(weights);

        while(start <= end){
            int mid = start + (end - start)/2;
            if(canAccumudate(weights, mid, days)){
                end = mid -1;
            }
            else {
                start = mid+1;
            }
        }
        System.out.println(start);
    }

    private static boolean canAccumudate(int [] arr, int mid, int days){
        int sum = 0;
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum <= mid) {

            } else {
                count++;
                sum = arr[i];
            }
        }
        count++;

        return count <= days;
        }


    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
