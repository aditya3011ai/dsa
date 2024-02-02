import java.util.*;

public class PQforObjects {
    public static class Student implements Comparable<Student> {
        String name;
        int rank;

        Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override public int compareTo(Student s2) {
            return this.rank-s2.rank;
        }

    }

    public static void main(String[] args) {
        //                    for revercing the original order -> Comparator.reverseOrder()
        PriorityQueue<Student> queue = new PriorityQueue<Student>(Comparator.reverseOrder());
        queue.add(new Student("a2", 4));
        queue.add(new Student("a1", 100));
        queue.add(new Student("a3", 3));
        queue.add(new Student("a4", 2));
        queue.add(new Student("a5", 1));
        while (!queue.isEmpty()) {
            System.out.print(queue.peek().rank+" ");
            queue.remove();
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
    }
}