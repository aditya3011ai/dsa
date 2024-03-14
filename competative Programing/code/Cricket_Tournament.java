import java.util.*;
import java.lang.*;
import java.io.*;
public class Cricket_Tournament {
            public static void main (String[] args) throws java.lang.Exception{
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int t = 0; t < T; t++) {
                int n,m;
                n = sc.nextInt();
                m = sc.nextInt();
                
                if(n-1>=m){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
            sc.close();
  }
}