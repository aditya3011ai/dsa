import java.util.*;
public class conatinsdublicates {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i=1;
        while(i<nums.length){
            if(nums[i]==nums[i-1]){
                return true;
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
    
  }
}