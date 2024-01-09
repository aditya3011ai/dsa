import java.util.*;
import java.lang.*;
import java.io.*;

public class dummy {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int x = sc.nextInt();
      System.out.println((int) Math.ceil((float) x/2 )+" "+x);
    }
    sc.close();
  }
}

// System.out.println(Math.ceil((float) x/y ));