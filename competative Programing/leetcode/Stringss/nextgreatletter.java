import java.util.*;
public class nextgreatletter {
    public static char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            if(target-'a'<letters[i]-'a'){
                return letters[i];
            }
        }
        return letters[0];
    }
    public static void main(String[] args) {
    char ch[] = {'x','x','y','y'};
    System.out.println(nextGreatestLetter(ch,'x'));
  }
}