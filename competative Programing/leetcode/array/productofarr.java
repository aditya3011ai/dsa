import java.util.*;
public class productofarr {
    public static int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int sum=1;
        for (int i = 0; i < ans.length; i++) {
            ans[i]=1;
        }
        for (int i = 1; i < ans.length; i++) {
            ans[i] = sum*nums[i-1];
            sum *= nums[i-1];
        }
        sum = nums[nums.length-1];
        for (int i = ans.length-2; i >=0; i--) {
            ans[i] = nums[i + 1] * ans[i];
            nums[i] = nums[i] * nums[i + 1];
        }  
        return ans;
    }
    public static void main(String[] args) {
    int arr[] = {1,2,3,4};
    int ans[]=productExceptSelf(arr);
    for (int i = 0; i < ans.length; i++) {
        System.out.print(ans[i]+" ");
    }
  }
}