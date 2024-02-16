import java.util.*;

public class windowmax {
    public static int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[n - k + 1];
        Deque<Integer> maxInWindow = new ArrayDeque<>();

        // Initialize maxInWindow with the first k elements
        for (int i = 0; i < k; i++) {
            while (!maxInWindow.isEmpty() && arr[i] >= arr[maxInWindow.peekLast()]) {
                maxInWindow.removeLast();
            }
            maxInWindow.addLast(i);
        }

        // The maximum element in the first window
        ans[0] = arr[maxInWindow.peekFirst()];

        // Process the remaining elements
        for (int i = k; i < n; i++) {
            // Remove elements that are out of the current
            // window
            while (!maxInWindow.isEmpty() && maxInWindow.peekFirst() <= i - k) {
                maxInWindow.removeFirst();
            }

            // Remove elements that are not needed in the
            // current window
            while (!maxInWindow.isEmpty() && arr[i] >= arr[maxInWindow.peekLast()]) {
                maxInWindow.removeLast();
            }

            maxInWindow.addLast(i);
            ans[i - k + 1] = arr[maxInWindow.peekFirst()];
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int ans[] = maxSlidingWindow(nums, 3);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i] + "");
        }

    }
}