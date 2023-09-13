import java.util.*;

public class sortedRotated {
    public static int find(int arr[], int si, int ei, int tar) {
        if(si>ei)return -1;
        int mid = (si + ei) / 2;
        if (arr[mid] == tar)
            return mid;
        if (arr[si] == tar)
            return si;
        if (arr[ei] == tar)
            return ei;
        if(arr[si]<=arr[mid]){
            if(tar<arr[mid] && tar>arr[si]){
                return find(arr, si+1, mid-1, tar);
            }
            return find(arr, mid+1, ei-1, tar);
        }
        if(arr[mid]<=arr[ei]){
            if(tar>arr[mid] && tar<arr[ei]){
            return find(arr, mid+1, ei-1, tar);
            }
            return find(arr, si+1, mid-1, tar);
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[]={8,7,1,2,3,4,5,6};
        System.out.println(find(arr, 0, arr.length-1, 5));
    }
}