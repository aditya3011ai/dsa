import java.util.*;

public class var1 {
  public static void main(String[] args) {
      System.out.println("Enter a Number");
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      if(num1==-1) return;
      System.out.println("Enter another Number");
      int num2 = sc.nextInt();
      System.out.println("Enter operation :- +,-,*,/");
      char operator = sc.next().charAt(0);

      switch (operator) {
        case '+':
          System.out.println(num1 + num2);
          break;
        case '-':
          System.out.println(num1 - num2);
          break;
        case '*':
          System.out.println(num1 * num2);
          break;
        case '/':
          System.out.println(num1 / num2);
          break;
        default:
          System.out.println("Invalid operator");
      }
  }
}