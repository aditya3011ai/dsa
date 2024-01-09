import java.util.*;

public class candydistri {
  public static int candy(int[] ratings) {
    int len = ratings.length;
    int left[] = new int[len];
    int right[] = new int[len];
    for(int i = 1; i < len; i++){
      if(ratings[i]>ratings[i-1]){
        left[i] = Math.max(left[i], left[i-1]+1);
      }
    }
    for (int i = len-2; i >=0; i--) {
      if(ratings[i]>ratings[i+1]){
        right[i] = Math.max(right[i], right[i+1]+1);
      }
    }
    int ans = 0;
    for (int i = 0; i < len; i++) {
      ans += Math.max(right[i], left[i])+1;
    }
    return ans;
  }

  public static void main(String[] args) {
    int arr[] = { 1,3,2,2,1 };
    candy(arr);
  }
}