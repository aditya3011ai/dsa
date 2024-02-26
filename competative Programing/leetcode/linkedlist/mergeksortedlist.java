import java.util.*;

public class mergeksortedlist {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        if(lists.length==0) return null;

        for (int i = 0; i < lists.length; i++) {
            ListNode list = lists[i];
            while (list != null) {
                pq.add(list.val);
                list = list.next;
            }
        }
        if(pq.isEmpty()) return new ListNode();
        ListNode ans = new ListNode(0, new ListNode());
        ListNode head = ans;
        int size = pq.size();
        for (int i = 0; i < size; i++) {
            int v = pq.poll();
            ans.next = new ListNode(v);
            ans = ans.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(6)));
        ListNode l2 = new ListNode(2, new ListNode(2, new ListNode(4)));
        ListNode list[] = new ListNode[2];
        list[0] = l1;
        list[1] = l2;
        ListNode ans = mergeKLists(list);
        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
        
    }
}