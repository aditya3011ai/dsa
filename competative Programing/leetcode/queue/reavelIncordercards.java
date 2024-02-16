package queue;

import java.util.*;

public class reavelIncordercards {
    public static int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int ans[] = new int[deck.length];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < deck.length; i++) {
            q.add(i);
        }
        int i = 0;
        boolean toggle = true;
        while (!q.isEmpty() && i < ans.length) {
            if (toggle) {
                ans[q.peek()] = deck[i];
                q.remove();
                i++;
                toggle = false;
            } else {
                int last = q.remove();
                q.add(last);
                toggle = true;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 17, 13, 11, 2, 3, 5, 7 };
        int ans[] = deckRevealedIncreasing(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}