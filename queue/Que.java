import java.util.*;

public class Que {
    static class Arrayqueue { // Implementaiton of Queue using Array
        static int arr[];
        static int size;
        static int rear;

        Arrayqueue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        boolean isEmpty() {
            return rear == -1;
        }

        void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        int remove() {
            if (isEmpty()) {
                System.out.println("queue is Empty");
                return -1;
            }
            int temp = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return temp;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("queue is Empty");
                return -1;
            }
            return arr[rear];
        }

        void print() {
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        }

    }

    static class LinkedlistQueue {
        static Node head;
        static Node tail;

        class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = tail.next;
        }

        void remove() {
            if (tail == head) {// if list has only one element
                tail = head = null;
            } else {
                head = head.next;
            }
        }

        boolean isEmpty() {
            return head == null && tail == null;
        }

        void peek() {
            if (isEmpty()) {
                System.out.println("Empty");
                return;
            }
            System.out.println(head.data);
        }

        void print() {
            if (isEmpty()) {
                System.out.println("Empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data);
                temp = temp.next;
            }

        }
    }

    static class StackQueue { // queue implemntation using 2 stacks
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s1.pop());
            }
        }

        void remove() {
            if (!s1.isEmpty()) {
                s1.pop();
            }
        }

        int peek() {
            if (!s1.isEmpty()) {
                return s1.peek();
            }
            return -1;
        }
    }

    static class QueueStack {// Stack using queue
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        void add(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        int remove() {
            if(q1.isEmpty() && q2.isEmpty()){return -1;}
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    int n = q1.remove();
                    if (q1.isEmpty()) {
                        return n;
                    } else {
                        q2.add(n);
                    }
                }
            } else {
                while (!q2.isEmpty()) {
                    int n = q2.remove();
                    if (q2.isEmpty()) {
                        return n;
                    } else {
                        q2.add(n);
                    }
                }
            }
            return 0;
        }
        int peek(){
            if(q1.isEmpty() && q2.isEmpty()){return -1;}
            int top=-1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }
    public static void interleavesTwoHalves(Queue<Integer>q1){
        Queue<Integer> q2 = new LinkedList<>();
        int len = q1.size();
        for (int i = 0; i < len/2; i++) {
            q2.add(q1.remove());
        }
        for (int i = 0; i < len; i++) {
            if(i%2==0){
                System.out.print(q2.remove()+" ");
            }else{
                System.out.print(q1.remove()+" ");
            }
        }
        return ;
    }
    public static void firstNonrepeating(String str){
        char freq[] =new char[26];
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch-'a']++;
            q.add(ch);
            while (!q.isEmpty() && freq[q.peek()-'a']!=1) {
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print("-1 ");
            }else{
            System.out.print(q.peek()+" ");
            }
        }
    }
    public static void queueReverse(Queue<Integer>que){
        if(que.isEmpty()){
            return;
        }
       int temp = que.remove();
       queueReverse(que);
       que.add(temp);
    }
    public static void main(String[] args) {
       Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.add(7);
        q1.add(8);
        queueReverse(q1);
        while(!q1.isEmpty()){
            System.out.print(q1.remove()+" ");
        }
    }
}
