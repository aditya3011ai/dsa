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

    public static void main(String[] args) {
        QueueStack s1 = new QueueStack();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        System.out.println(s1.peek());
    }
}
