import java.util.*;
public class checkPowerOfTwo {
    public static boolean check (int n){
        if((n &(n-1))==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
    System.out.println(check(3));
 }
}