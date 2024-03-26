import java.util.*;
import java.lang.*;
import java.io.*;

public class code {
    public static boolean check(int a, int b) {
        int A = a - b;
        int B = a + b;
        int C = a * b;

        if (Math.abs(A-B) == Math.abs(B-C)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws java.lang.Exception {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int ans = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]%2!=0){
                    continue;
                }
                for (int j = i + 1; j < arr.length; j++) {
                    if(arr[j]%2!=0){
                        continue;
                    }
                    if(check(arr[i], arr[j])){
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }

        sc.close();
    }
}
