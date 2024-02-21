
import java.util.*;

public class longestSubPalindrome {
 

  public static String longestPalindrome(String s) {
    if (s.length() < 1) {
      return "";
    }
    int st = 0;
    int ed = 0;

    for (int i = 0; i < s.length(); i++) {
      int odd = findmiddle(s, i, i);
      int even = findmiddle(s, i, i + 1);
      int max = Math.max(odd, even);
      
      if(max>ed-st){
        System.out.println(max);
        st = i-((max-1)/2); // find st idx with len of substr and mid idx
        ed = i+(max/2); // find ed idx with len of substr and mid idx
      }
    }

    String str = s.substring(st, ed+1);
    return str;
  }
  public static int findmiddle(String s, int st, int ed) {
    if(st>ed){
      return 0;
    }
    while (st >= 0 && ed < s.length() && s.charAt(st) == s.charAt(ed)) {
      st--;
      ed++;
    }
    int len = ed - st - 1;

    return len;
  }
  public static void main(String[] args) {
    System.out.println(longestPalindrome(new String("babad")));
    System.out.println(longestPalindrome(new String("babbabd")));
    System.out.println(longestPalindrome(new String("racecar")));
  }
}