package Stack.MonotonicStack.AssignmentQuestions;

import java.util.Scanner;
import java.util.Stack;

public class NextLargerElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++) {
            int num = arr[i];
            while(!stack.isEmpty() && arr[stack.peek()] < num) {
                int index = stack.pop();
                arr[index] = num;
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            arr[stack.pop()] = -1;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
