import java.util.*;

public class arraylist {
  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list2.add(1);
    list2.add(2);
    list2.add(4);
    mainlist.add(list1);
    mainlist.add(list2);
    // System.out.println(mainlist);

    // nested loops to print arraylist
  //   for (int i = 0; i <mainlist.size(); i++) {
  //   ArrayList<Integer> templist = mainlist.get(i);
  //   for (int index = 0; index < templist.size(); index++) {
  //     System.out.print(templist.get(index)+" ");
  //   }
  //   System.out.println();
  //   }
  }
}