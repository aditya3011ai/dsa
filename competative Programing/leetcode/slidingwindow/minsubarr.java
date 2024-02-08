import java.util.*;
public class minsubarr {
    public static int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=-1;
        int ans=Integer.MAX_VALUE;
        int curr_sum = 0;
        while (j<nums.length) {
            if(curr_sum<target){
                j++;
                if(j<nums.length)
                curr_sum += nums[j];
            }else{
                ans = Math.min(ans, (j-i)+1);
                curr_sum= curr_sum-nums[i];
                i++;
            }
        }
        if(ans==Integer.MAX_VALUE){
            ans = 0;
        }
        return ans;
    }
    public static void main(String[] args) {
    int arr[]= {2,3,1,2,4,3};
    System.out.println(minSubArrayLen(7, arr));
  }
}