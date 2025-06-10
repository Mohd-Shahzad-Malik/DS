package ArraysPkg;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int [] arr = {-1,0 ,-2};

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            max = Math.max(max, sum);
            if(sum < 0){
                sum = 0;
            }
        }

        System.out.println("Maximum Subarray Sum: " + max);
    }
}
