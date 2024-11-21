package Nov.ex_21112024;
import java.util.PriorityQueue;
public class Lab_216 {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        // FIFO
        pq.offer("1"); // add
        pq.offer("3");
        pq.offer("2");
        pq.offer("4");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
