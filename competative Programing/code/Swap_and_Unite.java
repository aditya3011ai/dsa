import java.util.*;
import java.lang.*;
import java.io.*;

public class Swap_and_Unite {
    
public static int count(char ch, String s) {
    int curr = 0;
    int max = 0;
    for (int i = 0; i < s.length(); i++) {
        if (ch == s.charAt(i)) {
            curr++;
        } else {
            curr = 0;
        }
        if (curr > max) {
            max = curr;
        }
    }
    return max;
}

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            String s = sc.next();
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (!map.containsKey(ch)) {
                    map.put(ch, 1);
                } else {
                    map.put(ch, map.get(ch) + 1);
                }
            }
            if (map.containsValue(1)) {
                System.out.println(0);
            } else {
                int ans = s.length();
                for (char ch : map.keySet()) {
                    int x = count(ch ,s);
                    ans = Math.min(ans,map.get(ch)-x);
                }
                System.out.println(ans);
            }

        }
        sc.close();
    }
}