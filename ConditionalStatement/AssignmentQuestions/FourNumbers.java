package ConditionalStatement.AssignmentQuestions;

import java.util.Scanner;

public class FourNumbers {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        int answer;
        if(num1 == num2 && num2 == num3 && num3 == num4) {
            answer = 0;
        }
        else if(num1 == num2 && num2 == num3) {
            answer = 1;
        }
        else if(num1 == num2 && num2 == num4) {
            answer = 1;
        }
        else if(num2 == num3 && num3 == num4) {
            answer = 1;
        }
        else if(num3 == num4 && num4 == num1) {
            answer = 1;
        }
        else {
            answer = 2;
        }

        System.out.println(answer);
    }
}
