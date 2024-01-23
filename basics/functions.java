import java.util.*;

public class functions {

    public static int productOF(int a, int b) {
        return a * b;
    }
    public static boolean power(int a) {
        for (int i = 0; i < Math.sqrt(a) ; i++) {
            if(Math.pow(2, i)==a){
                return true;
            }
        }
        return false;
    }

    public static int factorial(int a) {
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        if (a == 0)
            return 1;
        return factorial;
    }

    public static int binomialCoefficent(int n, int r) {
        int biCofficent = factorial(n) / (factorial(r) * factorial(n - r));
        return biCofficent;
    }

    public static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int range) {
        for (int i = 2; i <= range; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static int binaryToDec(int binaryNumber) {
        int pow = 0;
        int decNum = 0;
        while(binaryNumber>0){
            int lastDigit = binaryNumber % 10;
            decNum = decNum+(lastDigit*(int)Math.pow(2, pow));
            pow++;
            binaryNumber/=10;
        }
        return decNum;
    }
    public static int decTobin(int num){
        int binNum=0;
        int qus;
        int pow =0;
        while(num>0){
            qus = num%2;
            binNum = (binNum *10) + qus *(int) Math.pow(10, pow);
            num = num/2;
            pow++;
        }
        return binNum;
    }

    public static void hollowPatern(int row,int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
            if(i==1 || i==row || j==1 || j==col){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
            }
            System.out.println();
        }
    }

    public static void halfPyramidPattern(int row,int col){
         for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
            if(j>=col-i+1){
                System.out.print(" *");
            }else{
                System.out.print("  ");
            }
            }
            System.out.println();
        }
    }

    public static void invertedHalfPiramid(int row ){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i+1;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
     public static void zeroOnePyramid(int row ){

        for(int i=1;i<=row;i++){
    
            for(int j=0;j<i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                
                }else{
                    System.out.print(0);
            
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        System.out.println(power(16));
    }
}