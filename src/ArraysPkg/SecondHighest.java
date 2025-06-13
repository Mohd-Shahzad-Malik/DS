package ArraysPkg;

import java.util.Arrays;

public class SecondHighest {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,5,5,7,6};
        Arrays.sort(numbers);

        for (int i = numbers.length-1; i >=0 ; i--) {
            if(i >0 && numbers[i] != numbers[i-1]){
                System.out.println(numbers[i-1]);
                return;
            }
        }
        System.out.println("All numbers are the same");

        int maxNumber  =-1;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }
        }
        int secMax = -1;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < maxNumber  && secMax < numbers[i]){
                secMax = numbers[i];
            }
        }

        System.out.println(secMax);
//        int maxNumber = numbers[0];
//        int secMax = -1;
//        for (int i = 1; i < numbers.length; i++) {
//            if(numbers[i] > maxNumber){
//                secMax = maxNumber;
//                maxNumber = numbers[i];
//            } else if(numbers[i] < maxNumber && numbers[i] > secMax) {
//                secMax = numbers[i];
//            }
//        }
//        System.out.println(secMax);

    }
}
