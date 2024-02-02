import java.util.*;
public class largestsubarray {
    public static void main(String[] args) {
    HashMap<Integer,Integer> map = new HashMap<>();
    int arr []={0,2,-2,7,-1,15,-1,1};
    int len = 0;
    int sum =0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
        if(!map.containsKey(sum)){
          map.put(sum, i);
        }else{
          int idx = map.get(sum);
          if(arr[idx]==0){
            if(idx==0){
              len = Math.max(i+1, len);
            }
            len = Math.max(i, len);
          }else
          len = Math.max(i-idx, len);
        }
    }
    System.out.println(len);
  }
}