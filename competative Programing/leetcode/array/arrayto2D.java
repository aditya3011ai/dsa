import java.util.*;
public class arrayto2D {
    public static int[][] construct2DArray(int[] arr, int m, int n) {
        if(arr.length!=m*n)return new int[0][0];
        int ans[][] = new int[m][n];
        int idx =0;
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = arr[idx++];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
    int arr[]= {1,2,3,4};
    int ans[][] = construct2DArray(arr, 2, 2);
    for (int i = 0; i < ans.length; i++) {
        for (int j = 0; j < ans[0].length; j++) {
            System.out.print(ans[i][j]);
        }
        System.out.println();
    }
  }
}