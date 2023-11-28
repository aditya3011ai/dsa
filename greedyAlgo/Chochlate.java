import java.util.*;
public class Chochlate {
    public static int costFind(Integer row[],Integer col[]){
      Arrays.sort(row,Comparator.reverseOrder());
      Arrays.sort(col,Comparator.reverseOrder());
      int colP =1;
      int rowP =1;
      int cost =0;
      int i=0;
      int j=0;
      while (j<col.length && i<row.length) {
        if(col[j]<row[i]){
          cost += row[i]*colP;
          rowP++;
          i++;
        }else{
          cost += col[j]*rowP;
          colP++;
          j++;
        }
      }
      while(j<col.length){
        cost += col[j]*rowP;
        j++;
      }
      while(i<row.length){
        cost += row[i]*colP;
        i++;
      }
      return cost;
    }
    public static void main(String[] args) {
    Integer row[]={2,1,3,1,4};
    Integer col[] ={4,1,2};
      System.out.println(costFind(row ,col));
      
  }
}