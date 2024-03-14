import java.util.*;
import java.lang.*;
import java.io.*;
public class Binary_Parity {
            public static void main (String[] args) throws java.lang.Exception{
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int t = 0; t < T; t++) {
                int n  = sc.nextInt();
                if(Integer.bitCount(n)%2==0){
                    System.out.println("EVEN");
                }else{
                    System.out.println("ODD");
                }
            }
            sc.close();
  }
}