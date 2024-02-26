import java.util.*;
public class reverselist {
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
      public static ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode node = head;
        ListNode prev = null;
        while (node!=null) {
           ListNode next = node.next;
           node.next = prev;
           prev = node;
           node = next;
        }
        return prev;
      }
      public static ListNode reverseKGroup(ListNode head, int k) {
        if(head==null) return null;
        int nodes =0;
        ListNode node = head;
        while (node!=null) {
            node = node.next;
            nodes++;
        }
        // while () {
        //     if(k>nodes) break;
        //     int n = k;
        //     while (n>0) {
                
        //     }
        // }
        return null;
      }
    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode node = reverseList(head);
        while (node!=null) {
            System.out.println(node.val);
            node = node.next;
        }
  }
}