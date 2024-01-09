import java.util.*;
public class isSequence {
    public static boolean isSubsequence(String s, String t) {
        int slen = s.length();
        int tlen = t.length();

        if(slen==tlen && s==t || slen==0){
            return true;
        }
        int i=0;
        int j =0;
        while (i<slen && j<tlen) {
            if(t.charAt(j)==s.charAt(i)){
                j++;
                i++;
            }else{
                j++;
            }
        }
        if(i==slen){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
    String s = "";
    String t = "abc";
    System.out.println(isSubsequence(s, t));
  }
}