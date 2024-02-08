import java.util.*;
public class lonegstSubstringlen {
    public static int lengthOfLongestSubstring(String s) {
        int a=0;
        int b=0;
        int max =0;
        HashSet<Character> set = new HashSet<Character>();
        while (b<s.length()) {
            if(!set.contains(s.charAt(b))){
                set.add(s.charAt(b));
                max = Math.max(max, set.size());
                b++;
            }else{
                set.remove(s.charAt(a));
                a++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring(new String("abcabac")));
  }
}