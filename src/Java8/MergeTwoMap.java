package Java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MergeTwoMap {
    public static void main(String[] args) {
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("A", 50);
        map1.put("B", 20);
        Map<String,Integer> map2 = new HashMap<>();
        map2.put("B", 30);
        map2.put("C", 40);

        HashMap<String, Integer> collect = map1.entrySet()
                .stream().
                collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        Integer::sum,
                        HashMap::new
                ));

        map2.forEach((x,y) -> map1.merge(x, y, Integer::sum));

        System.out.println(map1);


    }
}
