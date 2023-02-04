package ConditionalStatement;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Choices are: ");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");
        System.out.println("%");

        System.out.print("Your choice?: ");
        char choice = scanner.next().charAt(0);


        int answer;
        switch(choice) {
            case '+':
                answer = num1 + num2;
                System.out.println(answer);
                break;
            case '-':
                answer = num1 - num2;
                System.out.println(answer);
                break;
            case '*':
                answer = num1 * num2;
                System.out.println(answer);
                break;
            case '/':
                answer = num1 / num2;
                System.out.println(answer);
                break;
            case '%':
                answer = num1 % num2;
                System.out.println(answer);
                break;
            default:
                System.out.println("Wrong choice!");
                break;
        }
    }
}
