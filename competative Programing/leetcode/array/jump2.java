import java.util.*;
public class jump2 {
    public static int jump(int nums[]){
      int far = 0;
      int lastjump = 0;
      int jumps =0;
      for (int i = 0; i < nums.length; i++) {
        far = Math.max(far, i+nums[i]);
        if(i==lastjump){
          jumps++;
          lastjump = far;
          if(lastjump>=nums.length-1){
            return jumps;
          }
        }
      }
      return jumps;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,2,3,1,1,2};
    System.out.println(jump(arr));
  }
}