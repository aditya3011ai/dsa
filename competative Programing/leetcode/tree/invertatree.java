import java.util.*;
public class invertatree {
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
    public TreeNode invertTree(TreeNode root) {
        if(root ==null) return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    } 
    public static boolean isSymmetric(TreeNode root) {
        
        return isMirror(root,root);
    }  
    public static boolean isMirror(TreeNode root, TreeNode node){
        if(root==null && node==null) return true;
        if(root==null || node==null) return false;
        return root.val==node.val && isMirror(root.left, node.right) && isMirror(root.right, node.left);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right= new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
    System.out.println(isSymmetric(root));
  }
}