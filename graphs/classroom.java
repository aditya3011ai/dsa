import java.util.*;

public class classroom {
  public static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
    am.get(s).add(d);
    am.get(d).add(s);
  }

  public static void printGraph(ArrayList<ArrayList<Integer>> am) {
    for (int i = 0; i < am.size(); i++) {
      System.out.println("\nVertex " + i + ":");
      for (int j = 0; j < am.get(i).size(); j++) {
        System.out.print(" -> " + am.get(i).get(j));
      }
      System.out.println();
    }
  }

  public static ArrayList<Integer> BFS(ArrayList<ArrayList<Integer>> adj, int v) {
    ArrayList<Integer> ans = new ArrayList<Integer>();
    boolean bool[] = new boolean[v];
    Queue<Integer> queue = new LinkedList<Integer>();
    queue.add(0);
    bool[0] = true;

    while (!queue.isEmpty()) {
      int vertex = queue.peek();
      queue.remove();
      ans.add(vertex);

      for (int j = 0; j < adj.get(vertex).size(); j++) {
        if (bool[adj.get(vertex).get(j)] == false) {
          bool[adj.get(vertex).get(j)] = true;
          queue.add(adj.get(vertex).get(j));
        }
      }
    }

    return ans;
  }

  public static ArrayList<Integer> DFS(ArrayList<ArrayList<Integer>> list, boolean visted[], int v,int vertex, ArrayList<Integer>ans) {
    visted[vertex] = true;
    ans.add(vertex);
    for (int i = 0; i < list.get(vertex).size(); i++) {
      if(visted[list.get(vertex).get(i)]==false)
      ans = DFS(list, visted, v, list.get(vertex).get(i), ans);
    }
    return ans;
  }

  public static void main(String[] args) {
    int V = 5;
    ArrayList<ArrayList<Integer>> am = new ArrayList<ArrayList<Integer>>(V);

    for (int i = 0; i < V; i++)
      am.add(new ArrayList<Integer>());

    // Add edges
    addEdge(am, 0, 1);
    addEdge(am, 1, 2);
    addEdge(am, 1, 3);
    addEdge(am, 2, 4);
    addEdge(am, 2, 3);
    boolean vistied [] = new boolean[V];
    ArrayList<Integer> ans = new ArrayList<Integer>();
    ArrayList<Integer> list = DFS(am,vistied,V,0,ans);
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
    // printGraph(am);
  }

}