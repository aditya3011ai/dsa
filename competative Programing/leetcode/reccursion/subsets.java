import java.util.*;

public class subsets {
    static List<List<Integer>> ans = new ArrayList<>();
    
    public static List<List<Integer>> subsetss(int[] nums) {
        Arrays.sort(nums);
        Kamal(ans, new ArrayList<>(), 0, nums);
        return ans;
    }

    public static void Kamal(List<List<Integer>> res, List<Integer> subset, int start, int[] nums) {
        ans.add(new ArrayList<>(subset));
        for (int i = start; i < nums.length; i++) {
            if(i>start && nums[i]==nums[i-1])continue;
            subset.add(nums[i]);
            Kamal(res, subset, i + 1, nums);
            subset.removeLast();
        }
    }

    public static void main(String[] args) {
        System.out.println(subsetss(new int[]{1, 2, 3}));
    }
}