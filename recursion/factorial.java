import java.util.*;
public class factorial {
    public static int factorialOf(int n){
        if(n<0){
          return 0;
        }
        if(n==0){
            return 1;
        }
     return n* factorialOf(n-1);
     }

     public static void printDes(int n){
        if(n ==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printDes(n-1); 
      }
    public static void main(String[] args) {

    System.out.println(factorialOf(4));
  }
}