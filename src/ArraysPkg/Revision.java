//package ArraysPkg;
//
//import java.util.*;
//
//public class Revision {
//    public static void main(String[] args) {
//        int [] arr = {1,1,1,0,0,0,1,1,1,1,0};
//        int k = 2;
//
//        int i =0;
//        int j=0;
//        int maxLength = 0;
//        int count = 0;
//        while(j< arr.length){
//            if(arr[j] == 0) count++;
//
//            if(count <=k){
//                maxLength = Math.max(maxLength, j-i+1);
//                j++;
//            } else if(arr[i] == 0){
//                i++;
//                count--;
//                j++;
//            }else {
//                j++;
//                i++;
//            }
//        }
//
//        System.out.println(maxLength);
//        int maxLength = 0;
//        int [] arr = {2,0,0,3};
//        int k = 3;
//        int i =0, j=0;
//        int sum = arr[j];
//       while(j < arr.length){
//           if(i <= j && sum > k ){
//               sum = sum - arr[i];
//               i++;
//           }
//           if(sum == k){
//               maxLength = Math.max(maxLength,j-i+1);
//               j++;
//           }
//           j++;
//           if(j < arr.length){
//               sum  = sum + arr[j];
//           }
//
//       }
//        System.out.println(maxLength);
//
//    }
//}
