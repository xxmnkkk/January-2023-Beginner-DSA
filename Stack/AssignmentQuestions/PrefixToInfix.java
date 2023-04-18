package Stack.AssignmentQuestions;

import java.util.Scanner;
import java.util.Stack;

public class PrefixToInfix {
    private static boolean isOperator(char ch) {
        if(ch == '/' || ch == '*' || ch == '+' || ch == '-') {
            return true;
        }

        return false;
    }

    private static String prefixToInfix(String prefix) {
        String infix = "";

        int prefixLength = prefix.length();
        Stack<String> stack = new Stack<>();
        for(int i = prefixLength - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);

            if(isOperator(ch)) {
                String operand1 = stack.pop();
                String operand2 = stack.pop();

                String expression = "(" + operand1 + ch + operand2 + ")";

                stack.push(expression);
            }
            else {
                String str = ch + "";
                stack.push(str);
            }
        }

        infix = stack.pop();

        return infix;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String prefix = scanner.nextLine();

        String infix = prefixToInfix(prefix);
        System.out.println(infix);
    }
}
