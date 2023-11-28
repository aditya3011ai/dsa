import java.util.*;

public class Btree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public Node BuildTree(int data[]) {
            idx++;
            if (idx >= data.length) {
                return null;
            }
            if (data[idx] == -1) {
                return null;
            }
            Node newNode = new Node(data[idx]);
            newNode.left = BuildTree(data);
            newNode.right = BuildTree(data);
            return newNode;
        }

        public void printTreeOrder(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }
            System.out.print(root.data + " ");
            printTreeOrder(root.left);
            printTreeOrder(root.right);
        }

        public void inorder(Node root) {
            if (root == null) {

                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");

        }
    }

    public static void main(String[] args) {
        int data[] = { 1, 2, 3, -1, -1, 5, -1, -1, 3, -1, 6 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(data);
        tree.postorder(root);
    }
}
