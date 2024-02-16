import java.util.*;

public class inorder {
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

    public static List<Integer> res = new ArrayList<>();

    public static List<Integer> inorderTraversal(TreeNode root) {
        inordert(root);
        return res;
    }

    public static void inordert(TreeNode root) {
        if (root == null)
            return;
        inordert(root.left);
        res.add(root.val);
        inordert(root.right);
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null && targetSum == root.val) {
            return true;
        }
        boolean left = false;
        boolean right = false;
        if (root.left != null)
            left = hasPathSum(root.left, targetSum - root.val);
        if (root.right != null)
            right = hasPathSum(root.right, targetSum-root.val);
        return left || right;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        List<Integer> res = inorderTraversal(root);
        // System.out.println(res);
        System.out.println(hasPathSum(root, 3));
    }
}