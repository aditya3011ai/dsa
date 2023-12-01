
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class palinfrome
{
	
	 public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkPlindrom(int num) {
        int realNum = num;
        int reverseint = 0;
        while (num != 0) {
            int temp = num % 10;
            reverseint = (reverseint * 10) + temp;
            num = num / 10;
        }
        if (reverseint == realNum) {
            return true;
        }
        return false;
    }
    public static boolean digit(int n){
        if(n>=2 && n<=9 || n>=100 && n<=999 || n>=10000 && n<=99999){
            return false;
        }else{
            return true;
        }
    }
    public static void check(int n) {
        int j=2;
        int i=0;
        int arr[]=new int[n];
         while(i<n) {
            if (isPrime(j) && checkPlindrom(j)) {
                arr[i]=j;
                i++;
            }
        }
        int odd=0;
        int even =0;
        for (int k = 0; k < arr.length; k++) {
            if(digit(arr[k])){
                even++;
            }else{
                odd++;
            }
        }
       System.out.println(even+ " "+ odd);
    }

   public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        check(size);
    }
}
