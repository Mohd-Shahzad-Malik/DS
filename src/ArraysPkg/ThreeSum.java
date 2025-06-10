package ArraysPkg;

public class ThreeSum {
    public static void main(String[] args) {
        int k  = 8;
        int [] arr = {1, 1, 1, 2, 2, 2, 3,3,3,4,4,4,5,5};

        for (int i = 0; i < arr.length; i++) {
            if(i > 0 && arr[i] == arr[i-1]) continue; // Skip duplicates
            for (int j = i+1; j < arr.length; j++) {
                if(j > i+1 && arr[j] == arr[j-1]) continue; // Skip duplicates
                int r= args.length-1;
                int l = j+1;

                if(arr[i] + arr[j] + arr[k] + arr[l] == k) {
                    System.out.println("Triplet found: " + arr[i] + ", " + arr[j] + ", " + arr[l]);

                    while (l < r && arr[l] == arr[l-1]) {
                        l++; // Skip duplicates
                    }
                    j++;
                    k--;
                } else if(arr[i] + arr[j] + arr[k] + arr[l] < k) {
                    l++;
                } else {
                    r--;

                }

            }
        }

    }
}
