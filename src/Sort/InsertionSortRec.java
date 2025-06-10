package Sort;

public class InsertionSortRec {
    public static void main(String[] args) {
        int [] arr = {20, 35, -15, 7, 55, 1, -22};
        insertionSort(arr, arr.length);

        System.out.println(java.util.Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr, int numOfItems) {

        if(numOfItems < 2){
            return;
        }

        insertionSort(arr, numOfItems - 1);
        System.out.println("Before inserting: " + java.util.Arrays.toString(arr) + " | Number of items: " + numOfItems);
        int newElement = arr[numOfItems-1];
        int j;
        for (j=numOfItems- 1; j > 0 && arr[j-1] > newElement; j--) {
            arr[j] = arr[j-1];
        }
        arr[j] = newElement;

//System.out.println("After inserting " + newElement + ": " + java.util.Arrays.toString(arr) + " | Number of items: " + numOfItems);
        System.out.println("-------------------------");
    }

}
