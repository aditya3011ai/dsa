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

  public static void addFirst(int data){
    //create new Node
    Node newNode = new Node(data);
    if(head == null){
      head = tail = newNode;
    }
    newNode.next=head;
    head = newNode;
  }
  public static void addLast(int data){
    //create new Node
    Node newNode = new Node(data);
    if(head == null){
      head = tail = newNode;
    }
    tail.next=newNode;
    tail = newNode;
  }
  public static void printList(Llist list){
    if(head==null){
      System.out.println("empty List");
      return;
    }
    
    Node temp = head;
    while(temp != null){
      System.out.println(temp.data);
      temp = temp.next;
    }
    
  }

  public static void main(String[] args) {
    Llist newLL = new Llist();
    Llist.addFirst(1);
    Llist.addFirst(2);
    Llist.addFirst(3);
    Llist.addLast(4);
    Llist.printList(newLL);
  }
}