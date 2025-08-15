package BinarySearch;

import java.util.Stack;

public class BinarySearchMain {
    public static void main(String[] args) {
        int [] arr = {3,4,6,7,9,12,16,17};

        Stack<Character> s = new Stack<>();

        int target = 13;
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (end+start)/2;

            if(arr[mid] == target){
                System.out.println(mid);
                return;
            } else if(arr[mid] < target){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        System.out.println(-1);
    }
}
