package ArraysPkg;

public class MergeSortedArray {
    public static void main(String[] args) {
        int [] one = {1, 3, 5, 7};
        int [] two = {2, 4, 6, 8};

        int [] merged = new int[one.length + two.length];
        int indexOne = 0;
        int indexTwo = 0;
        int indexMerged = 0;
        int x = one.length;
        int y = two.length;



        for (int i=  (one.length + two.length) / 2 + (one.length + two.length) % 2 ;i> 0; i = (i/2 + i % 2)) {
            int left = 0;
            int right = left + i;

            while(right < (one.length + two.length)){
                if(left < one.length && right >= one.length){
                    swap(one, two,left , right -one.length);
                } else if(left >= one.length) {
                    swap(two,two, left - one.length, right - one.length);
                } else {
                    swap(one, one , left, right);
                }
                left++;
                right++;
            }
            if( i == 1) {
                break;
            }

        }

        System.out.println("First Array: " + java.util.Arrays.toString(one));
        System.out.println("Second Array: " + java.util.Arrays.toString(two));

//        while(indexOne < x && indexTwo < y) {
//            if (one[indexOne] <= two[indexTwo]) {
//                merged[indexMerged++] = one[indexOne++];
//            } else {
//                merged[indexMerged++] = two[indexTwo++];
//            }
//        }
//
//        while(indexOne < x) {
//            merged[indexMerged++] = one[indexOne++];
//        }
//
//        while(indexTwo < y) {
//            merged[indexMerged++] = two[indexTwo++];
//        }
//
//        for (int i = 0; i < one.length; i++) {
//            one[i] = merged[i];
//        }
//
//        for (int i = 0; i < two.length; i++) {
//            two[i] = merged[one.length +i];
//        }

//        System.out.println("First Array: " + java.util.Arrays.toString(one));
//        System.out.println("Second Array: " + java.util.Arrays.toString(two));

    }


    private static void swap(int[] one, int[] two, int indexOne, int indexTwo) {
        if (one[indexOne] > two[indexTwo]) {
            int temp = one[indexOne];
            one[indexOne] = two[indexTwo];
            two[indexTwo] = temp;
        }
    }

}
