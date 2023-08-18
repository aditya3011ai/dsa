import java.util.*;
public class stringCompression {
    public static String compress(String str){
        StringBuilder compressedStr = new StringBuilder("");
        int count =1;

        for(int i=0;i<str.length();i++){
           if(i==str.length()-1){
                compressedStr.append(str.charAt(i)+Integer.toString(count));
                break;
            }
            if(str.charAt(i+1)!=str.charAt(i) && i!=str.length()-1){
                 
                compressedStr.append(str.charAt(i)+Integer.toString(count));
                count =0;
            }
            
            count++;
        }
        return compressedStr.toString();
    }
    public static void main(String[] args) {
    System.out.println(compress("aaabbbccc"));
  }
}
