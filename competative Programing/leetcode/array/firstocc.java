import java.util.*;
import java.lang.*;
import java.io.*;

public class firstocc {
    public static int strStr(String str1, String str2) {
       for (int i = 0; i <= str1.length()-str2.length(); i++) {
            String str = str1.substring(i, i+str2.length());
            if(str2.compareTo(str)==0){
                return i;
            }    
       }
        return -1;
    }

    public static void main(String[] args) throws java.lang.Exception {
        String string1 = "iiniiniinin";
        String s2 = "inin";
        System.out.println(strStr(string1,s2));
    }
}