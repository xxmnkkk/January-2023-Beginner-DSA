package Queue.DoubleEndedQueue;

public class Deque {
    int queue[];
    int size;
    int front;
    int rear;

    Deque(int size) {
        this.size = size;
        this.queue = new int[size];
        this.front = -1;
        this.rear = 0;
    }

    private void printArray() {
        System.out.print("Current Array: ");
        for(int i = 0; i < size; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
    private boolean isFull() {
        if((front == 0 && rear == size - 1) || front == rear + 1) {
            return true;
        }

        return false;
    }

    private boolean isEmpty() {
        if(front == -1) {
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

    private void deleteAtRear() {
        if(isEmpty()) {
            System.out.println("Underflow");
            return;
        }

        int deletedElement = queue[rear];

        if(front == rear) {
            front = -1;
            rear = 0;
        }
        else {
            rear = ((size - 1) + rear) % size;
        }

        System.out.println("Deleted Element: " + deletedElement);
    }

    private void deleteAtFront() {
        if(isEmpty()) {
            System.out.println("Underflow");
            return;
        }

        int deletedElement = queue[front];

        if(front == rear) {
            front = -1;
            rear = 0;
        }
        else {
            front = (front + 1) % size;
        }

        System.out.println("Deleted Element: " + deletedElement);
    }

    private void insertAtRear(int data) {
        if(isFull()) {
            System.out.println("Overflow");
            return;
        }

        if(front == -1) {
            front = 0;
        }
        else {
            rear = (rear + 1) % size;
        }

        queue[rear] = data;
    }

    private void insertAtFront(int data) {
        if(isFull()) {
            System.out.println("Overflow");
            return;
        }

        if(front == -1) {
            front = 0;
        }
        else {
            front = ((size - 1) + front) % size;
        }

        queue[front] = data;
    }

    public static void main(String[] args) {
        Deque deque = new Deque(6);

        deque.deleteAtFront();
        System.out.println();

        deque.deleteAtRear();
        System.out.println();

        deque.insertAtRear(10);
        deque.traverse();
        System.out.println();

        deque.insertAtFront(20);
        deque.traverse();
        System.out.println();

        deque.insertAtRear(30);
        deque.traverse();
        System.out.println();

        deque.insertAtFront(40);
        deque.traverse();
        System.out.println();

        deque.insertAtFront(50);
        deque.traverse();
        System.out.println();

        deque.insertAtFront(60);
        deque.traverse();
        System.out.println();

        deque.insertAtFront(70);
        deque.traverse();
        System.out.println();

        System.out.println("Front: " + deque.front);
        System.out.println("Rear: " + deque.rear);
        deque.printArray();
        deque.deleteAtRear();
        deque.traverse();
        System.out.println();

        System.out.println("Front: " + deque.front);
        System.out.println("Rear: " + deque.rear);
        deque.printArray();
        deque.deleteAtFront();
        deque.traverse();
        System.out.println();
    }
}
