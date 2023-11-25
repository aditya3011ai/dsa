import java.util.*;
public class rotatearr {
    public static void rotate(int[] nums, int k) {
        if(k<=0){
            return;
        }
        if(k>nums.length){
            k=(k+(nums.length))%(nums.length);
        }
        int j=0;
        int arr[] = new int[nums.length];
        int i=nums.length-k;
       while(i<nums.length){
           arr[j]=nums[i];
           j++;
           i++;
       }
       i=0;
       while(i<=nums.length-k-1){
           arr[j]=nums[i];
           i++;
           j++;
       }
     for (i = 0; i < arr.length; i++) {
       nums[i]=arr[i];
    }
    }
    public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6};
    rotate(arr, 3);
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
  }
}