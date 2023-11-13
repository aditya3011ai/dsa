import java.util.*;

public class Llist {

  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  public void addFirst(int data) {
    // create new Node
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public static void addLast(int data) {
    // create new Node
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
    }
    tail.next = newNode;
    tail = newNode;
  }

  public void printList() {
    if (head == null) {
      System.out.println("empty List");
      return;
    }

    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }

  }

  public void zigzag() {
    // find Mid
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    Node mid = slow;
    // reverse 2nd half
    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    Node left = head;
    Node right = prev;
    Node nextL, nextR;
    // zig-zag merge
    while (left != null && right != null) {
      nextL = left.next;
      left.next = right;
      nextR = right.next;
      right.next = nextL;

      left = nextL;
      right = nextR;
    }
  }

  public Node getMid(Node head) {
    Node slow = head;
    Node fast = head.next;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public Node merge(Node head1, Node head2) {
    Node mergeLL = new Node(-1);
    Node temp = mergeLL;
    while (head1 != null && head2 != null) {
      if (head1.data <= head2.data) {
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
      } else {
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
      }
    }
    while (head1 != null) {
      temp.next = head1;
      head1 = head1.next;
      temp = temp.next;
    }
    while(head2 != null){
       temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
    }
    return mergeLL.next;
  }

  public Node mergeSort(Node head) {
    if (head == null || head.next == null) {
      return head;
    }
    Node mid = getMid(head);
    Node rightHead = mid.next;
    mid.next = null;
    Node newLeft = mergeSort(head);
    Node newRight = mergeSort(rightHead);

    return merge(newLeft, newRight);
  }

  public static void main(String[] args) {
    Llist newLL = new Llist();
    newLL.addFirst(1);
    newLL.addFirst(2);
    newLL.addFirst(3);
    newLL.addFirst(4);
    newLL.addFirst(5);
    newLL.printList();
    newLL.head = newLL.mergeSort(newLL.head);
    newLL.printList();
  }
}