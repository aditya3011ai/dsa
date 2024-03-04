import java.util.*;
public class sqrofarray{
    public static int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];
        int l=0,r=nums.length-1;
        int s = nums.length-1;
        while (l<=r) {

            if(Math.abs(nums[l])>Math.abs(nums[r])){
                ans[s] = nums[l]*nums[l];
                s--;
                l++;
            }else{
                ans[s] = nums[r]*nums[r];
                s--;
                r--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
    int arr[] = {-4,-1,0,1,2,3};
    int ans[] = sortedSquares(arr);
    for (int i = 0; i < ans.length; i++) {
        System.out.print(ans[i]+" ");
    }
  }
}