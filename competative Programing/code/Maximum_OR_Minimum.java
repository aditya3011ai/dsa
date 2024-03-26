import java.util.*;
import java.lang.*;
import java.io.*;

public class Maximum_OR_Minimum {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            long n = sc.nextLong();
            int countzero = 0;
            int countone = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == 1) {
                    countone++;
                } else {
                    countzero++;
                }
            }
            if(countzero>countone) {
                System.out.println(0);
            }else{
                System.out.println(1);
            }
            // boolean toggle = true;
            // int ans = -1;
            // if (countzero <= 0) {
            //     System.out.println(1);
            //     continue;
            // }
            // if (countone <= 0) {
            //     System.out.println(0);
            //     continue;
            // }
            // while (n > 1) {
            //     if (toggle) {
            //         countzero--;
            //         toggle = false;
            //     } else {
            //         countone--;
            //         toggle = true;
            //     }
            //     if (countzero <= 0) {
            //         ans = 1;
            //         break;
            //     }
            //     if (countone <= 0) {
            //         ans = 0;
            //         break;
            //     }
            //     n--;
            // }
            // System.out.println(ans);
        }
    }
}
