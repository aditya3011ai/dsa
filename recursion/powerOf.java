import java.util.*;
public class powerOf {
    public static int power(int n,int i){// O(logn)
        if(i==1){
            return n;
        }
        int halfPower = power(n, i/2);
        int halfPowersq = halfPower * halfPower;
        if(i%2!=0){
            halfPowersq = halfPowersq * n;
        }
        return halfPowersq;
     }
    public static void main(String[] args) {
    System.out.println(power(2, 4));
  }
}