package Queue.DoubleEndedQueue.AssignmentQuestions;

import java.util.Deque;

public class CircularRotation {
    static void circularRotate(Deque<Integer> deq, int d, int n) {
        d = d % n;

        for(int i = 1; i <= d; i++) {
            int lastElement = deq.pollLast();
            deq.addFirst(lastElement);
        }
    }
}
