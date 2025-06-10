package Java8;

import java.util.List;

public class ReduceMethod {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        Integer reduce = list.stream()
                .reduce(5, Integer::sum);
        System.out.println(reduce);
    }
}
