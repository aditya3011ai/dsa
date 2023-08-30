import java.util.*;
public class tilling {
    public static int tillingFor (int n){
        if(n<=0){
            return 0;
        }
        
        if(n==1 || n==0){
        return 1;
        } 
        return tillingFor(n-1)+tillingFor(n-2);
    }
    public static void main(String[] args) {
    System.out.println(tillingFor(2));
  }
}