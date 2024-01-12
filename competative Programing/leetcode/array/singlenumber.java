import java.util.*;
public class singlenumber {

    public static int singleNumber(int[] nums) {
       Arrays.sort(nums);
       int i=0;
       Stack<Integer> stack = new Stack<Integer>();
       while(i<nums.length){
        if(stack.isEmpty()){
           stack.push(nums[i]);
        }else if(stack.peek()==nums[i]){
            stack.pop();
        }else{
            stack.push(nums[i]);
        }
        i++;
       }
       return stack.peek();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,3,4,4};
        System.out.println(singleNumber(arr));
  }
}