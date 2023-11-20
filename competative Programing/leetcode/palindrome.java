import java.util.*;
public class palindrome {
     public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int newx = 0;
        int temp =x;
        int i=0;
        while (temp != 0) {
            newx = temp%10 + (newx * 10);
            temp = temp/10;
            i++;
        }
        if(x==newx){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
    System.out.println(isPalindrome(-121));
  }
}