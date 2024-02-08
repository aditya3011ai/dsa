import java.util.*;

public class random {
    static class RandomizedSet {
        HashMap<Integer, Integer> map = new HashMap<>();
        int size = -1;

        public RandomizedSet() {

        }

        public boolean insert(int val) {
            if (map.containsValue(val)) {
                return false;
            } else {
                size++;
                map.put(val, val);
                return true;
            }
        }

        public boolean remove(int val) {
            if (map.containsValue(val)) {
                map.remove(val);
                size--;
                return true;
            } else {
                return false;
            }
        }

        public int getRandom() {
            Random r = new Random();
            int random = r.nextInt(size + 1);
            int val = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(random==0){
                val = entry.getValue();
                }
                random--;
            }
            return val;
        }
    }

    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        boolean param_1 = obj.insert(1);
        boolean param_2 = obj.insert(2);
        // boolean param_3 = obj.remove(1);
        boolean param_4 = obj.insert(2);
        // boolean param_3 = obj.remove(2);
        // int param_3 = ;
        System.out.println(param_1);
        // System.out.println(param_3);
        System.out.println(param_4);
        System.out.println(obj.getRandom());
        System.out.println(obj.getRandom());
    }
}