import java.util.*;

public class template {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int list[] = new int[len];
    int count = 0;
    for (int i = 0; i < len; i++) {
      list[i] = sc.nextInt();
    }

    for (int i = 0; i < len; i++) {
      for (int j = 0; j < Integer.toString(list[i]).length(); j++) {
        if (Integer.parseInt(String.valueOf((Integer.toString(list[i]).charAt(j)))) == 4) {
          count++;
        }
      }
      System.out.println(count);
      count = 0;
    }
  }
}