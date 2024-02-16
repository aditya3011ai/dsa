import java.util.*;

public class sameTree {
    public static  class TreeNode {
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
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(q==null && p==null) return true;
        if(p==null && q!=null || q==null && p!=null) return false;
        if(q.val==p.val){
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(1);
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(1);
        node.right = new TreeNode(1);
        node.right.left = new TreeNode(1);
        node.right.right= new TreeNode(1);
        System.out.println(isSameTree(root, node));
  }
}