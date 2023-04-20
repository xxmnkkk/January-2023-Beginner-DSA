package Queue.StandardQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingInbuiltClass {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        //enqueue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);

        //dequeue
        queue.remove(); //throws an exception if the queue is empty

        //poll
        queue.poll(); //does not throw an exception if the queue is empty

        //peek
        System.out.println(queue.peek());

        System.out.println(queue);
    }
}
