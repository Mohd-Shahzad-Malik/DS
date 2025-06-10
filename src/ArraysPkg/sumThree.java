package ArraysPkg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sumThree {
    public static void main(String[] args) {
        int [] arr = {-1, 0,1, 2, -1,-4};
        Arrays.sort(arr);
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i+1; j < arr.length; j++) {
                int sum  = -(arr[i] + arr[j]);
                if(set.contains(sum)) {
                    result.add(List.of(arr[i], arr[j], sum));
                } else {
                    set.add(arr[j]);
                }
            }
        }
        System.out.println("Triplets with sum zero: " + result);
    }
}
