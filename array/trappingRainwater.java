import java.util.*;
public class trappingRainwater {

    public static int trappingwater(int arr[]){
        if(arr.length<=1){
            return 0;
        }
        int leftMax[] = new int[arr.length]; 
        int rightMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        rightMax[arr.length-1] = arr[arr.length-1];

        for(int i=1;i<arr.length;i++){
            leftMax[i] = Integer.max(leftMax[i-1], arr[i]);
            rightMax[arr.length-i-1] =  Integer.max(rightMax[arr.length-i], arr[arr.length-i-1]);
        }
        int trappedWater = 0;
        for(int i =0;i<arr.length;i++){
            int waterLevel = Integer.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel-arr[i];
        }

    
        return trappedWater;
    }
    public static int trappingRainWater(int arr[]){
        if(arr.length<=1){
            return 0;
        }
        int n = arr.length;
        int leftMax[] = new int[arr.length];
        int rightMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        rightMax[n-1] = arr[n-1];
        // getting the right and left Max Boundaries
        for(int i =1;i<n;i++){
            leftMax[i] = Integer.max(leftMax[i-1], arr[i]);
            rightMax[n-i-1] = Integer.max(rightMax[n-i], arr[n-i-1]);
        }
        int trappedWater =0;
        for(int i=0;i<n;i++){
            int minBoundary = Integer.min(leftMax[i], rightMax[i]);
            trappedWater += minBoundary-arr[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        System.out.println(trappingRainWater(arr));
  }
}
