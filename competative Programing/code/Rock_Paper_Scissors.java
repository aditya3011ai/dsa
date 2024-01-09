import java.util.*;
import java.lang.*;
import java.io.*;

public class Rock_Paper_Scissors {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int rounds = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            int needtoWIn = rounds/2 +1;
            StringBuilder str2 = new StringBuilder("");
            for (int i = 0; i < str.length(); i++) {
                str2.append("P");
                if (str.charAt(i)=='R') {
                    needtoWIn--;
                }
            }
            for (int i = str.length()-1; i >= 0; i--) {
                if(needtoWIn>0 && (str.charAt(i)=='S' || str.charAt(i)=='P')){
                    str2.setCharAt(i, (str.charAt(i)=='S') ? 'R':'S');
                    needtoWIn--;        
                }
            }
            System.out.println(str2);
        }
        sc.close();
    }
}