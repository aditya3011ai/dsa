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

        public int diameter(Node root) {
            if (root == null) {
                return 0;
            }
            int leftdiameter = diameter(root.left);
            int rightdiameter = diameter(root.right);
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            int selfDiam = leftHeight + rightHeight + 1;
            return Math.max(selfDiam, Math.max(rightdiameter, leftdiameter));
        }

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

        public void levelorder(Node root) {
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
        public void printkthLevel(Node root,int level,int currLevel){
            if(root==null){
                return;
            }
            if(currLevel==level){
                System.out.print(root.data+" ");
                return;
            }
            printkthLevel(root.left, level, currLevel+1);
            printkthLevel(root.right, level, currLevel+1);
        }
        public int height(Node root) {
            if (root == null) {
                return 0;
            }
            Node currRoot = root;
            int hl = height(currRoot.left);
            int hr = height(currRoot.right);
            return (Math.max(hl, hr) + 1);
        }

        public int leaf(Node root) {
            if (root == null) {
                return 0;
            }
            Node currRoot = root;
            int hl = leaf(currRoot.left);
            int hr = leaf(currRoot.right);
            return (hl + hr + 1);
        }

        public int sum(Node root) {
            if (root == null) {
                return 0;
            }
            Node currRoot = root;
            int hl = sum(currRoot.left);
            int hr = sum(currRoot.right);
            return hl + hr + currRoot.data;
        }

    }

    public static boolean isIdentical(Node root, Node subroot) {
        if (root == null && subroot == null) {
            return true;
        }
        if (root == null && subroot != null || root != null && subroot == null || root.data != subroot.data) {
            return false;
        }
        return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
    }

    public static boolean isSubtree(Node root, Node subroot) {
        if (root == null) {
            return false;
        }
        if (root.data == subroot.data) {
            if (isIdentical(root, subroot)) {
                return true;
            } else {
                return false;
            }
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

    static class Info {
        Node node;
        int hd;

        Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        if (root == null) {
            return;
        }
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int max =0,min = 0;
        q.add(new Info(root, 0));
        q.add(null);
        while (!q.isEmpty()) {
            Info curr = q.poll();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);            
                }
            } else {
                if (!map.containsKey(curr.hd)) {// first occuring of the outer elemnt
                    map.put(curr.hd, curr.node);
                }
                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(curr.hd-1, min);
                }
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd+1);
                }
                
            }
           
        }
         for (int i = min; i <=max; i++) {
            System.out.print(map.get(i).data+" ");
            }
    }
    public static Node findLca(Node root,int n1,int n2){
        if(root==null){
            return null;
        }
        if(root.data==n1 || root.data==n2){
            return root;
        }
        Node left = findLca(root.left, n1, n2);
        Node right = findLca(root.right, n1, n2);

        if(left == null){
            return right;
        }
        if(right == null){
            return left;
        }
        return root;
    } 
    public static int distance(Node root,int n1,int n2){
        if(root==null){
            return -1;
        }
        if(root.data==n1 ||root.data==n2){
            return 1;
        }
        int left = distance(root.left, n1,n2);
        int right = distance(root.right, n1,n2);
        return  Math.max(left, right)+1;
    }
    public static int minDis(Node root,int n1,int n2){
        Node minParaent = findLca(root, n1, n2);
        int left = distance(minParaent.left, n1,n2);
        int right = distance(minParaent.right, n1,n2);
        return (left+right);
    }

    public static void main(String[] args) {
        //  1
        // / \
        // 2 1
        // / \ \
        // 3 1 1

        // int data[] = { 1, 2, 3, -1, -1, 1, -1, -1, 1, -1, 1 };
        BinaryTree tree = new BinaryTree();
        // Node root = tree.BuildTree(data);
        // System.out.println(tree.diameter(root));
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // root.right.right.right = new Node(8);
        // tree.printkthLevel(root, 3, 1);
        System.out.println(minDis(root, 4, 7));
    }
}
