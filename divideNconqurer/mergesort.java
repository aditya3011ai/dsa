import java.util.*;

public class mergesort {
    public static void sort(int arr[], int si, int ei) {
        if (si == ei) {
            return;
        }
        int mid = (si + ei) / 2;
        // left Part
        sort(arr, si, mid);
        sort(arr, mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge (int arr[],int si,int mid,int ei){ 
        int temp[] = new int [ei-si+1];
        int i= si;//idx for left side
        int j=mid+1; // idx fir right side
        int ti =0; // idx for temp array
        while(i<=mid && j<=ei){
            if(arr[i]>=arr[j]){
                temp[ti]=arr[j];
                j++;
            }else{
                temp[ti]=arr[i];
                i++;
            }
            ti++;
        }
        while(i<=mid){
            temp[ti]=arr[i];
            i++;
            ti++;
        }
        while(j<=ei){
            temp[ti]=arr[j];
            j++;
            ti++;
        }
        for(ti=0,i=si;ti<temp.length;ti++,i++){
            arr[i]=temp[ti];
        }
     }

    public static void main(String[] args) {
        int arr []= {5,9,2,7,0,4};
        sort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}