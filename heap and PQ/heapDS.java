import java.util.*;

public class heapDS {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        void add(int data) {
            arr.add(data); // adding value to the last node
            int idx = arr.size() - 1; // child idx
            int pidx = (idx - 1) / 2;
            while (arr.get(idx) < arr.get(pidx)) { // swapping small number
                int temp = arr.get(pidx);
                arr.set(pidx, arr.get(idx));
                arr.set(idx, temp);
            }
        }

        int peek() {
            return arr.get(0);
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minidx = i;

            if (left < arr.size() && arr.get(minidx) > arr.get(left)) {
                minidx = left;
            }
            if (right < arr.size() && arr.get(minidx) > arr.get(right)) {
                minidx = right;
            }
            if (minidx != i) {
                int temp = arr.get(i);
                arr.set(i, minidx);
                arr.set(minidx, temp);
                heapify(minidx);
            }
        }

        int remove() {
            int one = arr.get(0);// store the min value
            // swap the min value to the last value
            int temp = arr.size() - 1;
            arr.set(0, arr.get(temp));
            arr.remove(arr.size() - 1);// remove the last value

            heapify(0); // fix the heap

            return one;
        }
        boolean isEmpty(){
            return arr.size()==0;
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(0);
        heap.add(20);
        heap.add(3);
        heap.add(2);

        for (int i = 0; i < 4; i++) {
            System.out.println(heap.peek());
            heap.remove();
        }
    }
}