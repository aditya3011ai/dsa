import java.util.*;
public class sumOfNaturalNum {
    // Sum of First n Natural Numbers Function
    public static int sumOfFirst (int n){
        if(n<1){
            return -1;
        }
        if(n==1){
            return 1;
        }
        return n+ sumOfFirst(n-1);
     }
    public static void main(String[] args) {
    System.out.println(sumOfFirst(4));
  }
}