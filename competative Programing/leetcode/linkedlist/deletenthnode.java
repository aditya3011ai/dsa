
import java.util.*;
public class deletenthnode {
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
    public static  ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        int count =0;
        ListNode node = head;
        while (node !=null) {
            count++;
            node = node.next;
        }
        if(n==count){
            return head.next;
        }
        if(count ==1 && n==1) return null;
        node = head;
        int k = count-n;
        while (k-->1) {
            node = node.next;
        }
        if(node.next!=null)node.next = node.next.next;
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode node = removeNthFromEnd(head,1);
        while (node!=null) {
            System.out.println(node.val);
            node = node.next;
        }
  }
}