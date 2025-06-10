package ArraysPkg;

public class NumberAppearsOnce {
    public static void main(String[] args) {
        int [] arr = {2, 2, 3,  3 ,4 , 5, 5, 6, 6, 7, 7, 8, 8};
        int xor = 0;

        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }


        System.out.println("Initial XOR value: " + xor);
    }
}
