import java.util.*;

public class maxavg {
    public static double findMaxAverage(int[] nums, int k) {
        if (nums.length < k)
            return 0;
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double curravg =(double)sum / (double) k;
        double maxavg = curravg;
        int idx =0;
        if(k==nums.length) return maxavg;

        for (int i = k; i < nums.length; i++) {
            sum -=nums[idx++];
            sum+=nums[i];
            curravg =(double) sum / (double) k;
            maxavg = Math.max(maxavg, curravg);
        }
        return maxavg;
    }

    public static void main(String[] args) {
        int arr [] = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(arr, 4));
    }
}