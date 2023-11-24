import java.util.*;
public class removeDubII {
    public static int removeDuplicates(int[] nums) {
        int i = 1;
        int j = 1;
        int count = 0;
        while(j < nums.length){
            if(nums[j-1] == nums[j] ){
                count++;  
            }
            else{
                count = 0;
            }
            if(count <=1){
                nums[i] = nums[j];
                i++;
            }
            j++;
            
        } 
        return i;
 
    }
    public static void main(String[] args) {
        int nums[]={0,0,1,1,1,2,3,3};
        int k= removeDuplicates(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println("K-"+ k);
  }
}