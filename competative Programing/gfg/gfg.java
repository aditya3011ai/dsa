import java.util.*;
import java.lang.*;
import java.io.*;

public class gfg {
    public static int maxProfit(int n, int[] arr) {
        int prev = arr[0];
        int size = -1;
        int profit = 0;
        int profits[] = new int[n];
        int i = 1;
        while(i<n) {
            if (prev>=arr[i]) {
                size++;
                profits[size] = profit;
                profit = 0;
            } else {
                profit += arr[i] - prev;
            }
            prev = arr[i];
            i++;
        }
       if(size+1<n){
         size++;
        profits[size] = profit;
       }
       Arrays.sort(profits);
       
        return profits[n-1]+profits[n-2];
    }

    public static void main(String[] args) throws java.lang.Exception {
        int arr[] = { 10 ,22 ,5, 75, 65 ,80 };
        int x = 6;
        System.out.println(maxProfit(x, arr));
    }
}