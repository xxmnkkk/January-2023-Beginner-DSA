package Queue;

public class QueueUsingArray {
    int queue[];
    int size;
    int front;
    int rear;

    QueueUsingArray(int size) {
        this.size = size;
        this.queue = new int[size];
        this.front = this.rear = -1;
    }

    //is empty?
    private boolean isEmpty() {
        if(rear == -1 || front > rear) {
            return true;
        }

        return false;
    }

    //is full?
    private boolean isFull() {
        if(rear == size - 1) {
            return true;
        }
        return false;
    }

    //traverse
    private void traverse() {
        if(isEmpty()) {
            System.out.println("Underflow");
            return;
        }

        System.out.print("Current Queue: ");
        for(int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    //peek
    private void peek() {
        if(isEmpty()) {
            System.out.println("Underflow");
            return;
        }

        int peekedElement = queue[front];

        System.out.println("Peeked: " + peekedElement);
    }
    //delete
    private void dequeue() {
        if(isEmpty()) {
            System.out.println("Underflow");
            return;
        }

        int deletedElement = queue[front];

        if(front == rear) {
            front = -1;
            rear = -1;
        }
        else {
            front++;
        }

        System.out.println("Deleted: " + deletedElement);
    }

    //insert
    private void enqueue(int data) {
        if(isFull()) {
            System.out.println("Overflow");
            return;
        }

        //first element?
        if(front == -1 && rear == -1) {
            front = 0;
            rear = 0;
        }
        else {
            rear++;
        }

        queue[rear] = data;
    }

    public static void main(String[] args) {
        QueueUsingArray queueUsingArray
                = new QueueUsingArray(5);

        queueUsingArray.dequeue();
        System.out.println();

        queueUsingArray.enqueue(10);
        queueUsingArray.traverse();
        System.out.println();

        queueUsingArray.dequeue();
        queueUsingArray.traverse();
        System.out.println();

        queueUsingArray.enqueue(20);
        queueUsingArray.traverse();
        System.out.println();

        queueUsingArray.enqueue(30);
        queueUsingArray.traverse();
        System.out.println();

        queueUsingArray.dequeue();
        queueUsingArray.traverse();
        System.out.println();

        queueUsingArray.enqueue(40);
        queueUsingArray.traverse();
        System.out.println();

        queueUsingArray.enqueue(50);
        queueUsingArray.traverse();
        System.out.println();

        queueUsingArray.enqueue(60);
        queueUsingArray.traverse();
        System.out.println();

        queueUsingArray.enqueue(70);
        queueUsingArray.traverse();
        System.out.println();

        queueUsingArray.dequeue();
        queueUsingArray.traverse();
        System.out.println();

        queueUsingArray.dequeue();
        queueUsingArray.traverse();
        System.out.println();

        queueUsingArray.dequeue();
        queueUsingArray.traverse();
        System.out.println();

        queueUsingArray.dequeue();
        queueUsingArray.traverse();
        System.out.println();

        queueUsingArray.enqueue(80);
        queueUsingArray.traverse();
        System.out.println();

        queueUsingArray.enqueue(90);
        queueUsingArray.traverse();
        System.out.println();

        queueUsingArray.enqueue(100);
        queueUsingArray.traverse();
        System.out.println();

        queueUsingArray.enqueue(110);
        queueUsingArray.traverse();
        System.out.println();

        queueUsingArray.enqueue(120);
        queueUsingArray.traverse();
        System.out.println();

        queueUsingArray.enqueue(130);
        queueUsingArray.traverse();
        System.out.println();
    }
}
