import java.util.*;
public class oneplus {
    public static int[] plusOne(int[] digits) {
        boolean onlynine = true;
       for (int i = 0; i < digits.length; i++) {
        if (digits[i]!=9) {
            onlynine = false;
            break;
        }
       }
       if (onlynine) {
        int[] result = new int[digits.length+1];
        result[0]=1;
        return result;

       }
        for (int i=digits.length-1; i >=0; i--) {
            if (digits[i]==9) {
                digits[i] =0;
            }else{
                digits[i]++;
                break;
            }
        }
        return digits;
    }
    public static void main(String[] args) {
        int arr[]= {1,9,9,9};
        int arr2[] = plusOne(arr);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
  }
}