import java.util.*;
public class iterateticket {
    public static void main(String[] args) {
    HashMap<String,String> map = new HashMap<String,String>();
    map.put("Chennai", "Bengaluru");
    map.put("Goa","Chennai" );
    map.put("Delhi", "Goa");
    map.put("Mumbai", "Delhi");
    Set<String> set = map.keySet();
    String st = "";
    for (String key : set) {
        if(!map.containsValue(key)){
            st = key;
        }
    }
    for (int i=0;i<=map.size();i++) {
        System.out.print(st+"-> ");  
        st = map.get(st);
    }

  }
}