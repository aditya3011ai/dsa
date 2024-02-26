import java.util.*;

public class depth {
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

  public static int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return Math.max(maxDepth(root.left)+1, maxDepth(root.right)+1);
  }
  public static int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    if(root.left ==null && root.right == null) {
      return 0;
    }
    if(root.left==null) return minDepth(root.right)+1;
    if(root.right==null) return minDepth(root.left)+1;

    return Math.min(minDepth(root.left), minDepth(root.right))+1;
  }
  public static List<Double> averageOfLevels(TreeNode root) {
      Queue<TreeNode> q = new LinkedList<>();
      List<Double> res = new LinkedList<>();
      if(root==null) return res;
      q.add(root);
      q.add(null);
      Double sum =0.0;
      int count =0;
      while (!q.isEmpty()) {
        TreeNode node =  q.remove();
        if(node==null){
          if(!q.isEmpty()){
            q.add(null);
          }
          res.add((double)(sum/count) );
          count=0;
          sum=0.0;
        }else{
          sum+= node.val;
          count++;
          if(node.left!=null){
            q.add(node.left);
          }
          if(node.right !=null){
            q.add(node.right);
          }
        }
      }
        return res;
  }
  public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);
    List<Double> ans = averageOfLevels(root);
    System.out.println(ans);
  }
}