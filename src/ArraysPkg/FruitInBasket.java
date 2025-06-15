package ArraysPkg;

import java.util.HashSet;
import java.util.Set;

public class FruitInBasket {
    public static void main(String[] args) {
        int [] fruits = {3,3,3,1,2,1,1,2,3,3,4};
        int k =2;
        int maxLength =0;

        for (int i = 0; i < fruits.length; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i; j < fruits.length; j++) {
                set.add(fruits[j]);
                if(set.size() <= 2){
                   maxLength = Math.max(maxLength, j-i+1) ;
                }  else break;
            }
        }
        System.out.println(maxLength);
    }
}
