package ArraysPkg;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeaderArray  {
    public static void main(String[] args) {
         int [] arr = {10, 22, 12, 3, 0,6};
        List<Integer> list =  new LinkedList<>();
        list.add(arr[arr.length-1]);
        int max = arr[arr.length-1];
        for (int i = arr.length-2; i >=0 ; i--) {
            if(arr[i] > max){
                list.add(arr[i]);
                max = arr[i];
            }
        }

        System.out.println(list);
    }
}
