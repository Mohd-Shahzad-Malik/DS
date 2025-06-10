package Sort;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {4725, 4586, 1330, 8792, 1594, 5729};
        radixSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void radixSort(int[] arr) {
        int max = findMax(arr);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            // Perform counting sort for each digit
            countingSortByDigit(arr, exp);
        }
    }

    private static void countingSortByDigit(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n]; // Output array
        int[] count = new int[10]; // Count array for digits 0-9

        // Store count of occurrences in count[]
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        // Change count[i] so that it contains the actual position of this digit in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        System.out.println("Count array for exp = " + exp + ": " + java.util.Arrays.toString(count));
        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the output array to arr[], so that arr[] now contains sorted numbers according to the current digit
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
