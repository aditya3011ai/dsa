import java.util.*;

public class levelorder {
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

  public static List<List<Integer>> levelOrder(TreeNode root) {
    if(root ==null) {
      return new ArrayList<List<Integer>>();
    }
    Queue<TreeNode> q = new LinkedList<>();
    List<List<Integer>> list = new ArrayList<>();
    q.add(root);
    q.add(null);
    list.add(new ArrayList<Integer>());
    int i = 0;
    while (!q.isEmpty()) {
      TreeNode node = q.remove();
      if (node == null) {
        if (q.isEmpty()) {
          return list;
        }
        q.add(null);
        list.add(new ArrayList<Integer>());
        i++;
      } else {
        list.get(i).add(node.val);
        if (node.left != null) {
          q.add(node.left);
        }
        if (node.right != null) {
          q.add(node.right);
        }
      }
    }
    return list;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.right = new TreeNode(4);
    root.left.left = new TreeNode(0);
    List<List<Integer>> l = levelOrder(root);
    System.out.println(l);
  }
}