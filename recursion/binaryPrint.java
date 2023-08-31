import java.util.*;
public class binaryPrint {
    public static void printBinary(int n,int lastDigit,String str){
        if(n<=0){
            System.out.println(str);
            return;
        }
        printBinary(n-1, 0, str+"0");
        if(lastDigit==0){
            printBinary(n-1, 1, str+("1"));
        }
        
     }
    public static void main(String[] args) {
    printBinary(3, 0, new String(""));
  }
}