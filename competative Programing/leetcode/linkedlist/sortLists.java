import java.util.*;
public class sortLists {
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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        ListNode temp = head;
        while(temp.next!=null){
            queue.add(temp.val);
            temp = temp.next;
        }
        queue.add(temp.val);
        temp = head;
        while(!queue.isEmpty()){
            temp.val = queue.poll();
            temp = temp.next;
        }
        return head;  
    }
    public static void main(String[] args) {
    
  }
}