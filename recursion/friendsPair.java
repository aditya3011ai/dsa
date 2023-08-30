import java.util.*;
public class friendsPair {
    public static int pair(int n){
        if(n== 1 || n==2){
            return n;
        }
        if(n<0){
            return 0;
        }
        // choice 
        // Single
        int single = pair(n-1);
        // Pair
        // a,b,c
        // n-1 = 2 more ways for pairing x rest of the rest of the ways of pair
        int pair = pair(n-2)*n-1;
        return single + pair;
     }
    public static void main(String[] args) {
    System.out.println(pair(4));
  }
}