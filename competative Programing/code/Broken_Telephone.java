import java.util.*;
import java.lang.*;
import java.io.*;
public class Broken_Telephone {
            public static void main (String[] args) throws java.lang.Exception{
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int t = 0; t < T; t++) {
                int n = sc.nextInt();
                int arr[] = new int[n];
                int ans=0;
                
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                }
                int count[] = new int[n];
                for (int i = 1; i < arr.length; i++) {
                    if(arr[i]!=arr[i-1]){
                        count[i] =1;
                        count[i-1] =1;
                    }
                }
                for (int i = 0; i < count.length; i++) {
                    if(count[i] ==1){
                        ans++;
                    }
                }
                System.out.println(ans);
            }
            sc.close();
  }
}