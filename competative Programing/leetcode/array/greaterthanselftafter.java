import java.util.*;
public class greaterthanselftafter {
    public static List<Integer> countSmaller(int[] nums) {
        List<Integer> res = new LinkedList<>();
        List<Integer> sortedlist = new ArrayList<>();
        for(int i=nums.length - 1;i>=0;i--){
            int index = insertAndGetIndex(sortedlist,nums[i]);
            res.add(0,index);
        }
        return res;
    }
    public static int insertAndGetIndex(List<Integer> list,int n){
        if(list.size()==0){
            list.add(n);
            return 0;
        }
        if(list.getLast()<=n){
            list.addLast(n);
            return list.size()-1;
        }
        if(list.getFirst()>=n){
            list.addFirst(n);
            return 0;
        }
        int l = 0;
        int r =list.size()-1;
        while (r-l>1) {
            int mid = (l+r)/2;
            if(n<=list.get(mid)){
                r = mid;
            }else{
                l = mid;
            }
        }
        if(n<=list.get(l)){
            list.add(l,n);
            return l;
        }else if(n>list.get(r)){
            list.add(r+1, n);
            return r+1;
        }else{
            list.add(r,n);
            return r;
        }
    }
    public static void main(String[] args) {
    int nums[] = {5,2,6,1};
    System.out.println(countSmaller(nums));
  }
}