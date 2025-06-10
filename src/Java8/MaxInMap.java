package Java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxInMap {
    public static void main(String[] args) {
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("A", 50);
        map1.put("B", 20);
        map1.put("C", 70);


        map1.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        map1.values().stream().collect(Collectors.toList());
    }
}
