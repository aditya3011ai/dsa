import java.util.*;
import java.lang.*;
import java.io.*;
public class aplus {
            public static void main (String[] args) throws java.lang.Exception{
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int t = 0; t < T; t++) {
                int len = sc.nextInt();
                Integer a[] = new Integer[len];
                Integer b[] = new Integer[len];
                for (int i = 0; i < len; i++) {
                  a[i] = sc.nextInt();
                }
                for (int i = 0; i < len; i++) {
                  b[i] = sc.nextInt();
                }
                Arrays.sort(a);
                Arrays.sort(b,Collections.reverseOrder());
                boolean found = true;
                for (int i = 1; i < b.length; i++) {
                    if(a[i-1]+b[i-1]!=a[i]+b[i]){
                        found = false;
                    }
                }
                if (found) {
                    for (int i = 0; i < b.length; i++) {
                        System.out.print(a[i]+" ");
                    }
                     System.out.println();
                    for (int i = 0; i < b.length; i++) {
                        System.out.print(b[i]+" ");
                    }
                     System.out.println();
                   
                }else{
                    System.out.println(-1);
                }
            }
            sc.close();
  }
}