package ArraysPkg;

public class MaxProd {
    public static void main(String[] args) {
        int [] nums = {1,0,-1,2,3,-5,-2};

        int maxProduct = Integer.MIN_VALUE;
        int prev = 1;
        int sufff = 1;
        for (int k = 0; k < nums.length; k++) {
            if (prev ==0) prev = 1; // Reset previous product if zero is encountered
            if (sufff ==0) sufff = 1; // Reset previous product if zero is encountered

            prev = prev * nums[k];
            sufff = sufff * nums[nums.length -k -1];
            System.out.println("sufff: " + sufff + " prev: " + prev + " k: " + k);
            maxProduct = Math.max(maxProduct, Math.max(prev,sufff));
        }

        System.out.println("Maximum product of two elements in the array: " + maxProduct);
    }
}
