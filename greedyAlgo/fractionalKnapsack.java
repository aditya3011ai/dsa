import java.util.*;
public class fractionalKnapsack {
    public static void findMac(int value[],int weight[],int W){
        int arr[][]=new int[value.length][3];
        for (int i = 0; i < arr.length; i++) {
           arr[i][0]=value[i];
           arr[i][1]=weight[i];
           arr[i][2]=value[i]/weight[i];
        }
        Arrays.sort(arr, Comparator.comparingInt((int[] o) -> o[2]).reversed());
        int maxValue=0;
        for(int i = 0; i < arr.length; i++) {
            if(W-arr[i][1]<0){
                maxValue+= arr[i][2] * W;
                W=0;
            }else{
                maxValue += arr[i][0];
                W = W-arr[i][1];
            }
        }
        System.out.println(maxValue);
    }
    public static void main(String[] args) {
    int val[]={60,100,120};
    int w[]={10,20,30};
    int cap = 50;
    findMac(val, w, cap);
  }
}