import java.util.*;
import java.lang.*;
import java.io.*;

public class toggle {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int t = 0; t < T; t++) {

      int n = sc.nextInt();
      int arr[] = new int[n + 1];
      int i = 1;
      int j = n;
      // Toggle system
      boolean toggle = true;
      for (int m = n; m > 0; m--) {
        if (toggle) {
          arr[j] = m;
          toggle = false;
          j--;
        } else {
          arr[i] = m;
          toggle = true;
          i++;
        }
      }

    }
  }
}