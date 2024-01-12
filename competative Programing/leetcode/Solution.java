import java.util.*;
public class Solution {
    public static int rev(int num){
        int temp =0;
        while(num!=0){
           temp = num%10 + (temp*10);
           num = num/10;
        }
        return temp;
   }
   public static int countNicePairs(int[] nums) {
       int pairs =0;
       for(int i=0;i<nums.length-1;i++){
        for(int j=i+1;j<nums.length;j++){
          if(nums[i] + rev(nums[j]) == nums[j] + rev(nums[i])){
              pairs++;
          }
        }
       }
       return pairs;
   }
   public static int climbStairs(int n) {
        if(n==1 ||n==0){
            return 1;
        }
        
        return climbStairs(n-1)+climbStairs(n-2);
   }
    public static void main(String[] args) {
        int arr[] = {42,11,1,97};
        System.out.println(climbStairs(3));
  }
}