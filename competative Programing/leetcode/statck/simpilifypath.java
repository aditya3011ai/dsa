import java.util.*;

public class simpilifypath {
    public static String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        String val[] = path.split("/");
        String ans = "";
        for (String v : val) {
            if (v.equals(".")) {
                continue;
            }
            if (v.equals("..")) {
                if (!s.isEmpty()) {
                    s.pop();
                    s.pop();
                }
            } else {
                if (!v.equals("")) {
                    s.push(v);
                }
            }
        }
        if(!s.isEmpty()){
            s.pop();
        }
        return "/" + String.join(ans, s);
    }

    public static void main(String[] args) {
        String s = "/a//a//b//./aa/";
        System.out.println(simplifyPath(s));
    }
}