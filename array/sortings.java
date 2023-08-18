import java.util.*; 
public class sortings {

  public static void insertionSort(int arr[]) {
    for (int i = 1; i < arr.length; i++) {
      int cur = arr[i];
      int prev = i - 1;
      while (prev >= 0 && arr[prev] > cur) {
        arr[prev + 1] = arr[prev];
        prev--;
      }
      arr[prev+1] = cur;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }
  public static void countingSort(int arr[]){
    int largest = Integer.MIN_VALUE;
    for (int i = 0;i<arr.length;i++){
      largest = Math.max(largest , arr[i]);
    }
    int count[] = new int[largest]; 
    for(int i = 0;i<count.length;i++){
      count[arr[i]]++; 
    } 
    int j = 0;
    for (int i=0;i<count.length;i++){
      while(count[i]>0){
        arr[j] = i;
        j++;
        count[arr[i]]--;
      }
    }
     for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }
  public static void main(String[] args) {
    int arr[] = { 4, 2, 8, 3, 3,2,5,10 };
    insertionSort(arr);
  }
}
