import java.util.*;
import java.lang.*;
import java.io.*;
public class CombineRopes {
            public static void main (String[] args) throws java.lang.Exception{
            int ropes[] ={2,3,3,4,6};
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i = 0; i < ropes.length; i++) {
                pq.add(ropes[i]);
            }
            int cost = 0;
            while(!pq.isEmpty()){
                int a = pq.remove();
                if(pq.isEmpty()){
                    System.out.println(cost);
                    break;
                }
                int b = pq.remove();
                cost +=a+b;
                pq.add(a+b);
            }

  }
}