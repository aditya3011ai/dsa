import java.util.*;
public class findDisappeared {
    static class NumArray {
        public int[] prefix;

        public NumArray(int[] nums) {
            prefix = new int [nums.length];
            int sum =0;
            for(int i=0;i<nums.length;i++){
                sum +=nums[i];
                prefix[i] = sum;
            }
        }
        
        public int sumRange(int left, int right) {
            int r = prefix[right];
            int l;
            if(left>0){
                 l = prefix[left-1];
            }else{
                 l = 0;
            }
            return r - l;
        }
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            int idx = (Math.abs(nums[i]) - 1);
            if(nums[idx] > 0) {
                nums[idx] = nums[idx] * (-1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>=0){
                res.add(i+1);
            }
        }
        return res;
    }
    public static void main(String[] args) {
    int arr[] = {4,3,2,7,8,2,3,1};
    // List<Integer> list = findDisappearedNumbers(arr);
    // System.out.println(list);
    // System.out.println(Math.abs(8-1));
    NumArray obj = new NumArray(arr);
     int param_1 = obj.sumRange(0,2);
     System.out.println(param_1);
  }
}