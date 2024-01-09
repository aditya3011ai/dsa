import java.util.*;
import java.lang.*;
import java.io.*;
public class Codechef {
    public static int strStr(String str, String str2) {

        int j = 0;
          for (int i = 0; i < str.length(); i++) {
             if(str.charAt(i)==str2.charAt(j)){
                j++;
                if(j==str2.length()){
                    return Math.abs((str2.length()-1)-i);
                }
             }else{
                    j=0;
                }
            }
        return -1;
    }
            public static void main (String[] args) throws java.lang.Exception{
           
           System.out.println(strStr("mississippi", "issip"));
          
  }
}