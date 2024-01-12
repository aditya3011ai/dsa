import java.util.*;
import java.lang.*;
import java.io.*;
public class Access_Control {
            public static void main (String[] args) throws java.lang.Exception{
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int t = 0; t < T; t++) {
                int slen = sc.nextInt();
                int x = sc.nextInt();
                String s = sc.next();
                // System.out.println(s);
                if(s.charAt(0)=='0'){
                    System.out.println("NO");
                }else{
                    int temp = x;
                    for (int i = 1; i < slen; i++) {
                    if(s.charAt(i)=='0' && temp==0){
                        System.out.println("NO");
                        i=slen;
                       temp=-1;
                    }else if(s.charAt(i)=='0'){
                        temp--;
                    }else{
                        temp = x;
                    }
                }
                    if(temp !=-1 ){
                        System.out.println("YES");
                    }
                }
               
            }
            sc.close();
  }
}