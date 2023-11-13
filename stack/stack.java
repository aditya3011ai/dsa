import java.util.*;
public class stack {
    static class StackA{
      // Stack using ArrayList
       ArrayList<Integer> list = new ArrayList<>();
       public boolean isEmpty(){
        if (list.size()==0) {
            return true;
        }      
        return false;
       }
       public void push(int data){
        list.add(data);
       } 
       public int peek(){
        return list.get(list.size()-1);
       }
       public int pop(){
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
       }
    }
    static class StackL{
        // stack using linked List
        class Node {
            int data;
            Node next;
            Node(int data){
                this.data = data;
                this.next = null;
            }
        }
          static Node head;
        public void push(int data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
         public void pop(){
           head = head.next;
        }
        public int peek(){
            if(head ==null){
                return -1;
            }
            return head.data;
        }
        public boolean isEmpty(){
            if(head==null){
                return true;
            }
            return false;
        }
    }
    public static void pushToBottom(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushToBottom(s, data);
        s.push(top);
    }
    public static void traverse(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        // traverse(list);
        pushToBottom(list, 0);
        traverse(list);
  }
}