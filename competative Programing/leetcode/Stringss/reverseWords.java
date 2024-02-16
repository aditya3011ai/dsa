package Stringss;

import java.util.*;

public class reverseWords {
    public static String reverseWord(String s) {
        String str[] = s.split(" ");
        String ans ="";
        for (int i = str.length-1; i>=0; i--) {
            if(str[i]!="" && i!=0)ans = ans.concat(str[i]+" ");

            if(i==0) ans = ans.concat(str[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWord(s));
    }
}