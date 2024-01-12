import java.util.*;
public class mostwater {
    public static int maxArea(int[] height) {
        int l = 0,r=height.length-1;
        int ans =0;
        while(l<r){
            ans = Math.max(ans,((r-l)* Math.min(height[l],height[r])));
            if(height[r]>height[l]){
                l++;
            }else{
                r--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int h[]={7,7};
        System.out.println(maxArea(h));
    
  }
}