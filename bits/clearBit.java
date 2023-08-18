import java.util.*;
public class clearBit {
    public static int clearithBit(int n,int i){
        return n & ~1<<i;
    }
    public static void main(String[] args) {
    System.out.println(clearithBit(10, 1));
  }
}