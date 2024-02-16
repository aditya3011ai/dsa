package Stringss;

import java.util.*;
public class letternumberCombo {
    public static List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        if(digits.length()==0)return ans;
        ans.add("");
        HashMap<Integer,String> map = new HashMap<>();
        map.put(2,"abc" );
        map.put(3,"def" );
        map.put(4,"ghi" );
        map.put(5,"jkl" );
        map.put(6,"mno" );
        map.put(7,"pqrs" );
        map.put(8,"tuv" );
        map.put(9,"wxyz" );
        char[] nums = digits.toCharArray();
        for (int i = 0; i < digits.length(); i++) {
            int idx = Character.getNumericValue(nums[i]);
          while(ans.peek().length()==i){
            String perm = ans.remove();
            for (char c : map.get(idx).toCharArray()) {
                ans.add(perm+c);
            }
          }
        }
        return ans;
    }
    public static void main(String[] args) {
    letterCombinations("23");
  }
}