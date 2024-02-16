import java.util.*;

public class kthsmallest {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static ArrayList<Integer> arr = new ArrayList<>();
    public static int kthSmallestnum(TreeNode root, int k) {
            if(k<0) return -1;
            traverse(root,k);
            return arr.get(k-1);
    }
    
    public static void traverse(TreeNode root,int k){
        if(root ==null) return;
        if(arr.size()==k){
            return;
        }
        traverse(root.left,k);
        arr.add(root.val);
        traverse(root.right,k);
    }
   

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
       System.out.println(kthSmallestnum(root, 3));
    }
}