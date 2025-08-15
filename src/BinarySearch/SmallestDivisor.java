package BinarySearch;

public class SmallestDivisor {
    public static void main(String[] args) {
        int [] nums = {21212,10101,12121};
        int threshold = 1000000;

        int [] a = findMinAndMax(nums);
        int start = 1;
        int end = a[1];

        while(start <= end){
            int mid = start + (end - start)/2;
            if(getDivisor(nums, mid,threshold)){
                end = mid -1;
            } else {
                start = mid +1;
            }
        }
        System.out.println(start);
    }

    private static boolean getDivisor(int[] arr, int mid, int t){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + (int)Math.ceil(arr[i]/(double)mid);
        }
        return sum<= t;
    }

    public static int[] findMinAndMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is null or empty.");
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        return new int[]{min, max}; // return as array [min, max]
    }
}
