import java.util.*;
public class Hindex1n2 {
    public static int hIndex2(int[] citations) {
        Arrays.sort(citations);
        int papers = citations.length;
        int index =0;
        while (index<papers && papers-index>citations[index]) {
            index++;
        }
        return papers-index;
    }
    public static void main(String[] args) {
        int arr[] = {100};
        System.out.println(hIndex2(arr));
  }
}