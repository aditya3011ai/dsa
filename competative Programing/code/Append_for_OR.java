import java.util.*;
import java.lang.*;
import java.io.*;
public class Append_for_OR {
            public static void main (String[] args) throws java.lang.Exception{
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int t = 0; t < T; t++) {
                int n ,y;
                n = sc.nextInt();
                y = sc.nextInt();
                int arr[] = new int[n];
                int or=0;
                for (int i = 0; i < n; i++) {
                    int x = sc.nextInt();
                    arr[i] = x;
                    or |= x;
                }
                if((or|y)!=y){
                    System.out.println(-1);
                }else{
                    System.out.println(y-or);
                }
            }
            sc.close();
  }
}