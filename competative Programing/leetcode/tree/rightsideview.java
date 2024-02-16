import java.util.*;

public class rightsideview {
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

    public static List<Integer> res = new ArrayList<Integer>();

    public static List<Integer> rightSideView(TreeNode root) {
        if(root==null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            TreeNode node = q.remove();
            if(node==null){
                return res;
            }
            if (node.left != null) {
                q.add(node.left);
            }
            if (node.right != null) {
                q.add(node.right);
            }
            if (q.peek() == null) {
                res.add(node.val);
                System.out.println(node.val);
                q.remove();
                if(!q.isEmpty())q.add(null);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        root.left.left = new TreeNode(0);
        root.left.left.left = new TreeNode(20);
        rightSideView(root);
        System.out.println(res);
    }
}