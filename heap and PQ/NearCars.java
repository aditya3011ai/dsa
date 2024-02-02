import java.util.*;
import java.lang.*;
import java.io.*;
public class NearCars {
        static class Point implements Comparable<Point>{
            int x;
            int y;
            int ds;
            int idx;
            Point(int x,int y,int ds,int idx){
                this.x = x;
                this.y = y;
                this.ds = ds;
                this.idx = idx;
            }
        @Override 
        public int compareTo(Point p2){
            return this.ds - p2.ds; // ascending order sort
        }

        }
            public static void main (String[] args) throws java.lang.Exception{
            int arr [][]={{5,-1},{-2,4},{3,3}};
            PriorityQueue<Point> que = new PriorityQueue<>();
            for (int i = 0; i < 3; i++) {
                int dst = arr[i][0]*arr[i][0] + arr[i][1]*arr[i][1];
                que.add(new Point(arr[i][0],arr[i][1],dst,i));
            }
            System.out.println(que.remove().idx);
  }
}