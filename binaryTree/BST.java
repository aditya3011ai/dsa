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

        public static void printAllPaths(Node root, ArrayList<Integer> paths) {
            if (root == null) {
                return;
            }
            paths.add(root.data);
            if (root.left == null && root.right == null) {
                for (int i = 0; i < paths.size(); i++) {
                    System.out.print(paths.get(i) + " ");
                }
                System.out.println();
                paths.remove(paths.size() - 1);
                return;
            }
            if (root.left != null) {
                printAllPaths(root.left, paths);
            }
            if (root.right != null) {
                printAllPaths(root.right, paths);
            }
        }

        public static ArrayList<Integer> inorder(Node root, ArrayList<Integer> list) {
            if (root == null) {
                return list;
            }
            if (root.left == null && root.right == null) {
                list.add(root.data);
                return list;
            }

            list = inorder(root.left, list);
            list.add(root.data);
            list = inorder(root.right, list);
            return list;
        }

        public static boolean isValidBST(Node root, ArrayList<Integer> list) {
            list = inorder(root, list);
            int i = 1;
            while (i < list.size()) {
                if (list.get(i - 1) > list.get(i)) {
                    return false;
                }
                i++;
            }
            return true;
        }

        public static boolean isValidBST2(Node root, Node min, Node max) {
            if (root == null) {
                return true;
            }
            if (min != null && min.data > root.data) {
                return false;
            }
            if (max != null && max.data < root.data) {
                return false;
            }
            return isValidBST2(root.left, min, root) && isValidBST2(root.right, root, max);
        }

        public static Node mirrorBST(Node root) {
            if (root == null) {
                return null;
            }
            Node left = mirrorBST(root.left);
            Node right = mirrorBST(root.right);
            root.left = right;
            root.right = left;
            return root;
        }

        public static Node balancedBST(ArrayList<Integer> arr, int si, int ei) {
            if (si > ei) {
                return null;
            }
            int mid = (si + ei) / 2;
            Node node = new Node(arr.get(mid));
            node.left = balancedBST(arr, si, mid - 1);
            node.right = balancedBST(arr, mid + 1, ei);
            return node;
        }

        public static ArrayList<Integer> BSTtoArr(Node root, ArrayList<Integer> arr) {
            if (root == null)
                return null;
            if (root.left != null)
                arr = BSTtoArr(root.left, arr);
            arr.add(root.data);
            if (root.right != null)
                arr = BSTtoArr(root.right, arr);
            return arr;
        }

        public static Node merger(Node node1, Node node2) {
            ArrayList<Integer> arr1 = new ArrayList<Integer>();
            arr1 = BSTtoArr(node1, arr1);

            ArrayList<Integer> arr2 = new ArrayList<Integer>();
            arr2 = BSTtoArr(node2, arr2);
            ArrayList<Integer> arr3 = new ArrayList<Integer>();
            int i = 0;
            int j = 0;
            while (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) > arr2.get(j)) {
                    arr3.add(arr2.get(j));
                    j++;
                } else {
                    arr3.add(arr1.get(i));
                    i++;
                }
            }
            while (i < arr1.size()) {
                arr3.add(arr1.get(i));
                i++;
            }
            while (j < arr2.size()) {
                arr3.add(arr2.get(j));
                j++;
            }
            System.out.println(arr3);
            Node root = balancedBST(arr3, 0, arr3.size() - 1);
            return root;
        }

    }

    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;
        int maxBST;

        Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;

        }

        Info(boolean isBST, int size, int min, int max, int maxBST) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
            this.maxBST = maxBST;
        }
    }
    public static int largest = 0;
    public static Info largestBST(Node root) {
        if (root == null) {
            return new Info(true, 0,Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        
        Info left = largestBST(root.left);
        Info right = largestBST(root.right);
        int min = Math.min(root.data, Math.min(left.min, right.min));
        int max = Math.max(root.data, Math.max(left.max, right.max));

        if (left.max > root.data || right.min < root.data) {
            return new Info(false, left.size + right.size + 1, min, max);
        }
        if(left.isBST && right.isBST){
            largest = left.size+right.size+1;
            return new Info(true, left.size+right.size+1, min, max);
        }
        return new Info(false, left.size + right.size + 1, min, max);
    }

    public static void main(String[] args) {
        // int arr[] = {8,5,3,1,4,6,7,10,11,14};
        int arr[] = { 8, 5, 3, 6, 10, 11 };
        // Node root = tree.buildBST(arr);
        Node node = new Node(50);
        node.left = new Node(30);
        node.right = new Node(60);
        node.right.right = new Node(70);
        node.right.left = new Node(45);
        node.left.left = new Node(10);
        node.right.right.right = new Node(80);
        node.right.right.left = new Node(65);
        node.left.right = new Node(20);
        // tree.levelorder(root);
        // tree.delete(root,5);
        // int arr2[] = { 3, 5, 6, 8, 10, 11, 12 };
        // Node root = tree.merger(node, node2);
        // tree.levelorder(node);
        Info info = largestBST(node);
        System.out.println(largest);
        
    }   
}
