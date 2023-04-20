package Queue.StandardQueue.AssignmentQuestions;

import java.util.Stack;

public class FormingQueueFromTwoStack {
    static Stack<Integer> s1 = new Stack<Integer>();
    static Stack<Integer> s2 = new Stack<Integer>();

    static void enQueue(int x) {
        //move all elements from s1 to s2
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        //push 'x'
        s1.push(x);

        //move all elements back to s1
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    static void deQueue() {
        s1.pop();
    }
    static void Print1() {
        System.out.println(s1.peek());
    }
}
