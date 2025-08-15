package BinarySearch;


public class AggressiveCows {
    public static void main(String[] args) {
        int [] arr = {0, 3, 4, 7, 9, 10};
        int cows = 4;

        int min = arr[0];
        int max = arr[arr.length-1];


        for (int i = 1; i < max- min; i++) {
            if(canBePlace(arr, i, cows)){

            } else {
                System.out.println(i-1);
                return;
            }
        }
    }

    private static boolean canBePlace(int [] arr, int i,int cows) {
        int lastCowPlaces = arr[0];
        int cowPlaced = 1;
        for (int j = 1; j < arr.length; j++) {
            if(arr[j] - lastCowPlaces >= i){
                cowPlaced++;
                lastCowPlaces = arr[j];
            }
        }

        return cowPlaced >= cows;
    }
}
