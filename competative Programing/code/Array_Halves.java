import java.util.*;
import java.lang.*;
import java.io.*;
public class Array_Halves {
            public static boolean check(int arr[],int n){
                int amax =0;
                int bmax=0;
                for (int i = 0; i < n; i++) {
                    amax = Math.max(amax,arr[i]);
                }
                for (int i = n; i < n*2; i++) {
                    bmax = Math.max(bmax,arr[i]);
                }
                return amax<bmax;
            }
            public static void main (String[] args) throws java.lang.Exception{
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int t = 0; t < T; t++) {
                int n = sc.nextInt();
                int arr[] = new int[n*2];
                for (int i = 0; i < n*2; i++) {
                    arr[i] = sc.nextInt();
                }
                int ans =0;
                if(check(arr, n)){
                    System.out.println(ans);
                }
            }
            sc.close();
  }
}