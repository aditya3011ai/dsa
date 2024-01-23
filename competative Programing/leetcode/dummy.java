import java.util.*;
public class dummy {
  public static void reverseString(char[] s) {
     int i=0;
     int j=s.length-1;
     while(i<j){
      char c = s[i];
      s[i] = s[j];
      s[j] = c;
      i++;
      j--;
     }
       
  }
    public static void main(String[] args) {
    char s[] = {'h','e','l'};
    reverseString(s);
    System.out.println(s);
  }

}