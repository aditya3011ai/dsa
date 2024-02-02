import java.util.*;

public class newHeap {
    public static class Heap {
        ArrayList<Integer> heap = new ArrayList<Integer>();

        public void insert(int data) {
            heap.add(data);
            int x = heap.size()-1; // idx of the child
            int par = (x-1)/2;
            while(heap.get(par)>heap.get(x)){
                int temp  = heap.get(par);
                heap.set(par, heap.get(x));
                heap.set(x,temp);
                x = par;
                par = (x-1)/2;
            }
        }
        public void delete(){
            int data = heap.get(heap.size()-1);
            heap.set(0, data);
            heap.remove(heap.size()-1);
            heapify(0);
        }
        public void heapify(int i){
            int left = 2*i+1; // left child
            int right = 2*i+2;// right child
            int min = i;

            if(left<heap.size() && heap.get(left)<heap.get(min)){
                min = left;
            }
            if(right<heap.size() && heap.get(right)<heap.get(min)){
                min = right;
            }

            if(min==i){
                return;
            }
            int temp = heap.get(min);
            heap.set(min, heap.get(i));
            heap.set(i, temp);

            heapify(min);
        }
        public int peek(){
            if(heap.isEmpty()){
                return Integer.MAX_VALUE;
            }   
            return heap.get(0);
        }
        public boolean isEmpty(){
            return heap.size()==0;
        }
    }

    public static class Point implements Comparable<Point>{
        int x;
        int y;
        int dis;
        Point(int x,int y,int dis){
            this.x = x;
            this.y = y;
            this.dis = dis;
        }
        @Override public int compareTo(Point p2){
            return this.dis - p2.dis;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Point> pq = new PriorityQueue<>();
        pq.add(new Point(3, 3, (3*3)+(3*3)));
        pq.add(new Point(5, -1, (5*5)+(-1*-1)));
        pq.add(new Point(-2, 4, (-2*-2)+(4*4)));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().x +" "+ pq.peek().y);
            pq.remove();
        }
    }
}