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
    }

    public static void main(String[] args) throws java.lang.Exception {
        int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Tree tree = new Tree();
        Node root = tree.buildTree(arr);
        tree.postorderTraversal(root);
    }
}