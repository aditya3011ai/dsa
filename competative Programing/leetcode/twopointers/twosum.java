import java.util.*;
public class twosum {
    public static int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        while (i<j) {
            if(numbers[i]+numbers[j]==target){
                System.out.println(numbers[i]+" "+numbers[j]);
                int arr[] ={numbers[i]+1,numbers[j]+1};
                return arr;
            }
            if(numbers[i]+numbers[j]>target){
                j--;
            }else{
                i++;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        twoSum(arr, 9);
  }
}