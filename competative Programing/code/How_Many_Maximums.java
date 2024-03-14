import java.util.*;
import java.lang.*;
import java.io.*;
public class How_Many_Maximums {
            public static void main (String[] args) throws java.lang.Exception{
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int t = 0; t < T; t++) {
                int n = sc.nextInt();
                String str = sc.next();
                if (n==1) {
                    System.out.println(1);
                    continue;
                }
                int i=0;
                int ans =0;
                while (i<str.length()) {
                    while (i<n-1 && str.charAt(i)!='1') {
                        i++;
                    }
                    if(i<str.length())ans++;
                    while (i<str.length() && str.charAt(i)!='0') {
                        i++;
                    }
                }
                if(str.charAt(str.length()-1)=='0'){
                    ans++;
                }
                System.out.println(ans);
            }
            sc.close();
  }
}