package TwoPoinerSliddingWindow;

public class NumberOfZeroOncesTwoes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 0, 1, 2};

        int zeroCount = 0, oneCount = 0, twoCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            } else if (arr[i] == 1) {
                oneCount++;
            } else if (arr[i] == 2) {
                twoCount++;
            }
        }
            int i =0;
            while (zeroCount > 0) {
                arr[i++] = 0;
                zeroCount--;
            }
            while (oneCount > 0) {
                arr[i++] = 1;
                oneCount--;
            }
            while (twoCount > 0) {
                arr[i++] = 2;
                twoCount--;
            }
        System.out.println("Sorted Array: " + java.util.Arrays.toString(arr));

        int low = 0, mid = 0, high = arr.length - 1;

        while(mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        System.out.println("Sorted Array using Two Pointer Technique: " + java.util.Arrays.toString(arr));

    }


}
