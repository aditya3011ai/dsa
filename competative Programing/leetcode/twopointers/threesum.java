import java.util.*;

public class threesum {
    public static List<Integer> twoSum(int[] numbers, int target, int idx) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            if(i==idx){
                i++;
                continue;
            }
            if(j==idx){
                j--;
                continue;
            }
            if (numbers[i] + numbers[j] == target) {
                // System.out.println(numbers[i]);
                List<Integer> arr = new ArrayList<>();
                arr.add(numbers[i]);
                arr.add(numbers[j]);
                arr.add(-target);
                arr.sort(Comparator.naturalOrder());
                return arr;
            }
            if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        // System.out.println(i);
        return null;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        while (i < nums.length - 2) {
            int target = -nums[i];
                List<Integer> arr = (List<Integer>) twoSum(nums, target, i);
                if (arr != null) {
                    if(!list.contains(arr)){
                        list.add(arr);
                    }
                }
                i++;
            }
        return list;
    }

    public static void main(String[] args) {
        // int arr[] = { -1, 0, 1, 2, 0, -1, -4 };
        // int arr[] = {-2,0,1,1,2};
        int arr[] = {0,0,0,0};

        System.out.println(threeSum(arr));
    }
}