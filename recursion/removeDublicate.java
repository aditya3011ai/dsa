import java.util.*;
public class removeDublicate {
    public static void removeDublicateChar(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        if(map[str.charAt(idx)-'a']==true){
            removeDublicateChar(str, idx+1, newStr, map);
        }else{
            map[str.charAt(idx)-'a']= true;
            removeDublicateChar(str, idx+1, newStr.append(str.charAt(idx)), map);
        }
     }
    public static void main(String[] args) {
    String str = "hellowworld";
    StringBuilder newstr = new StringBuilder("");
    boolean map[] = new boolean[26];
    removeDublicateChar(str, 0, newstr, map);
  }
}