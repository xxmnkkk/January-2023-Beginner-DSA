package Stack;

public class StackUsingArray {
    int stack[];
    int size;
    int top;

    StackUsingArray(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }

    private boolean isFull() {
        if(top == (size - 1)) {
            return true;
        }

        return false;
    }

    private boolean isEmpty() {
        if(top == -1) {
            return true;
        }

        return false;
    }

    private void traverse() {
        if(isEmpty()) {
            System.out.println("Stack Underflow!");
            return;
        }

        System.out.print("Current Stack: ");
        for(int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }

        System.out.println();
    }

    private int peek() {
        //check if stack is already empty
        if(isEmpty()) {
            return top;
        }

        int peekedElement = stack[top];

        return peekedElement;
    }

    private int pop() {
        //check if stack is already empty
        if(isEmpty()) {
            return top;
        }

        int poppedElement = stack[top];
        top--;

        return poppedElement;
    }
    private void push(int data) {
        //check if stack is already full
        if(isFull()) {
            System.out.println("Stack Overflow!");
            return;
        }

        top = top + 1;
        stack[top] = data;
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(10);
        int result;

        result = stack.pop();
        if(result == -1) {
            System.out.println("Underflow!");
        }
        else {
            System.out.println("Popped Element: " + result);
        }
        System.out.println("Current Size: " + (stack.top + 1));
        System.out.println();

        stack.push(10);
        System.out.println("Current Size: " + (stack.top + 1));
        stack.traverse();
        System.out.println();

        stack.push(-100);
        System.out.println("Current Size: " + (stack.top + 1));
        stack.traverse();
        System.out.println();

        stack.push(20);
        System.out.println("Current Size: " + (stack.top + 1));
        stack.traverse();
        System.out.println();

        stack.push(30);
        System.out.println("Current Size: " + (stack.top + 1));
        stack.traverse();
        System.out.println();

        stack.push(40);
        System.out.println("Current Size: " + (stack.top + 1));
        stack.traverse();
        System.out.println();

        result = stack.pop();
        if(result == -1) {
            System.out.println("Underflow!");
        }
        else {
            System.out.println("Popped Element: " + result);
        }
        System.out.println("Current Size: " + (stack.top + 1));
        stack.traverse();
        System.out.println();

        stack.push(50);
        System.out.println("Current Size: " + (stack.top + 1));
        stack.traverse();
        System.out.println();

        stack.push(60);
        System.out.println("Current Size: " + (stack.top + 1));
        stack.traverse();
        System.out.println();

        stack.push(70);
        System.out.println("Current Size: " + (stack.top + 1));
        stack.traverse();
        System.out.println();

        stack.push(80);
        System.out.println("Current Size: " + (stack.top + 1));
        stack.traverse();
        System.out.println();

        stack.push(90);
        System.out.println("Current Size: " + (stack.top + 1));
        stack.traverse();
        System.out.println();

        stack.push(100);
        System.out.println("Current Size: " + (stack.top + 1));
        stack.traverse();
        System.out.println();

        stack.push(110);
        System.out.println("Current Size: " + (stack.top + 1));
        stack.traverse();
        System.out.println();
    }
}
