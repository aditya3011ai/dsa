import java.util.*;
public class findDublicate {
    public static int findDuplicate(int[] nums) {
        for(int i:nums)
        {
           int idx = Math.abs(i);
            if(nums[idx]<0)
                return idx;
            nums[idx]= -nums[idx];
        }
        return -1;
    }
    public static List<Integer> findDuplicate2(int[] nums) {
        List<Integer> ans = new LinkedList<>();

        for(int i:nums)
        {
           int idx = Math.abs(i)-1;
            if(nums[idx]<0)
                ans.add(idx+1);
            nums[idx]= -nums[idx];
        }
        return ans;
    }
    public static void main(String[] args) {
    int arr [] = {4,3,2,7,8,2,3,1};
    System.out.println(findDuplicate2(arr));
  }
}