package linkedlist;

import java.util.*;

public class deletenodestwo {
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

    public static ListNode deleteDuplicatestwo(ListNode head) {
        ListNode node = head;
        HashMap<Integer, Boolean> set = new LinkedHashMap<>();
        while (node != null) {
            if (set.containsKey(node.val)) {
                set.put(node.val, false);
            } else {
                set.put(node.val, true);
            }
            node = node.next;
        }
        ListNode newHead = new ListNode(-1);
        node = newHead;
        for (Integer integer : set.keySet()) {
            if (set.get(integer)) {
                node.next = new ListNode(integer);
                node = node.next;
            }
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(5)))));
        ListNode node = deleteDuplicatestwo(head);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}