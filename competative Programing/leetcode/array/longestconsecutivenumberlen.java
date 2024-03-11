import java.util.*;
public class longestconsecutivenumberlen {
    public static int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],false);
        }
        int ans=0;
        for (int num : nums) {
            int currans =1;
            // checking for forward numbers
            int next = num+1;
            while (map.containsKey(next)&& !map.get(next)) {
                map.put(num, true);
                next++;
                currans++;
            }
            int prev = num-1;
            while (map.containsKey(prev)&& !map.get(prev)) {
                map.put(num, true);
                prev--;
                currans++;
            }
            ans = Math.max(currans, ans);
        }
        return ans;
    }
    public static void main(String[] args) {
    int arr []={1,2,100,4,200};
    System.out.println(longestConsecutive(arr));
  }
}