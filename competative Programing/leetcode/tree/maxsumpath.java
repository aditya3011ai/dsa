import java.util.*;

public class maxsumpath {
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
    public static class Info{
        int path;
        int max;
        Info(int max, int path) {
            this.max = max;
            this.path = path;
        }
    }
    public static Info maxpath(TreeNode root){
        if(root==null){
            return new Info(-1000, -1000);
        }
        Info left = maxpath(root.left);
        Info right = maxpath(root.right);
        // it get the path which is the max sum
        int path = Math.max(Math.max(left.path, right.path)+root.val ,root.val);
        // its keep trak for the max sum subtree
        int max = Math.max(left.max, right.max);
        max = Math.max(Math.max(left.path+right.path+root.val,max),path);
        return new Info(max, path);
    }
    public static int maxPathSum(TreeNode root) {
        Info ans = maxpath(root);
        return ans.max;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(-1);
        // root.left = new TreeNode(2);
        // root.right = new TreeNode(-10);
        // root.left.left = new TreeNode(-9);
        // root.left.right = new TreeNode(-20);
        // root.left.right.right = new TreeNode(-7);
        // root.left.right.left = new TreeNode(-15);

        System.out.println(maxPathSum(root));
  }
}