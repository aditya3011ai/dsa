import java.util.*;
public class tripletSum {
  public static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> l2 = new ArrayList<List<Integer>>();
        Arrays.sort(arr);
        int i=0,k=arr.length-1,j=(i+k)/2;
        while (i!=j && j!=k) {
          j=(i+k)/2;
          List<Integer> l1 = new ArrayList<Integer>();
          while (j!=k && j!=i) {
            if(arr[i]+arr[j]+arr[i]==0){
              l1.add(arr[i]);
              l1.add(arr[j]);
              l1.add(arr[k]);
              l2.add(l1);
              System.out.println(l1+" hlo");
            }else if(arr[i]+arr[j]+arr[i]>0){
              j--;
            } else{
              j++;
            }
          }
           i++;
           k--;
        }
        return l2;
  }
    public static void main(String[] args) {
    int arr[] = {-1,0,1,2,-1,-4};
    System.out.println(threeSum(arr));
  }
}