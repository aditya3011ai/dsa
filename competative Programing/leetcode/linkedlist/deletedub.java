package linkedlist;


import java.util.*;
public class deletedub {
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
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while (node!=null) {
            while (node.next!=null && node.val==node.next.val) {
                node.next  = node.next.next;
            }
            node = node.next;
        }
        return head;
    }
    public static void main(String[] args) {
    ListNode head = new ListNode(1,new ListNode(1,new ListNode(2,new ListNode(2,new ListNode(3)))));
    ListNode node = deleteDuplicates(head);
    while (node!=null) {
        System.out.println(node.val);
        node = node.next;
    }
  }
}