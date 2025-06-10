package ArraysPkg;

import java.util.Map;

public class IteratorOnMap {
    public static void main(String[] args) {
        // This class is intended to demonstrate the use of iterators on a map.
        // The actual implementation would depend on the specific requirements.
        System.out.println("IteratorOnMap class is ready for implementation.");
        Map <Integer, String> map = Map.of(
            1, "One",
            2, "Two",
            3, "Three"
        );

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
