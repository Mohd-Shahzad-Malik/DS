package ArraysPkg;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]){
                arr[index] = arr[i];
                index++;
            }
        }
        // Print the array without duplicates
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
