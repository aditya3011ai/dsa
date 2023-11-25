
import java.util.*;
public class buyandSellStocks {
    public static int buyandsell(int arr[]){
        if(arr.length==1){
            return 0;
        }
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minPrice){// update Min Price
                minPrice=arr[i];
            }
            int currProfit =arr[i]- minPrice;// Today's Profit
            if(currProfit>maxProfit){   
                maxProfit=currProfit;// Maxium Profit
            }
        }   
        return maxProfit;
    }

    public static boolean findDublicate(int arr[]){
        Arrays.sort(arr);
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,45,7,3,75};
        System.out.println(buyandsell(arr));
  }
}
