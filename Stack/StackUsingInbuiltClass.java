package Stack;

import java.util.Stack;

public class StackUsingInbuiltClass {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //push
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        //print
        System.out.println(stack);
        System.out.println();

        //peek
        System.out.println("Peeked Element: " + stack.peek());
        System.out.println("Current Stack: " + stack);
        System.out.println();

        //pop
        System.out.println("Popped Element: " + stack.pop());
        System.out.println("Current Stack: " + stack);
        System.out.println();

        //search
        System.out.println("10 is at: " + stack.search(10));
        System.out.println();

        //add
        stack.add(60);
        System.out.println("Current Stack: " + stack);
        System.out.println();

        //is empty?
        System.out.println("Is stack empty?: " + stack.empty());
        System.out.println();

        System.out.println("First element: " + stack.firstElement());
        System.out.println();
    }
}
