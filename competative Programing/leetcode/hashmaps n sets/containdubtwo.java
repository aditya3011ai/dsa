import java.util.*;
public class containdubtwo {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        // this is like sliding window k+1 is size of the window and if dublicate is present int the window of size k the return true;
        // we have use Hashset to remove and check the elements
        // L is the left side pointer which remove the element fromt the window and r will add the element to the elements in the window
        HashSet<Integer> set = new HashSet<>();
        int l = 0;
        for (int r=0; r<nums.length; r++) {
            if(r-l>k){
                set.remove(nums[l]);
                l++;
            }
            if(set.contains(nums[r])){
                return true;
            }
            set.add(nums[r]);
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,1,2,3};
        System.out.println(containsNearbyDuplicate(nums,2));
  }
}