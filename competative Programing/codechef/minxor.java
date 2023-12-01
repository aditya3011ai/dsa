import java.util.*;
import java.lang.*;
import java.io.*;

class minxor {
    public static int minXor(int[] arr) {
        int ans = 0;
        HashMap<Integer, Boolean> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
            max = Math.max(max, arr[i]);
            map.put(arr[i], true);
        }
        if (ans == 0) {
            return 0;
        } else if (map.containsKey(ans)) {
            return 0;
        } else {
            ans = ans ^ max;
            return ans;
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans[] = new int[t];
        for (int i = 0; i < t; i++) {
            int s = sc.nextInt();
            int arr[] = new int[s];
            for (int j = 0; j < s; j++) {
                arr[j]=sc.nextInt();
            }
            ans[i]=minXor(arr);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
