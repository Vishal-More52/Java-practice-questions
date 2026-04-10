package Collection_Framework.ArrayDqueue;

import java.util.ArrayDeque;

public class ArrayDequeue1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23);
        adq.offerFirst(12);
        adq.offerLast(50);
        adq.offer(98);

        System.out.println(adq);

        System.out.println("--------- Peek ---------");
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println("---------Poll ---------");
        System.out.println(adq.poll());
        System.out.println("poll()"+adq);

        System.out.println("----- poll first ----");
        System.out.println(adq.pollFirst());
        System.out.println("Poll first ()"+adq);

        System.out.println("------poll last-------");
        System.out.println(adq.pollLast());
        
        System.out.println("Poll last () :"+adq);

    }
}
