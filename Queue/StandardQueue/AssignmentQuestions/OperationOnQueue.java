package Queue.StandardQueue.AssignmentQuestions;

import java.util.Queue;

public class OperationOnQueue {
    public static void enqueue(Queue<Integer> qu, int x) {
        qu.add(x);
    }

    // dequeue():- that takes the queue as parameter.
    public static void dequeue(Queue<Integer> qu) {
        qu.poll();
    }

    // displayfront():-  that takes the queue as parameter.
    public static void displayfront(Queue<Integer> qu) {
        if(!qu.isEmpty()) {
            System.out.println(qu.peek());
        }
        else {
            System.out.println("0");
        }
    }
}
