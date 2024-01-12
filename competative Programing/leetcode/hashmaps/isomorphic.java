import java.util.*;

public class isomorphic {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        HashMap<Character, Character> map2 = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i)) && !map2.containsKey(t.charAt(i))) {
                map.put(s.charAt(i), t.charAt(i));
                map2.put(t.charAt(i), s.charAt(i));
            } else {
                if (map.containsKey(s.charAt(i))) {
                    if (map.get(s.charAt(i)) != t.charAt(i)) {
                        return false;
                    }
                }
                if(map2.containsKey(t.charAt(i))){
                    if( map2.get(t.charAt(i)) != s.charAt(i)){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "bada";
        String t = "daba";
        System.out.println(isIsomorphic(s, t));
    }
}