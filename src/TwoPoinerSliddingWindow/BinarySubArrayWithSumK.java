package TwoPoinerSliddingWindow;

public class BinarySubArrayWithSumK {
    public static void main(String[] args) {
        int [] nums = {0, 0, 0,0, 0};
        int goal =0;
        int numberOfCount = getNumberOfCount(nums, goal) - getNumberOfCount(nums, goal-1);
        System.out.println(numberOfCount);


    }

    public static int getNumberOfCount(int [] arr, int goal){
        int l =0,r = 0;
        int count = 0;
        int sum  = 0;
        while(r < arr.length){
            if(goal < 0) return 0;
            sum  =sum + arr[r];
            while(sum > goal){
                sum  =sum - arr[l++];
            }

            count =  count + (r-l+1);
            r++;
        }



        return count;
    }
}
