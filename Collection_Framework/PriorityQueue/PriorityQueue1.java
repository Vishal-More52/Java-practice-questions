package Collection_Framework.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(69);
        pq.offer(165);
        pq.offer(123);
        pq.offer(13);

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());
    }
}
