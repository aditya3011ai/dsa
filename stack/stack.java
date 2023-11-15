import java.util.*;

public class stack {
    static class StackA {
        // Stack using ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            if (list.size() == 0) {
                return true;
            }
            return false;
        }

        public void push(int data) {
            list.add(data);
        }

        public int peek() {
            return list.get(list.size() - 1);
        }

        public int pop() {
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }
    }

    static class StackL {
        // stack using linked List
        class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        static Node head;

        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void pop() {
            head = head.next;
        }

        public int peek() {
            if (head == null) {
                return -1;
            }
            return head.data;
        }

        public boolean isEmpty() {
            if (head == null) {
                return true;
            }
            return false;
        }
    }

    public static void pushToBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushToBottom(s, data);
        s.push(top);
    }

    public static void traverse(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder temp = new StringBuilder("");
        while (!s.isEmpty()) {
            temp.append(s.pop());

        }
        str = temp.toString();
        System.out.println(str);
    }

    public static void stockspan(int stocks[],int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
       s.push(0);
       for (int i = 1; i < stocks.length; i++) {
        int currPrice = stocks[i];   
            while(!s.isEmpty() && currPrice >= stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                span[i]= i - s.peek();
            }
            s.push(i);
       }
    }
    public static void nextGreater(int arr[],int nextgreater[]){
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length-1; i >= 0; i--) {
                while(!stack.isEmpty() && stack.peek()<= arr[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    nextgreater[i]=-1;
                    stack.push(arr[i]);
                }else{
                    nextgreater[i]= stack.peek();
                    stack.push(arr[i]);
                }
        }
    }
    public static void reverseStack(Stack<Integer> s) {
        if(s.isEmpty()){
            return;
        }
        int temp = s.pop();
        reverseStack(s);
        pushToBottom(s, temp);
    }

    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int greater[] = new int[arr.length];
        nextGreater(arr, greater);
        for (int i = 0; i < greater.length; i++) {
            System.out.print(greater[i]+" ");
        };
    }
}