import java.util.*;
public class oddNeven {
    public static void oddoeEve(int n){
      if((n&1)==0){
        System.out.println("Even");
      }else{
        System.out.println("Odd");
      }
    }
    public static  void main(String[] args) {
      oddoeEve(0);
      oddoeEve(19);
      oddoeEve(4);
  }
}