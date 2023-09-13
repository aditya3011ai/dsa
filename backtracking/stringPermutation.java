import java.util.*;
public class stringPermutation {
    public static void printPermutation(String str ,String ans){
      if(str.length()==0){
        System.out.println(ans);
        return;
      }
      for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);// picking a char to fix at idx 0
        String newStr = str.substring(0,i)+str.substring(i+1); // removig ch from th string
        printPermutation(newStr,ans+ch);// adding ch to anser and passing rest of the string 
      }
     }
    public static void main(String[] args) {
    printPermutation(new String("abcd"),new String(""));
  }
}