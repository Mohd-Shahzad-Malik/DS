package ArraysPkg;

public class SearchInRotatingArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = search(arr, target);
        System.out.println("Index of " + target + ": " + result);

    }

    private static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the mid element is the target
            if (arr[mid] == target) {
                return mid;
            }

            // Determine which side is sorted
            if (arr[left] <= arr[mid]) { // Left side is sorted
                if (arr[left] <= target && target < arr[mid]) {
                    right = mid - 1; // Target is in the left sorted part
                } else {
                    left = mid + 1; // Target is in the right part
                }
            } else { // Right side is sorted
                if (arr[mid] < target && target <= arr[right]) {
                    left = mid + 1; // Target is in the right sorted part
                } else {
                    right = mid - 1; // Target is in the left part
                }
            }
        }
        return -1; // Target not found
    }
}
