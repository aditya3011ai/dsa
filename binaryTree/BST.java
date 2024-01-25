import java.util.*;

public class BST {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public class tree {
        public static Node insert(Node node, int val) {
            if (node == null) {
                Node node2 = new Node(val);
                return node2;
            }
            if (node.data < val) {
                node.right = insert(node.right, val);
            } else {
                node.left = insert(node.left, val);
            }
            return node;
        }

        public static Node buildBST(int arr[]) {
            Node node = new Node(arr[0]);
            for (int i = 1; i < arr.length; i++) {
                node = insert(node, arr[i]);
            }
            return node;
        }

        public static void levelorder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null);

            while (!queue.isEmpty()) {
                Node currNode = queue.remove();
                if (currNode == null) {
                    System.out.println();
                    if (queue.isEmpty()) {
                        break;
                    } else {
                        queue.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        queue.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        queue.add(currNode.right);
                    }
                }
            }
        }

        public static void inorderTraversal(Node root) {
            if (root == null) {
                return;
            }
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }

        public static void search(Node root, int val) {
            if (root == null) {
                System.out.println(-1);
                return;
            }
            if (root.data == val) {
                System.out.println(val + " Found");
                return;
            }
            if (root.data > val) {
                search(root.left, val);
            } else {
                search(root.right, val);
            }
        }

        public static Node findleft(Node root) {// 2.2
            if (root.left == null) {
                return root;
            }
            return findleft(root.left);
        }

        public static Node delete(Node root, int val) { // 2.1
            if (root == null) {
                return root;
            }
            if (root.data > val) {
                root.left = delete(root.left, val);
            } else if (root.data < val) {
                root.right = delete(root.right, val);
            } else {
                if (root.left == null && root.right == null) {// case 1
                    return null;
                }
                if (root.left == null) { // case 2
                    return root.right;
                }
                if (root.right == null) {
                    return root.left;
                }
                Node newNode = findleft(root.right); // case 3
                root.data = newNode.data;
                root.right = delete(root.right, root.data);
            }
            return root;
        }

        public static void printRaneg(Node root, int v1, int v2) {// 1
            if (root == null) {
                return;
            }
            if (root.data >= v1 && root.data <= v2) {
                printRaneg(root.left, v1, v2);
                System.out.print(root.data + " ");
                printRaneg(root.right, v1, v2);
            } else if (root.data < v1) {
                printRaneg(root.right, v1, v2);
            } else {
                printRaneg(root.left, v1, v2);
            }
        }

        public static  void printAllPaths(Node root, ArrayList<Integer> paths) {
            if (root == null) {
                return;
            }
            paths.add(root.data);
            if(root.left==null && root.right==null) {
                for (int i = 0; i < paths.size(); i++) {
                    System.out.print(paths.get(i)+" ");
                }
                System.out.println();
                paths.remove(paths.size()-1);
                return;
            }
            if (root.left != null) {
                printAllPaths(root.left, paths);
            }
            if (root.right != null) {
                printAllPaths(root.right, paths);
            }
        }
        public static ArrayList<Integer> inorder(Node root,ArrayList<Integer> list) {
            if(root==null){
                return list;
            }
            if(root.left==null && root.right==null){
                list.add(root.data);
                return list;
            }
           
            list = inorder(root.left, list);
            list.add(root.data);
            list = inorder(root.right, list);
            return list;
        }
        public static boolean isValidBST(Node root, ArrayList<Integer> list){
            list = inorder(root, list);
            int i=1;
            while (i<list.size()) {
                if(list.get(i-1)>list.get(i)){
                    return false;
                }
                i++;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        // int arr[] = {8,5,3,1,4,6,7,10,11,14};
        int arr[] = { 8, 5, 3, 6, 10, 11, 14 };
        Node root = tree.buildBST(arr);
        Node node = new Node(5);
        node.left = new Node(3);
        node.right = new Node(6);
        node.right.right = new Node(7);
        node.left.left = new Node(3);
        node.left.left.left = new Node(1);
        node.left.left.right = new Node(4);
        // tree.levelorder(root);
        // tree.delete(root,5);
        // tree.levelorder(root);
        ArrayList<Integer> path = new ArrayList<Integer>();
        // tree.printAllPaths(root,path);
        System.out.println(tree.isValidBST(node, path));
    }
}
