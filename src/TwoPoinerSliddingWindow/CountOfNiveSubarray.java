package TwoPoinerSliddingWindow;

public class CountOfNiveSubarray {
    public static void main(String[] args) {
        int [] nums = {102, 4, 100, 1, 101, 3, 2, 1,1, 103, 104, 105, 106};
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int count = 0;
            while(checkAvailable(nums, num)){
                count++;
                num+=1;
            }
            max = Math.max(count, max);
        }

        System.out.println(max);
    }

    private static boolean checkAvailable(int[] nums, int num) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == num){
                return true;
            }
        }
        return false;
    }
}