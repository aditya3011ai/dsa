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
        int idx = -1;

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
            if (root == null)
                return;
            Queue<Node> q = new LinkedList<Node>();

            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node node = q.remove();
                if (node == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(node.data + " ");
                    if (node.left != null) {
                        q.add(node.left);
                    }
                    if (node.right != null) {
                        q.add(node.right);
                    }
                }
            }
        }

        public int heightof(Node root) {
            if (root == null) {
                return 0;
            }
            return Math.max(heightof(root.left), heightof(root.right)) + 1;
        }

        public int countof(Node root) {
            if (root == null) {
                return 0;
            }
            return countof(root.left) + countof(root.right) + 1;
        }

        public int sumof(Node root) {
            if (root == null) {
                return 0;
            }
            return sumof(root.left) + sumof(root.right) + root.data;
        }

        public int diameterof(Node root) {
            if (root == null) {
                return 0;
            }
            int leftdia = diameterof(root.left);// finds the right node diameter
            int rightdia = diameterof(root.right);// finds the left node diameter
            int leftheight = heightof(root.left);
            int rightheight = heightof(root.right);
            int slef = rightheight + leftheight + 1;// calculate if sleft diameter
            int ans = Math.max(slef, Math.max(rightdia, leftdia));
            return ans;
        }

        public boolean isSubtree(Node root, Node sub) {
            if (root == null && sub == null) {
                return true;
            }
            if ((root == null && sub != null) || (root != null && sub == null)) {
                return false;
            }
            if (root.data == sub.data) {
                boolean ans = isSubtree(root.right, sub.right) && isSubtree(root.left, sub.left);
                if (ans) {
                    return true;
                }
            }
            return isSubtree(root.left, sub) || isSubtree(root.right, sub);
        }

        public static class Info {
            int x;
            Node node;

            Info(int x, Node node) {
                this.x = x;
                this.node = node;
            }
        }

        public HashMap<Integer, Integer> topview(Node root, HashMap<Integer, Integer> map) {
            if (root == null) {
                return map;
            }
            Queue<Info> q = new LinkedList<Info>();
            Info node = new Info(0, root);
            q.add(node);
            while (!q.isEmpty()) {
                Info currNode = q.remove();
                if (!map.containsKey(currNode.x)) {
                    map.put(currNode.x, currNode.node.data);
                }
                if (currNode.node.left != null) {
                    q.add(new Info(currNode.x - 1, currNode.node.left));
                }
                if (currNode.node.right != null) {
                    q.add(new Info(currNode.x + 1, currNode.node.right));
                }
            }
            return map;
        }

        public void printkth(Node root, int currlevel, int k) {
            if (root == null)
                return;
            if (currlevel == k) {
                System.out.print(root.data + " ");
            } else {
                if (root.left != null) {
                    printkth(root.left, currlevel + 1, k);
                }
                if (root.right != null) {
                    printkth(root.right, currlevel + 1, k);
                }
            }
        }

        public boolean getPath(Node root, ArrayList<Integer> path, int n1, int i) {
            if (root == null) {
                return false;
            }
            path.add(root.data);// adding node to path
            if (root.data == n1) {
                return true;
            }
            if (getPath(root.left, path, n1, i + 1) || getPath(root.right, path, n1, i + 1)) {
                return true;
            }
            path.remove(i); // removing node from the pasth
            return false;
        }

        public void lowestCommonAncestor(Node root, int node1, int node2) {
            ArrayList<Integer> path1 = new ArrayList<Integer>();
            ArrayList<Integer> path2 = new ArrayList<Integer>();
            int i = 0;
            getPath(root, path1, node1, i);
            getPath(root, path2, node2, i);
            while (i < path1.size() && i < path2.size()) {
                if (path1.get(i) != path2.get(i)) {
                    break;
                }
                i++;
            }
            System.out.println(path1.get(i - 1));
            return;
        }

        public Node lca2(Node root, int n1, int n2) {
            if (root == null || root.data == n1 || root.data == n2) {
                return root;
            }
            Node left = lca2(root.left, n1, n2);
            Node right = lca2(root.right, n1, n2);
            if (left == null) {
                return right;
            }
            if (right == null) {
                return left;
            }
            return root;
        }

        public int rootDistance(Node root, int n) {
            if (root == null)
                return -1;
            if (root.data == n)
                return 0;
            int left = rootDistance(root.left, n);
            int right = rootDistance(root.right, n);
            if (left > -1) {
                return left + 1;
            }
            if (right > -1) {
                return right + 1;
            }
            return -1;
        }

        public int minDistance(Node root, int n1, int n2) {
            Node lca = lca2(root, n1, n2);
            int minDistance1 = rootDistance(lca, n1);
            int minDistance2 = rootDistance(lca, n2);
            return minDistance1 + minDistance2;
        }
        public int minDepth(Node root,int depth){
            if(root == null)return depth;
            return Math.min(minDepth(root.left, depth), minDepth(root.left, depth))+1;
        }
        public int kthancestor(Node root, int n, int k) {
            if(root==null){
                return -1;
            }
            if (root.data == n) {
                return 0;
            }
           
            int left = kthancestor(root.left, n, k);
            int right = kthancestor(root.right, n, k);
            int max = Math.max(left, right);
           if(max>-1){
                if(max+1==k){
                    System.out.println(root.data);
                }
                return max+1;
           }

            return -1;

        }
        public int transformtosumtree(Node root){
            if(root==null){
                return 0;
            }
            int left = transformtosumtree(root.left);
            int right = transformtosumtree(root.right);
            int prev = root.data;
            root.data = left+right;

            return prev+root.data;
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        // int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // int arr[] = { 2,2,4,-1,-1,5,-1,-1,7,-1,3,-1,8,-1,-1};
        int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1,7,-1,-1 };
        Tree tree = new Tree();
        Node root = tree.buildTree(arr);
        // tree.lowestCommonAncestor(root, 4, 6);
        tree.transformtosumtree(root);
        tree.levelorder(root);
        // System.out.println(root.data);
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        // System.out.print(entry.getValue() + " ");
        // }
    }
}