import java.util.*;
public class longestvaild {
    public static int longestValidParentheses(String str) {
        int max =0;
        int open=0;
        int close =0;
        // this loop check for ')' in valid parantheis if there is one then it ignore it and count or check after that in the string 
        for (int i = 0; i < str.length(); i++) { 
            if(str.charAt(i)=='('){
                open++;
            }else{
                close++;
            }
            if(close==open){
                max = Math.max(max, open+close);
            }
            if(close>open){
                close=open=0;
            }
        }
        // this loop check for '(' in valid parantheis if there is one then it ignore it and count or check after that in the string
        open=close=0;
        for (int i = str.length()-1; i>=0; i--) {
            if(str.charAt(i)=='('){
                open++;
            }else{
                close++;
            }
            if(close==open){
                max = Math.max(max, open+close);
            }
            if(close<open){
                close=open=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
    String s = "(((())()";
    int ans =longestValidParentheses(s);
    System.out.println(ans);
  }
}