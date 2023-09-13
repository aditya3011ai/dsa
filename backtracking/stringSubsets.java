import java.util.*;

public class stringSubsets {
  public static void allSubsets (String str,String ans,int idx){
    if(idx==str.length()){// Base case
      if(ans.length()==0) {
        System.out.println("0");
        return;
      }
      System.out.print(ans+" ");
      return;
    }
    // add this char
    allSubsets(str, ans+str.charAt(idx), idx+1);
    // dont add this char
    allSubsets(str, ans, idx+1);
 }
    public static void main(String[] args) {
    allSubsets(new String("abc"),new String(""),0);
  }
}