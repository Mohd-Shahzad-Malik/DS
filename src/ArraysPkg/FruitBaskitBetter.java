package ArraysPkg;

import java.util.LinkedHashMap;
import java.util.Map;

public class FruitBaskitBetter {
    public static void main(String[] args) throws InterruptedException {

        int [] fruits = {3,3,3,1,2,1,1,2,3,3,4};
        int k =2;
        int maxLength =0;
        int i=0, j=0;
        Map<Integer, Integer> map = new LinkedHashMap<>();

        while(j < fruits.length){
            if(map.get(fruits[j]) == null){
                map.put(fruits[j], 1);
            }else map.put(fruits[j], map.get(fruits[j]) +1);

            if(map.size() >k){
                while(map.get(fruits[i]) != null && map.size() > 2){
                    map.put(fruits[i], map.get(fruits[i])-1);
                    if(map.get(fruits[i]) == 0){
                        map.remove(fruits[i]);
                    }
                    i++;
                }
            }

            if(map.size() <= k){
                maxLength = Math.max(maxLength, j-i+1);
                j++;
            }
        }

        System.out.println(maxLength);
    }
}
