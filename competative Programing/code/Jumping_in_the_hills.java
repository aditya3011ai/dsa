import java.util.*;
import java.lang.*;
import java.io.*;

public class Jumping_in_the_hills {
    public static int getidx(int arr[], int up, int down) {
        int idx = 0;
        boolean parachuteUsed = false; 
        while (idx < arr.length - 1) { 
            if (arr[idx] == arr[idx + 1]) {
                idx++;
            } else if (arr[idx] < arr[idx + 1] && arr[idx + 1] <= arr[idx] + up) { 
                idx++;
            } else if (arr[idx] > arr[idx + 1] && arr[idx] - arr[idx + 1] <= down) { 
                idx++;
            } else if (arr[idx] > arr[idx + 1] && !parachuteUsed) { 
                idx++;
                parachuteUsed = true;
            } else {
                break; 
            }
        }
        return idx + 1;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            int up = sc.nextInt();
            int down = sc.nextInt();
            int arr[] = new int[n];
            if(arr.length==1){
                System.out.println(1);
                continue;
            }
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int ans = getidx(arr, up, down);
            System.out.println(ans);
        }
        sc.close();
    }
}