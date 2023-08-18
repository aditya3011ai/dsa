import java.util.*;

public class maxSubarray {

    public static int maxSubarr(int arr[]) {
        int maxSubarray = Integer.MIN_VALUE;
        int currSubarr = 0;
        if (arr.length == 1) {
            maxSubarray = arr[0];
        }
        for (int i = 0; i < arr.length - 1; i++) {
            // to get the All possible subarrys of i index we will replace currsubarr with arr[i];
            currSubarr = arr[i];
            //if i index is > maxSubarr  then we will replace it with arr[i]
            if (maxSubarray < currSubarr) {
                maxSubarray = currSubarr;
            }
            for (int j = i + 1; j < arr.length; j++) {
                currSubarr += arr[j];
                if (maxSubarray < currSubarr) {
                    maxSubarray = currSubarr;
                }
            }
        }
        return maxSubarray;
    }

    public static int kandensSubarr(int arr[]) {
        if(arr.length==1){
            return arr[0];
        }
        int maxSubarr = Integer.MIN_VALUE;
         int subArr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (subArr + arr[i] < arr[i]) {
                subArr = arr[i];
                if (subArr > maxSubarr) {
                    maxSubarr = subArr;
                }
            } else {
                subArr += arr[i];
                if (subArr > maxSubarr) {
                    maxSubarr = subArr;
                }
            }
        }
        return maxSubarr;
    }

    public static void main(String[] args) {
        int arr[] = { -1, -3, 6, -2,-1,1 ,5, -3, 5 };
        System.out.println(kandensSubarr(arr));
    }
}