import java.util.*;
class Codechef1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int A =scanner.nextInt();
            int B =scanner.nextInt();
            if(A%2==0){
                A--;
            }
            if(B%2!=0){
                B--;
            }
            if(A>B){
                System.out.println("Limak");
            }else {
                System.out.println("Bob");
            }

        }
       scanner.close();
  }
}