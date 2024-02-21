import java.util.*;
public class groupanagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for (String string : strs) {
            char[] ch = string.toCharArray();
            Arrays.sort(ch);
            String str = String.valueOf(ch);
            if(map.containsKey(str)) {
                map.get(str).add(string);
            }else{
                map.put(str, new ArrayList<>());
                map.get(str).add(string);
            }
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
    // String strs[] = {"eat","tea","tan","ate","nat","bat"};
    String strs[] = {""};
    List<List<String>> list = groupAnagrams(strs);
    System.out.println(list);
  }
}