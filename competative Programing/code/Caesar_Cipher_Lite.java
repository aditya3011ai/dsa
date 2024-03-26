import java.util.*;
import java.lang.*;
import java.io.*;
public class Caesar_Cipher_Lite {
    public static int getans(int s,int enc){
            int shifts =0;
            if(s<enc && enc-s%3==0){
                return (enc-s)/3;
            }
            // System.out.println(enc+ " "+s);
            while (s!=enc) {
                shifts++;
                s +=3;
                if(s>=26){
                    s= s-26;
                }
            }
            return shifts;
    }
            public static void main (String[] args) throws java.lang.Exception{
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int t = 0; t < T; t++) {
                int n = sc.nextInt();
                String s = sc.next();
                String p = sc.next();
                char str[] = s.toCharArray();
                char enc[] = p.toCharArray();
                int ans[] = new int[n];
                for (int i = 0; i < ans.length; i++) {
                    ans[i] = getans(str[i]-'A', enc[i]-'A');
                }
                for (int i = 0; i < ans.length; i++) {
                    System.out.print(ans[i]+" ");
                }
                System.out.println();
            }
            sc.close();
  }
}