import java.util.*;
public class Llist {
    public static class Node{
      int data;
      Node next;
      Node(int data){
        this.data=data;
        this.next = null;
      }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
      Node newNode = new Node(data);
      if(head == null){
        head = tail = newNode;
        return;
      }
      newNode.next = head;
      head = newNode;
    }
     public void addLast(int data){
      Node newNode = new Node(data);
      if(head == null){
        head = tail = newNode;
        return;
      }
      tail.next = newNode;
      tail = newNode;
    }
     public void print(){
      if(head == null){
        System.out.println("empty");
        return;
      }
      Node temp = head;
      while(temp != null){
        System.out.println(temp.data);
        temp = temp.next;
      }
    }
    public void add(int data , int idx){
      if(head == null && idx !=0){
        System.out.println("phli fursat me nikal");
        return;
      } 
      if(idx==0){
        addFirst(data);
        return;
      }
      Node newNode = new Node(data);
      int i =0;
      Node temp = head;
      while(i<idx-1){
        temp = temp.next;
        i++;
      }
      newNode.next = temp.next;
      temp.next= newNode;
    }
    public void removeFirst(){
      head = head.next;
    }
    public void removeLast(){
      Node temp = head;
      while(temp.next != tail){
        temp = temp.next;
      }
      temp.next = null;
      tail = temp;
    }
    public int helper(Node head,int key){
      if(head==null){
        return -1;
      }
      if(head.data==key){
        return 0;
      }
      int idx = helper(head.next, key);
      return idx+1;
    }
    public int recSearch(int key){

      return helper(head,key);
    }
    public void reverse(){
      Node next;
      Node curr = tail = head;
      Node prev = null;
      while(curr!=null){
        next = curr.next;
        curr.next= prev;
        prev = curr;
        curr = next;
      }
      head = prev;
    }
    public void removeNthNode(int i){
      Node temp = head;
      for (int j = 1; j < i-1; j++) {
        temp = temp.next;
      }
      temp.next = temp.next.next;
      return;
    }
    public Node findMid(Node head){
      Node fast=head;
      Node slow=head;
      while(fast != null && fast.next != null){
        fast = fast.next.next;
        slow = slow.next;
      }
      return slow;
    }
    public boolean checkPlindrome(){
      if(head == null || head.next==null){
        return true;
      }
      // step 1 Find mid
      Node midNode = findMid(head);
      // step 2 rever half list
      Node curr = midNode;
      Node next;
      Node prev = null;
      while(curr!=null){
        next=curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
      }
      Node rightHead = prev;
      Node leftHead = head;
      // step 3 compare the left and right side
      while(rightHead != null){
        if(leftHead.data != rightHead.data){
          return false;
        }
        leftHead = leftHead.next;
        rightHead = rightHead.next;

      }
      return true;
    }

    public static void main(String[] args) {
    Llist list = new Llist();
    list.addFirst(2);
    list.addFirst(1);
    list.addLast(2);
    list.addLast(1);
    System.out.println(list.checkPlindrome());
    // list.print();
  }
}