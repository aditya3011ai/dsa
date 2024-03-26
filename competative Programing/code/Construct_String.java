import java.util.*;
import java.lang.*;
import java.io.*;
public class Construct_String {
            public static int getchar(int c){
                if(c==1)return 1;
                while (c>=3) {
                    c-=2;
                }
                return c;
            }
            public static void main (String[] args) throws java.lang.Exception{
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int t = 0; t < T; t++) {
                int n = sc.nextInt();
                String s  = sc.next();
                char[] ch = s.toCharArray();
                StringBuilder ans =new StringBuilder("");
                int count=1;
                int i=0;
                while(i<ch.length-1) {
                    while (i<ch.length-1&& ch[i]==ch[i+1]) {
                        count++;
                        i++;
                    }
                    int j =getchar(count);
                    while (j>0) {
                        j--;
                        ans.append(ch[i]);
                    }
                    i++;
                    count=1;
                }
                if (i==ch.length-1) {
                    ans.append(ch[i]);
                }
                System.out.println(ans);
            }
            sc.close();
  }
}