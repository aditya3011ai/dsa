import java.util.*;

public class movezeros {
    public static void moveZeroes(int[] nums) {
        if (nums.length == 1 || nums.length == 0)
            return;
        int l = 0;
        int r = 1;

        while (r < nums.length && l < nums.length) {
            if (nums[l] == 0) {
                while (r < nums.length && nums[r] == 0) {
                    r++;
                }
                nums[l] = nums[r];
                nums[r] = 0;
            }
            l++;
            r++;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 12, 15 };
        moveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}