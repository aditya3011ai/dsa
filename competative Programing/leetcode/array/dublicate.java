import java.util.*;

public class dublicate {
    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i=1; i<nums.length; i++){
            if (nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k+=1;
            }
                
        }
        return k;
    }
    public static int removeN(int nums[],int val){
            int result = 0, index = 0;
            
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[index] = nums[i];
                    index++;
                }
            }
            return index;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,3,3};
        int k = removeN(arr,3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("the k is "+ k);
    }
}