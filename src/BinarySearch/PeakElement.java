package BinarySearch;

public class PeakElement {
    public static void main(String[] args) {
        int [] nums = {1,2,1,3,5,6,4};

        int start =0;
        int end  =nums.length-1;
        if(nums.length == 1) return;
        if(nums[start] > nums[start+1]){
            System.out.println(nums[start]);
            return;
        }

        if(nums[end] > nums[end -1]){
            System.out.println(nums[end]);
            return;
        }
        start++;
        end --;
        while(start <= end){
            int mid = start + (end -start)/2;

            if((nums[mid-1] < nums[mid]) &&  nums[mid] > nums[mid+1]){
                System.out.println(nums[mid]);
                return;
            } else if(nums[mid] > nums[mid -1] && nums[mid] < nums[mid+1] ){
                start = mid +1;
            } else {
                end = mid-1;
            }
        }

        System.out.println(-1);

//        for (int i = 0; i < nums.length; i++) {
//            if((i==0 || nums[i-1] < nums[i]) &&
//                    (i == nums.length-1 || nums[i] > nums[i+1])){
//                System.out.println(nums[i]);
//            }
//        }
    }
}
