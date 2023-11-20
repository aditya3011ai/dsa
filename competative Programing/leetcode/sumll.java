import java.util.*;
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class sumll {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(2);
        ll.addLast(4);
        ll.addLast(3);
        LinkedList<Integer> ll2 = new LinkedList<>();
        ll2.addLast(5);
        ll2.addLast(6);
        ll2.addLast(4);
        int l1 = 0;
        int power = 0;
        while (!ll.isEmpty()) {
            l1 = ll.pop()+ (l1* 10);
            power++;
        }
        int l2 = 0;
        power = 0;
        while (!ll2.isEmpty()) {
            l2 = ll2.pop() + (l2* 10);
            power++;
        }   
        int sum = l1 + l2;
        System.out.println(sum);

        ListNode ll3 = new ListNode(sum%10);
        sum = sum/10;
        while (sum != 0) {
            ll3.next = new ListNode(sum%10);
            sum= sum/10;
        }
       while (! (ll3 == null)) {
            System.out.println(ll3.val);
            ll3 = ll3.next;
        }
    }
}