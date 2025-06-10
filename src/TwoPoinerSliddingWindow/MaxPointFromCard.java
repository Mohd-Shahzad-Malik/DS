package TwoPoinerSliddingWindow;

public class MaxPointFromCard {
    public static void main(String[] args) {
        int [] cards = {6, 2, 3, 4, 7, 2, 1, 7,1};

        int k =4;
        int lSum = 0;
        int rSum = 0;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            lSum = lSum + cards[i];
        }
        maxSum = lSum;

        int index = cards.length-1;
        for(int i = k-1; i >=0 ; i--) {
            lSum = lSum - cards[i];
            rSum = rSum + cards[index--];
            maxSum = Math.max(maxSum, lSum + rSum);
        }

        System.out.println(maxSum);
    }
}
