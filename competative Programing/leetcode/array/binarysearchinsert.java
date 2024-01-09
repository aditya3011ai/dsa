import java.util.*;

public class binarysearchinsert {
    public static int searchInsert(int[] nums, int target) {
        if (target < nums[0]) {
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        int i = 0, j = nums.length - 1;
        int mid = (i + j) / 2;
        while (i != mid && mid != j) {
            if (nums[i] == target) {
                return i;
            } else if (nums[j] == target) {
                return j;
            } else if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                j = mid;

            } else {
                i = mid;
            }
            mid = (i+j)/2;
        }
        if (nums[mid] == target) {
            return mid;
        }
        if(nums[mid]<target){
            mid++;
        }
        return mid;
    }

    public static void main(String[] args) {
        int arr[] = { 1,3,5};
        System.out.println(searchInsert(arr, 2));
    }
}