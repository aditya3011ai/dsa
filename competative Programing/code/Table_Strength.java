import java.util.*;
import java.lang.*;
import java.io.*;
public class Table_Strength {
            public static void main (String[] args) throws java.lang.Exception{
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int t = 0; t < T; t++) {
                int n = sc.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                } 
                Arrays.sort(arr);
                int ans =0;
                int legs = 1;
                for (int i = arr.length-1; i>=0; i--) {
                    ans = Math.max(ans , arr[i]*legs);
                    legs++;
                }
                System.out.println(ans);
            }
            sc.close();
  }
}