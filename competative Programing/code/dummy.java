import java.util.*;
import java.lang.*;
import java.io.*;

public class dummy {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int t = 0; t < T; t++) {
      int n = sc.nextInt();

      long arr[] = new long[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextLong();
      }

      // Calculate the forward array
      long forward[] = new long[n];
      forward[0] = arr[0];
      long maxSales = arr[0];
      long sum =0;
      for (int i = 0; i < n; i++) {
        sum +=(long) arr[i];
        forward[i] =(long) sum;
        maxSales = Math.max(maxSales, forward[i]);
      }

      // Calculate the maximum possible total sales
      long ans = maxSales;
      for (int i = 0; i < n; i++) {
        ans = Math.max(ans,(long) (forward[i] + arr[i]));
      }
      System.out.println(ans);
    }
    sc.close();
    // Scanner sc = new Scanner(System.in);
    // int T = sc.nextInt();
    // for (int t = 0; t < T; t++) {
    // int n = sc.nextInt();

    // int arr[] = new int[n];
    // for (int i = 0; i < n; i++) {
    // arr[i] = sc.nextInt();
    // }
    // int forward[] = new int[n];
    // int sum = 0;
    // for (int i = 0; i < n; i++) {
    // sum += arr[i];
    // forward[i] = sum;
    // }
    // int ans = 0;
    // for (int i = 0; i < n; i++) {
    // ans = Math.max(ans, forward[i] + arr[i]);
    // }
    // System.out.println(ans);
    // }
    // sc.close();
  }
}
// System.out.println(Math.ceil((float) x/y ));