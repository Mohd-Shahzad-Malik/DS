package Sort;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {4725, 4586, 1330, 8792, 1594, 5729};
        radixSort(arr, 10 , 4);

        System.out.println("Sorted array:" + java.util.Arrays.toString(arr));

    }

    private static void radixSort(int[] arr, int radix, int width) {
        for (int i = 0; i < width; i++) {
            countingSort(arr, i, radix);
        }

    }

    private static void countingSort(int[] arr, int position, int radix) {
        int numItems = arr.length;
        int[] countArray = new int[radix];

        for (int value : arr) {
            int digit = (value / (int) Math.pow(radix, position)) % radix;
            countArray[digit]++;
        }

        for (int i = 1; i < radix; i++) {
            countArray[i] += countArray[i - 1];
        }

        int[] output = new int[numItems];
        for (int i = numItems - 1; i >= 0; i--) {
            int value = arr[i];
            int digit = (value / (int) Math.pow(radix, position)) % radix;
            output[countArray[digit] - 1] = value;
            countArray[digit]--;
        }

        for (int i = 0; i < numItems; i++) {
            arr[i] = output[i];
        }
    }
}
