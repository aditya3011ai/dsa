import java.util.*;
public class firstmissingpositive {
    public static int firstMissingPositive(int[] nums) {
        if(nums.length == 0) return 1;
        Arrays.sort(nums);
        int ans =1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==ans){
                ans++;
            }
            if(nums[i]>ans){
                return ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
    int arr[] = {-1,3,4,0,1,2};
    System.out.println(firstMissingPositive(arr));
  }
}