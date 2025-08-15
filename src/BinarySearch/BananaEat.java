package BinarySearch;

public class BananaEat  {
    public static void main(String[] args) {
        int [] piles = {3,6,7,11};
        int h =18;

        int start= 0;
        int end = piles[piles.length-1];
        int ans = -1;
        while(start <= end){
            int mid = start + (end -start)/2;
            int numberOFHour = getNumberOFHour(piles, mid);
            System.out.println("mid " +  mid);
            System.out.println(numberOFHour);
            if(numberOFHour <= h && numberOFHour >=0){
                ans = mid;
                end = mid -1;
            } else {
                start = mid +1;
            }
        }

        System.out.println(ans);
    }

    public static int getNumberOFHour(int [] arr, int mid){
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num + (int)  Math.ceil(arr[i] / (double)mid);
        }
        return num;
    }
}
