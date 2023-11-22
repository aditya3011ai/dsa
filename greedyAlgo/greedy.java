import java.util.*;
public class greedy {
    public static int activitySelection(int st[],int et[]){
      int arr1[][]=new int[st.length][3];
      for (int i = 0; i < st.length; i++) {
        arr1[i][0]= i;
        arr1[i][1]= st[i];
        arr1[i][2]= et[i];
      }
      Arrays.sort(arr1,Comparator.comparingDouble(o->o[2]));;
      ArrayList<Integer> arr = new ArrayList<>();
      arr.add(arr1[0][0]);
      int count =1;
      int end = arr1[0][2] ;
      for (int i = 1; i < et.length; i++) {
        if(arr1[i][1]>=end){
          count++;
          end =arr1[i][2];
          arr.add(arr1[i][0]);
        }
      } 
      System.out.println(arr);
      return count;
    }
    public static void main(String[] args) {
    int start[]={4,1,7,12,15};
    int end[]={6,13,13,14,19};
    System.out.println(activitySelection(start, end));
  }
}