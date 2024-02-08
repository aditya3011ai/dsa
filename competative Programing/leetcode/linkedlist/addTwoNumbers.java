package linkedlist;

import java.util.*;

public class addTwoNumbers {
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

  public static ListNode addTwoNums(ListNode l1, ListNode l2) {
    ListNode head = new ListNode(0);
    ListNode l3 = head;
    int carry = 0;
    while (l1 != null || l2 != null) {
      int v1 = (l1 != null) ? l1.val : 0;
      int v2 = (l1 != null) ? l2.val : 0;
      if(l1!=null)l1 = l1.next;
      if(l2!=null)l2 = l2.next;
      int currSum = v1 + v2 + carry;
      carry = currSum / 10;
      l3.next = new ListNode(currSum % 10);
      l3 = l3.next;
    }
    if (carry > 0) {
      l3.next = new ListNode(carry);
    }
    return head.next;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
    ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
    ListNode ans = addTwoNums(l1, l2);
    while (ans != null) {
      System.out.print(ans.val + " ");
      ans = ans.next;
    }
  }
}