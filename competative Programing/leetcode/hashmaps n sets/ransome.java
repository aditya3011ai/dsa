import java.util.*;

public class ransome {
    public static boolean canConstruct(String s, String m) {
        if (s.length() > m.length()){return false;}
        char ss[] = s.toCharArray();
        char mm[] = m.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(mm);
        
        int i = 0;
        int j = 0;
        int len = mm.length;
        while (j < len && i < ss.length) {
            if (ss[i] != mm[j]) {
                j++;
            } else {
                i++;
                j++;
            }
        }
         if (i < ss.length) {
                return false;
            }
        return true;
    }

    public static void main(String[] args) {
        String s = "abc";
        String r = "cba";
        System.out.println(canConstruct(s, r));
    }
}