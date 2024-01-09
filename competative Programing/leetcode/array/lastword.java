import java.util.*;
public class lastword {
    public static int lengthOfLastWord(String s) {
        int length =0;
        for (int i = s.length()-1; i >=0 ; i--) {
            if(s.charAt(i)==' ' && length==0){
                continue;
            } else if(s.charAt(i)==' '&& length!=0){
                break;
            }
            length++;
        }
        return length;
    }   
     public static void main(String[] args) {
    System.out.println(lengthOfLastWord("Hello World "));
  }
}