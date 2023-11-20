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

    public static void stockspan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            while (!s.isEmpty() && currPrice >= stocks[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - s.peek();
            }
            s.push(i);
        }
    }

    public static void nextGreater(int arr[], int nextgreater[]) {
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nextgreater[i] = -1;
                stack.push(arr[i]);
            } else {
                nextgreater[i] = stack.peek();
                stack.push(arr[i]);
            }
        }
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int temp = s.pop();
        reverseStack(s);
        pushToBottom(s, temp);
    }

    public static boolean vaildParanthesis(String str) {
        int n = str.length();
        if (n % 2 != 0) {
            return false; // If the string length is odd, it can't be valid
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {// for opening
                stack.push(ch);
            } else {// for closing
                if (stack.isEmpty()) {
                    return false;
                }
                if ((stack.peek() == '{' && ch == '}') ||
                    (stack.peek() == '[' && ch == ']') ||
                    (stack.peek() == '(' && ch == ')')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean dublicateParanthesis(String str){
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
             char ch = str.charAt(i);
            if(ch==')'){ // check if the current char is cloing ?
                int count = 0;
                while (!s.isEmpty() && s.peek() != '(') { 
                    s.pop(); // pop the stack and increase the count till s.peek == ')' or stack empty
                    count++;
                }
                    if(s.isEmpty()){
                    return false;
                }
                    if(count<1){ // if yes and if count is 0 then its a dublicate parantheses
                        return false;
                    }else{ // if yes and count is not zero means its a vaild useful parantheses. so pop its pair and continue
                        s.pop();
                    }
                
            }else{ // if its not closing then push the char
                s.push(ch);
            }
        }
        return true;
     }
    public static int maxAreaofHistogram(int arr[]){
        int length=arr.length;
        int nsr[]= new int[length];
        int nsl []= new int[length];
        int maxArea = 0;
        // for Next smaller Right
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nsr[i] = length;
                
            } else {
                nsr[i] = stack.peek();
            }
            stack.push(i);
        }
        // next smaller left 
        stack = new Stack<>();
        for (int i =  0; i <length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nsl[i] = -1;
                
            } else {
                nsl[i] = stack.peek();
            }
            stack.push(i);
        }
        for (int i = 0; i < length; i++) {
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int area = height * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,};
        System.out.println(maxAreaofHistogram(arr));
    }
}