import java.util.*;
public class missingnumber {
    public static  int missingNumbers(int[] nums) {
        int sum =nums.length;
        for (int i = 0; i < nums.length; i++) {
            sum += (i-nums[i]);
        }
        return sum;
    }
    public static void main(String[] args) {
    int arr[] = {1,2};
    System.out.println(missingNumbers(arr));
  }
}