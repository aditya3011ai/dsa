import java.util.*;
import java.lang.*;
import java.io.*;

public class dynamic {
    public static int fib(int n, int f[]) {
        if (n == 0 || n == 1)
            return n;
        if (f[n] != 0) {
            return f[n];
        }
        f[n] = fib(n - 1, f) + fib(n - 2, f);
        return f[n];
    }

    public static void fibTabulation(int n) {
        int dp[] = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(dp[n]);
    }

    public static void climbingStairs(int n) {
        int dp[] = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1]+ dp[i-2];
        }
        System.out.println(dp[n]);
    }

    public static void main(String[] args) throws java.lang.Exception {
       climbingStairs(4);
    }
}