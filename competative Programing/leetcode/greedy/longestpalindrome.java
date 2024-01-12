import java.util.*;
public class longestpalindrome {
    public static int longestPalindrome(String s) {
        if(s.length()==1) return 1;
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        String s2 = new String(ch);
        int i =0;
        int ans =1;
        while (i<s2.length()-1) {
            if(s2.charAt(i)==s2.charAt(i+1)){
                ans+=2;
                i+=2;
            }else{
                i++;
            }
        }
        if(ans>s.length()){
            ans=s.length();
        }
        return ans;
    }
    public static void main(String[] args) {
    char ch[] = {'a','b','c','A','C'};
    Arrays.sort(ch);
    String s = "abca";
    System.out.println(longestPalindrome(s));
  }
}