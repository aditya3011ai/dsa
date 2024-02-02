import java.util.HashMap;
import java.util.Set;
public class iterate {
    public static void main(String[] args) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    map.put(1, -1);
    map.put(2, -1);
    map.get(1);
    // map.remove(1);
    map.isEmpty();
    map.containsKey(1);
    map.containsValue(1);
    int s= map.size();
    Set<Integer> key = map.keySet();
    for(int k: key){
        System.err.println(map.get(k));
    }

  }
}