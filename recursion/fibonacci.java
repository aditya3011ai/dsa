import java.util.*;

public class fibonacci {
    public static int nthFibonacci(int n) {
        if(n<=0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        int fibNum = nthFibonacci(n-2) + nthFibonacci(n-1);
        return fibNum;  
    }

    public static void main(String[] args) {
        System.out.println(nthFibonacci(9));
    }
}