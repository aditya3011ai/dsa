import java.util.*;
public class clearLastiBits {
    public static int clearLastBits(int n,int i){
        return n & (~0<<i);
    }
    public static void main(String[] args) {
    System.out.println(clearLastBits(15, 2));
  }
}