package Queue.CircularQueue;

public class CircularQueueUsingArray {
    int queue[];
    int size;
    int front;
    int rear;

    CircularQueueUsingArray(int size) {
        this.size = size;
        this.queue = new int[size];
        this.front = this.rear = -1;
    }

    private boolean isEmpty() {
        if(rear == -1) {
            return true;
        }

        return false;
    }

    private boolean isFull() {
        if((front == 0 && rear == size - 1) || (rear == front - 1)) {
            return true;
        }

        return false;
    }

    private void traverse() {
        if(isEmpty()) {
            System.out.println("Underflow");
            return;
        }

        System.out.print("Current Queue: ");
        for(int i = front; i != rear; i = (i + 1) % size) {
            System.out.print(queue[i] + " ");
        }
        System.out.print(queue[rear]);
        System.out.println();
    }

    private void peek() {
        if(isEmpty()) {
            System.out.println("Underflow");
            return;
        }

        int peekedElement = queue[front];

        System.out.println("Deleted Element: " + peekedElement);
    }

    private void dequeue() {
        if(isEmpty()) {
            System.out.println("Underflow");
            return;
        }

        int deletedElement = queue[front];

        if(front == rear) {
            rear = -1;
            front = -1;
        }
        else {
            front = (front + 1) % size;
        }

        System.out.println("Deleted Element: " + deletedElement);
    }

    private void enqueue(int data) {
        if(isFull()) {
            System.out.println("Overflow");
            return;
        }

        if(rear == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;

        queue[rear] = data;
    }

    public static void main(String[] args) {
        CircularQueueUsingArray circularQueueUsingArray
                = new CircularQueueUsingArray(5);

        circularQueueUsingArray.dequeue();
        System.out.println();

        circularQueueUsingArray.enqueue(10);
        circularQueueUsingArray.traverse();
        System.out.println();

        circularQueueUsingArray.enqueue(20);
        circularQueueUsingArray.traverse();
        System.out.println();

        circularQueueUsingArray.enqueue(30);
        circularQueueUsingArray.traverse();
        System.out.println();

        circularQueueUsingArray.dequeue();
        circularQueueUsingArray.traverse();
        System.out.println();

        circularQueueUsingArray.enqueue(40);
        circularQueueUsingArray.traverse();
        System.out.println();

        circularQueueUsingArray.enqueue(50);
        circularQueueUsingArray.traverse();
        System.out.println();

        circularQueueUsingArray.enqueue(60);
        circularQueueUsingArray.traverse();
        System.out.println();

        circularQueueUsingArray.dequeue();
        circularQueueUsingArray.traverse();
        System.out.println();

        circularQueueUsingArray.dequeue();
        circularQueueUsingArray.traverse();
        System.out.println();

        circularQueueUsingArray.dequeue();
        circularQueueUsingArray.traverse();
        System.out.println();

        circularQueueUsingArray.dequeue();
        circularQueueUsingArray.traverse();
        System.out.println();

        circularQueueUsingArray.dequeue();
        System.out.println();

        circularQueueUsingArray.enqueue(70);
        circularQueueUsingArray.traverse();
        System.out.println();

        circularQueueUsingArray.enqueue(80);
        circularQueueUsingArray.traverse();
        System.out.println();

        circularQueueUsingArray.enqueue(90);
        circularQueueUsingArray.traverse();
        System.out.println();

        circularQueueUsingArray.enqueue(100);
        circularQueueUsingArray.traverse();
        System.out.println();

        circularQueueUsingArray.enqueue(110);
        circularQueueUsingArray.traverse();
        System.out.println();

        circularQueueUsingArray.dequeue();
        circularQueueUsingArray.traverse();
        System.out.println();

        circularQueueUsingArray.dequeue();
        circularQueueUsingArray.traverse();
        System.out.println();

        circularQueueUsingArray.dequeue();
        circularQueueUsingArray.traverse();
        System.out.println();

        circularQueueUsingArray.dequeue();
        circularQueueUsingArray.traverse();
        System.out.println();

        circularQueueUsingArray.enqueue(120);
        circularQueueUsingArray.traverse();
        System.out.println();

        circularQueueUsingArray.enqueue(130);
        circularQueueUsingArray.traverse();
        System.out.println();

        circularQueueUsingArray.enqueue(140);
        circularQueueUsingArray.traverse();
        System.out.println();

        circularQueueUsingArray.enqueue(150);
        circularQueueUsingArray.traverse();
        System.out.println();
    }
}
