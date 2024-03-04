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
    return helper(0, 0, inorder.length - 1, preorder, inorder);
  }

  public static TreeNode helper(int preS, int inS, int inE, int preorder[], int inorder[]) {
    if (preS > preorder.length - 1 || inS > inE) {
      return null;
    }
    TreeNode root = new TreeNode(preorder[preS]);
    int idx = 0;
    for (int i = inS; i <= inE; i++) {
      if (root.val == inorder[i]) {
        idx = i;
      }
    }
    root.left = helper(preS + 1, inS, idx - 1, preorder, inorder);
    root.right = helper(preS + idx - inS + 1, idx + 1, inE, preorder, inorder);
    return root;
  }

  public static int ans = 0;

  public static int diameterOfBinaryTree(TreeNode root) {
    helper(root);
    return ans;
  }

  public static int helper(TreeNode root) {
    if (root == null)
      return -1;
    int left = helper(root.left);
    int right = helper(root.right);
    ans = Math.max(left + right + 1, ans);
    return Math.max(left, right) + 1;
  }

  public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
    if (root1 == null && root2 == null)
      return null;
    if (root1 == null && root2 != null) {
      return root2;
    }
    if (root1 != null && root2 == null) {
      return root1;
    }
    root1.val += root2.val;
    root1.left = mergeTrees(root1.left, root2.left);
    root1.right = mergeTrees(root1.right, root2.right);
    return root1;
  }

  public static List<List<Integer>> levelOrder(TreeNode root) {
    if (root == null) {
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

  static List<String> paths = new LinkedList<>();

  public static List<String> binaryTreePaths(TreeNode root) {
    if (root == null)
      return null;
    constructPaths(root, new String(""));
    return paths;
  }

  public static  void constructPaths(TreeNode root, String s) {
    s+=(root.val);
    if (root.left == null && root.right == null) {
      paths.add(s);
      return;
    }
    if (root.left != null) {
      constructPaths(root.left, s+"->");
    }
    if (root.right != null) {
      constructPaths(root.right, s+"->");
    }
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.right = new TreeNode(4);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(6);
    System.out.println(binaryTreePaths(root));
  }
}