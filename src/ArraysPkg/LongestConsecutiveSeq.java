package ArraysPkg;

public class LongestConsecutiveSeq {
    public static void main(String[] args) {
         int [] arr = {102,4,100, 1,101, 3, 2, 1,1};

         int count = 1;
        for (int i = 0; i < arr.length; i++) {
            int num   =arr[i];
            int curr = 1;
            while(present(arr, num+1)){
                num+=1;
                curr++;
            }
            count  = Math.max(count, curr);
        }
        System.out.println(count);
    }

    private static boolean present(int[] arr, int i) {
        for (int k : arr) {
            if (k == i) {
                return true;
            }
        }
        return false;
    }
}
