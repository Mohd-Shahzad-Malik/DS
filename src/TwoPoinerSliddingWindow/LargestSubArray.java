package TwoPoinerSliddingWindow;

public class LargestSubArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 1, 1,1, 1, 3, 3};

        int i = 0, j = 0;
        int sum = 0;
        int maxL = Integer.MIN_VALUE;
        while(j < arr.length) {
            sum += arr[j];

            if (sum <= 6) {
                maxL = Math.max(maxL, j - i + 1);
            } else {
                sum -= arr[i];
                i++;
            }
            j++;
        }
        System.out.println("Largest subarray length with sum <= 6: " + maxL);



    }
}
