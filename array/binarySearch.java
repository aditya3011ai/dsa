// import java.util.*;

public class binarySearch {

  public static int binSearch(int arr[], int findNum) {
    int first = 0;
    int last = arr.length - 1;
    int mid = (first + last) / 2;
    while (first <= last) {
      if (arr[first] == findNum) {
        return first;
      } else if (arr[mid] == findNum) {
        return mid;
      } else if (arr[last] == findNum) {
        return mid;
      }
      if (arr[mid] > findNum) {
        first++;
        last = mid - 1;
        mid = (last + first) / 2;
      } else {
        last--;
        first = mid + 1;
        mid = (last + mid) / 2;
      }
      if (first == last && arr[first] != findNum) {
        return -1;
      }
    }
    return -1;
  }

  public static void printPiar(int arr[]){
    for(int i=0;i<arr.length-1;i++){
      for(int j=i+1;j<arr.length;j++){
        System.out.print("("+arr[i]+","+arr[j]+") ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 5, 8, 9 };

    printPiar(arr);

  }
}