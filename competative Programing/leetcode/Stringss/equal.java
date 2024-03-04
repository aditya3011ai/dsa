import java.util.*;
public class equal {
    public static  boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch!='#'){
                stack.push(ch);
            }else{
                if(!stack.isEmpty()) stack.pop();
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if(ch!='#'){
                stack2.push(ch);
            }else{
                if(!stack2.isEmpty()) stack2.pop();
            }
        }

        return stack.equals(stack2);
    }   
    public static void main(String[] args) {
    String s ="ad#c";
    String t ="ac#c";
    System.out.println(backspaceCompare(s, t));
  }
}