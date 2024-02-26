import java.util.*;
public class isCycle {
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
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    } 
    public static boolean isPalindrome(ListNode head) {
        ArrayList<Integer> res = new ArrayList<>();
        while (head!=null) {
            res.add(head.val);
        }
        int l =0;
        int r = res.size();
        while (l<r) {
            if(res.get(l)!=res.get(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static  ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
    
  }
}