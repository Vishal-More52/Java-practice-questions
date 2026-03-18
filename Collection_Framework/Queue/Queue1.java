package Collection_Framework.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();

        System.out.println("---- Add element using offer -----");

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue);
    }
}
