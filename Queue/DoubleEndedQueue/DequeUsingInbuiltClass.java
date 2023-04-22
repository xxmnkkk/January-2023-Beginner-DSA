package Queue.DoubleEndedQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeUsingInbuiltClass {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        //insert at rear
        deque.addLast(10);

        //insert at front
        deque.addFirst(20);

        deque.pollFirst();

        deque.pollLast();

        System.out.println(deque);
    }
}
