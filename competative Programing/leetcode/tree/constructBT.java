import java.util.*;

public class constructBT {
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
      public static TreeNode buildTree(int[] preorder, int[] inorder) {
            return helper(0, 0, inorder.length-1,preorder,inorder);
      }
      public static TreeNode helper(int preS,int inS,int inE ,int preorder[],int inorder[]){
        if (preS > preorder.length-1 || inS>inE) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preS]);
        int idx = 0;
        for (int i = inS; i <= inE; i++) {
            if(root.val==inorder[i]){
                idx = i;
            }
        }
        root.left = helper(preS+1, inS, idx-1, preorder, inorder);
        root.right = helper(preS+idx-inS+1, idx+1, inE, preorder, inorder);
        return root;
      }
    public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.right = new TreeNode(4);
    root.left.left = new TreeNode(0);
  }
}