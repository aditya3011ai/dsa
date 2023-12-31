import java.util.*;

public class Llist {
  public static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  public void addFirst(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public void addLast(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;
  }

  public void print() {
    if (head == null) {
      System.out.println("empty");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  public void add(int data, int idx) {
    if (head == null && idx != 0) {
      System.out.println("phli fursat me nikal");
      return;
    }
    if (idx == 0) {
      addFirst(data);
      return;
    }
    Node newNode = new Node(data);
    int i = 0;
    Node temp = head;
    while (i < idx - 1) {
      temp = temp.next;
      i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;
  }

  public void removeFirst() {
    head = head.next;
  }

  public void removeLast() {
    Node temp = head;
    while (temp.next != tail) {
      temp = temp.next;
    }
    temp.next = null;
    tail = temp;
  }

  public int helper(Node head, int key) {
    if (head == null) {
      return -1;
    }
    if (head.data == key) {
      return 0;
    }
    int idx = helper(head.next, key);
    return idx + 1;
  }

  public int recSearch(int key) {

    return helper(head, key);
  }

  public void reverse() {
    Node next;
    Node curr = tail = head;
    Node prev = null;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
  }

  public void removeNthNode(int i) {
    Node temp = head;
    for (int j = 1; j < i - 1; j++) {
      temp = temp.next;
    }
    temp.next = temp.next.next;
    return;
  }

  public Node findMid(Node head) {
    Node fast = head;
    Node slow = head;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    return slow;
  }

  public boolean checkPlindrome() {
    if (head == null || head.next == null) {
      return true;
    }
    // step 1 Find mid
    Node midNode = findMid(head);
    // step 2 rever half list
    Node curr = midNode;
    Node next;
    Node prev = null;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    Node rightHead = prev;
    Node leftHead = head;
    // step 3 compare the left and right side
    while (rightHead != null) {
      if (leftHead.data != rightHead.data) {
        return false;
      }
      leftHead = leftHead.next;
      rightHead = rightHead.next;

    }
    return true;
  }

  public static void removeLoop() {
    Node slow = head;
    Node fast = head;
    boolean isLoop = false;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        isLoop = true;
        break;
      }
    }
    if (isLoop) {
      Node prev = fast;
      slow = head;
      if (head == fast) {
        while (fast != head) {
          prev = fast;
          fast = fast.next;
        } 
      } else {
        while (slow != fast) {
          prev = fast;
          fast = fast.next;
          slow = slow.next;
        }
      }
      prev.next = null;
    }

  }

  public static boolean isLooped() {
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return true;
      }
    }
    return false;
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
    Node fast = head;
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
    // Llist list = new Llist();
    // list.addFirst(2);
    // list.addFirst(1);
    // list.addLast(2);
    // list.addLast(1);

    // System.out.println(list.checkPlindrome());
    // list.print();
    head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = head;
    removeLoop();
    System.out.println(isLooped());
  }
}
