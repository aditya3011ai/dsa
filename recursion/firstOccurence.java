import java.util.*;
public class firstOccurence {
    public static int printIndextOf(int arr[],int n,int i){
        if(i>=arr.length){
            return -1;
        }
        if(arr[i]==n){
            return i;
        }
        return printIndextOf(arr, n, i+1);
     }
    public static void main(String[] args) {
    int arr[]={1,2,4,6,3,4}; 
    System.out.println(printIndextOf(arr, 3, 0));

  }
}