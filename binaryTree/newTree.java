import java.util.*;
import java.lang.*;
import java.io.*;

public class newTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Tree {
        static int idx = -1;

        public Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node node = new Node(nodes[idx]);
            node.left = buildTree(nodes);
            node.right = buildTree(nodes);
            return node;
        }

        public void preorderTraversal(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

        public void inorderTraversal(Node root) {
            if (root == null) {
                return;
            }
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
        public void postorderTraversal(Node root) {
            if (root == null) {
                return;
            }
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data + " ");
        }
        public void levelorder(Node root) {
           if(root==null) return;
            Queue<Node>q = new LinkedList<Node>();

            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node node = q.remove();
                if(node==null){
                    System.out.println();
                      if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
                }else{
                    System.out.print(node.data+" ");
                    if(node.left!=null){
                        q.add(node.left);
                    }
                    if(node.right!=null){
                        q.add(node.right);
                    }
                }
            }
        }
        public int heightof(Node root){
            if(root==null){
                return 0;
            }
            return Math.max(heightof(root.left), heightof(root.right)) + 1;
        }
        public int countof(Node root){
            if(root==null){
                return 0;
            }
            return countof(root.left)+countof(root.right) + 1;
        }
        public int sumof(Node root){
            if(root==null){
                return 0;
            }
            return sumof(root.left)+sumof(root.right) + root.data;
        }
        public int diameterof(Node root){
            if(root==null){
                return 0;
            }
            int leftdia = diameterof(root.left);// finds the right node diameter
            int rightdia = diameterof(root.right);//finds the left node diameter
            int leftheight = heightof(root.left);
            int rightheight = heightof(root.right);
            int slef = rightheight+leftheight+1;// calculate if sleft diameter 
            int ans = Math.max(slef, Math.max(rightdia, leftdia));
            return ans;
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        // int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        int arr[] = { 1,2,4,-1,-1,5,-1,6,-1,7,-1,-1,3,-1,8,-1,-1};
        Tree tree = new Tree(); 
        Node root = tree.buildTree(arr);
        tree.levelorder(root);
        System.err.println(tree.diameterof(root));
    }
}