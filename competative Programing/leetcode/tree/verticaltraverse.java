import java.util.*;

public class verticaltraverse {
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

  public static class Pair {
    int hd;
    TreeNode node;

    Pair(int hd, TreeNode node) {
    this.hd = hd;
    this.node = node;
    }
  }

  public static List<List<Integer>> verticalTraversal(TreeNode root) {
    Queue<Pair> q = new ArrayDeque<>();
    Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
    q.add(new Pair(0, root));
    while (!q.isEmpty()) {
      Pair curr = q.poll();
      if(map.containsKey(curr.hd)){
        map.get(curr.hd).addLast(curr.node.val);
      }else{
        ArrayList<Integer> tmp = new ArrayList<>();
        tmp.add(curr.node.val);
        map.put(curr.hd,tmp);
      }
      if(curr.node.left!=null){
        q.add(new Pair(curr.hd-1, curr.node.left));
      }
      if(curr.node.right!=null){
        q.add(new Pair(curr.hd+1, curr.node.right));
      }
    }
    List<List<Integer>> ans = new ArrayList<>();
    for (Map.Entry<Integer,ArrayList<Integer>> entry: map.entrySet()) {
        ArrayList<Integer>  temp = entry.getValue();
        Collections.sort(temp);
        ans.add(temp);
    }
    return ans;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.right = new TreeNode(7);
    root.right.left = new TreeNode(5);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(6);
    List<List<Integer>> ans = verticalTraversal(root);
    System.out.println(ans);
  }
}