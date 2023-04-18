package Stack.AssignmentQuestions;

import java.util.Scanner;
import java.util.Stack;

public class EvaluateExpression {
    private static boolean isDigit(char ch) {
        if(ch == '/' || ch == '*' || ch == '+' || ch == '-') {
            return true;
        }

        return false;
    }

    private static int calculate(int num1, int num2, char operator) {
        int result = 0;

        switch(operator) {
            case '+':
                result = num2 + num1;
                break;
            case '-':
                result = num2 - num1;
                break;
            case '*':
                result = num2 * num1;
                break;
            case '/':
                result = num2 / num1;
                break;
        }

        return result;
    }
    private static int evaluatePostfix(String postfix, int postfixLength) {
        String postfixArray[] = postfix.split(" ");
        int result = 0;

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < postfixLength; i++) {
            String str = postfixArray[i];
            char ch = str.charAt(0);

            if(isDigit(ch)) {
                int num1 = stack.pop();
                int num2 = stack.pop();

                int value = calculate(num1, num2, ch);

                stack.push(value);
            }
            else {
                int digit = Integer.parseInt(str);
                stack.push(digit);
            }
        }

        result = stack.pop();

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int postfixLength = scanner.nextInt();
        scanner.nextLine();
        String postfix = scanner.nextLine();

        int result = evaluatePostfix(postfix, postfixLength);
        System.out.println(result);
    }
}
