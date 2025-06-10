package ArraysPkg;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1};
        int k = 3;
        System.out.println("Length of longest subarray with sum " + k + ": " + longestSubArrayWithSumK(arr, k));
    }

    private static String longestSubArrayWithSumK(int[] arr, int k) {
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum =0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if(sum == k) {
                    int length = j - i + 1;
                    maxLength = Math.max(maxLength, length);
                }
            }
        }
        return maxLength == 0 ? "No subarray found" : String.valueOf(maxLength);
    }
}
