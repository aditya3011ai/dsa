import java.util.*;

public class weakestSoilder {
    public static class Row implements Comparable<Row> {
        int count;
        int idx;
        Row(int count, int idx) {
            this.count = count;
            this.idx = idx;
        }
        @Override
        public int compareTo(Row r2) {
            if(this.count == r2.count){
                return this.idx - r2.idx;
            }else{
                return this.count - r2.count;
            }
        }
    }

    public static void main(String[] args) {
        int army[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 0 }
        };
        int k = 2;
        PriorityQueue<Row> queue = new PriorityQueue<>();
        for (int i = 0; i < army.length; i++) {
            int count =0;
            for (int j = 0; j < army[0].length; j++) {
                if(army[i][j]==1){
                    count++;
                }
            }
            queue.add(new Row(count,i));
        }
        while (k>0) {
            System.out.println(queue.peek().idx);
            queue.remove(queue.peek());
            k--;
        }
    }
}