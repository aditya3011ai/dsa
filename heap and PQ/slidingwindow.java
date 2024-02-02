import java.util.*;

public class slidingwindow {
    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        int ans[] = new int[arr.length + 1 - k];
        int prev = arr[0]; // keep trak for element which is to be removed from heap
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < k; i++) { // add first k elemnts to the queue
            queue.add(arr[i]);
        }
        ans[0] = queue.peek();// add first maximum element from array of k length
        for (int i = k; i < arr.length; i++) { // i = next element int the Heap 
            queue.remove(prev);// remove previous element
            queue.add(arr[i]);// add next element
            ans[i + 1 - k] = queue.peek();// get the maximum number from array of k length
            prev = arr[i + 1 - k];// update prev to its next idx
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}