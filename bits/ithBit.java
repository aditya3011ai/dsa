import java.util.*;
public class ithBit {
    public static void findith(int n,int i){
        if((n&(1<<i)) == 0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
    public static void main(String[] args) {
    findith(5, 0);
  }
}