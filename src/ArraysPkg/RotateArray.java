package ArraysPkg;

public class RotateArray {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7};
        int [] number = {1, 2, 3, 4, 5, 6, 7};

        rotateLeft(numbers);
        System.out.println(java.util.Arrays.toString(numbers));
        rotateRight(number);
        System.out.println(java.util.Arrays.toString(number));
    }


    private static void rotateRight(int[] numbers) {
        int lastNumber = numbers[numbers.length - 1];
        for(int i=numbers.length-1;i>0;i--){
            numbers[i] = numbers[i-1];
        }
        numbers[0] = lastNumber;
    }

    private static void rotateLeft(int[] numbers) {
        int lastNumber = numbers[0];
        for(int i=0;i<numbers.length-1;i++){
            numbers[i] = numbers[i+1];
        }
        numbers[numbers.length-1] = lastNumber;
    }
}
