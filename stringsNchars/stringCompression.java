import java.util.*;
public class stringCompression {
    public static String compress(String str){// O(N)
        // ans String
        StringBuilder compressedStr = new StringBuilder("");
        // this count keep track for the characters cout // defualt count will be 1
        int count =1;

        for(int i=0;i<str.length();i++){
            // if we are on the last character then append the count with the current character
           if(i==str.length()-1){
                compressedStr.append(str.charAt(i)+Integer.toString(count));
                break;
            }
            // check if the work which is coming next is the same or not 
            if(str.charAt(i+1)!=str.charAt(i)){
                compressedStr.append(str.charAt(i)+Integer.toString(count));
                // make count to zero bcoz it will automatically increment after this if block
                count =0;
            }
            // increase the number of counts of charachters
            count++;
        }
        return compressedStr.toString();
    }
    public static void main(String[] args) {
    System.out.println(compress("aaabbbccc"));
  }
}
