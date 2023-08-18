import java.util.*;
public class isPrime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean isPrime = true;
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if(n==2){
            break;
        }
        if (n % i == 0) {
            isPrime = false;
            break;
        }
    }
    System.out.println(isPrime);
  }
}