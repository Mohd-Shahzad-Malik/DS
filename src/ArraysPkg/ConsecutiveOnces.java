package ArraysPkg;

public class ConsecutiveOnces {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 0, 1, 1, 1};
        int maxCount = 0;
        int currentCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                currentCount++;
            } else {
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 0;
            }
        }

        // Check at the end of the loop in case the array ends with a sequence of ones
        if (currentCount > maxCount) {
            maxCount = currentCount;
        }

        System.out.println("Maximum consecutive ones: " + maxCount);
    }
}
