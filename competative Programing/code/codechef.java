import java.util.*;
import java.lang.*;
import java.io.*;

class codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int x = 0; x < T; x++) {
            int n = sc.nextInt();
            int arr[] = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
            }

            int ans = 0;

            for (int i = 1; i < n; i++) {
                if (arr[i] == i) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    ans++;
                }
            }
            if (arr[n] == n) {
                ans++;
            }
            System.out.println(ans);
        }

    }
}