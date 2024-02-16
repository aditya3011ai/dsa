import java.util.*;
public class wordpattern {
    public static  boolean word(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        String str [] = s.split(" ");
        int i=0;
        
        while (i<pattern.length()&& i<str.length ) {
            if(str[i]=="")continue;
            if(!map.containsKey(pattern.charAt(i))){
                if(map.containsValue(str[i])){
                    System.out.println(1);
                    return false;
                }else{
                    map.put(pattern.charAt(i), str[i]);
                }
            }else{
                if(!map.get(pattern.charAt(i)).equals(str[i])){
                    return false;
                }
            }
            i++;
        }
        if(i<str.length) return false;
        return true;
    }
    public static void main(String[] args) {
    String s = "dog cat dog cat";
    String str = "abba";
    System.out.println(word(str,s));
  }
}