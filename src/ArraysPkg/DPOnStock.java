package ArraysPkg;

import java.sql.SQLOutput;

public class DPOnStock {
    public static void main(String[] args) {
        int[] prices = {3,2,6,5,0,3};
        int mini = prices[0];
        int maxProfit = 0;
        int n = prices.length;

        for (int i = 1; i < n; i++) {
            int cost = prices[i] - mini;
            maxProfit = Math.max(maxProfit, cost);
            mini = Math.min(mini, prices[i]);

        }

        System.out.println("Maximum Profit: " + maxProfit);


    }
}
