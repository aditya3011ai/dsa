import java.util.*;
import java.lang.*;
import java.io.*;
public class Average_Number {
            public static void main (String[] args) throws java.lang.Exception{
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int t = 0; t < T; t++) {
                int n,k,avg;
                n = sc.nextInt();
                k= sc.nextInt();
                avg = sc.nextInt();
                int arr[] = new int[n+k];
                int total =0;
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                    total += arr[i];
                }
                int ans = (Math.abs((avg*(n+k))-total)) / k;
                total += (ans * k);
                if(total/(n+k)!=avg||ans==0){
                    System.out.println(-1);
                }else{
    
                    System.out.println(ans);
                }
            }
            sc.close();
  }
}