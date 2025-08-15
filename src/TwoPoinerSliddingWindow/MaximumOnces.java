package TwoPoinerSliddingWindow;

public class MaximumOnces {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3; // Maximum number of zeros to replace
        int count =0;
        int maxLength = 0;
        int left = 0, right = 0;
        while(right < arr.length){
            if(arr[right] == 0) count++;
            if(count <= k){
             maxLength = Math.max(maxLength, right - left + 1);
            } else if(arr[left] == 0){
                count--;
                left++;
            } else {
                left++;
            }
            right++;
        }
        System.out.println(maxLength);


    }
}
